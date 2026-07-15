package com.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("Ramesh");
		hashSet.add("Suresh");
		hashSet.add("Mahesh");
		hashSet.add("Jignesh");
		hashSet.add("Suresh");

		System.out.println("HashSet " + hashSet);

		System.out.println("************************************************************************");
		LinkedHashSet<String> linkedhashSet = new LinkedHashSet<String>();
		linkedhashSet.add("Ramesh");
		linkedhashSet.add("Suresh");
		linkedhashSet.add("Mahesh");
		linkedhashSet.add("Jignesh");
		linkedhashSet.add("Suresh");
		System.out.println("LinkedHashSet " + linkedhashSet);

		System.out.println("************************************************************************");
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("Ramesh");
		treeSet.add("Suresh");
		treeSet.add("Mahesh");
		treeSet.add("Jignesh");
		treeSet.add("Suresh");
		System.out.println("TreeSet " + treeSet);

		System.out
				.println("*****************************Printing using Iterator***************************************");
		Iterator<String> it = treeSet.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out
				.println("*****************************Printing using For each***************************************");
		for (String st : hashSet) {
			System.out.println(st);
		}
	}
}
