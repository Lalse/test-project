package com.example.tests;

import static org.testng.Assert.assertEquals;

import java.util.Collections;
import java.util.List;
import java.util.Random;

import org.testng.annotations.Test;

import bsh.Console;

public class GroupRemovalTests extends TestBase{
	
	@Test
	
	public void deleteSomeGroup(){
		app.getNavigationHelper().openMainPage();
		app.getNavigationHelper().gotoGroupPage();
		//save old state
	    List<GroupData> oldList = app.getGroupHelper().getGroups();
	    if(oldList.isEmpty()== true)
	    {
	    	GroupData group = new GroupData();
			group.groupname = generateRandomString();
			group.header = generateRandomString();
			group.footer = generateRandomString();	
		    creationSomeGroup(group);
		    app.getNavigationHelper().gotoGroupPage();
		    oldList = app.getGroupHelper().getGroups();
		    removeSomeGroupWithVerification(oldList);		    	
	    }
	    else 
	    {
	    	removeSomeGroupWithVerification(oldList);	    
	    }
	    
		
		
	}

	private void removeSomeGroupWithVerification(List<GroupData> oldList) {
		Random rnd = new Random();
	    int index = rnd.nextInt(oldList.size());
	     //actions 
		app.getGroupHelper().deleteGroup(index);
		app.getNavigationHelper().returnToGroupPage();
		//save new state
		List<GroupData> newList = app.getGroupHelper().getGroups();
		//compare states
		oldList.remove(index);
		Collections.sort(oldList);
		assertEquals(newList, oldList);
	}
	

}
