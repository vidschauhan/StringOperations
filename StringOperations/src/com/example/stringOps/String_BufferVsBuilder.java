package com.example.stringOps;

/**
 * @author Vidit 
   25-Dec-2017 6:49:55 PM
 */
public class String_BufferVsBuilder {

	public static void main(String[] args) {
		
		StringManipulation strmanup = new StringManipulation();
		
		String string = "Simple String";
		StringBuffer buffrString = new StringBuffer("Buffer");
		StringBuilder builderString = new StringBuilder("Builder");
		
		System.out.println(strmanup.appendString(string));
		System.out.println(strmanup.appendStringBuffer(buffrString));
		System.out.println(strmanup.appendStringBuilder(builderString));

	}

}


//StringBuffer is similar to StringBuilder except one difference that StringBuffer is thread safe

class StringManipulation {

	public StringBuilder appendStringBuilder(StringBuilder str) {
		StringBuilder newString = null;
		newString = str.append("Singh");
		return newString;
	}

	public StringBuffer appendStringBuffer(StringBuffer strbuff) {
		StringBuffer newString = null;
		newString = strbuff.append("Singh");
		return newString;
	}
	

	public String appendString(String str) {
	String newString = null;
	newString = "Vidit" + str;
	return newString;
	}

}