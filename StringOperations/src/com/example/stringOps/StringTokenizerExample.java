package com.example.stringOps;

import java.util.StringTokenizer;

/**
 * @author Vidit 
   25-Dec-2017 6:50:15 PM
 */
public class StringTokenizerExample {

	public static void main(String[] args) {
		
		
		StringTokenizer strToken = new StringTokenizer("This is en example of String Tokenizer.");
		
		while(strToken.hasMoreTokens()) {
			System.out.println(strToken.nextToken());
		}
		
		 StringTokenizer st2 = 
	             new StringTokenizer("JAVA : Code : String", " :");  // split tokens using : delimiter.
	        while (st2.hasMoreTokens())
	            System.out.println(st2.nextToken());
		
	}
	
	
	
	

}
