package com.example.stringOps;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SuppressWarnings("resource")
public class RemoveZeroes {

	public static void main(String[] args) {

		String str = null;
		System.out.println("Enter Choice : ");
		System.out.println("******************************************");
		System.out.println("1.Remove all zeroes");
		System.out.println("2.Remove leading zeroes");
		System.out.println("3.Remove trailing zeroes");
		System.out.println("******************************************\n");
		String choice = new Scanner(System.in).nextLine();
		Matcher choiceMatcher = Pattern.compile("[1-3]{1}").matcher(choice);
		if (choiceMatcher.matches()) {
			System.out.println("Enter digits with zeroes : ");
			str = new Scanner(System.in).nextLine();
		}
		StringBuilder strbuild = new StringBuilder();
		switch (choice) {
		case "1":
			strbuild = removeAllZeroes(str, strbuild);
			break;
		case "2":
			strbuild = removeAllLeadingZeroes(str, strbuild);
			break;
		case "3":
			strbuild = removeAllTrailingZeroes(str, strbuild);
			break;
		default:
			System.out.println("Please make valid choice");

		}
		if (strbuild.length() != 0)
			System.out.println("Output :  " + strbuild.toString());

	}

	private static StringBuilder removeAllZeroes(String str, StringBuilder strbuild) {
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '0') {
				i++;
			} else {
				strbuild.append(str.charAt(i));
			}

		}
		return strbuild;
	}

	private static StringBuilder removeAllLeadingZeroes(String str, StringBuilder strbuild) {

		int i, j;

		i = 0;
		while (str.charAt(i) == '0')
			i++;

		for (j = i; j < str.length(); j++) {
			strbuild.append(str.charAt(j));
		}

		return strbuild;

	}

	private static StringBuilder removeAllTrailingZeroes(String str, StringBuilder strbuild) {
		int i, j;
		j = 0;
		i = str.length() - 1;
		while (str.charAt(i) == '0')
			i--;

		for (j = 0; j <= i; j++) {
			strbuild.append(str.charAt(j));
		}

		return strbuild;

	}
}
