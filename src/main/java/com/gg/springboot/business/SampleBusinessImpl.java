package com.gg.springboot.business;

public class SampleBusinessImpl {

	public SampleBusinessImpl() {
		
	}

	public int calculateSumOfNumbers(int [] numberArray) {
		int sum= 0;
		for (int num : numberArray) {
		sum += num;
		}
	   return sum;
	   }

}