package com.gg.springboot.business;

import com.gg.springboot.service.impl.SampleBusinessServiceImpl;

public class SampleBusinessImpl {

	public SampleBusinessImpl() {
	}

	private SampleBusinessServiceImpl  sampleBusinessServiceImpl;
	
	public int calculateSumOfNumbers(int [] numberArray) {
		int sum= 0;
		for (int num : numberArray) {
		sum += num;
		}
	   return sum;
	   }

	
	public int calculateSumOfNumbersUsingService() {
		int sum= 0;
		for (int num : sampleBusinessServiceImpl.getNumbersArray()) {
		sum += num;
		}
	   return sum;
	   }
}// end class