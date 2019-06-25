package com.rubex.steps;

import org.junit.Assert;

import com.orangehrmpages.LogInpage;
import com.orangehrmpages.addEmpl;
import com.syntex.utils.CommonMethods;
import com.syntex.utils.ConfigsReader;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddEmployee extends CommonMethods{
	addEmpl add;
	@Given("I logged in")
	public void i_logged_in() {
		LogInpage log=new LogInpage();
	     log.login(ConfigsReader.getProperty("username"),ConfigsReader.getProperty("password"));
	}

	@Given("I click on PIM")
	public void i_click_on_PIM() {
		add=new addEmpl();
	     CommonMethods.justClick(add.pim);

	}
	
	 
	@When("I provide {string}, {string}, and {string}")
	public void i_provide_and(String fName, String lName, String location) {
		 CommonMethods.sendText(add.firstName, fName);
	     CommonMethods.sendText(add.lastName, lName);
	     CommonMethods.justClick(add.location);
	     CommonMethods.selectList(add.locationList, location);

	}

	@Then("I click on savebotton")
	public void i_click_on_savebotton() {
		CommonMethods.justClick(add.nextBtn);
	}
	@Then("I see {string}, {string}  is displayed")
	public void i_see_is_displayed(String fName, String lName) {
	    waitForElementBeClickable(add.empVer, 20);
		String empName=add.empVer.getText();
	     Assert.assertEquals(fName+" "+lName,  empName);

	}
	@When("I click on employee link")
	public void i_click_on_employee_link() {
		CommonMethods.justClick(add.addEmp);

}}
