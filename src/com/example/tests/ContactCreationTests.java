package com.example.tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase{
  
  @Test
  public void testNonEmptyCreationNewContact() throws Exception {
    openMainPage();
    initNewContactCreation();
    ContactData contact = new ContactData();
    contact.contactname = "contactname1";
    contact.lastname = "last_name";
    contact.adress1 = "adress1";
    contact.telefoneHome = "12345";
    contact.telefoneMobile = "123456";
    contact.telefoneWork = "1234567";
    contact.email1 = "test@test.com";
    contact.email2 = "test1@test.com";
    contact.selectDay = "1";
    contact.selectMonth = "January";
    contact.year = "2014";
    contact.adress2_2 = "adress2";
    contact.telefoneHome2 = "123456";
	fillNewContactForm(contact);
    submitNewContactCreation();
    gotoHome();
  }
  
  @Test
  public void testEmptyCreationNewContact() throws Exception {
    openMainPage();
    initNewContactCreation();
    ContactData contact = new ContactData("", "", "", "", "", "", "", "", "", "", "", "", "");
	fillNewContactForm(contact);
    submitNewContactCreation();
    gotoHome();
  }


 

  
}
