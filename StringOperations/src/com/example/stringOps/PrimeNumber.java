package com.example.stringOps;

import java.util.Scanner;
@SuppressWarnings("resource")
public class PrimeNumber {

	public static void main(String[] args) {
		int digits;
		try {
			digits = new Scanner(System.in).nextInt();
			isPrime(digits);}
		catch(Exception ex) {
			System.out.println("Exception occured. Please enter valid digits between 0-9");
		}
		

	}
	private static void isPrime(int digits) {
		int flag =0 ;
		for(int i=2;i<digits;i++) {
			if(digits%i==0) {
				flag=1;
				break;
			}
			
		}
		if(flag!=0) {
			System.out.println("Not Prime");
		} else {
			System.out.println("Prime");
		}
	}

}
