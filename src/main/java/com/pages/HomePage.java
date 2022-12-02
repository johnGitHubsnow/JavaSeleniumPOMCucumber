package com.pages;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	private WebDriver driver;
	
	private By yammer = By.linkText("APAC Yammer");
			
	private By yammerEmailId = By.id("i0116");
	private By nextButton = By.id("idSIButton9");
	private By adam = By.linkText("Adam");
	private By usefulLink = By.linkText("Useful Link");
	private By admin = By.linkText("Admin");
			
	private By keyContacts = 
			By.xpath("//body//div[@class='container']//div[@class='row']//div[@class='row']//div[1]//mat-card[1]");
	private By helpDeskAndDataExpence = 
			By.xpath("//body//div[@class='container']//div[@class='row']//div[@class='row']//div[2]//mat-card[1]");
	private By updateDetails =
			By.xpath("//body//div[@class='container']//div[@class='row']//div[@class='row']//div[3]//mat-card[1]");
	private By hrInfo = 
			By.xpath("//body//div[@class='container']//div[@class='row']//div[@class='row']//div[4]//mat-card[1]");
	private By apacPlatformLeadership =
			By.xpath("//body//div[@class='container']//div[@class='row']//div[@class='row']//div[5]//mat-card[1]");
	private By talentPage = 
			By.xpath("//body//div[@class='container']//div[@class='row']//div[@class='row']//div[6]//mat-card[1]");
	private By learningPlatforms =
			By.xpath("//body//div[@class='container']//div[@class='row']//div[@class='row']//div[7]//mat-card[1]");
	private By mandatoryTrainings =
			By.xpath("//body//div[@class='container']//div[@class='row']//div[@class='row']//div[8]//mat-card[1]");
	private By cyberSecurityIncident = 
			By.xpath("//body//div[@class='container']//div[@class='row']//div[@class='row']//div[9]//mat-card[1]");
	
	
	private By backButton =
			By.xpath("//img[@src='assets/back.svg']");
	
	
	private By verifyHelpDeskDetails = By.xpath("//h4[normalize-space()='HelpDesk and Data Expense']");
	private By verifyUpdateDetails = By.xpath("//h4[normalize-space()='Update Details']");
	private By verifyApacPlatformLeadership = By.xpath("//h3[normalize-space()='APAC Platform Leadership']");
	private By verifyTalentPage = By.xpath("//h3[normalize-space()='Talent Page']");
	private By verifyLearningPlatforms = By.xpath("//h4[normalize-space()='Learning Platforms']");
	private By verifyMandatoryTrainings = By.xpath("//h4[normalize-space()='Mandatory Trainings']");
	private By verifyCyberSecurityIncident = By.xpath("//h4[normalize-space()='Cyber Security Incident']");
	private By verifyKeyContacts = By.xpath("//h4[normalize-space()='Key Contacts']");
	private By verifyHrInfo = By.xpath("//h4[normalize-space()='HR Info']");
	private By verifyAdmin = By.xpath("//h4[normalize-space()='Welcome Admin']");
	
	
	private By leadersNames = 
			By.xpath("//div[@class ='mat-grid-tile-content']//b");
	private By talentPageUsefulPathsDetials =
			By.xpath("//mat-card-title[@class = 'mat-card-title title']");
	
	
	private By pageUrlsInAdminFrame = By.xpath("//b[normalize-space()='Page URLs']");
	private By mandatoryTrainingInAdminFrame = By.xpath("//b[normalize-space()='Mandatory Trainings']");
	private By adminUserRolesInAdminFrame = By.xpath("//b[normalize-space()='Admin User Roles']");
	private By apacLeadersInAdminFrame = By.xpath("//b[normalize-space()='APAC Leaders']");
	private By notificationsInAdminFrame = By.xpath("//b[normalize-space()='Notifications']");
	private By employeeDetailsInAdminFrame = By.xpath("//b[normalize-space()='Employee Details']");
	
	
	//helpdesk
	private By serviceCentalLinkInHelpDeskFrame = By.linkText("Service Central");
	private By serviceCentalButtonInHelpDeskFrame = By.xpath("//button[normalize-space()='Click Here']");
	
	//updateDetails
	private By clickHereButtonInMobilePassFrame = By.xpath("//div[@class='row']//div[1]//mat-card[1]//mat-card-footer[1]//a[1]//button[1]");
	private By clickHereButtonInSkillsUpdateFrame = By.xpath("//div[@class='row']//div[2]//mat-card[1]//mat-card-footer[1]//a[1]//button[1]");
	private By clickHereButtonInCVUpdateFrame = By.xpath("//div[@class='row']//div[3]//mat-card[1]//mat-card-footer[1]//a[2]//button[1]");
	private By clickHereButtonInPersonalDetailsFrame = By.xpath("//div[@class='row']//div[4]//mat-card[1]//mat-card-footer[1]//a[1]//button[1]");
	private By clickHereButtonInBankDetailsFrame = By.xpath("//div[@class='row']//div[5]//mat-card[1]//mat-card-footer[1]//a[1]//button[1]");
	
	//HR Info
	private By hrInfoLink = By.xpath("//u[normalize-space()='Click here to know more']");
	
	//talent page
	private By clickHereButtonInTalentPageFrame = By.xpath("//button[normalize-space()='Click here']");
	
	//learning platform
	private By myLearningHyperLinkImage = By.xpath("//img[@src='assets/mylearning.png']");
	private By degreedHyperLinkImage = By.xpath("//img[@src='assets/Next.png']");
	private By courseraHyperLinkImage = By.xpath("//img[@src='assets/coursera.png']");
	private By pluralsightHyperLinkImage = By.xpath("//img[@src='assets/plural.png']");
	
	//Cyber security
	private By formButtonInCyberSecurityFrame = By.xpath("//button[normalize-space()='Form']");
	private By startReportingButtonInCyberSecurityFrame = By.xpath("//input[@name='continue']");
	private By cyberKnowledgeCenterHyperLinkInCyberSecurityFrame = By.xpath("//a[normalize-space()='Cyber Knowledge Center']");
	
	//popular links
	private By timeCardApplicationLink = By.xpath("//b[normalize-space()='Time Card Application']");
	private By leaveManagementSystemLink = By.xpath("//b[normalize-space()='Leave Management System']");
	private By outlook = By.xpath("//i[@class='bi bi-envelope fas fa-camera fa-lg']");
	
	//Constructor
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	//methods
	public String getHomePageTitle() {
		return driver.getTitle();
	}
	public void clickOnAPACYammerLink() {
		driver.findElement(yammer).click();
	}
	public void enterEmailId(String email) {
		driver.findElement(yammerEmailId).sendKeys(email);
	}
	public void clickOnNextButton() {
		driver.findElement(nextButton).click();
	}
	public void clickOnAdamLink() {
		driver.findElement(adam).click();
	}
	public void clickOnUsefulLink() {
		driver.findElement(usefulLink).click();
	}
	public void clickOnHelpDeskAndDataExpence() {
		driver.findElement(helpDeskAndDataExpence).click();
		
	}
	public void clickOnAdminLink() {
		driver.findElement(admin).click();
	}
	public void clickOnBackButton() {
		driver.findElement(backButton).click();
	}
	public void clickOnApacPlatformLeadership() {
		driver.findElement(apacPlatformLeadership).click();
	}
	public void clickOnTalentPage() {
		driver.findElement(talentPage).click();;
	}
	public void clickOnLearningPlatforms() {
		driver.findElement(learningPlatforms).click();
	}
	public void clickOnMandatoryTrainings() {
		driver.findElement(mandatoryTrainings).click();
	}
	public void cliclOnCyberSecurityIncident() {
		driver.findElement(cyberSecurityIncident).click();
	}
	public void clickOnUpdateDetails() {
		driver.findElement(updateDetails).click();
	}
	public void clickOnKeyContacts() {
		driver.findElement(keyContacts).click();
	}
	public void clickOnHRInfo() {
		driver.findElement(hrInfo).click();
	}
	public String checkHelpDesKAndDataExpence() {
		return driver.findElement(verifyHelpDeskDetails).getText();
	}
	public String checkUpdateDetails() {
		return driver.findElement(verifyUpdateDetails).getText();
	}
	public String checkApacPlatformLeadership() {
		return driver.findElement(verifyApacPlatformLeadership).getText();
		
	}
	public String checkLearnigPlatforms() {
		return driver.findElement(verifyLearningPlatforms).getText();
	}
	public String checkTalentPage() {
		return driver.findElement(verifyTalentPage).getText();
	
	}
	public String checkMandatoryTrainings() {
		return driver.findElement(verifyMandatoryTrainings).getText();
		
	}
	public String checkCyberSecurityIncident() {
		return driver.findElement(verifyCyberSecurityIncident).getText();
		
	}
	public String checkKeyContacts() {
		return driver.findElement(verifyKeyContacts).getText();
	}
	public String checkHrInfo() {
		return driver.findElement(verifyHrInfo).getText();
	}
	public String checkAdmin() {
		return driver.findElement(verifyAdmin).getText();
	}
	
	
	
	public void clickOnPageUrlsInAdminFrame() {
		driver.findElement(pageUrlsInAdminFrame).click();
	}
	
	public void clickOnMandatoryTrainingInAdminFrame() {
		driver.findElement(mandatoryTrainingInAdminFrame).click();
	}
	
	public void screenshot(String fileName) throws Exception {
			File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(file, new File("C:\\Users\\VREDDYK\\eclipse-workspace\\ebuddy1\\Evidence\\"+fileName+".jpg"));
		}
	public void clickOnAdminUserRolesInAdminFrame() {
		driver.findElement(adminUserRolesInAdminFrame).click();
	}
	public void clickOnApacLeadersInAdminFrame() {
		driver.findElement(apacLeadersInAdminFrame).click();
	}
	public void clickOnNotificationsInAdminFrame() {
		driver.findElement(notificationsInAdminFrame).click();
	}
	public void clickOnEmployeeDetailsInAdminFrame() {
		driver.findElement(employeeDetailsInAdminFrame).click();
	}
	public void clickOnserviceCentalLinkInHelpDeskFrame() {
		driver.findElement(serviceCentalLinkInHelpDeskFrame).click();
	}
	public void clickOnserviceCentalButtonInHelpDeskFrame() {
		driver.findElement(serviceCentalButtonInHelpDeskFrame).click();
	}
	
	public void clickOnclickHereButtonInMobilePassFrame() {
		driver.findElement(clickHereButtonInMobilePassFrame).click();
	}
	public void clickOnclickHereButtonInSkillsUpdateFrame() {
		driver.findElement(clickHereButtonInSkillsUpdateFrame).click();
	}
	public void clickOnclickHereButtonInCVUpdateFrame() {
		driver.findElement(clickHereButtonInCVUpdateFrame).click();
	}
	public void clickOnclickHereButtonInPersonalDetailsFrame() {
		driver.findElement(clickHereButtonInPersonalDetailsFrame).click();
	}
	public void clickOnclickHereButtonInBankDetailsFrame() {
		driver.findElement(clickHereButtonInBankDetailsFrame).click();
	}
	public void clickOnHrInfoLink() {
		driver.findElement(hrInfoLink).click();
	}
	public void clickOnclickHereButtonInTalentPageFrame() {
		driver.findElement(clickHereButtonInTalentPageFrame).click();
	}
	public void clickOnMyLearningHyperLinkImage() {
		driver.findElement(myLearningHyperLinkImage).click();
	}
	public void clickOnDegreedHyperLinkImage() {
		driver.findElement(degreedHyperLinkImage).click();
	}
	public void clickOnCourseraHyperLinkImage() {
		driver.findElement(courseraHyperLinkImage).click();
	}
	public void clickOnPluralsightHyperLinkImage() {
		driver.findElement(pluralsightHyperLinkImage).click();
	}
	public void clickOnFormButtonInCyberSecurityFrame() {
		driver.findElement(formButtonInCyberSecurityFrame).click();
	}
	public void clickOnStartReportingButtonInCyberSecurityFrame() {
		driver.findElement(startReportingButtonInCyberSecurityFrame).click();
	}
	public void clickOnCyberKnowledgeCenterHyperLinkInCyberSecurityFrame() {
		driver.findElement(cyberKnowledgeCenterHyperLinkInCyberSecurityFrame).click();
	}
	public void clickOnTimeCardApplicationLink() {
		driver.findElement(timeCardApplicationLink).click();
	}
	public void clickOnLeaveManagementSystemLink() {
		driver.findElement(leaveManagementSystemLink).click();
	}
	public void clickOnOutlook() {
		driver.findElement(outlook).click();
	}
	
	
	

}
