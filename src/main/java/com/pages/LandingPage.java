package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	private WebDriver driver;
	
	//By Locators of Landing Page
	private By applicationNames = By.xpath("//mat-card-title[@class = 'card-name ng-star-inserted']");
	
	//Constructor
	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//methods
	public String getLandingPageTitle() {
		return driver.getTitle();
	}
	
	public int getapplicationsCount() {
		return driver.findElements(applicationNames).size();
	}
	
	public List<String> getapplicationNamesList() {
		List<String> appsTextList = new ArrayList<>();
		 List<WebElement> appLists = driver.findElements(applicationNames);
		 
		 for(WebElement e : appLists) {
			 String text = e.getText();
			 System.out.println(text);
			 appsTextList.add(text);
		 }
		return appsTextList;
	}

}
