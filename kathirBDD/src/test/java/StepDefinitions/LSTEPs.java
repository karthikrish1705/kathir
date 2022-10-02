package StepDefinitions;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LSTEPs {
	ChromeDriver ob;
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
	   System.out.println("User visited website ");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		 ob= new ChromeDriver();
		ob.get("http://www.mycontactform.com");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
	   System.out.println("Entering usrname and password");
	   ob.findElementById("user").sendKeys("Dhivyakarthi123");
	   ob.findElementById("pass").sendKeys("12345");
	}

	@And("click on login button")
	public void click_on_login_button() {
	   System.out.println("Clicking on login button");
	   ob.findElementByName("btnSubmit").click();
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() throws InterruptedException {
	    System.out.println("user is n home page ");
	    System.out.println(ob.getTitle());
	    Thread.sleep(3000);
	    ob.quit();
	}
}
