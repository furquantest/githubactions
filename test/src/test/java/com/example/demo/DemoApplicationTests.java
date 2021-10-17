package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
		System.out.println("Running Test Case .....");

	}

	@Test
	public void testAdd1Plus1()
	{

		int x  = 1 ; int y = 1;
		assertEquals(2, ForTest.add(x,y));
	}

}
