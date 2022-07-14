package com.JavaPrograms;

import java.util.Scanner;

public class SwappingNumbersWithoutVar {

	public static void main(String[] args) {
		int a,b;
		Scanner s = new Scanner(System.in);
		System.out.println("The numbers are:");
		a= s.nextInt();
		b=s.nextInt();
		a= a+b;
		b= a-b;
		a = a-b;
		System.out.println(a);
		System.out.println(b);

	}

}
