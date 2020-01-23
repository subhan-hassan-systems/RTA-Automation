package Test.Automation.Pages;

import Test.Automation.Utils.DriverFactory;
import Test.Automation.Utils.UtilityMethods;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by waqar.tufail on 4/18/2019.
 */
public class ManageSubmitPrequalifications extends DriverFactory {
    JavascriptExecutor executor = (JavascriptExecutor) driver;

    @FindBy(xpath = "//*[@class='page-header']")
    public WebElement PageHeader;

    @FindBy(id = "managePreq")
    public WebElement manageSubmitPreQualification;

    @FindBy(id="ctl00_cphDefault_rgPrequalifications_ctl00_ctl02_ctl00_InitInsertButton")
    public WebElement addProject;

    @FindBy(id = "ctl00_cphDefault_rgPrequalifications_ctl00_ctl02_ctl03_EditFormControl_ddMajorscope")
    public WebElement AddMajor;

    @FindBy(id = "ctl00_cphDefault_rgPrequalifications_ctl00_ctl02_ctl03_EditFormControl_ddlDepartment")
    public WebElement AddDepartment;

    @FindBy(id = "ctl00_cphDefault_rgPrequalifications_ctl00_ctl02_ctl03_EditFormControl_lbxScopes")
    public WebElement Scope;

    @FindBy(id = "ctl00_cphDefault_ctl00_cphDefault_rgPrequalifications_ctl00_ctl02_ctl03_EditFormControl_btnAddPanel")
    public WebElement AddButton;

    @FindBy(xpath = "//*[@class='alert alert-success']")
    public WebElement Success;

    @FindBy(id = "ctl00_cphDefault_rgPrequalifications_ctl00_ctl02_ctl00_InitInsertButton")
    public WebElement manageSubmitPreQualificationTable;

    //@FindBy(id = "ctl00_cphDefault_rgPrequalifications_ctl00_ctl04_Img1")
    //public WebElement manageSubmitPreQualificationEdit;
    @FindBy (id = "ctl00_cphDefault_rgPrequalifications_ctl00_ctl04_btnSubmitRow")
    public WebElement manageSubmitPreQualificationEdit;

    @FindBy (id = "ctl00_cphDefault_GridVendorExperience_ctl00_ctl04_cbScopeSelected")
    public WebElement manageSubmitPreQualificationRelevantExp;

    @FindBy (id = "ctl00_cphDefault_GridVendorExperience_ctl00_ctl06_cbScopeSelected")
    public WebElement manageSubmitPreQualificationExp;

    @FindBy (id = "ctl00_cphDefault_GridContacts_ctl00_ctl04_cbScopeSelected")
    public WebElement manageSubmitPreQualificationCVs;

    @FindBy (id = "ctl00_cphDefault_GridContacts_ctl00_ctl06_cbScopeSelected")
    public WebElement manageSubmitPreQualificationCVs02;

    @FindBy (id = "ctl00_cphDefault_GridContacts_ctl00_ctl08_cbScopeSelected")
    public WebElement manageSubmitPreQualificationCVs03;




    @FindBy (id = "ctl00_cphDefault_GridContacts_ctl00_ctl06_cbScopeSelected")
    public WebElement manageSubmitPreQualificationCV;

    @FindBy (id = "btnHappy")
    public WebElement Happy;

    @FindBy (id = "ctl00_cphDefault_chkAgree")
    public WebElement Terms;

    @FindBy (id = "ctl00_cphDefault_btnSubmitRow")
    public WebElement Submit;

    public ManageSubmitPrequalifications(WebDriver driver) throws Exception {
        PageFactory.initElements(driver, this);
    }

    public void NavigateToManageSubmitQualification() throws Throwable{
        UtilityMethods.waitForPageLoadAndPageReady();
        UtilityMethods.wait2Seconds();
        executor.executeScript("arguments[0].scrollIntoView(true);", manageSubmitPreQualification);
        executor.executeScript("arguments[0].click()", manageSubmitPreQualification);
    }

    public void OpenScopeProjects() throws Throwable{
        UtilityMethods.waitForPageLoadAndPageReady();
        executor.executeScript("arguments[0].scrollIntoView(true);", addProject);
        UtilityMethods.wait1Seconds();
        executor.executeScript("arguments[0].click()", addProject);
        new WebDriverWait(driver, 20)
                .until(ExpectedConditions.visibilityOf(AddMajor));
    }

    public void addScopeProject(String MajorScope, String Department, String Scopes) throws Throwable{
        UtilityMethods.waitForPageLoadAndPageReady();
        new Select(AddMajor).selectByVisibleText(MajorScope);
        UtilityMethods.wait10Seconds();
        new Select(AddDepartment).selectByVisibleText(Department);
        UtilityMethods.wait10Seconds();
        new Select(Scope).selectByVisibleText(Scopes);
        UtilityMethods.wait10Seconds();
        UtilityMethods.evenctClick(AddButton);
    }

    public void ScopeProjectVerification() throws Throwable{
        UtilityMethods.waitForPageLoadAndPageReady();
        UtilityMethods.wait1Seconds();
        new WebDriverWait(driver, 20)
                .until(ExpectedConditions.visibilityOf(Success));

    }

    public void editSubmitQualifiation() throws Throwable{
        UtilityMethods.waitForPageLoadAndPageReady();
        UtilityMethods.wait1Seconds();
        //System.out.print("click on submit qualification");
        executor.executeScript("arguments[0].scrollIntoView(true);", manageSubmitPreQualificationTable);
        executor.executeScript("arguments[0].click()", manageSubmitPreQualificationEdit);
        System.out.print("click on submit qualification");
    }

    public void PrequalificationPage() throws Throwable{
        new WebDriverWait(driver, 20)
                .until(ExpectedConditions.visibilityOf(PageHeader));
        if (PageHeader.getText() == "Relevant Information for Scope : scope3") {
            System.out.print(PageHeader.getText() + "Page Redirected to Manage Pre-Qualification");
        } else {
            new WebDriverWait(driver, 20)
                    .until(ExpectedConditions.visibilityOf(PageHeader));
        }
    }

    public void SelectRelevantExperience() throws Throwable{
        UtilityMethods.waitForPageLoadAndPageReady();
        UtilityMethods.wait1Seconds();
        executor.executeScript("arguments[0].scrollIntoView(true);", manageSubmitPreQualificationRelevantExp);
        executor.executeScript("arguments[0].click()", manageSubmitPreQualificationRelevantExp);
//        executor.executeScript("arguments[0].click()", manageSubmitPreQualificationExp);
        UtilityMethods.wait1Seconds();
//        if(manageSubmitPreQualificationRelevantExp.getAttribute("checked").equals("checked")){
//            executor.executeScript("arguments[0].click()", manageSubmitPreQualificationRelevantExp);
////            UtilityMethods.evenctClick(manageSubmitPreQualificationExp);
//        }else{
////            UtilityMethods.evenctClick(manageSubmitPreQualificationExp);
//            executor.executeScript("arguments[0].click()", manageSubmitPreQualificationExp);
//        }
    }

    public void SelectCVs() throws Throwable{
        UtilityMethods.waitForPageLoadAndPageReady();
        UtilityMethods.wait1Seconds();
        executor.executeScript("arguments[0].scrollIntoView(true);", manageSubmitPreQualificationCVs);
        executor.executeScript("arguments[0].click()", manageSubmitPreQualificationCVs);

        UtilityMethods.wait2Seconds();
        executor.executeScript("arguments[0].scrollIntoView(true);", manageSubmitPreQualificationCVs02);
        executor.executeScript("arguments[0].click()", manageSubmitPreQualificationCVs02);

        UtilityMethods.wait2Seconds();
        executor.executeScript("arguments[0].scrollIntoView(true);", manageSubmitPreQualificationCVs03);
        executor.executeScript("arguments[0].click()", manageSubmitPreQualificationCVs03);

        UtilityMethods.wait3Seconds();
        /*for(int _checkbox = 0; _checkbox < 2; _checkbox++){
            System.out.println("Under for loop..");
            driver.switchTo().activeElement().sendKeys(Keys.TAB);
            Thread.sleep(1000);
            driver.switchTo().activeElement().sendKeys(Keys.ENTER);
            UtilityMethods.wait1Seconds();
            System.out.println(_checkbox);
        }
*/
//        executor.executeScript("arguments[0].click()", manageSubmitPreQualificationCV);
        UtilityMethods.wait1Seconds();
//        if(manageSubmitPreQualificationCVs.getAttribute("checked").equals("checked")){
//            executor.executeScript("arguments[0].click()", manageSubmitPreQualificationCVs);
////            UtilityMethods.evenctClick(manageSubmitPreQualificationExp);
//        }else{
////            UtilityMethods.evenctClick(manageSubmitPreQualificationExp);
//            executor.executeScript("arguments[0].click()", manageSubmitPreQualificationCV);
//        }
    }

    public void SubmitformPreQualificationRequest() throws Throwable{
        UtilityMethods.waitForPageLoadAndPageReady();
        UtilityMethods.wait1Seconds();
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Happy);
        Thread.sleep(500);
        //UtilityMethods.evenctClick(Happy);
        executor.executeScript("arguments[0].click()", Happy);
//        UtilityMethods.eventClick(Terms);
        UtilityMethods.wait1Seconds();
//        UtilityMethods.evenctClick(Submit);
        executor.executeScript("arguments[0].click()", Submit);
        UtilityMethods.wait1Seconds();
    }
}
