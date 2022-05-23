package com.example.SpringbootWebApp;

import java.util.ArrayList;
import java.util.List;

public class ContactBusiness {

	public List<Contact> getContactList(){
		List<Contact> listContact = new ArrayList<>();
		
		listContact.add(new Contact("Abin Rajan", "abinrajan@gmail.com","India"));
		listContact.add(new Contact("Shabil Babu", "shabilbabu@gmail.com","India"));
		listContact.add(new Contact("Shyamjith P", "shyamjithp@gmail.com","India"));
		listContact.add(new Contact("Alexander", "alexander@gmail.com","USA"));

		return listContact;
	}
}
