package com.example.stringOps;

public class Swap1stAndLastWord {

	public static void main(String[] args) {
		String str = "Hello World";
		 char[] ch = str.toCharArray();
	        for (int i = 0; i < ch.length; i++) {
	 
	            // k stores index of first character
	            // and i is going to store index of last 
	            // character. 
	            int k = i;
	            while (i < ch.length && ch[i] != ' ') 
	                i++;
	             
	            // Swapping
	            char temp = ch[k];
	            ch[k] = ch[i - 1];
	            ch[i - 1] = temp;
	}
	        System.out.println(new String(ch));
	}
	

}
