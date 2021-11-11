package com.viji.javalearning;

public class StringBufferSample {

	public static void main(String[] args) {

		System.out.println("String is IMMUTABLE");
		String name="Nitin";
		System.out.println(name.concat("Kabilan"));
		System.out.println("Original String:"+ name);
		
		System.out.println("StringBuffer is MUTABLE");
		//only using new keyword we can initialize stringbuffer
		StringBuffer value=new StringBuffer("Kavin");
		System.out.println(value.append("Kabilan"));
		System.out.println("Original string:"+ value);
		
		//StringBuffer methods
		StringBuffer value2=new StringBuffer("Welcome");
		//Reverse
		System.out.println(value2.reverse());
		
		//Replace
		//Replaces the characters in a substring of this sequence 
		//with characters in the specified String. The substringbegins 
		//at the specified start and extends to the characterat index 
		//end - 1 or to the end of thesequence if no such character exists
		System.out.println(value.replace(0, 5, "Nitin"));
		
		//delete
		System.out.println(value2.delete(0, 2));
		
		//insert
		System.out.println(value2.insert(0, "em"));
		
		//Returns the current capacity
		System.out.println(value.capacity());
		//like String we have charAt(), Substring(), length() methods also
	}
}
