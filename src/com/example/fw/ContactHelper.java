package com.example.fw;

import org.openqa.selenium.By;

import com.example.tests.ContactData;
import com.example.tests.TestBase;

public class ContactHelper extends HelperBase {

	public ContactHelper(ApplicationManager manager) {
		super(manager);
		
	}

	public void submitNewContactCreation() {
		click(By.name("submit"));
	}

	public void fillNewContactForm(ContactData contact) {
		type(By.name("firstname"),contact.contactname);
		type(By.name("lastname"),contact.lastname);
		type(By.name("address"),contact.adress1);
		type(By.name("home"),contact.telefoneHome);
		type(By.name("mobile"), contact.telefoneMobile);
		type(By.name("work"),contact.telefoneWork);
		type(By.name("email"),contact.email1);
		type(By.name("email2"),contact.email2);
		selectByText(By.name("bday"), contact.selectDay);
		selectByText(By.name("bmonth"), contact.selectMonth);
	    type(By.name("byear"),contact.year);
		// selectByText(By.name("new_group"), "group_1");
		type(By.name("address2"),contact.adress2_2);
	    type(By.name("phone2"), contact.telefoneHome2);
		
	   
	   
	}

	public void initNewContactCreation() {
		click(By.linkText("add new"));
	}

}
