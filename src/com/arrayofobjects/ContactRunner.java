package com.arrayofobjects;

public class ContactRunner {

	public static void main(String[] args) {
		Contact c[]=new Contact[2];
		for(Contact a:c) {
			System.out.println(a);
		}
		c[0]=new Contact("Ravi","9039493939");
		c[1]=new Contact("Kishan","8938384838");
		
		for(Contact a:c) {
			System.out.println(a);
		}
		
		c[0].setContactNumber("5555555555");
		for(Contact a:c) {
			System.out.println(a);
		}

	}

}
