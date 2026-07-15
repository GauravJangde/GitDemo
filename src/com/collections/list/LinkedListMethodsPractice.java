package com.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListMethodsPractice {

	public static void main(String[] args) {
		LinkedList<String> namesList = new LinkedList<String>();
		namesList.add("Katrina");
		namesList.add("Kareena");
		namesList.add("Alia");
		namesList.add("Katrina");
		namesList.add(null);
		namesList.add("Deepika");

		System.out.println(namesList);

		namesList.add(2, "Disha");
//		System.out.println(namesList);
//		String removedHead=namesList.remove();
//		System.out.println(removedHead);
//		System.out.println(namesList);
//		
//		namesList.remove(0);
//		System.out.println(namesList);
//		
//		namesList.remove("Alia");
		System.out.println(namesList);

		System.out.println(namesList.get(4));
		System.out.println(namesList.contains("Alia"));

		ArrayList<String> al = new ArrayList<String>();
		al.add("Hrithik");
		al.add("Shahrukh");
		al.add("Shahid");

		namesList.addAll(al);
		System.out.println(namesList);

//		for(int i=0;i<namesList.size();i++) {
//			System.out.println(namesList.get(i));
//		}

//		for (String s : namesList) {
//			System.out.println(s);
//		}
		
		/*
		 * Iterator<String>iterator=namesList.iterator(); while(iterator.hasNext()) {
		 * System.out.println(iterator.next()); }
		 */

		namesList.forEach(System.out::println);
	}

}
