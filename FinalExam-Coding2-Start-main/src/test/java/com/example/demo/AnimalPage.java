package com.example.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AnimalPage {

    @FindBy(id = "animalText")
    private WebElement animalText;

    @FindBy(id = "adjective")
    private WebElement adjective;

    @FindBy(id = "submit")
    private WebElement submitButton;


    @FindBy(id = "resultData")
    private WebElement resultData;

    public AnimalPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public String getDisplay() {
        return resultData.getText();
    }


    public void setAnimalText(String animalText) {
        this.animalText.sendKeys(animalText);
    }

    public void setAdjective(String adjective) {
        this.adjective.sendKeys(adjective);
    }

    public void submitForm() {
        submitButton.click();
    }
}
