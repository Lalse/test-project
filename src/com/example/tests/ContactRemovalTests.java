package com.example.tests;

import static org.testng.Assert.assertEquals;

import java.util.Collections;
import java.util.List;
import java.util.Random;

import org.testng.annotations.Test;

public class ContactRemovalTests extends TestBase {
	
@Test
	
	public void deleteSomeContact(){
		app.getNavigationHelper().openMainPage();
		//save old state
	     List<ContactData> oldList = app.getContactHelper().getContacts();
	     if(oldList.isEmpty()== true)
	     {
	    	ContactData contact = new ContactData();
	    	contact.contactname = generateRandomString();
	    	contact.lastname = generateRandomString();
	    	createSomeContact(contact);
	    	app.getNavigationHelper().gotoHome();
	    	oldList = app.getContactHelper().getContacts();
	    	removeSomeContactWithVerification(oldList);	 
	     }
	     else
	     {
	     removeSomeContactWithVerification(oldList);
	     }
	}

private void removeSomeContactWithVerification(List<ContactData> oldList) {
	Random rnd = new Random();
	 int index = rnd.nextInt(oldList.size());  
	//actions
	app.getContactHelper().openEditContactForm(index);
	app.getContactHelper().deleteContact();
	app.getNavigationHelper().gotoHome();
	//save new state
	List<ContactData> newList = app.getContactHelper().getContacts();
	//compare states
   
	oldList.remove(index);
	Collections.sort(oldList);
	assertEquals(newList, oldList);
}

}
