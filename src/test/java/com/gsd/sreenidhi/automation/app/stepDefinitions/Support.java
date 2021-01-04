package com.gsd.sreenidhi.automation.app.stepDefinitions;

import org.openqa.selenium.By;

import com.gsd.sreenidhi.cheetah.actions.selenium.SeleniumActions;

import io.cucumber.java.en.*;
public class Support {
	/**
	 * @throws Throwable
	 * i choose support option in the website
	 */
	@And("^i choose support$")
	public void i_choose_support() throws Throwable {
		SeleniumActions.click(By.xpath("//*[@id=\"nav\"]/li[5]/a"));
	}
	
	

	/**
	 * @throws Throwable
	 * after hovering over the option, i navigate to the content page
	 */
	@And("^i navigate to the contents of the page$")
	public void i_navigate_to_the_contents_of_the_page() throws Throwable {
		SeleniumActions.click(By.xpath("//*[@id=\"nav\"]/li[5]/ul/li[1]/a"));
	}
	
	/**
	 * @throws Throwable
	 * under support, i choose purchasing and licensing
	 */
	@And("^i choose purchasing and licensing$")
	public void i_choose_purchasing_and_licensing() throws Throwable {
		SeleniumActions.click(By.xpath("//*[@id=\"nav\"]/li[5]/ul/li[2]/a"));
	}
	
	/**
	 * @throws Throwable
	 * i choose to navigate to saas as a option in the pricing section
	 */
	@And("^i choose Saas as a option$")
	public void i_choose_Saas_as_a_option() throws Throwable {
		SeleniumActions.click(By.xpath("//*[@id=\"body-container\"]/section[1]/div[2]/div/ul/li[1]/i"));
	}
	
	/**
	 * @throws Throwable
	 * i then continue to purchase now in saas section
	 */
	@And("^i choose purchase as a option$")
	public void i_choose_purchase_as_a_option() throws Throwable {
		SeleniumActions.click(By.xpath("//*[@id=\"body-container\"]/section[1]/div[2]/div/div/div[1]/section/div[2]/div/div[2]/div/div[4]/a"));
	}
	
	/**
	 * @throws Throwable
	 * i choose technical support
	 */
	@And("^i choose Technical Support$")
	public void i_choose_technical_support() throws Throwable {
		SeleniumActions.click(By.xpath("//*[@id=\"body-container\"]/section[1]/div[2]/div/ul/li[2]/i"));
	}
	
	/**
	 * @throws Throwable
	 * i choose contact us option under support
	 */
	@And("^i choose contact us $")
	public void i_choose_contact_us() throws Throwable {
		SeleniumActions.click(By.xpath("//*[@id=\"nav\"]/li[5]/ul/li[4]/a"));
	}
	
}
