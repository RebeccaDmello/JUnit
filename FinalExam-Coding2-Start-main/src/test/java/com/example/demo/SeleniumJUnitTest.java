package com.example.demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)

public class SeleniumJUnitTest {
    @LocalServerPort
    private Integer port = 8080;
    private static WebDriver driver;
    private AnimalPage animalCounter;

    @BeforeAll
    public static void beforeAll() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @BeforeEach
    public void beforeEach() {
//        open browser at localhost:port/animal
        driver.get("http://localhost:" + port + "/animal");
        animalCounter = new AnimalPage(driver);
    }

    @AfterAll
    public static void afterAll() {
        driver.quit();
    }

    @Test
    public void maintest () {
        // perform an automated test with
            // animal: dog
            // adjective: funny
        String expRes = "We love funny dogs.";
        animalCounter.setAnimalText("dog");
        animalCounter.setAdjective("funny");
        animalCounter.submitForm();

        String result = animalCounter.getDisplay();
        assertEquals(expRes,result );
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
