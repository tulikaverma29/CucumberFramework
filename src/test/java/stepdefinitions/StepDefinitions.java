package stepdefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import pages.FacebookHomePage;
import pages.FacebookLoginPage;
import utils.DriverManager;

public class StepDefinitions {
	private final WebDriver driver = DriverManager.getDriver();
	private final FacebookLoginPage loginPage = new FacebookLoginPage(driver);
	private final FacebookHomePage homePage = new FacebookHomePage(driver);

	@Given("I am on the Facebook login page")
	public void iAMOnTheFacebookLoginPage() {
	}

}
