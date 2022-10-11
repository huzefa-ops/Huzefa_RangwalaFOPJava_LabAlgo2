package com.greatlearning.service;

public class Denomination {
	public void BubbleSort(int[] currency ) {
		for (int i = 0; i < currency.length-1; i++) {
			for (int j = 0; j < currency.length-i-1; j++) {
				if(currency[j]<currency[j+1]) {
					
					//swap
					int temp = currency[j];
					currency[j] = currency[j+1];
					currency[j+1] = temp;
					 
				}
			}			
		}
	}
	public void noOfNotes(int[] currency, int amount) {
		int[] result = new int[currency.length];
		for (int i = 0; i< currency.length; i++) {
		if(currency[i] < amount )
		result[i] = amount/currency[i];
		amount = amount%currency[i];
	}
		if(amount>0) {
			System.out.println("Amount cannot be made denominated");
		}else {
			System.out.println("Your payment approach in order to give min number of note will be");
			for (int i = 0; i < result.length; i++) {
				if(result[i]!=0) {
					System.out.println(currency[i]+":"+result[i]);
				}
			}
		}
	}
}
