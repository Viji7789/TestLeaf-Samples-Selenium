package com.viji.javapgms;

import java.util.Scanner;

public class ArithmeticOperationsSample {

	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter first value:");
		int a=sc.nextInt();
		
		System.out.println("Enter second value:");
		int b=sc.nextInt();
		
		int c;
		c=a+b;
		System.out.println("The sum is:"+c);
		
		System.out.println("Enter first value:");
		int i=sc.nextInt();
		
		System.out.println("Enter second value:");
		int j=sc.nextInt();
		
		int k;
		k=i-j;
		System.out.println("The difference is:"+k);
		
	}

}
