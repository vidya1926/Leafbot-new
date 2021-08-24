package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.leafBot.testng.api.base.ProjectSpecificMethods;



public class DuplicateLeadPage extends ProjectSpecificMethods {


	public DuplicateLeadPage(RemoteWebDriver driver, ExtentTest node){
		this.driver = driver;
		this.node = node;
			
	}


	
	public ViewLeadPage clickCreateLeadDublicate(){
		click(locateElement("class","smallSubmit"));
		return new ViewLeadPage(driver, node);
	}
}
