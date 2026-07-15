package com.exception.handling;

public class Demo {

	public static void main(String[] args) {
		
		int arr[] = new int[3];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		try {
		arr[3]=40;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		for (int i : arr) {
			System.out.println(i);
		}

	}

}
