package com.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterationForArrayList {

	public static void main(String[] args) {
		List<Integer>numberList = new ArrayList<Integer>();
		numberList.add(10);
		numberList.add(20);
		numberList.add(30);
		numberList.add(40);
		
		/*
		 * for(int index=0;index<numberList.size();index++) {
		 * System.out.println(numberList.get(index)); }
		 * 
		 * System.out.println("Printing using Iterator");
		 * 
		 * Iterator<Integer>NumberIterator = numberList.iterator();
		 * 
		 * while(NumberIterator.hasNext()) { System.out.println(NumberIterator.next());
		 * }
		 */
		Iterator<Integer>NumberIterator = numberList.iterator();
		//numberList.forEach(System.out::println);
		NumberIterator.forEachRemaining(x->System.out.println(x));
	}

}
