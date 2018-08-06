package com.example.stringOps;

import java.util.Scanner;

public class VowelPrecentage {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = sc.nextLine();
		findPercent(str);
	}

	private static void findPercent(String str) {
		int count, digits;
		count = digits = 0;
		str = str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
				count++;
			if (ch >= '0' && ch <= '9')
				digits++;
		}

		System.out.printf("%.2f", (count * 100f) / str.length());
		System.out.println();
		System.out.printf("%.2f", (digits * 100f) / str.length());
	}

}
