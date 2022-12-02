import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoEbuddy {
	
	public static void main(String args[]) throws InterruptedException {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setAcceptInsecureCerts(true);
		driver = new ChromeDriver(caps);
		WebDriverWait wait = new WebDriverWait(driver,50);
		//Actions act = new Actions(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get(" https://10.24.161.103:8000/swagger/index.html");
		driver.get("http://apacworld.in.capgemini.com:9090/APACWorld/#/");
		Thread.sleep(3000);
		String mainHandle = driver.getWindowHandle();
		//System.out.println(mainHandle);
		driver.findElement(By.xpath("//input[@placeholder='User Id']")).sendKeys("kdevika");
		//act.sendKeys(Keys.TAB).sendKeys("Welcome@22").sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Welcome@22");
		driver.findElement(By.xpath("//button[normalize-space()='Sign In']")).click();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//img[@alt='profilepic']")).click();
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("//button[@role='menuitem']")).click();
		WebElement el = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//mat-card-title[normalize-space()='eBuddy']"))));
		el.click();
		//driver.findElement(By.xpath("//mat-card-title[normalize-space()='eBuddy']")).click();
		
	
		Thread.sleep(7000);
		Set<String> handles = driver.getWindowHandles();
		for (String handle: handles) {
		System.out.println(handle);
			if(!handle.equals(mainHandle)) {
			driver.switchTo().window(handle);
			Thread.sleep(7000);
			driver.findElement(By.linkText("Admin")).click();
			driver.findElement(By.linkText("//b[normalize-space()='Page URLs']")).click();
			Thread.sleep(7000);
			driver.findElement(By.xpath("//img[@src='assets/back.svg']")).click();
		
			}

		}	
	}	
		
		
		 
	}
