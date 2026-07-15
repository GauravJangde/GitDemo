package com.scanner.demo;

import java.util.Scanner;

public class ScannerRunner {
	public static void main(String[] args) {
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value for age");
		age = sc.nextInt();
		System.out.println("Entered Age is: : "+age);
		sc.nextLine();
		
		System.out.println("Enter your name");
		String name = sc.nextLine();
		System.out.println("Entered name is : "+name);
		
		System.out.println("Enter your percentage");
		float percentage = sc.nextFloat();
		System.out.println("Entered percentage is : "+percentage);
		
		System.out.println("Enter boolean value");
		boolean value = sc.nextBoolean();
		System.out.println("Entered boolean value is : "+value);
		
		System.out.println("Enter double value");
		double data = sc.nextDouble();
		System.out.println("Entered double value is : "+data);
		
		System.out.println("Enter char value");
		char c = sc.next().charAt(0);
		System.out.println("Entered char value is : "+c);
	}
}
