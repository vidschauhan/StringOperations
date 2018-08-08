package com.example.stringOps;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MaxOccuringCharacter {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("Enter the string : ");
		String str = new Scanner(System.in).nextLine();
		maxOccur(str);
		stringFormatter(str);
	}

	private static void maxOccur(String str) {
		if(null== str || str == "") {
			System.out.println("Please enter any String" + "\n Exiting system...");
			System.exit(-1);
		}

		char[] ch = str.toLowerCase().toCharArray();
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		for (Character chars : ch) {
			if (charMap.containsKey(chars)) {
				charMap.put(chars, charMap.get(chars) + 1);
			} else {
				charMap.put(chars, 1);
			}
		}

		// For occurrence more than 1
		Map<Character, Integer> maps = charMap.entrySet().stream().filter(m -> m.getValue() > 1)
				.collect(Collectors.toMap(m -> m.getKey(), m -> m.getValue()));
		maps.entrySet().stream().forEach(System.out::print);

		// for MAX occurance.
		Entry<Character, Integer> Mapentry = charMap.entrySet().stream()
				.max((p1, p2) -> Integer.compare(p1.getValue(), p2.getValue())).get();

		System.out.printf("Max occured word : %s = %s", Mapentry.getKey(), Mapentry.getValue());
	}

	private static void stringFormatter(String str) {
		char[] ch  = str.toCharArray();
		int i=0;
		StringBuilder formattedString = new StringBuilder();
		while(i <str.length()) {
			if(ch[i]==' ') {
				formattedString.append("%20");
			}else {
				formattedString.append(ch[i]);
			}
			i++;
		}
		System.out.println(formattedString);
	}
}
