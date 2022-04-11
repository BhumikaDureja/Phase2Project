package stepDefs;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	WebDriver driver = BaseClass.driver;
	
	@Given("I have opened the application in browser")
	public void i_have_opened_the_application_in_browser() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(5000);
	}

	@When("I enter username {string}")
	public void i_enter_username(String UserNameVal) {
	    // Write code here that turns the phrase above into concrete actions
		
		WebElement UserName = driver.findElement(By.id("user-name"));
		UserName.sendKeys(UserNameVal);
	
	}

	@When("I enter password {string}")
	public void i_enter_password(String PasswordVal) {
	    // Write code here that turns the phrase above into concrete actions
	
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys(PasswordVal);
	}

	@When("I click on the login button")
	public void i_click_on_the_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	
		WebElement LoginBtn = driver.findElement(By.id("login-button"));
		LoginBtn.click();
	}

	@Then("I should have landed on the Product page")
	public void i_should_be_landed_on_the_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	 
		System.out.println("On the Product Page");
	}

	@Then("I should get error message as {string}")
	public void i_should_get_error_message_as(String ExpMsg) {
	    // Write code here that turns the phrase above into concrete actions
	   
		WebElement ErrorMsg = driver.findElement(By.xpath("//*[starts-with(text(),'Epic sadface')]"));
		String ActualMsg = ErrorMsg.getText();
		Assert.assertEquals(ExpMsg, ActualMsg);
	}

}
