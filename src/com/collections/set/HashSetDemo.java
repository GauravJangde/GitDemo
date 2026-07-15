package com.collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetDemo {

	public static void main(String[] args) {
		Set<String>names = new TreeSet<String>();
		names.add("Satish");
		names.add("Manish");
		names.add("Shubham");
		names.add("Sumit");
		names.add("Raj");
		names.add("Shubham");
		
		System.out.println(names);

	}

}
