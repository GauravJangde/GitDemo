package com.demo;

public class Runner {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.setId(10);
		p1.setName("Vavin");
		
		Person P2 = new Person("Paresh",32);
		
		System.out.println("*********************");
		
		Person copyPerson = new Person(P2);
		System.out.println(copyPerson.getId());
		System.out.println(copyPerson.getName());
		

	}

}
