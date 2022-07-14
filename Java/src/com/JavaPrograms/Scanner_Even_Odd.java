package com.JavaPrograms;

import java.util.Scanner;

public class Scanner_Even_Odd {

	public static void main(String[] args) {
		
		Scanner e = new Scanner(System.in);
		System.out.println("Enter a number");
		int i = e.nextInt();
	    if (i%2 == 0) {
	    	System.out.println("Entered number is " + i + " and it is even");
		}
	    else if (i%2 ==1) {
	    	System.out.println("Entered number is " + i + " and it is odd");
			
		}
	}

	}

