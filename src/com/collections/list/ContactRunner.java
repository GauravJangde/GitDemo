package com.collections.list;

import java.util.ArrayList;

public class ContactRunner {

	public static void main(String[] args) {
		
		Contact contactOne = new Contact("Jatin","9876523432");
		Contact contactTwo = new Contact("Uday","9039493939");
		Contact contactThree = new Contact("Santosh","9485849933");
		
		ArrayList<Contact>al = new ArrayList<Contact>();
		al.add(contactOne);
		al.add(contactTwo);
		al.add(contactThree);
		al.add(new Contact("Ricky","9848584858"));
		
		al.forEach(System.out::println);
		
		//Update Contact
		int contactIndex=-1;
		for(int index = 0; index<al.size(); index++) {
			Contact result = al.get(index);
			if(result.getName().equalsIgnoreCase("Santosh")) {
				contactIndex=index;
				break;
			}
		}
		System.out.println("Contact found at Index: "+contactIndex);
		if(contactIndex!=-1) {
			al.set(contactIndex,new Contact("Sandy","8833449933"));
		}
		al.forEach(System.out::println);
		
		//Remove contact from ArrayList
		int contactToRemoveIndex=-1;
		for(int index=0;index<al.size();index++) {
			Contact result = al.get(index);
			if(result.getName().equalsIgnoreCase("Uday")) {
				contactToRemoveIndex = index;
				break;
			}
		}
		System.out.println("Contact found at Index: "+contactToRemoveIndex);
		al.remove(contactToRemoveIndex);
		al.forEach(System.out::println);
	}

}
