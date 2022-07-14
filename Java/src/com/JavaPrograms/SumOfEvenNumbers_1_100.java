package com.JavaPrograms;

public class SumOfEvenNumbers_1_100 {
	public static void main(String[] args) {
		int n = 0;
		for (int i = 0; i <=100; i++) {
			if (i%2==0) {
				n= n+i;	
			}
			
		}
		System.out.println(n);
	}

}
