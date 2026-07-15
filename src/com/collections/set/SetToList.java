package com.collections.set;

import java.util.ArrayList;
import java.util.HashSet;

public class SetToList {

	public static void main(String[] args) {

		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("Ramesh");
		hashSet.add("Suresh");
		hashSet.add("Mahesh");
		hashSet.add("Jignesh");
		hashSet.add("Suresh");
		
		ArrayList<String>al= new ArrayList<String>(hashSet);
		System.out.println(al.get(3));

	}

}
