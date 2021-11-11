package com.viji.javalearning;

public class StaticBlockSample {

	static {
		System.out.println("First static block");
	}
	
	static {
		System.out.println("Second static block");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Main block");
	}

}
