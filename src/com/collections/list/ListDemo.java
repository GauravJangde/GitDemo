package com.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		
		Integer arr[]= {4,5,6,3,9};
		List<Integer>arrlist = Arrays.asList(arr);
		for(Integer a:arrlist) {
			System.out.println(a);
		}
		
	}

}
