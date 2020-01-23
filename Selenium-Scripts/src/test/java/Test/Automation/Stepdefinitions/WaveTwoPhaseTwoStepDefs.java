package Test.Automation.Stepdefinitions;

import Test.Automation.Pages.EPQPortal;
import Test.Automation.Pages.ManageSubmitPrequalifications;
import Test.Automation.Pages.ReviewManagementPage;
import Test.Automation.Pages.WaveTwoPhaseTwoPgae;
import Test.Automation.Utils.DriverFactory;
import Test.Automation.Utils.UtilityMethods;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import static Test.Automation.Utils.DataPool.readExcelData;

public class WaveTwoPhaseTwoStepDefs extends DriverFactory {

    private EPQPortal epqPortalPage;
    private WaveTwoPhaseTwoPgae appealprocess;
    private ManageSubmitPrequalifications epqSubmitManagePrequalificationPage;
    private ReviewManagementPage reviewManagementPage;

    @FindBy(xpath = "//*[@id='gridBodyTable']/tbody/tr[1]/td[1]")
    public WebElement clickRecord;

    @Before
    public void setUp() throws Exception {
        epqPortalPage = new EPQPortal(driver);
        epqSubmitManagePrequalificationPage = new ManageSubmitPrequalifications(driver);
        appealprocess = new WaveTwoPhaseTwoPgae(driver);
        reviewManagementPage = new ReviewManagementPage(driver);


    }

    @When("^Complete Completeness Review$")
    public void complete_Completeness_Review() throws Throwable {
        appealprocess.SelectReviewsDropdown();
       // reviewManagementPage.ClickAPQEngineerReview("Test Vendor Account 10");
        reviewManagementPage.ClickAPQEngineerReview(
                readExcelData("Testdata","AppLogin","EPQUsername").get("Value").toString());


        reviewManagementPage.CompletePQEnigeerReview(
                readExcelData("Testdata","EPQPortalCRM","QuestionarieAnswer").get("Value").toString(),
                readExcelData("Testdata","EPQPortalCRM","RecommentationValue").get("Value").toString()

        );
        //Click on Reviews
    }

    @When("^Complete Technical Review department coordinator$")
    public void complete_Technical_Review_department_coordinator() throws Throwable {

        reviewManagementPage.CompleteTechnicalReqview(
                readExcelData("Testdata","EPQPortalCRM","QuestionarieAnswer").get("Value").toString(),
                readExcelData("Testdata","EPQPortalCRM","RecommentationValueTech").get("Value").toString()

        );
        //Technical Review
        //Click on Reviews
    }


    @When("^User perform switch$")
    public void user_perform_switch() throws Throwable {
        //appealprocess.SelectReviewsDropdown();
        //reviewManagementPage.ClickAPQEngineerReview("Test Vendor Account 10");
        UtilityMethods.wait20Seconds();
        reviewManagementPage.clickReviewFilter();
        System.out.println("12");
        UtilityMethods.wait2Seconds();
    }


    @When("^User perform Review switch$")
    public void user_perform_Review_switch() throws Throwable {
        //appealprocess.SelectReviewsDropdown();
        //reviewManagementPage.ClickAPQEngineerReview("Test Vendor Account 10");
        UtilityMethods.wait20Seconds();
        reviewManagementPage.clickReviewFilter(); // click on review button
        System.out.println("12");
        UtilityMethods.wait2Seconds();

        UtilityMethods.waitForPageLoadAndPageReady();
        UtilityMethods.wait2Seconds();
        driver.switchTo().defaultContent(); //new
        System.out.println("123.5");
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']"))); //new
        UtilityMethods.wait3Seconds();
        System.out.println("123");

        System.out.println("12345");
        UtilityMethods.wait3Seconds();
        reviewManagementPage.clickRecord();

       /* clickRecord.click();
        try {*//*
            System.out.println("1234");
            Actions actions = new Actions(driver);
            actions.doubleClick(clickRecord).build().perform();
            System.out.println("try...");
*//*
            System.out.println("12345");
            clickRecord.click();
            System.out.println("123456");
            clickRecord.sendKeys(Keys.ENTER);
            System.out.println("1234567");
            System.out.println("Catch...");


        }

        catch(Exception e){
            System.out.println("12345");
            clickRecord.click();
            System.out.println("123456");
            clickRecord.sendKeys(Keys.ENTER);
            System.out.println("1234567");
            System.out.println("Catch...");
        }*/
    }

    @When("^Complete CP Director Appeal Review$")
    public void complete_CP_Director_Appeal_Review() throws Throwable {
        System.out.println("CP Director Appeal Review");
        //appealprocess.SelectReviewsDropdown();
        //reviewManagementPage.ClickAPQEngineerReview("Test Vendor Account 10");

        reviewManagementPage.CompleteCPDirectorAppealReview(
                readExcelData("Testdata", "EPQPortalCRM", "QuestionarieAnswer").get("Value").toString(),
                readExcelData("Testdata", "EPQPortalCRM", "RecommentationValueCP").get("Value").toString()

        );
    }

    @When("^Complete PQ Committee Appeal Review$")
    public void complete_PQ_Committee_Appeal_Review() throws Throwable {
        System.out.println("PQ Committee Appeal Review");
       // appealprocess.SelectReviewsDropdown();
        //reviewManagementPage.ClickAPQEngineerReview("Test Vendor Account 10");
        reviewManagementPage.CompletePQCommitteeAppealReview();
    }

    @When("^Complete Chairman Appeal Review$")
    public void complete_Chairman_Appeal_Review() throws Throwable {
        //appealprocess.SelectReviewsDropdown(); // for testing only
        System.out.println("AMDRADEON");
        //appealprocess.SelectReviewsDropdown();
        //reviewManagementPage.ClickAPQEngineerReview ( readExcelData("Testdata","AppLogin","EPQUsername").get("Value").toString());
        //reviewManagementPage.ClickAPQEngineerReview("Test Vendor Account 10");
        UtilityMethods.wait4Seconds();
        UtilityMethods.wait10Seconds();
        UtilityMethods.wait10Seconds();
        reviewManagementPage.CompleteChairmanAppealReview();
                //readExcelData("Testdata","EPQPortalCRM","QuestionarieAnswer").get("Value").toString(),
                //readExcelData("Testdata","EPQPortalCRM","RecommentationValueTech").get("Value").toString()

        //);
    }

    @When("^Complete Technical Review department director$")
    public void complete_Technical_Review_department_director() throws Throwable {
        appealprocess.SelectReviewsDropdown();
    }

    @When("^Complete PQ committee head$")
    public void complete_PQ_committee_head() throws Throwable {
        appealprocess.SelectReviewsDropdown();
    }

    @Then("^Complete CP director$")
    public void complete_CP_director() throws Throwable {
        appealprocess.SelectReviewsDropdown();
    }
}
