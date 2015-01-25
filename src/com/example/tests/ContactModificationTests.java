package com.example.tests;

import org.testng.annotations.Test;

public class ContactModificationTests extends TestBase{

	
@Test
	
	public void modifySomeContact(){
		app.getNavigationHelper().openMainPage();
		
		app.getContactHelper().openEditContactForm(1);
		ContactData contact = new ContactData();
		contact.contactname  = "new_name";
		app.getContactHelper().fillContactForm(contact);
		app.getContactHelper().submitContactModification();
		app.getNavigationHelper().openMainPage();
		
	}
}
