package Test.Automation.Pages;

import Test.Automation.Utils.DriverFactory;
import Test.Automation.Utils.UtilityMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaveTwoPhaseTwoPgae extends DriverFactory {

    @FindBy(css = "img.ms-crm-View-icon-associated-lite.ms-crm-ImageStrip-Dropdown_Arrow")
    public WebElement openList;

    @FindBy(xpath = "//span[@title='Pending Reviews']")
    public WebElement pendingreviews;

    public WaveTwoPhaseTwoPgae(WebDriver driver) throws Exception {

        PageFactory.initElements(driver, this);

    }

    public void SelectReviewsDropdown () throws Throwable{
        UtilityMethods.waitForPageLoadAndPageReady();
        new WebDriverWait(driver, 60)
                .until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));
        openList.click();
        if(openList.getText().equals(pendingreviews)){
            UtilityMethods.wait3Seconds();//Seconds();//Seconds();
            pendingreviews.click();
        }
        else {
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", pendingreviews);
            UtilityMethods.wait3Seconds();
            pendingreviews.click();
        }
    }
}
