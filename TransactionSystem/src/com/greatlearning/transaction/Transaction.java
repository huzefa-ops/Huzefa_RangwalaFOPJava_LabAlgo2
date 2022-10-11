package com.greatlearning.transaction;

public class Transaction {
	
	public void isTargetAcheivable(int value , int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum= sum + arr[i];
			if(sum>=value) {
				System.out.println("Target acheive after "+(i+1)+" transactions");
				break;
			}
		}
		if(sum<=value) {
			System.out.println("Target is not acheived");
		}		
	}	
}
