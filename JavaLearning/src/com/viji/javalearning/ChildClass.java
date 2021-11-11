package com.viji.javalearning;

public class ChildClass extends ParentClass{

	ChildClass(){
		super();//by default there will be super constructor available 
		//always here to inherit the parent class 
		 
		System.out.println("ChildClass");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChildClass child=new ChildClass();
	}

}
