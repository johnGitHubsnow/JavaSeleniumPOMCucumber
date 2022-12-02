package stepdefinitions;

import java.util.List;
import java.util.Map;

import com.pages.LoginPage;
import com.pages.Logout;
import com.qa.factory.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogoutSteps {
	private String title;

	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	private Logout logout;
	
	@Given("user has already logged in to application and ready to logout")
	public void user_has_already_logged_in_to_application_and_ready_to_logout(DataTable credTable) {
	  
		List<Map<String, String>> credList = credTable.asMaps();
		String userName = credList.get(0).get("username");
		String password = credList.get(0).get("password");
		DriverFactory.getDriver().get("https://10.24.161.103:8000/swagger/index.html");
		
		DriverFactory.getDriver().get("http://apacworld.in.capgemini.com:9090/APACWorld/#/");
		
		logout = loginPage.doSigninLog(userName, password);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   
	}
	@Given("user is on Landing page and ready to logout")
	public void user_is_on_landing_page_and_ready_to_logout() {
		logout.getTitleOfLandingPage();
	  
	}

	@When("user click on the Profile")
	public void user_click_on_the_profile() {
	   logout.goToUserProfile();
	   try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@When("user click on Logout button")
	public void user_click_on_logout_button() {
	   logout.clickOnLogoutButton();
	}
	@Then("user go back to login page")
	public void user_go_back_to_login_page() {
	    title = logout.getTitleOfLoginPage();
	    System.out.println(title);
	}
	@When("user click on Profile menu")
	public void user_click_on_profile_menu() {
	    logout.goToUserProfileInEbuddyApplication();
	    try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@When("user click on the Logout button")
	public void user_click_on_the_logout_button() {
	    logout.clickOnLogoutButtonInEbuddyApplication();
	}

	

}
