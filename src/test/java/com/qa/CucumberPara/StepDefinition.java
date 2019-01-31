package com.qa.CucumberPara;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.assertEquals;

public class StepDefinition {
	
	WebDriver driver;
	MenuPage menuPage;
	Start start;
	
	
	@Before
	public void setup() {
		System.setProperty("phantomjs.binary.exe", Constant.PHANTOMLOCATION);
		driver = new PhantomJSDriver();
	}
	
	@After
	public void teardown() {
		driver.quit();
	}
	
	@Given("^the correct web address$")
	public void the_correct_web_address() throws Throwable {
	    driver.get(Constant.TEATEST);
	    
	}

	@When("^I navigate to the 'Menu' page$")
	public void i_navigate_to_the_Menu_page() throws Throwable {
	    start = PageFactory.initElements(driver, Start.class);
	    start.clickMenu();
	}

	@Then("^I can browse a list of the available products\\.$")
	public void i_can_browse_a_list_of_the_available_products() throws Throwable {
	   menuPage = PageFactory.initElements(driver, MenuPage.class);
	   assertEquals("List not present", true, menuPage.isListPresent());
	}

	@When("^I click the checkout button$")
	public void i_click_the_checkout_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I am taken to the checkout page$")
	public void i_am_taken_to_the_checkout_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
}
