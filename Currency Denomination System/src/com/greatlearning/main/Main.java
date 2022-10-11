package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.service.Denomination;

public class Main {

	public static void main(String[] args) {
		Denomination denomination = new Denomination();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of currency denomination ");
		int currencySize = scanner.nextInt();
		int[] currency = new int[currencySize];
		
		System.out.println("Enter the currency of denomination");
		for (int i = 0; i < currency.length; i++) {
			currency[i] = scanner.nextInt();	
		}
		
		System.out.println("Enter the amount you want to pay");
		int amount = scanner.nextInt();
		denomination.BubbleSort(currency);
		denomination.noOfNotes(currency , amount);
		System.out.println("");
	}

}
