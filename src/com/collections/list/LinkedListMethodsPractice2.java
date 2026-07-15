package com.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListMethodsPractice2 {

	public static void main(String[] args) {
		LinkedList<String> namesList = new LinkedList<String>();
		namesList.add("Katrina");
		namesList.add("Kareena");
		namesList.add("Alia");
		namesList.add("Katrina");
		namesList.add(null);
		namesList.add("Deepika");

		System.out.println(namesList);

		namesList.addFirst("Shrivalli");
		namesList.addLast("Poonam");
		System.out.println(namesList);
		
		namesList.removeFirst();
		namesList.removeLast();
		System.out.println(namesList);
		
		String name1 = namesList.peekFirst();
		System.out.println(name1);
		System.out.println(namesList);
		
		String name2 = namesList.pollFirst();
		System.out.println(name2);
		System.out.println(namesList);
		
		namesList.push("Neelam");
		System.out.println(namesList);
		namesList.pop();
		System.out.println(namesList);
	}

}
