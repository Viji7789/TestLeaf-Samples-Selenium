package com.viji.javalearning;

public class LoopingSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//for loop-initialization,condition,incrementation
		//first it will initialize and then go for condition.then it will go inside the loop 
		//and perform the operation.
		//then it will increment the value,then again runs the condition.
	/*	for(int i=0;i<5;i++) {
			i=i+2;
			System.out.println("i value is:"+ i);
		}*/
		
/*WHILE
		int i=1;
		while(i<6) {
			System.out.println("Print i value:"+ i);
			i=i+2;
		}*/
		
		int i=0;
		do {
			System.out.println("do while loop");
			i++;
		} while (i<5);
		
	}

	
}
