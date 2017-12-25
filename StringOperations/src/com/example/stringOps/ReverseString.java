package com.example.stringOps;

public class ReverseString {

	public static void main(String[] args) {
		
		String name = "Vidit";
		char[] arr = name.toCharArray();
		StringBuilder reverseString = new StringBuilder();
		int strLength = name.length();
		while(strLength>0) {
			reverseString.append((arr[strLength-1])); // since array starts from 0 so length-1.
			strLength--;
		}

		System.out.println(reverseString.toString());
	}

}
