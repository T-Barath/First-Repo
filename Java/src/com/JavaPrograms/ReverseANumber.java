package com.JavaPrograms;

import java.util.Scanner;

public class ReverseANumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = s.nextInt();
		int i = 0, j = 0;
		
		while (n > 0) {
		i = n % 10;
		j = (j * 10) + i;
		n = n / 10;
		}
		System.out.println("Reverse number is=" + j);
	}

}