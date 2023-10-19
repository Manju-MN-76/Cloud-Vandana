package com.java;

import java.util.Scanner;

public class RomanToInteger {

	public static void main(String[] args) {

		String Roman;
		Scanner sc = new Scanner(System.in);

		System.out.println("enter roman number");
		Roman = sc.nextLine();

		System.out.println(ConverInt(Roman));

		sc.close();

	}

	public static int ConverInt(String roman) {

		int sum = 0;
		int length=roman.length();
		for (int i = 0; i < length; i++) {
			
			int first = CharToInt(roman.charAt(i));
			if (i + 1 < length) {
				
				int second = CharToInt(roman.charAt(i + 1));
				if (first >= second) {
					
					sum = sum + first;
				} else {
					
					sum = sum - first;
				}
			} else {
				
				sum = sum + first;
			}
		}
		
		return sum;
	}

	public static int CharToInt(char ch) {
		
		switch (ch) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;
		default:
			return -1;
		}
	}

}
