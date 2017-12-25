package com.example.stringOps;

public class IntegerToString {

	public static void main(String[] args) {
		
		int a = 12345;
		
		String str = Integer.toString(a);
		System.out.println(str.getClass() + " = " + str);
		
		 String str2 = String.valueOf(a);
		 System.out.println("String str2 = " + str2);
		 
		 	Integer obj = new Integer(a);
		    String str4 = obj.toString();
		    System.out.println("String str4 = " + str4);
		    
		    String str6 = new StringBuffer().append(1234).toString();
		    System.out.println("String str6 = " + str6);

	}

}