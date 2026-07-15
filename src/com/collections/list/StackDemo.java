package com.collections.list;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<String>name = new Stack<String>();
		name.push("Vikram");
		name.push("Satish");
		name.push("Rajesh");
		name.push("Kunal");
		name.push("Kaustubh");
		
		for(String str:name) {
			System.out.println(str);
		}
//		System.out.println(name.size());
//		System.out.println(name.peek());
//		//System.out.println(name.pop());
//		System.out.println(name.size());
//		System.out.println(name);
//		//System.out.println(name.pop());
//		//System.out.println(name.isEmpty());
//		System.out.println(name.search("Vikram"));
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		for(int index=name.size()-1;index>=0;index--) {
			System.out.println(name.get(index));
		}
		
		
	}

}
