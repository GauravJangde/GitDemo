package com.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayVsArrayList {
	public static void main(String[] args) {
		int numbers[] = new int[5];
		numbers[0]=10;
		numbers[1]=20;
		numbers[2]=30;
		numbers[3]=40;
		numbers[4]=50;
		
		
		ArrayList<Integer>al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		
		
		System.out.println(Arrays.toString(numbers));
		System.out.println(al);
		
		al.add(1, 55);
		System.out.println(al);
		al.remove(0);
		System.out.println(al);
		
		Collections.sort(al);
		System.out.println(al);
		
		Collections.reverse(al);
		System.out.println(al);
		
		al.remove(new Integer(60));
		System.out.println(al);
		
		al.add(0, 60);
		System.out.println(al);
		
		System.out.println(al.indexOf(50));
		System.out.println("--------------------");
		Integer arr[] = al.toArray(new Integer[0]);
		for(Integer a:arr) {
			System.out.println(a);
		}
		System.out.println(arr.length);
	}
}
