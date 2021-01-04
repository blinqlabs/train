package com.gsd.sreenidhi.automation.app.stepDefinitions;

import org.openqa.selenium.By;

import com.gsd.sreenidhi.cheetah.actions.selenium.SeleniumActions;

import io.cucumber.java.en.*;
public class Blog {
	/**
	 * @throws Throwable
	 * i choose blog section in the home page
	 */
	
	@And("^i choose blog$")
	public void i_choose_blog() throws Throwable {
		SeleniumActions.click(By.xpath("//*[@id=\"nav\"]/li[4]/a"));
	}
	
	/**
	 * @throws Throwable
	 * i choose read under the key to a successful DevOps implementation section under blog
	 */
	@And("^I choose Read under The key to a successful DevOps implementation$")
	public void i_choose_Read_under_The_key_to_a_successful_DevOps_implementation() throws Throwable {
		SeleniumActions.click(By.xpath("//*[@id=\"body-container\"]/div[2]/div[1]/div[1]/a/div/div[2]/button"));
	}
	
	
	/**
	 * @throws Throwable
	 * i choose read under Blinqlabs launch
	 */
	@And("^I choose Read under Blinqlabs Launch$")
	public void i_choose_Read_under_DevOps_A_beginner_guide() throws Throwable {
		SeleniumActions.click(By.xpath("//*[@id=\"body-container\"]/div[2]/div[1]/div[3]/a/div/div[2]/button"));
	}

	/**
	 * @throws Throwable
	 * then i click save button, to save all the information
	 */
	@And("^i choose save$")
	public void i_choose_save() throws Throwable {
		SeleniumActions.click(By.xpath("//*[@id=\"save-comment\"]"));
	}

}
