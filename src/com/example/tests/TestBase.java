package com.example.tests;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import com.example.fw.ApplicationManager;

public class TestBase {
	
	static ApplicationManager app;
	
   @BeforeTest
	public void setUp() throws Exception {
		app = new ApplicationManager();
	    
	  }

	@AfterTest
	public void tearDown() throws Exception {
		app.stop();
	    
	  }
	@DataProvider
	public Iterator<Object[]> randomValidGroupGenerator() {
		List<Object[]> list = new ArrayList<Object[]>();
		
		for (int i=0; i<5; i++) {
			GroupData group = new GroupData();
			group.groupname = generateRandomString();
			group.header = generateRandomString();
			group.footer = generateRandomString();
			list.add(new Object[]{group});
			
		}
		
		return list.iterator();
	}
	
	@DataProvider	
	public Iterator<Object[]> randomValidContactGenerator(){
		List<Object[]> list = new ArrayList<Object[]>();
		Random rnd = new Random();
		for(int i=0; i<5; i++){
			ContactData contact = new ContactData();
			
			contact.contactname = generateRandomString();
			contact.lastname = generateRandomString();
			 contact.adress1 = generateRandomString();
			 contact.telefoneHome = generateRandomString();
			 contact.telefoneMobile = generateRandomString();
			 contact.telefoneWork = generateRandomString();
			 contact.email1 = generateRandomString();
			 contact.email2 = generateRandomString();
			 contact.selectDay = "";
			 contact.selectMonth = "";
			 contact.year = "";
			 contact.adress2_2 = generateRandomString();
			 contact.telefoneHome2 = generateRandomString();
			 list.add(new Object[]{contact});
			
			
		}
		
		return list.iterator();
		
	}
	
	public String generateRandomString() {
		Random rnd = new Random();
		if (rnd.nextInt(3) == 0){
			return "";	
		}
		else{
			
			return "test" + rnd.nextInt();
		}
	}
	
	

	protected void creationSomeGroup(GroupData group) {
		app.getGroupHelper().initGroupCreation();
	    app.getGroupHelper().fillGroupForm(group);
	    app.getGroupHelper().submitGroupCreation();
	}

	protected void createSomeContact(ContactData contact) {
		app.getContactHelper().initNewContactCreation();
		app.getContactHelper().fillContactForm(contact);
	    app.getContactHelper().submitNewContactCreation();
	} 
	
	

}
