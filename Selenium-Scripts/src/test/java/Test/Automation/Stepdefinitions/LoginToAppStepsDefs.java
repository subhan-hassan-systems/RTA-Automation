//Author Omer Aqeel
package Test.Automation.Stepdefinitions;

import java.io.IOException;

import Test.Automation.Pages.LoginPage;
import Test.Automation.Utils.DriverFactory;
import cucumber.api.java.Before;
import cucumber.api.java.en.When;

public class LoginToAppStepsDefs extends DriverFactory {

	private LoginPage loginPage;

	public LoginToAppStepsDefs() throws IOException {
	}

	@Before
	public void setUp() throws Exception {
		loginPage = new LoginPage(driver);
	}

	@When("^Close Initial Popups$")
	public void Close_Initial_Popups() throws Throwable {

		loginPage.CloseInitialPopups();

	}

	@When("^Close Second Initial Popups$")
	public void Close_Second_Initial_Popups() throws Throwable {

		loginPage.CloseInitialPopups();

	}

}