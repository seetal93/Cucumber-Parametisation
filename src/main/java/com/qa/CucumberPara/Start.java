package com.qa.CucumberPara;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Start {

	@FindBy(xpath = "//*[@id=\"wsb-nav-00000000-0000-0000-0000-000450914915\"]/ul/li[3]/a")
	private WebElement searchBox;
	
	public void clickMenu() {
		searchBox.click();
		searchBox.submit();
		
	}

}
