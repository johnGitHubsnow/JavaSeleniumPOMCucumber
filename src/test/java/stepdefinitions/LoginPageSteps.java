package stepdefinitions;

import org.junit.Assert;

import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps {
	
	private static String title;
	private static String cdp;
	private static String ebuddy;
	private static String yammer;
	private static String ideaPortal;
	
	
	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		DriverFactory.getDriver().get("https://10.24.161.103:8000/swagger/index.html");
		//loginPage.safeGoToWebApp();
		DriverFactory.getDriver().get("http://apacworld.in.capgemini.com:9090/APACWorld/#/");
		
		//loginPage.safeGoToWebApp();
		
	}

	@When("user gets the title of the page")
	public void user_gets_the_title_of_the_page() throws InterruptedException {
		Thread.sleep(5000);
		title = loginPage.getPageTitle();
	   System.out.println("Page title is : "+ title);
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String expectedTitleName) {
		Assert.assertTrue(title.contains(expectedTitleName));
	   
	}

	@Then("forgot password link should be displayed")
	public void forgot_password_link_should_be_displayed() {
		Assert.assertTrue(loginPage.forgotPwdLinkExist());
	   
	}

	@Then("forgot userid link should be displayed")
	public void forgot_userid_link_should_be_displayed() {
		Assert.assertTrue(loginPage.forgotUserIdLinkExist());
	}

	@When("user enters username {string}")
	public void user_enters_username(String username) {
	   loginPage.enterUserName(username);
	}

	@When("user enters password {string}")
	public void user_enters_password(String password) {
	  loginPage.enterPassword(password);
	}

	@When("user clicks on Signin button")
	public void user_clicks_on_signin_button() {
	    loginPage.clickOnSignin();
	    try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@When("user clicks on ebuddy applcation")
	public void user_clicks_on_ebuddy_applcation() {
	    loginPage.clickonEbuddyApp();
	    try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@When("user goes to next tab that is ebuddy portal")
	public void user_goes_to_next_tab_that_is_ebuddy_portal() {
		loginPage.switchToRequriedTab("eBuddy");


	}
	@When("user press TAB key on keyboard")
	public void user_press_tab_key_on_keyboard() {
	  loginPage.pressTabKeyOnKeyboard();
	}

	@When("user goes to Signin button then user press ENTER key on keyboard")
	public void user_goes_to_signin_button_then_user_press_enter_key_on_keyboard() {
	   loginPage.pressEnterKeyOnKeyboard();
	}

	


	

}
