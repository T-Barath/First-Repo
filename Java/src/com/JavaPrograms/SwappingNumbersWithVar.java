package com.JavaPrograms;

import java.util.Scanner;

public class SwappingNumbersWithVar {

	public static void main(String[] args) {
		int a,b,c;
		Scanner s = new Scanner(System.in);
		System.out.println("The numbers are:");
		a = s.nextInt();
		b = s.nextInt();
		
		c=a;
		a=b;
		b=c;
		System.out.println("The swapped numbers are:");
		System.out.println(a);
		System.out.println(b);
	
	}

}
