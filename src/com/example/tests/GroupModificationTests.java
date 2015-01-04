package com.example.tests;

import org.testng.annotations.Test;

public class GroupModificationTests extends TestBase {
	
@Test
	
	public void modifySomeGroup(){
		app.getNavigationHelper().openMainPage();
		app.getNavigationHelper().gotoGroupPage();
		app.getGroupHelper().initGroupModification(1);
		GroupData group = new GroupData();
		group.groupname  = "new_name";
		app.getGroupHelper().fillGroupForm(group );
		app.getGroupHelper().submitGroupModification();
		app.getNavigationHelper().returnToGroupPage();
		
	}

}
