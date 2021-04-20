package com.finalexam;

import com.finalexam.service.FBService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class FEApplicationTests {

	@Test
	void testFBuzz1 () {
		FBService fbs = new FBService();

		// check non-divisible numbers return themselves
		assertEquals("1", fbs.fBuzz(1));
		assertEquals("47", fbs.fBuzz(47));
		assertEquals("121", fbs.fBuzz(121));
	}

	@Test
	void testFBuzz2 () {
		FBService fbs = new FBService();

		// check numbers divisible by 3
		assertEquals("Fizz", fbs.fBuzz(3));
		assertEquals("Fizz", fbs.fBuzz(333));
	}

	@Test
	void testFBuzz3 () {
		FBService fbs = new FBService();

		//check numbers divisible by 5
		assertEquals("Buzz", fbs.fBuzz(5));
		assertEquals("Buzz", fbs.fBuzz(85));
	}

	@Test
	void testFBuzz4 () {
		FBService fbs = new FBService();

		//check numbers divisible by 3 and 5
		assertEquals("FizzBuzz", fbs.fBuzz(15));
		assertEquals("FizzBuzz", fbs.fBuzz(75));
	}

	@Test
	void testFBuzz5 () {
		FBService fbs = new FBService();

		//check invalid inputs
		assertThrows(IllegalArgumentException.class, () -> fbs.fBuzz(0));
		assertThrows(IllegalArgumentException.class, () -> fbs.fBuzz(-1));
	}
}
