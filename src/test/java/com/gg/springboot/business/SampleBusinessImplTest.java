package com.gg.springboot.business;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SampleBusinessImplTest {

	@Test
	void calculateSumOfNumbers_test() {
		SampleBusinessImpl sampleBusinessImpl = new SampleBusinessImpl();
		
		int actualResult = sampleBusinessImpl.calculateSumOfNumbers(new int [] {0,1,2,3});
		int expectedResult = 6;
		assertEquals(expectedResult, actualResult);
	}

	@Test
	void calculateSumOfNumbersWithEmptyArray_test() {
		SampleBusinessImpl sampleBusinessImpl = new SampleBusinessImpl();
		
		int actualResult = sampleBusinessImpl.calculateSumOfNumbers(new int [] {});
		int expectedResult = 0;
		assertEquals(expectedResult, actualResult);
	}
}
