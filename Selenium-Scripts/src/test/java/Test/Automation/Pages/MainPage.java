package Test.Automation.Pages;

import static Test.Automation.Utils.UtilityMethods.elementNotPresent;
import static Test.Automation.Utils.UtilityMethods.waitForElementClickable;
import static Test.Automation.Utils.UtilityMethods.waitForElementVisible;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Test.Automation.Utils.DriverFactory;
import Test.Automation.Utils.UtilityMethods;

public class MainPage extends DriverFactory {

	private static final String PAGE_URL = "/Vineyard-Vines";
	
	protected WebElement pageHeading() {
		return new WebDriverWait(driver, 15)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("img[class='mast_logo_img']")));
	}
	
	public void isLoaded() throws Error, InterruptedException {
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.wait2Seconds();
		//clickElementOnlyIfDisplayed(By.cssSelector(POPUP_EMAILPROMPT));
		UtilityMethods.waitForPageLoadAndPageReady();
		assertTrue(pageHeading().isDisplayed());
		assertTrue(driver.getCurrentUrl().contains(PAGE_URL));
	}

	public MainPage(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, this);
	}

	
}