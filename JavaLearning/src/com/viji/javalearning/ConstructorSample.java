package com.viji.javalearning;

/*DEFAULT CONSTRUCTOR
public class ConstructorSample {

	int Student_id; //default value is 0
	//Integer Student_id;//default value is null
	String Student_name;//default value is null
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorSample defaultconstructor=new ConstructorSample();
		System.out.println(defaultconstructor.Student_id);
		System.out.println(defaultconstructor.Student_name);
	}

}*/

/*NOARGUMENT CONSTRUCTOR
public class ConstructorSample {

	int Student_id; 
	int mark1;
	int mark2;//default value is 0
	//Integer Student_id;//default value is null
	String Student_name;//default value is null
	int Total;
	double Percentage;
	
	ConstructorSample(){
		mark1=80;
		mark2=85;
		Total=mark1+mark2;
		System.out.println("Total mark is :"+ Total);
	}
	
	public double getPercentage() {
		Percentage=Total/2;
		return Percentage;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorSample noargumentconstructor=new ConstructorSample();
		System.out.println("Percentage is:"
		+noargumentconstructor.getPercentage());
	}

}*/

//PARAMETERIZED CONSTRUCTOR
public class ConstructorSample {

	int Student_id=12322; 
	int mark1;
	int mark2;//default value is 0
	//Integer Student_id;//default value is null
	String Student_name="DENNY";//default value is null
	int Total;
	double Percentage;
	
	ConstructorSample(int mark1,int mark2){
		Total=mark1+mark2;
		System.out.println("Total mark is :"+ Total);
	}
	
	public double getPercentage() {
		Percentage=Total/2;
		return Percentage;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorSample parameterizedconstructor=new ConstructorSample(70, 80);
		
		System.out.println("Percentage is:"
		+parameterizedconstructor.getPercentage());
		
		ConstructorSample parameterizedconstructor1=new ConstructorSample(85, 80);
		
		System.out.println("Percentage is:"
		+parameterizedconstructor1.getPercentage());
	}

}