package com.exception.handling;

import java.util.Stack;

public class ReverseStringUsingStack {

	public static void main(String[] args) {
		String str = "Hello World";
		char[] arr=str.toCharArray();
		Stack<Character>stack = new Stack<Character>();
		for(char a:arr) {
			stack.push(a);
		}
		StringBuilder sb = new StringBuilder();
		while(!stack.isEmpty()) {
			sb.append(stack.pop());
		}
		System.out.println("Reverse of String is :"+sb);
	}

}
