package com.collections.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<String,String> countryCapitalMap = new HashMap<String,String>();
		countryCapitalMap.put("India", "New Delhi");
		countryCapitalMap.put("USA", "Washington DC");
		countryCapitalMap.put("UK", "London");
		
		System.out.println(countryCapitalMap.get("India"));
		
		for(Map.Entry<String,String>entry:countryCapitalMap.entrySet()) {
			System.out.println(entry.getKey()+"-------->"+entry.getValue());
		}
		

	}

}
