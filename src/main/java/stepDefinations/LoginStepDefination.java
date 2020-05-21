package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class LoginStepDefination {

	WebDriver driver;
	
	@Given("^user is already on Login Page$")
	public void user_already_on_login_page() {
		
		System.setProperty("webdriver.chrome.driver", "/Users/AliAhmed/Downloads/chromedriver 2");
		driver = new ChromeDriver();
		driver.get("https://cunyfirst.cuny.edu//");
	
	}
	
	@When("^title of login page is CUNY Login$")
	public void title_of_login_page_is_free_CRM() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("CUNY Login", title);
		
	}
	@Then("^user enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_username_and_password(String username, String password) {
		driver.findElement(By.name("usernameH")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
	}
	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() {
		driver.findElement(By.name("submit")).click();
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("arguments[0].click();", loginBtn);
		
	}
	
	@Then("^user is on home page$")
	public void user_is_on_home_page() {
		String title = driver.getTitle();
		System.out.println("Home Page title : "+ title);
		Assert.assertEquals("Employee-facing registry content", title);
	}

	@Then("^close the browser$")
	public void close_the_browser(){
		driver.quit();
	}
	
}