package com.github.smk7758.Numbers;

import java.util.Scanner;

public class Main {
	
	Scanner scanner=new Scanner(System.in);
	
	int number1=scanner.nextInt();
	int number2=scanner.nextInt();
	int number3=scanner.nextInt();
	
	
	int[] input_number = {number1, number2, number3 }, ansewer_number = { 1, 2, 3 };

	public static void main(String[] args) {
		new Main().processer();
		
	}

	public void processer() {
		if (isPlaceNumberCorrect()) {
			System.out.println("Place number is correct.");
		} else if (isNumberCorrect()) {
			System.out.println("Number is correct.");
		} else {
			System.out.println("Don't mind!");
		}
	}

	public boolean isNumberCorrect() {
		for (int i = 0; i < 3; i++) {
			for (int k = 0; k < 3; k++) {
				if (input_number[i] == ansewer_number[k]) return true;
			}
		}
		return false;
	}

	public boolean isPlaceNumberCorrect() {
		for (int i = 0; i < 3; i++) {
			if (input_number[i] == ansewer_number[i]) return true;
		}
		return false;
	}
}
