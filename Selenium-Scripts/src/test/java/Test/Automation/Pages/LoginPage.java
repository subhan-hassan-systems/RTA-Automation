package Test.Automation.Pages;
//Author Omer Aqeel

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Test.Automation.Utils.DriverFactory;
import Test.Automation.Utils.UtilityMethods;

public class LoginPage extends DriverFactory {

	@FindBy(xpath = "//*[@id='InlineDialog1_Iframe']")
	public WebElement switchToPendingEmailWarningPopup;

	@FindBy(id = "butBegin")
	public WebElement closeEmailWarningPopup;

	@FindBy(xpath = "//*[@id='InlineDialog_Iframe']")
	public WebElement switchToExplorerDynamics365Popup;

	@FindBy(id = "navTourCloseButtonImage")
	public WebElement closeExplorerDynamics365Popup;

	public void CloseInitialPopups() {

		WebDriverWait wait = new WebDriverWait(driver, 15);
		if(driver.findElements(By.xpath("//*[@id='InlineDialog1_Iframe']")).size()!=0){
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(switchToPendingEmailWarningPopup));

			closeEmailWarningPopup.click();
		}

		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(switchToExplorerDynamics365Popup));
		
		if(driver.findElements(By.id("butBegin")).size()!=0){
			
			closeEmailWarningPopup.click();
			
		}
		else
		closeExplorerDynamics365Popup.click();
		UtilityMethods.waitForPageLoadAndPageReady();
	}

	public LoginPage(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, this);
	}
}