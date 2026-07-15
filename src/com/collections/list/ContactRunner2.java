package com.collections.list;

public class ContactRunner2 {

	public static void main(String[] args) {
		ContactManager contactManager = new ContactManager();
		contactManager.addContact(new Contact("Jatin","9394949494"));
		contactManager.addContact(new Contact("Uday","8948484848"));
		
		contactManager.showAllContacts();
		contactManager.searchContact("9394949494");
		contactManager.updateContact("Uday", new Contact("Satish","9455443322"));
		contactManager.showAllContacts();
		contactManager.removeContact("9394949494");
		contactManager.showAllContacts();
		
	}

}
