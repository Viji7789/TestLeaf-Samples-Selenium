package com.viji.javalearning;

public class StaticVariableSample {
//example to show oly single copy of static variable is created
//and shared among all the instances of the class.
	static int student_id;
	String student_name;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*StaticVariableSample statobj=new StaticVariableSample();
		
		statobj.student_id=1223;
		statobj.student_name="Denny";
		System.out.println("Student1 details:");
		System.out.println("id:"+ statobj.student_id);
		System.out.println("name:"+ statobj.student_name);
	
	
		StaticVariableSample statobj2=new StaticVariableSample();
		
		statobj2.student_id=123;
		statobj2.student_name="Dylon";
		System.out.println("Student2 details:");
		System.out.println("id:"+ statobj2.student_id);
		System.out.println("name:"+ statobj2.student_name);*/
		
		
		StaticVariableSample statobj=new StaticVariableSample();
		statobj.student_id=1223;
		statobj.student_name="Denny";
		
	
		StaticVariableSample statobj2=new StaticVariableSample();
		statobj2.student_id=123;
		statobj2.student_name="Dylon";
		
		System.out.println("Student1 details:");
		System.out.println("id:"+ statobj.student_id);
		System.out.println("name:"+ statobj.student_name);
	
		System.out.println("Student2 details:");
		System.out.println("id:"+ statobj2.student_id);
		System.out.println("name:"+ statobj2.student_name);
	}

}
