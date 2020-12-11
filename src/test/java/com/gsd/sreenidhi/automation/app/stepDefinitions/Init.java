package com.gsd.sreenidhi.automation.app.stepDefinitions;

import org.openqa.selenium.By;

import com.gsd.sreenidhi.cheetah.actions.selenium.SeleniumActions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Init {
	@Given("^I launch the url$")
	/**
	 * 
	 * this method simply navigates us to the url when it is launched in the browser
	 */
	public void i_launch_the_url() throws Throwable {
		SeleniumActions.navigate_to("https://qa-test.sreenidhi-gsd.com");
	}

	@When("^I choose Selenium Dropdown$")
	/**
	 * when we choose selenium option from the dropdown, it navigates us to selenium contents
	 * @throws Throwable
	 */
	public void i_choose_Selenium_Dropdown() throws Throwable {
		SeleniumActions.click(By.xpath("//*[@id=\"navbar_global\"]/ul[1]/li[1]"));
	}

	@When("^I navigate to the Complex Page$")
	/**
	 * the contents is displayed in the page, which we choose in the previous page
	 * @throws Throwable
	 */
	public void i_navigate_to_the_Complex_Page() throws Throwable {
		SeleniumActions.click(By.xpath("//*[@id=\"navbar_global\"]/ul[1]/li[1]/div/div/a[1]"));
	}

	@Then("^I click on Checkbox(\\d+)$")
	/**
	 * 
	 * @param arg1
	 * @throws Throwable
	 */
	public void i_click_on_Checkbox(int arg1) throws Throwable {
		if(arg1==1) {
			SeleniumActions.click(By.xpath("//*[@id=\"check_div\"]/div[1]/div[1]/label"));
		}
	}

	@Then("^I select Radio(\\d+)$")
	/**
	 * 
	 * @param arg1
	 * @throws Throwable
	 */
	public void i_select_Radio(int arg1) throws Throwable {
		
	}

	@Then("^I click Button(\\d+)$")
	/**
	 * 
	 * @param arg1
	 * @throws Throwable
	 */
	public void i_click_Button(int arg1) throws Throwable {
		
	}

	@Then("^I enter text \"([^\"]*)\" in TextBox(\\d+)$")
	/**
	 * 
	 * @param arg1
	 * @param arg2
	 * @throws Throwable
	 */
	public void i_enter_text_in_TextBox(String arg1, int arg2) throws Throwable {
		
	}

	@Then("^I enter name \"([^\"]*)\" in Name field$")
	/**
	 * 
	 * @param arg1
	 * @throws Throwable
	 */
	public void i_enter_name_in_Name_field(String arg1) throws Throwable {
		
	}

	@Then("^I enter email \"([^\"]*)\" in Email field$")
	/**
	 * 
	 * @param arg1
	 * @throws Throwable
	 */
	public void i_enter_email_in_Email_field(String arg1) throws Throwable {
		
	}

	@Then("^I enter message \"([^\"]*)\" in Message field$")
	/**
	 * 
	 * @param arg1
	 * @throws Throwable
	 */
	public void i_enter_message_in_Message_field(String arg1) throws Throwable {
		
	}

	@Then("^I click on dropdown Regular$")
	/**
	 * 
	 * @throws Throwable
	 */
	public void i_click_on_dropdown_Regular() throws Throwable {
		
	}

	@Then("^I click on toggle(\\d+)$")
	/**
	 * 
	 * @param arg1
	 * @throws Throwable
	 */
	public void i_click_on_toggle(int arg1) throws Throwable {
	
	}
}
