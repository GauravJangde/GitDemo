package com.collections.list;

import java.util.Iterator;
import java.util.Vector;

public class Vector101 {

	public static void main(String[] args) {
		Vector<Integer>vector = new Vector<Integer>();
		vector.addElement(10);
		vector.add(20);
		vector.add(30);
		vector.add(40);
		vector.add(50);
		
		System.out.println(vector);
		System.out.println(vector.firstElement());
		System.out.println(vector.lastElement());
		System.out.println(vector.elementAt(2));
		System.out.println(vector.get(2));
		vector.remove(3);
		System.out.println(vector);
		
		Iterator <Integer>iterator = vector.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		Integer[] arr = vector.toArray(new Integer[0]);
		for(Integer a:arr) {
			System.out.println(a);
		}
	}

}
