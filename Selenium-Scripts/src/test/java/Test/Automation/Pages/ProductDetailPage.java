package Test.Automation.Pages;

import static Test.Automation.Utils.UtilityMethods.waitForElementVisible;
import static org.junit.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Test.Automation.DataProvider.TestData;
import Test.Automation.Utils.DriverFactory;
import Test.Automation.Utils.PropertyReader;
import Test.Automation.Utils.UtilityMethods;

public class ProductDetailPage extends DriverFactory {

		private static final String POPUP_EMAILPROMPT = "div#emailprompt a";
		public static final String REFINEMENETS = "a[title='Remove']";
		
	

	@FindBy(id = "add-to-cart")
	public WebElement buttonAddToCart;

	
	public ProductDetailPage(WebDriver driver) throws Exception {
		
		PageFactory.initElements(driver, this);
		
	}

	

	public void ProductDetailPageDisplayed() throws Exception {

		UtilityMethods.waitForPageLoadAndPageReady();

		UtilityMethods.scrollToElement(buttonAddToCart);
		buttonAddToCart.isDisplayed();

	}
	
	

}