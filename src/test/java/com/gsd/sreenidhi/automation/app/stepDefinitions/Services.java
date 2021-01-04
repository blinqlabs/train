package com.gsd.sreenidhi.automation.app.stepDefinitions;

import org.openqa.selenium.By;

import com.gsd.sreenidhi.cheetah.actions.selenium.SeleniumActions;

import io.cucumber.java.en.*;

public class Services {
	@And("^i choose service$")
	public void i_choose_service() throws Throwable {
		SeleniumActions.click(By.xpath("//*[@id=\"nav\"]/li[3]/a"));
	}
	
	
	
	@And("^I choose Learnmore under manage services$")
	public void i_choose_Learnmore_under_manage_services() throws Throwable {
		SeleniumActions.click(By.xpath("//*[@id=\"body-container\"]/section[1]/div[2]/div/div/div[1]/div/div[3]/div/div[1]/div/div/a/button"));
	}
	
	@And("^I choose Contactus under DevOps$")
	public void i_choose_Contactus_under_DevOps() throws Throwable {
		SeleniumActions.click(By.xpath("//*[@id=\"body-container\"]/section[1]/div[2]/div/div/div[1]/div/div[5]/div/div[2]/div/div/a/button"));
	}
	
	@And("^I choose Learnmore under Cheetah$")
	public void i_choose_Learnmore_under_Cheetah() throws Throwable {
		SeleniumActions.click(By.xpath("//*[@id=\"body-container\"]/section[1]/div[2]/div/div/div[1]/div/div[9]/div/div[2]/div/div/a/button"));
	}

	@And("^I choose cloud$")
	public void i_choose_cloud() throws Throwable {
		SeleniumActions.click(By.xpath("//*[@id=\"body-container\"]/section[1]/div[2]/div/ul/li[2]"));
	}
	
	@And("^I choose workflows and automation$")
	public void i_choose_workflow_and_automation() throws Throwable {
		SeleniumActions.click(By.xpath("//*[@id=\"body-container\"]/section[1]/div[2]/div/ul/li[3]"));
	}
	
	@And("^I choose pricing link$")
	public void i_choose_pricing_link() throws Throwable {
		SeleniumActions.click(By.xpath("//*[@id=\"body-container\"]/section[3]/div/div[2]/div/p/span/a"));
	}
	
	@And("^I choose Custom app development$")
	public void i_choose_Custom_app_development() throws Throwable {
		SeleniumActions.click(By.xpath("//*[@id=\"body-container\"]/section[1]/div[2]/div/ul/li[4]"));
	}
	
	@And("^I choose training$")
	public void i_choose_trainings() throws Throwable {
		SeleniumActions.click(By.xpath("//*[@id=\"body-container\"]/section[1]/div[2]/div/ul/li[5]/i"));
	}
	
	@And("^I choose Enterprice service$")
	public void i_choose_Enterprice_service() throws Throwable {
		SeleniumActions.click(By.xpath("//*[@id=\"nav\"]/li[3]/ul/li[1]/a"));
	}
		
	@And("^I choose Startups and SMBs dropdown under service$")
	public void i_choose_startups_and_SMBs_dropdown_under_service() throws Throwable {
		SeleniumActions.click(By.xpath("//*[@id=\"nav\"]/li[3]/ul/li[2]/a"));
	}

	@And("^I choose DevOps tool chain(Saas) dropdown under service$")
	public void i_choose_DevOps_tool_chain_dropdown_under_service() throws Throwable {
		SeleniumActions.click(By.xpath("//*[@id=\"nav\"]/li[3]/ul/li[3]/a"));
	}
	
	@And("^I choose open source project dropdown under service$")
	public void i_choose_open_source_project_dropdown_under_service() throws Throwable {
		SeleniumActions.click(By.xpath("//*[@id=\"nav\"]/li[3]/ul/li[4]/a"));
	}
	
	@And("^I choose Trainings and certifications dropdown under service$")
	public void i_choose_Trainings_and_certifications_dropdown_under_service() throws Throwable {
		SeleniumActions.click(By.xpath("//*[@id=\"nav\"]/li[3]/ul/li[5]/a"));
	}
}
