package com.example.tests;

import static org.testng.Assert.assertEquals;

import java.util.Collections;
import java.util.List;

import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase{
	

  
  @Test(dataProvider = "randomValidContactGenerator")
  public void testCreationNewContactWithValidData(ContactData contact) throws Exception {
    app.getNavigationHelper().openMainPage();
    //save old state
     List<ContactData> oldList = app.getContactHelper().getContacts();
       
    //actions
    
	createSomeContact(contact);
    app.getNavigationHelper().gotoHome();
    //save new state
    List<ContactData> newList = app.getContactHelper().getContacts();
    //compare states
   
    oldList.add(contact);
    Collections.sort(oldList);
    Collections.sort(newList);
    assertEquals(newList, oldList);
    
  }

  
}
