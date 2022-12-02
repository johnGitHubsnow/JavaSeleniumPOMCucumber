package stepdefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.pages.HomePage;
import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageSteps {
	
	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	//private LandingPage landingPage = new LandingPage(DriverFactory.getDriver());
	private HomePage homePage;
	
	@Given("user has already logged in to eBuddy application")
	public void user_has_already_logged_in_to_e_buddy_application(DataTable credTable) throws InterruptedException {
		List<Map<String, String>> credList = credTable.asMaps();
		String userName = credList.get(0).get("username");
		String password = credList.get(0).get("password");
		DriverFactory.getDriver().get("https://10.24.161.103:8000/swagger/index.html");
		
		DriverFactory.getDriver().get("http://apacworld.in.capgemini.com:9090/APACWorld/#/");
		
		homePage = loginPage.doSigninHome(userName, password);
		Thread.sleep(7000);
		loginPage.clickonEbuddyApp();
		Thread.sleep(5000);
		loginPage.switchToRequriedTab("eBuddy");
	}
	
	@Given("user is on eBuddy application Home Page")
	public void user_is_on_e_buddy_application_home_page()  {
		homePage.getHomePageTitle();
		System.out.println(homePage.getHomePageTitle());
	   
	}
	@When("user clicks on the APAC Yammer link")
	public void user_clicks_on_the_apac_yammer_link() {
	    homePage.clickOnAPACYammerLink();
	    try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@When("user switch to next tab and there is APAC Yammer login page")
	public void user_switch_to_next_tab_and_there_is_apac_yammer_login_page() {
	    loginPage.switchToRequriedTab("Sign in to your account");
	    try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@When("user enter email {string}")
	public void user_enter_email(String email) {
	    homePage.enterEmailId(email);
	    try {
			Thread.sleep(9000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@When("user clicks on next button")
	public void user_clicks_on_next_button() {
	    homePage.clickOnNextButton();
	    try {
			Thread.sleep(9000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@When("user clicks on contiue button")
	public void user_clicks_on_contiue_button() {
		homePage.clickOnNextButton();
		try {
			Thread.sleep(9000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@When("user clicks on the Adam link")
	public void user_clicks_on_the_adam_link() {
	    homePage.clickOnAdamLink();
	    try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@When("user switch to next tab and there is Adam IT help home page")
	public void user_switch_to_next_tab_and_there_is_adam_it_help_home_page() {
	    loginPage.switchToRequriedTab("Group IT | IT Help");
	    try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@When("user clicks on the Useful Link")
	public void user_clicks_on_the_useful_link() {
	   homePage.clickOnUsefulLink();
	   try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@When("user switch to the next tab and there is Talent Capgemini home page")
	public void user_switch_to_the_next_tab_and_there_is_talent_capgemini_home_page() {
	   loginPage.switchToRequriedTab("India Intranet Homepage | Talent Capgemini");
	}


	@When("user clicks on Help Desk and Data Expence button")
	public void user_clicks_on_help_desk_and_data_expence_button() {
	    homePage.clickOnHelpDeskAndDataExpence();
	    try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@When("user clicks on APAC Platform Leadership button")
	public void user_clicks_on_apac_platform_leadership_button() {
	    homePage.clickOnApacPlatformLeadership();
	    try {
			Thread.sleep(12000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@When("user clicks on Talent Page button")
	public void user_clicks_on_talent_page_button() {
	    homePage.clickOnTalentPage();
	    try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@When("user clicks on Learning Platforms button")
	public void user_clicks_on_learning_platforms_button() {
	    homePage.clickOnLearningPlatforms();
	    try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@When("user clicks on Mandatory Trainings button")
	public void user_clicks_on_mandatory_trainings_button() {
	   homePage.clickOnMandatoryTrainings();
	   try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@When("user clicks on Cyber Security Incident button")
	public void user_clicks_on_cyber_security_incident_button() {
	    homePage.cliclOnCyberSecurityIncident();
	    try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@When("user clicks on Update Details button")
	public void user_clicks_on_update_details_button() {
	    homePage.clickOnUpdateDetails();
	    try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@When("user clicks on Key Contacts button")
	public void user_clicks_on_key_contacts_button() {
	    homePage.clickOnKeyContacts();
	    try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@When("user clicks on HR Info button")
	public void user_clicks_on_hr_info_button() {
	    homePage.clickOnHRInfo();
	    try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@When("user clicks on the Admin link")
	public void user_clicks_on_the_admin_link() {
	   homePage.clickOnAdminLink();
	   try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	


	@Then("helpdesk and data expense page, header name should be {string}")
	public void helpdesk_and_data_expense_page_header_name_should_be(String expectedValue) {
		String actualValue = homePage.checkHelpDesKAndDataExpence();
		Assert.assertTrue(actualValue.contains(expectedValue));
		
	}

	@Then("apac platform leadership page, header name should be {string}")
	public void apac_platform_leadership_page_header_name_should_be(String expectedValue) {
		try {
			Thread.sleep(9000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String actualValue = homePage.checkApacPlatformLeadership();
		Assert.assertTrue(actualValue.contains(expectedValue));
		
	}

	@Then("talent page, header name should be {string}")
	public void talent_page_header_name_should_be(String expectedValue) {
		String actualValue = homePage.checkTalentPage();
		Assert.assertTrue(actualValue.contains(expectedValue));
		
	}

	@Then("learning platform page, header name should be {string}")
	public void learning_platform_page_header_name_should_be(String expectedValue) {
		String actualValue = homePage.checkLearnigPlatforms();
		Assert.assertTrue(actualValue.contains(expectedValue));
		
	}

	@Then("mandatory trainings page, header name should be {string}")
	public void mandatory_trainings_page_header_name_should_be(String expectedValue) {
		String actualValue = homePage.checkMandatoryTrainings();
		Assert.assertTrue(actualValue.contains(expectedValue));
		
	}

	@Then("cyber security incident page, header name should be {string}")
	public void cyber_security_incident_page_header_name_should_be(String expectedValue) {
		String actualValue = homePage.checkCyberSecurityIncident();
		Assert.assertTrue(actualValue.contains(expectedValue));
		
	}
	
	

	@Then("update details page, header name should be {string}")
	public void update_details_page_header_name_should_be(String expectedValue) {
	    String actualValue = homePage.checkUpdateDetails();
	    Assert.assertTrue(actualValue.contains(expectedValue));
	}

	

	@Then("key contacts page, header name should be {string}")
	public void key_contacts_page_header_name_should_be(String expectedValue) {
	    String actualValue = homePage.checkKeyContacts();
	    Assert.assertTrue(actualValue.contains(expectedValue));
	}

	

	@Then("hr info page, header name should be {string}")
	public void hr_info_page_header_name_should_be(String expectedValue) {
	    String actualValue = homePage.checkHrInfo();
	    Assert.assertTrue(actualValue.contains(expectedValue));
	}


	@Then("user should get details of Admin and page header name should be {string}")
	public void user_should_get_details_of_admin_and_page_header_name_should_be(String expectedValue) {
	    String actualValue = homePage.checkAdmin();
	    Assert.assertTrue(actualValue.contains(expectedValue));
	}
	
	@When("user clicks on back button")
	public void user_clicks_on_back_button() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   homePage.clickOnBackButton();
	}



	@Then("user should go back to Welcome Admin frame and frame header should be {string}")
	public void user_should_go_back_to_welcome_admin_frame_and_frame_header_should_be(String expectedValue) {
		 String actualValue = homePage.checkAdmin();
		 Assert.assertTrue(actualValue.contains(expectedValue));
	}
	
	
	@When("user clicks on Page URLs button")
	public void user_clicks_on_page_ur_ls_button() {
	   homePage.clickOnPageUrlsInAdminFrame();
	   try {
		Thread.sleep(7000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

	@When("user clicks on Mandatory Trainings button in admin frame")
	public void user_clicks_on_mandatory_trainings_button_in_admin_frame() {
	   homePage.clickOnMandatoryTrainingInAdminFrame();
	   try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@When("user clicks on Admin user Roles button")
	public void user_clicks_on_admin_user_roles_button() {
	    homePage.clickOnAdminUserRolesInAdminFrame();
	    try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@When("user clicks on APAC Leaders button")
	public void user_clicks_on_apac_leaders_button() {
	    homePage.clickOnApacLeadersInAdminFrame();
	    try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@When("user clicks on Notifications")
	public void user_clicks_on_notifications() {
	    homePage.clickOnNotificationsInAdminFrame();
	    try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@When("user clicks on Employee Details button")
	public void user_clicks_on_employee_details_button() {
	    homePage.clickOnEmployeeDetailsInAdminFrame();
	    try {
			Thread.sleep(25000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	
	@When("user takes screenshot of Page Urls for evidence")
	public void user_takes_screenshot_of_page_urls_for_evidence() throws Exception {
		Thread.sleep(5000);
	    homePage.screenshot("PageUrlsInAdminFrame");
	}

	@When("user takes screenshot of Mandatory Training links for evidence")
	public void user_takes_screenshot_of_mandatory_training_links_for_evidence() throws Exception {
		Thread.sleep(5000);
	    homePage.screenshot("MandatoryTrainingLinksInAdminFrame");
	}

	@When("user takes screenshot of admin and user role details for evidence")
	public void user_takes_screenshot_of_admin_and_user_role_details_for_evidence() throws Exception {
		Thread.sleep(5000);
	    homePage.screenshot("AdminAndUserRolesInAdminFrame");
	}

	@When("user takes screenshot of Apac leaders details for evidence")
	public void user_takes_screenshot_of_apac_leaders_details_for_evidence() throws Exception {
		Thread.sleep(5000);
	    homePage.screenshot("APACLeadersInAdminFrame");
	}

	@When("user takes screenshot of Notification details for evidence")
	public void user_takes_screenshot_of_notification_details_for_evidence() throws Exception {
		Thread.sleep(5000);
	    homePage.screenshot("NotificationsInAdminFrame");
	}
	
	
	@When("user takes screenshot of employee details for evidence")
	public void user_takes_screenshot_of_employee_details_for_evidence() throws Exception {
	    Thread.sleep(5000);
	    homePage.screenshot("EmployeeDetails");
	}
	
	
	
	
	
	@When("user takes screenshot of Key Contacts details for evidence")
	public void user_takes_screenshot_of_key_contacts_details_for_evidence() throws Exception {
		Thread.sleep(5000);
	    homePage.screenshot("KeyContacts");
	}

	

	@When("user takes screenshot of Help Dest and Data Expence details for evidence")
	public void user_takes_screenshot_of_help_dest_and_data_expence_details_for_evidence() throws Exception {
		Thread.sleep(5000);
	    homePage.screenshot("helpDeskAndDataExpence");
	}

	@When("user clicks on Service Central link under Steps to Request IT Services frame")
	public void user_clicks_on_service_central_link_under_steps_to_request_it_services_frame() {
	    homePage.clickOnserviceCentalLinkInHelpDeskFrame();
	}

	@When("user switch to next tab that is ServieCentral home page")
	public void user_switch_to_next_tab_that_is_servie_central_home_page() {
	    loginPage.switchToRequriedTab("Home Page - ServiceCentral");
	}

	@When("user switch back to the ebuddy home page")
	public void user_switch_back_to_the_ebuddy_home_page() {
	    loginPage.switchToRequriedTab("eBuddy");
	}

	@When("user clicks on Service Central link under Steps to Report IT issue frame")
	public void user_clicks_on_service_central_link_under_steps_to_report_it_issue_frame() {
	    homePage.clickOnserviceCentalLinkInHelpDeskFrame();
	}

	@When("user clicks on Click here button under IT HelpDesk Contact Details frame")
	public void user_clicks_on_click_here_button_under_it_help_desk_contact_details_frame() {
	    homePage.clickOnserviceCentalButtonInHelpDeskFrame();
	}

	@When("user takes screenshot of Update details for evidence")
	public void user_takes_screenshot_of_update_details_for_evidence() throws Exception {
		Thread.sleep(5000);
	    homePage.screenshot("updateDetails");
	}

	@When("user clicks on Click here button under How to create MobilePass frame")
	public void user_clicks_on_click_here_button_under_how_to_create_mobile_pass_frame() {
	    homePage.clickOnclickHereButtonInMobilePassFrame();
	}

	@When("user switch to next tab that is Mobile Pass user guide document")
	public void user_switch_to_next_tab_that_is_mobile_pass_user_guide_document() {
	    loginPage.switchToRequriedTab("MobilePASS Enrollment User Guide Mobile PASS");
	}

	@When("user clicks on Click here button under Skills Update frame")
	public void user_clicks_on_click_here_button_under_skills_update_frame() {
	    homePage.clickOnclickHereButtonInSkillsUpdateFrame();
	}

	@When("user switch to next tab that is Job Feed")
	public void user_switch_to_next_tab_that_is_job_feed() {
	    loginPage.switchToRequriedTab("JobFeed");
	}

	@When("user clicks on Click here button under CV Update frame")
	public void user_clicks_on_click_here_button_under_cv_update_frame() {
	   homePage.clickOnclickHereButtonInCVUpdateFrame();
	}

	@When("user clicks on Click here button under Peronal Details frame")
	public void user_clicks_on_click_here_button_under_peronal_details_frame() {
	    homePage.clickOnclickHereButtonInPersonalDetailsFrame();
	}

	@When("user switch to next tab that is SAP NetWeaver Portal")
	public void user_switch_to_next_tab_that_is_sap_net_weaver_portal() throws Exception {
	    loginPage.switchToRequriedTab("SAP&#x20;NetWeaver&#x20;Portal");
	    Thread.sleep(5000);
	}

	@When("user clicks on Click here button under Bank Details frame")
	public void user_clicks_on_click_here_button_under_bank_details_frame() {
	   homePage.clickOnclickHereButtonInBankDetailsFrame();
	}

	@When("user takes screenshot of HR info details for evidence")
	public void user_takes_screenshot_of_hr_info_details_for_evidence() throws Exception {
		Thread.sleep(5000);
	   homePage.screenshot("HRInfoAllDetails");
	}

	@When("user clicks on Click here to know more, link")
	public void user_clicks_on_click_here_to_know_more_link() {
	    homePage.clickOnHrInfoLink();
	}

	@When("user switch to next tab that is HR Policies")
	public void user_switch_to_next_tab_that_is_hr_policies() throws Exception {
	    loginPage.switchToRequriedTab("HR Policies | Talent Capgemini");
	    Thread.sleep(5000);
	}

	@When("user takes screenshot of APAC leaders for evidence")
	public void user_takes_screenshot_of_apac_leaders_for_evidence() throws Exception {
		Thread.sleep(5000);
	    homePage.screenshot("APACLeaders");
	}

	@When("user takes screenshot of Talent page details for evidence")
	public void user_takes_screenshot_of_talent_page_details_for_evidence() throws Exception {
		Thread.sleep(5000);
	    homePage.screenshot("TalentPageAllDetails");
	}

	@When("user click on Click here button")
	public void user_click_on_click_here_button() {
	    homePage.clickOnclickHereButtonInTalentPageFrame();
	}

	@When("user switch to next tab that is Talent page")
	public void user_switch_to_next_tab_that_is_talent_page() {
	   loginPage.switchToRequriedTab("India Intranet Homepage | Talent Capgemini");
	}

	@When("user clicks on my learning image with hyperlink")
	public void user_clicks_on_my_learning_image_with_hyperlink() {
	    homePage.clickOnMyLearningHyperLinkImage();
	}
	
	@When("user switch to next tab that is My Learning")
	public void user_switch_to_next_tab_that_is_my_learning() {
	   loginPage.switchToRequriedTab("Home - SumTotal");
	}

	@When("user switch back to the eBuddy home page")
	public void user_switch_back_to_the_e_buddy_home_page() {
	    loginPage.switchToRequriedTab("eBuddy");
	}

	@When("user clicks on Next capgemini image with hyper link")
	public void user_clicks_on_next_capgemini_image_with_hyper_link() {
	    homePage.clickOnDegreedHyperLinkImage();
	}

	@When("user switch to next tab that is Degreed")
	public void user_switch_to_next_tab_that_is_degreed() {
	    loginPage.switchToRequriedTab("Log In | Degreed");
	}

	@When("user clicks on Coursera image with hyper link")
	public void user_clicks_on_coursera_image_with_hyper_link() {
	    homePage.clickOnCourseraHyperLinkImage();
	}

	@When("user switch to next tab that is Coursera")
	public void user_switch_to_next_tab_that_is_coursera() {
	   loginPage.switchToRequriedTab("Coursera | Online Courses &amp; Credentials From Top Educators. Join for Free");
	}

	@When("user clicks on Pluralsight image with hyper link")
	public void user_clicks_on_pluralsight_image_with_hyper_link() {
	    homePage.clickOnPluralsightHyperLinkImage();
	}

	@When("user switch to next tab that is Phuralsight")
	public void user_switch_to_next_tab_that_is_phuralsight() {
	   loginPage.switchToRequriedTab("Pluralsight - The tech workforce development company");
	}

	@When("user takes screenshot of mandatory training details for evidence")
	public void user_takes_screenshot_of_mandatory_training_details_for_evidence() throws Exception {
		Thread.sleep(5000);
	    homePage.screenshot("MandatoryTrainigAllDetails");
	}

	@When("user takes screenshot of Cyber Security details for evidence")
	public void user_takes_screenshot_of_cyber_security_details_for_evidence() throws Exception {
		Thread.sleep(5000);
		homePage.screenshot("CyberSecurityAllDetails");
	}

	@When("user clicks on Form button")
	public void user_clicks_on_form_button() {
	   homePage.clickOnFormButtonInCyberSecurityFrame();
	}

	@When("user switch to next tab that is Capgemini builders")
	public void user_switch_to_next_tab_that_is_capgemini_builders() {
	    loginPage.switchToRequriedTab("Capgemini Builders");
	}

	@When("user clicks on Start Reporting button")
	public void user_clicks_on_start_reporting_button() {
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    homePage.clickOnStartReportingButtonInCyberSecurityFrame();
	}

	@When("user gets Form to fill and takes screenshot of the form for the evidence")
	public void user_gets_form_to_fill_and_takes_screenshot_of_the_form_for_the_evidence() throws Exception {
		Thread.sleep(5000);
	    homePage.screenshot("CyberSecurityRepotingForm");
	}


	@When("user clicks on Cyber Knowledge Center link")
	public void user_clicks_on_cyber_knowledge_center_link() {
	    homePage.clickOnCyberKnowledgeCenterHyperLinkInCyberSecurityFrame();
	}

	@When("user switch to next tab that is Cyber Knowledge Center")
	public void user_switch_to_next_tab_that_is_cyber_knowledge_center() {
	    loginPage.switchToRequriedTab("Cyber Knowledge Center | Talent Capgemini");
	}
	
	@When("user clicks on Time card application link")
	public void user_clicks_on_time_card_application_link() {
	    homePage.clickOnTimeCardApplicationLink();
	   
	}

	@When("user switch to next tab that is time card application tab")
	public void user_switch_to_next_tab_that_is_time_card_application_tab() throws Exception {
	    loginPage.switchToRequriedTab("Time Card Management System");
	    Thread.sleep(5000);
	}

	@When("user clicks on leave management system link")
	public void user_clicks_on_leave_management_system_link() {
	    homePage.clickOnLeaveManagementSystemLink();
	}

	@When("user switch to next tab that is leave management system tab")
	public void user_switch_to_next_tab_that_is_leave_management_system_tab() {
	    loginPage.switchToRequriedTab("Leave Management System");
	}

	@When("user clicks on envelope type image on header field")
	public void user_clicks_on_envelope_type_image_on_header_field() {
	   homePage.clickOnOutlook();
	}

	@When("user switch to next tab that is Outlook tab")
	public void user_switch_to_next_tab_that_is_outlook_tab() {
	   loginPage.switchToRequriedTab("Outlook");
	}


}
