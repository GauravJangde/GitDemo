package com.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ContactManager {
	private List<Contact>contactList; 
	
	public ContactManager() {
		contactList = new ArrayList<Contact>();
	}
	
	public void addContact(Contact contactToAdd) {
		if(contactList.add(contactToAdd))
		{
		System.out.println("Contact Added successfully");
		}
		else {
			System.err.println("Opps something went wrong!!!");
		}
	}
	
	public void showAllContacts() {
		for(Contact data:contactList) {
			System.out.println(data.getName()+"\t"+data.getContactNumber());
		}
	}
	
	public void searchContact(String nameOrContactNumber) {
		int contactIndexFound = -1;
		Contact contact;
		for(int index=0;index<contactList.size();index++) {
			contact = contactList.get(index);
			if((contact.getName().equalsIgnoreCase(nameOrContactNumber))||(contact.getContactNumber().equalsIgnoreCase(nameOrContactNumber))){
				contactIndexFound = index;
				break;
			}
		}
		if(contactIndexFound == -1) {
			System.err.println("Contact not found");
		}
		else {
			System.out.println(contactList.get(contactIndexFound));
		}
	}
	
	public void updateContact(String nameOrContactNumber,Contact updatedContactInfo) {
		int contactIndexFound = -1;
		Contact contact;
		for(int index=0;index<contactList.size();index++) {
			contact = contactList.get(index);
			if((contact.getName().equalsIgnoreCase(nameOrContactNumber))||(contact.getContactNumber().equalsIgnoreCase(nameOrContactNumber))){
				contactIndexFound = index;
				break;
			}
		}
		if(contactIndexFound == -1) {
			System.err.println("Contact not found");
		}
		else {
			contactList.set(contactIndexFound, updatedContactInfo);
			System.out.println("Contact updated successfully");
		}
	}
	
	public void removeContact(String nameOrContactNumber) {
		int contactIndexFound = -1;
		Contact contact;
		for(int index=0;index<contactList.size();index++) {
			contact = contactList.get(index);
			if((contact.getName().equalsIgnoreCase(nameOrContactNumber))||(contact.getContactNumber().equalsIgnoreCase(nameOrContactNumber))){
				contactIndexFound = index;
				break;
			}
		}
		if(contactIndexFound == -1) {
			System.err.println("Contact not found");
		}
		else {
			contactList.remove(contactIndexFound);
			System.out.println("Contact deleted successfully");
		}
	}

}
