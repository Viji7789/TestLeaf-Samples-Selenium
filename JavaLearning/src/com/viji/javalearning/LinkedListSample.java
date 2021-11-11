package com.viji.javalearning;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListSample {
	
	public void linkedlistmethods() {
		LinkedList<Integer> linkedlist=new LinkedList<Integer>();
		linkedlist.add(2);
		linkedlist.add(20);
		linkedlist.add(32);
		linkedlist.add(42);
		linkedlist.add(62);
		System.out.println("The linked list contains:"+ linkedlist);
		
		linkedlist.addFirst(12);
		System.out.println("The linked list contains:"+ linkedlist);

		linkedlist.addLast(50);
		System.out.println("The linked list contains:"+ linkedlist);

		//to get the first element
		System.out.println("The linked list contains:"+ linkedlist.getFirst());

		//to return the value using index
		System.out.println("The linked list contains:"+ linkedlist.get(2));
		
		//to get the last element
		System.out.println("The linked list contains:"+ linkedlist.getLast());

		//remove and remove first() deletes the first element
		System.out.println("Remove:"+ linkedlist.remove());
		System.out.println("Remove first:"+ linkedlist.removeFirst());
		System.out.println("The linked list contains:"+ linkedlist);

		//remove last() removes the last element
		System.out.println("Remove last:"+ linkedlist.removeLast());
		System.out.println("The linked list contains:"+ linkedlist);

		//poll method and poll first() deletes the first element
		System.out.println("Poll option:"+ linkedlist.poll());
		System.out.println("Poll first:"+ linkedlist.pollFirst());

		//pollLast() deletes the last element
		System.out.println("Poll last:"+ linkedlist.pollLast());

		//insert element
		linkedlist.addFirst(3);
		linkedlist.add(32);
		linkedlist.add(45);
		linkedlist.add(90);
		linkedlist.addLast(100);
		System.out.println("The linked list contains:"+ linkedlist);
		
		//peek and peek first() retrieves the first element
		//and does not remove from the list
		System.out.println("Peek:"+linkedlist.peek());
		System.out.println("Peek first:"+linkedlist.peekFirst());
		
		//peek last() retrieves the last element but does not remove
		System.out.println("Peek last:"+linkedlist.peekLast());
		
		System.out.println("The linked list contains:"+ linkedlist);
		
		//Removes the first occurrence of the specified element
		//in this list (when traversing the list from head to tail). 
		//If the list does not contain the element, it is unchanged.
		//returns true if the value is available

		System.out.println(linkedlist.removeFirstOccurrence(32));
		
		System.out.println(linkedlist.removeLastOccurrence(45));
		
		System.out.println("The linked list contains:"+ linkedlist);
	}
	
	public void linkedlistwithsimpleFor() {
	
		LinkedList<String> forlist=new LinkedList<String>();
		forlist.add("apple");
		forlist.add("banana");
		forlist.add("carrot");
		forlist.add("dates");
		forlist.add("egg");
		for(int index=0;index<forlist.size();index++) {
			//System.out.println("ForList contains:"+forlist.get(index));

}
		System.out.println("ForList contains:"+forlist);
	
	}
	
	public void linkedlistwithiteratorFor() {
		LinkedList<String> iteratorlist=new LinkedList<String>();
		iteratorlist.add("chess");
		iteratorlist.add("ball");
		iteratorlist.add("carrom");
		iteratorlist.add("dice");
		iteratorlist.add("animal");

		Iterator<String> iterator=iteratorlist.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

	public static void main(String[] args) {

		LinkedListSample linkedlistobj=new LinkedListSample();
		linkedlistobj.linkedlistmethods();
		linkedlistobj.linkedlistwithsimpleFor();
		linkedlistobj.linkedlistwithiteratorFor();
	}

}
