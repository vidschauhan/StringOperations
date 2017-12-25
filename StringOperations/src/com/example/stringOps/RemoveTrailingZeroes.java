package com.example.stringOps;

public class RemoveTrailingZeroes {

	public static void main(String[] args) {
	
		String str = "00012125302128800023122100";
		StringBuffer strbuff = new StringBuffer(str);
		int i =1;
		
		StringBuilder stringBuilder = new StringBuilder(str);
		char st = strbuff.charAt(5);
		
/*		System.out.println(st);
		strbuff.replace(0, i, "");
		System.out.println(strbuff.toString());*/
		while(i <= str.length()-1) {
		
			if(str.charAt(i)== '0') {
		stringBuilder.replace(0, i,"");
			}
		i++;
		}
		System.out.println(stringBuilder);
		/*while(i<=str.length()-1) {
			
			
			if (0 == Integer.parseInt(strbld.charAt(i))) {
				strbld.replace(strbld.charAt(i), i, "");
			}
			i++;
		}
		
		System.out.println(strbld.toString());
*/
	}

}
