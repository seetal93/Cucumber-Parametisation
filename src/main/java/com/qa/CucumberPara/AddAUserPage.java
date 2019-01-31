package com.qa.CucumberPara;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddAUserPage {
	
	@FindBy(xpath = "/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[1]/td[2]/p/input")
	private WebElement username; 
	@FindBy(xpath = "/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[2]/td[2]/p/input")
	private WebElement password; 
	@FindBy(xpath = "/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[3]/td[2]/p/input")
	private WebElement button; 
	
	public void addUser(String user, String pass) {
		username.sendKeys(user);
		password.sendKeys(pass);
		button.click();
		button.submit();
		
	}
	
}

