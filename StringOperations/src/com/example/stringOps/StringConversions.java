package com.example.stringOps;

/**
 * @author Vidit 
   25-Dec-2017 6:50:12 PM
 */
public class StringConversions {

	public static void main(String[] args) {
		
		
		String str = "Vidit";
		System.out.println(str.getClass() + " " + str);
		
		//converting into String Buffer from String.
		StringBuffer strbuff = new StringBuffer(str);
		System.out.println(strbuff.getClass() + " " + strbuff);
		
		//Again converting into String.
		String st = strbuff.toString();
		System.out.println(st.getClass() + " " + st);
		
		
		// converting StringBuffer to Builder is done via first converting into String class and 
		// then to Builder of buffer Vice Versa.
		

	}

}
