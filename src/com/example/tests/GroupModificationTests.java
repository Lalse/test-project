package com.example.tests;

import static org.testng.Assert.assertEquals;

import java.util.Collections;
import java.util.List;
import java.util.Random;

import org.testng.annotations.Test;

public class GroupModificationTests extends TestBase {
	
@Test(dataProvider = "randomValidGroupGenerator")
	
	public void modifySomeGroup(GroupData group){
		app.getNavigationHelper().openMainPage();
		app.getNavigationHelper().gotoGroupPage();
		//save old state
	    List<GroupData> oldList = app.getGroupHelper().getGroups();
	    //actions
	    if(oldList.isEmpty()== true)
	    {
	    	
		    creationSomeGroup(group);
		    app.getNavigationHelper().gotoGroupPage();
		    oldList = app.getGroupHelper().getGroups();
	        modifySomeGroupWithVerification(oldList, group);
	    }
	    else
	    {
		
	    	 modifySomeGroupWithVerification(oldList, group);
	    }

}

private void modifySomeGroupWithVerification(List<GroupData> oldList, GroupData group) {
	Random rnd = new Random();
	int index = rnd.nextInt(oldList.size());
	//actions 
	app.getGroupHelper().initGroupModification(index);
	
	app.getGroupHelper().fillGroupForm(group );
	app.getGroupHelper().submitGroupModification();
	app.getNavigationHelper().returnToGroupPage();
	//save new state
	List<GroupData> newList = app.getGroupHelper().getGroups();
	//compare states
	oldList.remove(index);
	oldList.add(group);
	Collections.sort(oldList);
	assertEquals(newList, oldList);
    } 


}
