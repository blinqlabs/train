package com.gsd.sreenidhi.automation.app.stepDefinitions;

import org.openqa.selenium.By;

import com.gsd.sreenidhi.cheetah.actions.selenium.SeleniumActions;

import io.cucumber.java.en.*;

public class Product {
	/**
	 * @throws Throwable
	 * i choose product page in the home
	 */
	@And("^i choose product$")
	public void i_choose_product() throws Throwable {
		SeleniumActions.click(By.xpath("//*[@id=\"nav\"]/li[2]/a"));
	}
	
	/**
	 * @throws Throwable
	 * i choose cheetah in the deopdown
	 */
	@Then("^I navigate to cheetah$")
	public void i_navigate_to_cheetah() throws Throwable {
		SeleniumActions.click(By.xpath("//*[@id=\"nav\"]/li[2]/ul/li/a"));
	}
	
	/**
	 * @throws Throwable
	 * and i select on the button "get started"
	 */
	@And("^I choose get started$")
	public void i_choose_get_started() throws Throwable {
		SeleniumActions.click(By.xpath("//*[@id=\"body-container\"]/div[2]/div[3]/div/div/div/div[1]/a"));
	}
	
	/**
	 * @param arg1
	 * @throws Throwable
	 * i enter my email id in the email field
	 */
	@And("^I enter email \"([^\"]*)\" in Email field$")
	public void i_enter_email_in_Email_field(String arg1) throws Throwable {
		SeleniumActions.enter_text(By.id("TX_EMAIL"), arg1);
	}

}
