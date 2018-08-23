package com.example.stringOps;

public class StringTrickyQuestions {

	public static void main(String[] args) {
		//new StringOp1().foo(null); // Compilation Error as foo() is ambiguous.

		String s1 = "abc";
		String s2 = new String("abc");
		s2.intern();
		System.out.println(s1 ==s2); // false.
		
		System.out.println("**********************************");

		String s3 = new String("Hello");  
		String s4 = new String("Hello"); 
		/*How many Objects ? 
		First – line 1, “Hello” object in the string pool.
		Second – line 1, new String with value “Hello” in the heap memory.
		Third – line 2, new String with value “Hello” in the heap memory. Here “Hello” string from string pool is reused.*/

		
		
	}
	
	 

}

class StringOp1{
	public void foo(String s) {
		 System.out.println("String");
		 }

		 public void foo(StringBuffer sb){
		 System.out.println("StringBuffer");
		 }
}