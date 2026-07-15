package com.builder;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Emp e1 = new Emp("Rahul",55,2000);
		//System.out.println(e1);
		
		Emp e2 = new Emp.Builder().name("Ram").salary(2200).empId(56).build();
		System.out.println(e2);
		
		Emp1 empp = new Emp1.Builder1().name("Raj").percent(88).rollNo(5).build();
		System.out.println(empp);
	}

}
