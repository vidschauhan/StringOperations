package com.example.stringOps;

/**
 * @author Vidit 
   25-Dec-2017 6:50:08 PM
 */
public class StringComparison {

	public static void main(String[] args) {
		
		
		String str1 = "Vidit";
		String str2 = "Vidit";
		String s3 = new String("Vidit");
		StringBuffer s4 = new StringBuffer("Vidit");
		
		
		
		System.out.println(str1.equals(str2)); // compares values.
		System.out.println(str1 == s3); // compares references not values
		System.out.println(str2.compareTo(s3)); // compares values lexicographically and returns an integer value
		System.out.println(str1.equals(s4));
	}

}
