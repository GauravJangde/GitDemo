package com.calc;

public class CalculatorApp {

	public static void main(String[] args) {
		int num1 = 100;
		int num2 = 25;
		int num3 = 30;
		float num4 = 35.25f;
		
		sum(num1,num2);
		sum(num1,num2,num3);
		sum(num3,num4);

	}

	public static void sum(int num1, int num2) {
		System.out.println(num1+num2);		
	}

	public static void sum(int num1, int num2, int num3) {
		System.out.println(num1+num2+num3);
	}
	public static void sum(int num3, float num4) {
		System.out.println(num3+num4);
	}
}
