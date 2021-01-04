package com.gsd.sreenidhi.automation.app.stepDefinitions;

import org.openqa.selenium.By;

import com.gsd.sreenidhi.cheetah.actions.selenium.SeleniumActions;

import io.cucumber.java.en.*;
public class home {
	/**
	 * 
	 * this method is used to choose home
	 */
	@Given("^I choose Home$")
	public void i_choose_Home() throws Throwable {
		SeleniumActions.click(By.xpath("//*[@id=\"nav\"]/li[1]/a"));
	}
	
	/**
	 * @throws Throwable
	 */
	@And("^Navigation to who we are$")
	public void navigation_to_who_we_are() throws Throwable {
		SeleniumActions.click(By.xpath("//*[@id=\"nav\"]/li[1]/ul/li[1]/a"));
	}
	
	/**
	 * 
	 * @param arg1
	 * @throws Throwable
	 */
	@And("^I enter email \"([^\"]*)\" in Email field$")
	public void i_enter_email_in_Email_field(String arg1) throws Throwable {
		SeleniumActions.enter_text(By.id("TX_EMAIL"), arg1);
	}
	
	/**
	 * 
	 * @throws Throwable
	 */
	@And("^I subcribe$")
	public void i_subcribe() throws Throwable {
		SeleniumActions.click(By.xpath("/html/body/div/div[3]/footer/div[1]/div/div/div[2]/div[2]/div/div/form/div/button/span"));
	}
	
	/**
	 * @throws Throwable
	 */
	@And("^Navigation to Careers$")
	public void navigation_to_careers() throws Throwable {
		SeleniumActions.click(By.xpath("//*[@id=\"body-container\"]/section[1]/div/div[1]/h2"));
	}
	
	/**
	 * @throws Throwable
	 */
	@And("^I select Join us$")
	public void i_select_join_us() throws Throwable {
		SeleniumActions.click(By.xpath("//*[@id=\"body-container\"]/section[1]/div/div[2]/div[2]/a"));
	}
	
	/**
	 * @throws Throwable
	 */
	@And("^I navigate to why work with us$")
	public void navigation_to_why_work_with_us() throws Throwable {
		SeleniumActions.click(By.xpath("//*[@id=\"nav\"]/li[1]/ul/li[2]/a"));
	}
	
	@And("^I navigate to the Complex Page$")
	public void i_navigate_to_the_Complex_Page() throws Throwable {
		SeleniumActions.click(By.xpath("//*[@id=\"nav\"]/li[1]/ul/li[2]/a"));
	}
	
}
