package com.viji.javalearning;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetSample {
	/*No of constructors available for HashSet=4
	 * 1.HashSet hs=new HashSet();size:16 and fill ratio is 75%
	 * 2.HashSet hs=new HashSet(int initialSize);size as declared and fillratio is default
	 * 3.HAshSet hs=new HashSet(int initialSize,float fillRatio); both size and fill ratio can be declared
	 * 4.HashSet hs=new HashSet(Collection c);creates a HashSet for any given collection
	*/
	
	public void HashSetMethods() {
		HashSet<String> hashset=new HashSet<String>();
		hashset.add("Table");
		hashset.add("Chair");
		hashset.add("Sofa");
		hashset.add("Table");
		hashset.add("Matress");
		System.out.println("HashSet includes:"+ hashset);
		
		hashset.clone();
		System.out.println("HashSet clone includes:"+ hashset);

		System.out.println(hashset.contains("Chair"));
		
		Iterator<String> iterator=hashset.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		

	}
	public static void main(String[] args) {
		HashSetSample hs=new HashSetSample();
		hs.HashSetMethods();
	}

}
