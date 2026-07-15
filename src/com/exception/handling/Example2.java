package com.exception.handling;

public class Example2 {

	public static void main(String[] args) {
		try {
		int result = 10/10;
		int arr[] = new int[2];
		System.out.println(arr[2]);
		Person p = null;
		System.out.println(p.getName());
		}
		catch(ArithmeticException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		catch(NullPointerException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		

	}

}
