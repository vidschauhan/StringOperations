package com.example.stringOps;

/**
 * @author Vidit 
   25-Dec-2017 6:50:00 PM
 */
public class StringBufferExample {

	public static void main(String[] args) {
		
		StringBuffer strbuffer = new StringBuffer("StringBufferExample");
		
		System.out.println("Capacity :" + strbuffer.capacity()); // t accepts a String argument that sets the initial
																	// contents of the StringBuffer object and reserves
																	// room for 16 more characters without reallocation

		System.out.println("deleteted string :::: " + strbuffer.delete(2, 5));
		
	
		// The first one is dynamic initilization of String which happens to be in Heap section. which is mutable.
		StringBuffer bffr = new StringBuffer("Vidit"); 
		String bff1 = "Vidit"; // this resides on String pool area of Heap memory and is immutable.

		System.out.println(bff1.getClass());
		
		
		
	}

}
