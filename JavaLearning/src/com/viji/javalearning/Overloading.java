package com.viji.javalearning;

public class Overloading {
//EXAMPLE FOR CONSTRUCTOR OVERLOADING
	int Student_id=12322; 
	//int mark1;
	//int mark2;
	String Student_name="DENNY";
	static double Total;
	double Percentage;
	
	Overloading(){
		System.out.println("Student id:"+Student_id);
		System.out.println("Student name:"+Student_name);
	}
	
	Overloading(double value1,double value2){
		Total=value1+value2;
		System.out.println("Total is:"+ Total);
	}
	
	Overloading(double percent){
		Percentage=Total/2;
		System.out.println("Percentage is:"+ Percentage);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading overloading=new Overloading();
		Overloading overloading1=new Overloading(80,80);
		Overloading overloading3=new Overloading(Total);
	}

}
