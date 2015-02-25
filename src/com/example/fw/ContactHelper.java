package com.example.fw;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.example.tests.ContactData;
import com.example.tests.GroupData;
import com.example.tests.TestBase;

public class ContactHelper extends HelperBase {

	public ContactHelper(ApplicationManager manager) {
		super(manager);
		
	}

	public void submitNewContactCreation() {
		click(By.name("submit"));
	}

	public void fillContactForm(ContactData contact) {
		
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

	public void deleteContact() {
		click(By.xpath("//input[@value ='Delete']"));
		
	}

	public void openEditContactForm(int index) {
		
		 if (driver.findElement(By.xpath("(.//*[@id='maintable']/tbody/tr/td[7]/a/img)[" + (index + 1) + "]"))!= null)
		{
		click(By.xpath(( "(.//*[@id='maintable']/tbody/tr/td[7]/a/img)[" + (index + 1) + "]")));
		}
				
	}

	
	public void submitContactModification() {
		click(By.xpath("//input[@value ='Update']"));
		
	}

	public List<ContactData> getContacts() {
		List<ContactData> contacts = new ArrayList<ContactData>();
		List<WebElement> checkboxes = driver.findElements(By.name("selected[]"));
		for (WebElement checkbox : checkboxes) {
			ContactData contact = new ContactData();
			String title = checkbox.getAttribute("title");
			contact.lastname = title.substring(title.lastIndexOf(" "), title.indexOf(")")); 
			contact.contactname = title.substring(title.indexOf("(")+1, title.lastIndexOf(" "));
			contacts.add(contact);
		}
		return contacts;
	}

}
