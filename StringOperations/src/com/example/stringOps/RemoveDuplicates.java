package com.example.stringOps;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicates {

	public static void main(String[] args) {

		System.out.println("Enter the string : ");
		@SuppressWarnings("resource")
		String str = new Scanner(System.in).nextLine();
		System.out.println(removeDuplicates(str));
	}

	private static String removeDuplicates(String str) {

		char[] ch = str.toCharArray();
		Set<Character> set = new HashSet<Character>();
		int i = 0;
		while (i < str.length()) {
			set.add(ch[i]);
			i++;
		}
		String uniqueString = set.stream().map(e -> e.toString()).collect(Collectors.joining());
		return uniqueString;
	}

}
