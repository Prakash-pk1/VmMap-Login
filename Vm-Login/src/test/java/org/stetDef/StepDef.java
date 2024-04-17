package org.stetDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef {
	WebDriver driver;
	
	
	@Given("User is on VM Maps acoount Sign In page")
	public void user_is_on_vm_maps_acoount_sign_in_page() {
		driver = new ChromeDriver();
		driver.get("https://accounts.vmmaps.com/");
		driver.manage().window().maximize();
		
	}

	@When("User Enters valid Email Address and Password")
	public void user_enters_valid_email_address_and_password() {
		driver.findElement(By.id("login-email")).sendKeys("prakashsekar786@gmail.com");
		driver.findElement(By.id("login-password")).sendKeys("18urCZ05");
		
	}

	@When("Click Login button")
	public void click_login_button() {
	    driver.findElement(By.id("login-submit-text")).click();
	    
	}

	@Then("user is on Dashboard page")
	public void user_is_on_dashboard_page() {
	    System.out.println("**********LOGIN SUCCESSFULLY**********");
	}

	@When("User Enters valid Email Address and invalid Password")
	public void user_enters_valid_email_address_and_invalid_password() {
		driver.findElement(By.id("login-email")).sendKeys("prakashsekar786@gmail.com");
		driver.findElement(By.id("login-password")).sendKeys("18ueuy9");
	}

	@Then("User Should see the Invalid parameter message")
	public void user_should_see_the_invalid_parameter_message() throws InterruptedException {
		WebElement msg = driver.findElement(By.id("signinFormError"));
		Thread.sleep(3000);
		String text = msg.getText();
		System.out.println(text);		
	
	}

	@When("User Enters invalid Email Address and valid Password")
	public void user_enters_invalid_email_address_and_valid_password() {
		driver.findElement(By.id("login-email")).sendKeys("sdhge978@gmail.com");
		driver.findElement(By.id("login-password")).sendKeys("18urCZ05");
	}

	@Then("User Should see the Invalid Email message")
	public void user_should_see_the_invalid_email_message() {
		WebElement msg = driver.findElement(By.id("signinFormError"));
		String text = msg.getText();
		System.out.println(text);
	}

	@When("User does not Enters Email Address and Password click login button straight")
	public void user_does_not_enters_email_address_and_password_click_login_button_straight() {
		driver.findElement(By.id("login-submit-text")).click();
		
	}

	@Then("User Should see the Please fill out this feild message")
	public void user_should_see_the_please_fill_out_this_feild_message() {
		System.out.println("PLEASE FILL OUT THIS FIELD");
		
	}
}
