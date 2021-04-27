package com.gg.springboot.business;

import com.gg.springboot.service.SampleBusinessServiceImpl;

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

}// end class