package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Logout {
	
	private WebDriver driver;
	private By userProfile = By.xpath("//img[@alt='profilepic']");
	private By logoutButton = By.xpath("//button[@role='menuitem']");
	private By ebuddyuserProfile = By.xpath("//button[@data-toggle='dropdown']");
	private By ebuddyLogoutButton = By.xpath("//button[normalize-space()='LogOut']");
	
	public Logout(WebDriver driver) {
		this.driver = driver;
	}
	public String getTitleOfLandingPage() {
		return driver.getTitle();
	}
	
	public void goToUserProfile() {
		driver.findElement(userProfile).click();
		
	}
	public void clickOnLogoutButton() {
		driver.findElement(logoutButton).click();
	}
	public String getTitleOfLoginPage() {
		return driver.getTitle();
	}
	public void goToUserProfileInEbuddyApplication() {
		driver.findElement(ebuddyuserProfile).click();
		
	}
	public void clickOnLogoutButtonInEbuddyApplication() {
		driver.findElement(ebuddyLogoutButton).click();
	}

}
