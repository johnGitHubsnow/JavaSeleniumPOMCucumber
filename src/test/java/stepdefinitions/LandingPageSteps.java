package stepdefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.pages.LandingPage;
import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LandingPageSteps {
	private static String title;
	
	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	private LandingPage landingPage;
	
	@Given("user has already logged in to application")
	public void user_has_already_logged_in_to_application(DataTable credTable) {
	  List<Map<String,String>> credList =  credTable.asMaps();
	  String userName = credList.get(0).get("username");
	  String password = credList.get(0).get("password");
	  DriverFactory.getDriver().get("https://10.24.161.103:8000/swagger/index.html");
	 
	  DriverFactory.getDriver().get("http://apacworld.in.capgemini.com:9090/APACWorld/#/");
	  
	  landingPage = loginPage.doSignin(userName, password);
	  
	  
	}

	@Given("user is on Landing page")
	public void user_is_on_landing_page() {
		 landingPage.getLandingPageTitle();
	}

	

	@Then("user gets apac world apps")
	public void user_gets_apac_world_apps(DataTable applicationTable) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<String> expectedAppList = applicationTable.asList();
		System.out.println("Expected Apps List" + expectedAppList);
	    List<String> actualAppList = landingPage.getapplicationNamesList();
	    System.out.println("Actual apps List:" + actualAppList);
	    
	   // Assert.assertTrue(expectedAppList.containsAll(actualAppList));
	}

	@Then("application count should be {int}")
	public void application_count_should_be(Integer expectedAppCount) {
	  Assert.assertTrue(landingPage.getapplicationsCount()==expectedAppCount);
	}

}
