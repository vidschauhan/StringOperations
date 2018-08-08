package com.example.stringOps;

/**
 * @author Vidit 
   25-Dec-2017 6:49:50 PM
 */
public class ReverseString {

	public static void main(String[] args) {
		
		String name = "Vidit is a smart boy";
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
