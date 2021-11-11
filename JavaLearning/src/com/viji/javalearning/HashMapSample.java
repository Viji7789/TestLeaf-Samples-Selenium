package com.viji.javalearning;

import java.util.HashMap;
import java.util.Map;

public class HashMapSample {

	public void hashmapmethods() {
		HashMap<Integer,String> employeedetails=new HashMap<Integer,String>();
		//to insert element use put
		employeedetails.put(100,"Abi");
		employeedetails.put(101,"Banu");
		employeedetails.put(102,"Cathy");
		employeedetails.put(103,"Denny");
		employeedetails.put(104,"Elsa");
		System.out.println("Employee details:"+employeedetails);
		
		//to make a copy of existing map
		Map<Integer,String> copyMap=new HashMap<Integer,String>();
		copyMap.putAll(employeedetails);
		System.out.println("Copy Map Employee details:"+copyMap);

		//to delete the map contents
		copyMap.clear();
		System.out.println("After clearing:"+copyMap);

		//to check if a key is present or not
		System.out.println("Checking Key:"+employeedetails.containsKey(101));
		
		//to check if a value is present or not
		System.out.println("Checking value:"+employeedetails.containsValue("Elsa"));
		
		//to clone the map (alternate for putall)
		System.out.println("Cloning map:"+employeedetails.clone());
		
		//check is empty
		System.out.println("Check map is empty:"+employeedetails.isEmpty());
		
		//fetch the set of keys in the map
		System.out.println("Set of keys:"+employeedetails.keySet());
		
		//fetch a value
		System.out.println("Any single Value of the map:"+ employeedetails.get(101));
		
		//fetch all the values
		System.out.println("Values in the map:"+employeedetails.values());
		
		//Entry set(combination of key,value)
		System.out.println("EntrySet values:"+employeedetails.entrySet());
	}
	public static void main(String[] args) {
HashMapSample hashmap=new HashMapSample();
hashmap.hashmapmethods();
	}

}
