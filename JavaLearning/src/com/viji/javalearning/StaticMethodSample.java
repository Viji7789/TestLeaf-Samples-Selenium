package com.viji.javalearning;

public class StaticMethodSample {

	public static void addmethod() {
		int i=34,j=45,add;
		add=i+j;
		System.out.println("Total value is :"+ add);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		addmethod();//static method doesn't need an object to use it
	}

}
