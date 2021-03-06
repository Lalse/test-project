package com.example.fw;

import org.openqa.selenium.By;

public class NavigationHelper extends HelperBase {

	public NavigationHelper(ApplicationManager manager) {
		super(manager);
		
	}

	public void openMainPage() {
		driver.get(manager.baseUrl + "/addressbookv4.1.4/");
	}

	public void gotoHome() {
		click(By.linkText("home page"));
	}

	public void gotoGroupPage() {
		click(By.linkText("groups"));
	}

	public void returnToGroupPage() {
		click(By.linkText("group page"));
		
	}

	

}
