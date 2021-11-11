package com.viji.javalearning;

public class StringSample {

	public static void main(String[] args) {

		String name="NitinKabilan";
	
		//returns character value for particular index
		System.out.println(name.charAt(3));
		
		//returns string length
		System.out.println(name.length());
		
		//checks the equality of string and also checks casesensitive
		System.out.println(name.equals("nitin"));
		
		//checks the equality of string and also ignores casesensitive
		System.out.println(name.equalsIgnoreCase("nitinkabilan"));
		
		//checks if string is empty or not
		System.out.println(name.isEmpty());
		
		//returns true or false based on the given value is present or not
		//and also checks case sensitive
		System.out.println(name.contains("t"));
		
		//Returns a string that is a substring of this string.
		//The substring begins with the character at the specified index 
		//and extends to the end of this string. 
		System.out.println(name.substring(2));
		
		//another substring method
		//Returns a string that is a substring of this string. 
		//The substring begins at the specified beginIndex and extends to 
		//the character at index endIndex - 1.
		//Thus the length of the substring is endIndex-beginIndex. 
		System.out.println(name.substring(2, 7));
		
		//Concatenates the specified string to the end of this string. 
		System.out.println(name.concat("hi"));
		
		//replaces the exisiting char with given char
		//Returns a string resulting from replacing all occurrences 
		//of oldChar in this string with newChar. Case sensitive
		System.out.println(name.replace("N", "K"));
		System.out.println(name.replace("t", "v"));;
		
		//Replaces each substring of this string that matches the 
		//literal target sequence with the specified literal 
		//replacement sequence
		System.out.println(name.replace("Nitin", "Kavin"));
		
		//Returns the index within this string of the first occurrence
		//of the specified substring. 
		System.out.println(name.indexOf("i"));
		
		//Returns the index within this string of the first occurrence 
		//of the specified substring. 
		System.out.println(name.indexOf("tin"));
		
		//Returns the index within this string of the first occurrence
		//of the specified substring, starting at the specified index. 
		System.out.println(name.indexOf("n", 5));
		
		//Returns the index within this string of the first occurrence
		//of the specified substring, starting at the specified index. 
		System.out.println(name.indexOf("Kab", 4));
		
		//Returns a string whose value is this string, 
		//with all leading and trailing space removed, 
		//where space is defined as any character whose 
		//codepoint is less than or equal to 'U+0020' (the space character).
		String trimvalue=" special value ";
		System.out.println(trimvalue.trim());
		
		//Returns the string representation of the int argument. 
		//convert any given data type to string
		int value=4;
		System.out.println(String.valueOf(value));
		
		String uppercase="WELCOME";
		System.out.println(uppercase.toLowerCase());
		
		String lowercase="canada";
		System.out.println(lowercase.toUpperCase());
		
		//Returns a new String composed of copies of the CharSequence
		//elements joined together with a copy of the specified 
		//delimiter. 
		System.out.println(String.join("-", "2021","10","20"));
		
		String spiltstring="2021/10/20";
		String[] splittedvalue=spiltstring.split("/");
		for (String string : splittedvalue) {
			System.out.println(string);
		}
		}
}
