package com.example.tests;

import org.testng.annotations.Test;

public class ContactRemovalTests extends TestBase {
	
@Test
	
	public void deleteSomeContact(){
		app.getNavigationHelper().openMainPage();
		app.getContactHelper().openEditContactForm(0);
		app.getContactHelper().deleteContact();
		app.getNavigationHelper().gotoHome();
		
	}

}