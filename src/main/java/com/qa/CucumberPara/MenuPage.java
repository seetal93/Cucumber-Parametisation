package com.qa.CucumberPara;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuPage {
	
	@FindBy(xpath = "//*[@id=\"wsb-button-00000000-0000-0000-0000-000451955160\"]/span")
	List<WebElement> isItThere;

	public boolean isListPresent() {
		if(isItThere.size() > 1) {
			return true;
		} else {
			return false;
		}
	}

}
