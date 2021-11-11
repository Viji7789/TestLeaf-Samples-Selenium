package com.viji.javalearning;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListSample {

	public void arrayList() {
		List<String> array=new ArrayList<String>();
		//ArrayList maintains insertion order
		//ArrayList allows duplicate elements
		array.add("apple");
		array.add("bat");
		array.add("cat");
		array.add("dog");
		array.add("apple");
		System.out.println("The list includes :"+ array);
		
		System.out.println("Index(2) is: "+array.get(2));
		
		System.out.println("Index position of element:"+array.indexOf("dog"));
		
		System.out.println("Last index position of element:"+
		array.lastIndexOf("apple"));
		
		//copy from one list to another
		List<String> secondList=new ArrayList<String>();
		secondList.addAll(array);
		//secondList.addAll(0,array);
		System.out.println("The second list contains:"+secondList);
		
		/*//delete all elements
		secondList.clear();
		System.out.println("The second list contains:"+secondList);*/
		
		//to remove particular element
		secondList.remove(0);//using index
		secondList.remove("cat");
		System.out.println("The second list contains:"+secondList);
		
		//inserting null value
		secondList.add(null);
		System.out.println("The second list contains:"+secondList);
		
		//to update the element in a particular position, using set
		secondList.set(0, "cat");
		System.out.println("The second list contains:"+secondList);
		
		//check is empty
		System.out.println("The second list contains:"+secondList.isEmpty());
	
	//Iterate using for each
		for (String string : secondList) {
			System.out.println(string);
		}
	
		//iterate using normal for loop
		for(int i=0;i<array.size();i++)
		{
			System.out.println(array.get(i));
		}
	
		//iterate using ListIterator<>
		ListIterator<String> listiterator=array.listIterator();
		//forward traversing
		while(listiterator.hasNext()) {
			System.out.println(listiterator.next());
		}
		
		//reverse traversing
		while(listiterator.hasPrevious()) {
			System.out.println(listiterator.previous());
		}
		
		//using Iterator<>
		Iterator<String> iterator=array.iterator();
		//Iterator can do oly forward traversing
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayListSample list=new ArrayListSample();
		list.arrayList();
		
	}

}
