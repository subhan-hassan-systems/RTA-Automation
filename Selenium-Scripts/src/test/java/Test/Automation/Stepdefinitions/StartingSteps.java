package Test.Automation.Stepdefinitions;

import Test.Automation.Pages.MainPage;
import Test.Automation.Utils.DriverFactory;
import Test.Automation.Utils.PropertyReader;
import Test.Automation.Utils.UtilityMethods;
import cucumber.api.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import static Test.Automation.Utils.DataPool.readExcelData;

public class StartingSteps extends DriverFactory {

    @Given("^I am on the RTA home page$")
    public void launchHomePage() throws Throwable {

        UtilityMethods.deleteCookies();

        String url = new PropertyReader().readProperty("appURL");
        driver.manage().window().setSize(new Dimension(1440, 900));
        driver.manage().window().maximize();
        driver.get(url);
        UtilityMethods.waitForPageLoadAndPageReady();

    }

    public void signOut() {

        UtilityMethods.waitForPageLoadAndPageReady();

        driver.findElement(By.cssSelector("strong.icon-arrow-menu")).click();

        UtilityMethods.waitForPageLoad();
        driver.findElement(By.cssSelector("li[class='mast_account_signout'] a")).click();

        UtilityMethods.waitForPageLoad();

    }

    @Given("^I am on the Customer Portal home page$")
    public void launchCustomerPortalHomePage() throws Throwable {
        UtilityMethods.deleteCookies();

        String url = new PropertyReader().readProperty("appURL2");
        driver.manage().window().setSize(new Dimension(1440, 900));
        driver.manage().window().maximize();
        driver.get(url);

        UtilityMethods.waitForPageLoadAndPageReady();

    }

    @Given("^I am on the vineyardvines home page with paypal cookies deleted$")
    public void launchHomePageWithPaypalCookiesDeleted() throws Throwable {
        UtilityMethods.deleteCookies();
        driver.navigate().to("https://www.sandbox.paypal.com");
        driver.manage().deleteAllCookies();

        String url = new PropertyReader().readProperty("appURL");
        driver.manage().window().setSize(new Dimension(1440, 900));
        driver.get(url);
        new MainPage(driver).isLoaded();
    }

    @Given("^I am on the EPQ Portal home page$")
    public void launchEPQPortalHomePage() throws Throwable {
        UtilityMethods.deleteCookies();
        String url = new PropertyReader().readProperty("appURL3");
        driver.manage().window().setSize(new Dimension(1440, 900));
        driver.manage().window().maximize();
        driver.get(url);
        UtilityMethods.waitForPageLoadAndPageReady();   //** login credentials are updated in test data file
        String userName = readExcelData("Testdata", "AppLogin", "EPQUsername").get("Value").toString();
        driver.findElement(By.id("txtEmailAddress")).clear(); //for Phase 2 EPQ
        driver.findElement(By.id("txtEmailAddress")).sendKeys(userName);
 //       driver.findElement(By.id("userName")).clear(); //for IMS
        UtilityMethods.wait2Seconds();
//        driver.findElement(By.id("userName")).sendKeys(userName);
        UtilityMethods.wait1Seconds();
        driver.findElement(By.id("btnSubmit")).click();//for Phase 2 EPQ
//        driver.findElement(By.xpath("//*[@class='btn BtnRed next']")).click();//for IMS
        UtilityMethods.wait2Seconds();
        UtilityMethods.waitForPageLoadAndPageReady();
        UtilityMethods.wait2Seconds();
    }

}