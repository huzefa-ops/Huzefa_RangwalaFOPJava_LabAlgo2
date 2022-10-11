package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.transaction.Transaction;

public class main {

	public static void main(String[] args){
		
		Transaction transaction = new Transaction();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of transaction array");
		int size = scanner.nextInt();
		int i;
		int[] transactionArray = new int[size];
		
		System.out.println("Enter the values of the array");
		for(i=0 ; i<transactionArray.length; i++) {
			transactionArray[i] = scanner.nextInt();
			
		}
		System.out.println("Enter the total no of targets need to be acheive");
		int noOfTargets = scanner.nextInt();
		
		for(i=0 ; i<noOfTargets; i++) {
			System.out.println("Enter the value of target");
			int value = scanner.nextInt();
			transaction.isTargetAcheivable(value , transactionArray);
		}
		scanner.close();
	}

}
