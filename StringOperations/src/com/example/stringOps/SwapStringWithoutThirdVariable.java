package com.example.stringOps;

/**
 * @author Vidit 
   25-Dec-2017 6:50:19 PM
 */
public class SwapStringWithoutThirdVariable {

	public static void main(String[] args) {
		
		String firstName = "Vidit";
		String lastName = "Singh";
		
		System.out.println("Before Swapping : " + firstName + " : " + lastName);
		
		firstName = firstName+lastName; // ViditSingh
		lastName = firstName.substring(0, firstName.length() - lastName.length());  // 0 -> starts from V till, ViditSingh - Singh.
		firstName = firstName.substring(lastName.length()); // substring Singh in ViditSingh.
		
		System.out.println("After Swapping : " + firstName + " : " + lastName);
		
		System.out.println(firstName.indexOf("n", 0));
		System.out.println("ChatAt  3  of Vidit is :: " + lastName.charAt(3));
		
	}

}
