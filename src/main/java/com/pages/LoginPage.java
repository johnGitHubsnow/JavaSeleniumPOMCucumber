package com.pages;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class LoginPage {
	
	private WebDriver driver;
	Actions act;
	
	 
	
	//By Locators Login Page
	private By advanceButton = By.id("details-button");
	private By proceedSafeLink = By.id("proceed-link");
	private By userid = By.xpath("//input[@placeholder='User Id']");
	private By password = By.xpath("//input[@placeholder='Password']");
	private By signInButton = By.xpath("//button[normalize-space()='Sign In']");
	private By forgotUserId = By.xpath("//a[normalize-space()='Forgot User Id?']");
	private By forgotPassword = By.xpath("//a[normalize-space()='Forgot Password?']");
	private By ebuddyappButton = By.xpath("//mat-card-title[normalize-space()='eBuddy']");
	
	
	
	//Create the constructor
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	//page actions: that is methods for actions in login page
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	public boolean forgotUserIdLinkExist() {
		return driver.findElement(forgotUserId).isDisplayed();
	}
	public boolean forgotPwdLinkExist() {
		return driver.findElement(forgotPassword).isDisplayed();
	}
	public void enterUserName(String username) {
		driver.findElement(userid).sendKeys(username);
	}
	public void enterPassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);
	}
	public void clickOnSignin() {
		driver.findElement(signInButton).click();
	}
	public LandingPage doSignin(String un, String pwd) {
		System.out.println("SignIn with the username:"+ un + "Password:"+ pwd);
		driver.findElement(userid).sendKeys(un);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(signInButton).click();
		return new LandingPage(driver);
	}
	public Logout doSigninLog(String un, String pwd) {
		System.out.println("SignIn with the username:"+ un + "Password:"+ pwd);
		driver.findElement(userid).sendKeys(un);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(signInButton).click();
		return new Logout(driver);
	}
	public HomePage doSigninHome(String un, String pwd) {
		System.out.println("SignIn with the username:"+ un + "Password:"+ pwd);
		driver.findElement(userid).sendKeys(un);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(signInButton).click();
		return new HomePage(driver);
	}
	public void safeGoToWebApp() {
		driver.findElement(advanceButton).click();
		driver.findElement(proceedSafeLink).click();
	}
	public void clickonEbuddyApp() {
		driver.findElement(ebuddyappButton).click();
	
	}
	public boolean switchToRightWindow(String windowTitle, List<String> hlist) {
		
		for (String handleTitle: hlist) {
			String title = driver.switchTo().window(handleTitle).getTitle();
			if (title.contains(windowTitle)) {
				System.out.println("found the right window......");
				return true;
			}
		}
		return false;
		
	}
	public void switchToRequriedTab(String reqWindowTitle) {
		String mainHandle = driver.getWindowHandle();
		Set<String> handles = driver.getWindowHandles();
		List<String> hlist = new ArrayList<String>(handles);
		if (switchToRightWindow(reqWindowTitle, hlist)) {
			System.out.println(driver.getTitle());
		}
	}
		
		
	public void pressTabKeyOnKeyboard() {
		act = new Actions(driver);
		act.sendKeys(Keys.TAB);
		
		}
	public void pressEnterKeyOnKeyboard() {
		act.sendKeys(Keys.ENTER).perform();
	}
	
	
	

}
