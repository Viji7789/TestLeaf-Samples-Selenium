package com.viji.javalearning;

public class ReturnTypeSample {

	Integer Age=5;
	Integer Student_id=34545;
	String Student_name="Elisa";
	
	
	public String getstudent_name() {
		//System.out.println("The student name is:"+ Student_name);
		return Student_name;
	}
	
	public Integer getstudent_id() {
		return Student_id;
	}
	
	public Integer getstudent_age() {
		return Age;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReturnTypeSample returntype=new ReturnTypeSample();
		System.out.println("Student id is:"+returntype.getstudent_id());
		System.out.println("Student name is:"+returntype.getstudent_name());
		System.out.println("Student age is:"+returntype.getstudent_age());
	}

}
