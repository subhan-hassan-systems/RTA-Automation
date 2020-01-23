package Test.Automation.Pages;

import Test.Automation.Utils.DriverFactory;
import Test.Automation.Utils.PropertyReader;
import Test.Automation.Utils.UtilityMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by waqar.tufail on 6/20/2019.
 */
public class IMSCRMPage extends DriverFactory {

    String CompaignCode = null;
    String IdeaCode = null;

    @FindBy(id = "codename_i")
    public WebElement Compaign_Code;

    @FindBy(css = "span.navTabButtonArrowDown")
    public WebElement expandWorkSpaceMenu;

    @FindBy(xpath = "//*[@alt='Marketing']")
    public WebElement marketing;

    @FindBy(id = "nav_campaigns")
    public WebElement campaigns;

    @FindBy(xpath = "//*/li[@command='campaign|NoRelationship|HomePageGrid|Mscrm.NewRecordFromGrid']")
    public WebElement CreateNewCompaign;

    @FindBy(id = "name")
    public WebElement selectTitle;

    @FindBy(id="name_i")
    public WebElement Title;

    @FindBy(id="rta_campaignaward")
    public WebElement ComapaignAward;

    @FindBy(id="rta_campaignaward_i")
    public WebElement txt_compaignaward;

    @FindBy(id="actualstart")
    public WebElement Start_Date;

    @FindBy(id = "DateInput")
    public WebElement txt_StartDate;

    @FindBy(id="typecode")
    public WebElement Compaign_Type;

    @FindBy(id = "typecode_i")
    public WebElement ddl_Compaign_Type;

    @FindBy(id="actualend")
    public WebElement End_Date;

    @FindBy (id = "actualend_iimg")
    public WebElement End_Date_Calender;

    @FindBy (xpath = "//*[@id=\'Dialog_actualend_iCalContainerDateInput_miniCal\']/table/tbody/tr[8]/td[7]")
    public WebElement enddate;

    @FindBy(id = "actualend_i")
    public WebElement txt_EndDate;

    @FindBy(id="description")
    public WebElement Description;

    @FindBy(id="description_i")
    public WebElement txt_Description;

    @FindBy(id = "rta_titlearabic")
    public WebElement selectarabicTitle;

    @FindBy(id="rta_titlearabic_i")
    public WebElement arabicTitle;

    @FindBy(id = "rta_campaignawardar")
    public WebElement campaignawardar;

    @FindBy(id="rta_campaignawardar_i")
    public WebElement txt_campaignawardar;

    @FindBy(id = "rta_descriptionarabic")
    public WebElement descriptionarabic;

    @FindBy(id="rta_descriptionarabic_i")
    public WebElement txt_descriptionarabic;

//    @FindBy(xpath="//*[@action='/upload-target']")
    @FindBy(xpath = "/html/body/div[3]/form/div/span[1]")
    public WebElement uploadBanner;

    @FindBy(xpath = "/html/body/div[3]/form/div/span[2]")
    public WebElement uploadBanner2;

    @FindBy(id = "banner1")
    public WebElement Upload;

    @FindBy(id = "banner2")
    public WebElement UploadAr;

    @FindBy(xpath = "//*[@id=\'campaign|NoRelationship|Form|Mscrm.Form.campaign.Save\']")
    public WebElement Save;

    @FindBy(xpath = "//*[@id=\'campaign|NoRelationship|Form|Mscrm.Form.campaign.SaveAndClose\']")
    public WebElement saveAndCloseButton;

    @FindBy(xpath = "//*[@id=\'campaign|NoRelationship|Form|rta.campaign.Publish.Button\']")
    public WebElement publish;

    @FindBy(id = "filterButtonImage")
    public WebElement mainFilter;

    @FindBy(xpath = "(//*[@id='mnuDown'])[1]")
    public WebElement CompaignCodeFilter;

    @FindBy(xpath = "//span[contains(text(),'Custom Filter...')]")
    public WebElement customFilter;

    @FindBy(id="primaryOperator")
    public WebElement primaryOperator;

    @FindBy(id = "primaryValue_txt")
    public WebElement SearchFilter;

    @FindBy(id="primaryValue_lookupTable_img")
    public WebElement Search;

    @FindBy(id = "crmGrid_findCriteria")
    public WebElement searchReview;

    @FindBy(id = "crmGrid_findCriteriaImg")
    public WebElement searchButton;

    @FindBy(xpath = "//*[@id='gridBodyTable']/tbody/tr[1]/td[1]")
    public WebElement clickRecord;

    @FindBy(id = "butBegin")
    public WebElement closePopup;

    @FindBy(xpath = "//*[@class='sidebar-listitem'][contains(text(),'Ideas')]")
    public WebElement leftmenuIdeas;

    @FindBy(xpath = "(//*[@value='Submit Idea'])[1]")
    public WebElement openrecentcompaign;

    @FindBy(id = "title")
    public WebElement ideatitile;

    @FindBy(id = "description")
    public WebElement ideadescription;

    @FindBy(id = "privacy")
    public WebElement ideaprivacy;

    @FindBy(id = "ownerType")
    public WebElement ideaownerType;

    @FindBy(id = "tag")
    public WebElement tag;

    @FindBy(id = "file")
    public WebElement fileUpload;

    @FindBy(xpath = "//*[@class='toggle-slider round']")
    public WebElement termsconditions;

    @FindBy(xpath = "//*[@class='btn BtnRed next']")
    public WebElement btnSubmit;

    @FindBy(xpath = "//h5")
    public WebElement ideaNumber;

    @FindBy(xpath = "(//*[@class='ms-crm-List-DataCell-Lite'])[1]")
    public WebElement submiitedIdea;

    @FindBy(xpath = "//*[@id='rta_idea|NoRelationship|Form|rta.rta_idea.Approve.Button']")
    public WebElement approve;

    @FindBy(xpath = "//*[@id='rta_idea|NoRelationship|Form|rta.rta_idea.Button2.Button']")
    public WebElement convertCase;

    @FindBy(xpath = "//div[@id='header_process_subjectid']/div")
    public WebElement moveToCaseSubject;

    @FindBy(id = "header_process_subjectid_i")
    public WebElement expandCaseSubject;

    @FindBy(xpath = "//*[@id=\"TreeContainer\"]/ul/li[1]/span/a/img")
    public WebElement expandAboutRta;

    @FindBy(xpath = ".//*[@id='TreeContainer']/ul/li[1]/ul/li[2]/span/label")
    public WebElement selectSubject;

    @FindBy(id = "butBegin")
    public WebElement casesubject;

    @FindBy(id = "new_other")
    public WebElement clickCaseDescription;

    @FindBy(id = "new_other_i")
    public WebElement verifyCaseDescription;

    @FindBy(xpath = "//*[@id=\"incident|NoRelationship|Form|Mscrm.Form.incident.SaveAndClose\"]/span/a/span")
    public WebElement casesaveAndCloseButton;

    public IMSCRMPage(WebDriver driver) throws Exception {
        PageFactory.initElements(driver, this);
    }

    public void NewCompaign() throws Throwable{
        System.out.println("--Navigating to Compaign---");
        UtilityMethods.waitForPageLoadAndPageReady();
        expandWorkSpaceMenu.click();
        UtilityMethods.wait1Seconds();
        marketing.click();
        UtilityMethods.waitForPageLoadAndPageReady();
        campaigns.click();
        UtilityMethods.waitForPageLoadAndPageReady();
        new WebDriverWait(driver, 60)
                .until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
        UtilityMethods.wait3Seconds();
        System.out.println("--Creating New Compaign---");
        CreateNewCompaign.click();
        UtilityMethods.waitForPageLoadAndPageReady();
        UtilityMethods.wait3Seconds();
        System.out.println("--Compaign Page Loaded---");
    }

    public void CreateCompaignEnglish(String EngTitle,String Award, String StartDate, String Type,String Desc) throws Throwable {

        UtilityMethods.waitForPageLoadAndPageReady();
        new WebDriverWait(driver, 60)
                .until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
        UtilityMethods.waitForPageLoadAndPageReady();
        UtilityMethods.evenctClick(selectTitle);
        UtilityMethods.evenctvalues(Title,EngTitle);
        UtilityMethods.evenctClick(ComapaignAward);
        UtilityMethods.evenctvalues(txt_compaignaward,Award);
        UtilityMethods.evenctClick(Start_Date);
        UtilityMethods.SendValuebyJavaSciptExecutor(txt_StartDate,StartDate);
        UtilityMethods.evenctClick(Compaign_Type);
        UtilityMethods.getSelectedOptionByText(ddl_Compaign_Type,Type);
        UtilityMethods.evenctClick(End_Date);
        UtilityMethods.evenctClick(End_Date_Calender);
        UtilityMethods.evenctClick(enddate);
        UtilityMethods.evenctClick(Description);
        UtilityMethods.evenctvalues(txt_Description,Desc);
        UtilityMethods.wait2Seconds();
        System.out.println("--Compaign Page English Section Completed---");
    }

    public void CreateCompaignArabic(String TitleArabic,String CampaignAwardArabic,String DescriptionArabic) throws Throwable {

        UtilityMethods.wait2Seconds();
        UtilityMethods.evenctClick(selectarabicTitle);
        UtilityMethods.evenctvalues(arabicTitle,TitleArabic);
        UtilityMethods.evenctClick(campaignawardar);
        UtilityMethods.evenctvalues(txt_campaignawardar,CampaignAwardArabic);
        UtilityMethods.evenctClick(descriptionarabic);
        UtilityMethods.evenctvalues(txt_descriptionarabic,DescriptionArabic);
        UtilityMethods.wait2Seconds();
        System.out.println("--Compaign Page Arabic Section Completed---");

        new WebDriverWait(driver, 60)
                .until(ExpectedConditions.visibilityOfElementLocated(By.id("WebResource_htmldropzone")));
        driver.switchTo().frame(driver.findElement(By.id("WebResource_htmldropzone")));
        UtilityMethods.waitForPageLoadAndPageReady();
        String BannerFile = new PropertyReader().readProperty("BannerLocation");
        UtilityMethods.wait1Seconds();
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", uploadBanner);
        Upload.sendKeys(BannerFile);
        UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
        new WebDriverWait(driver, 60)
                .until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
        UtilityMethods.wait1Seconds();
        System.out.println("--English Banner Uploaded---");

        new WebDriverWait(driver, 60)
                .until(ExpectedConditions.visibilityOfElementLocated(By.id("WebResource_htmldropzonearabic")));
        driver.switchTo().frame(driver.findElement(By.id("WebResource_htmldropzonearabic")));
        UtilityMethods.waitForPageLoadAndPageReady();
        UtilityMethods.wait1Seconds();
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", uploadBanner2);
        UploadAr.sendKeys(BannerFile);
        UtilityMethods.wait1Seconds();
        System.out.println("--Arabic Banner Uploaded---");

        UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
        UtilityMethods.waitForPageLoadAndPageReady();
        UtilityMethods.wait1Seconds();
        UtilityMethods.evenctClick(Save);
        System.out.println("--Compaign Saved---");

        new WebDriverWait(driver, 60)
                .until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Compaign_Code);
        UtilityMethods.wait3Seconds();
        CompaignCode = Compaign_Code.getAttribute("defaultvalue");
        UtilityMethods.wait3Seconds();
        System.out.println("--Compaign No is: "+CompaignCode+"---");

        UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
        UtilityMethods.waitForPageLoadAndPageReady();
        UtilityMethods.wait3Seconds();
        UtilityMethods.evenctClick(saveAndCloseButton);
        UtilityMethods.wait3Seconds();
        UtilityMethods.evenctClick(saveAndCloseButton);
        System.out.println("--Compaign Saved & Closed---");
    }

    public void CustomFilter()throws Throwable{
        new WebDriverWait(driver, 60)
                .until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));
        UtilityMethods.waitForPageLoadAndPageReady();
        UtilityMethods.wait2Seconds();
        UtilityMethods.clickElemetJavaSciptExecutor(mainFilter);
        UtilityMethods.waitForPageLoadAndPageReady();
        UtilityMethods.wait2Seconds();
        UtilityMethods.clickElemetJavaSciptExecutor(CompaignCodeFilter);
        UtilityMethods.wait2Seconds();
        customFilter.click();
        UtilityMethods.wait3Seconds();
        UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
        new WebDriverWait(driver,60)
                .until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#InlineDialog_Iframe")));
        driver.switchTo().frame(driver.findElement(By.cssSelector("#InlineDialog_Iframe")));
        UtilityMethods.waitForPageLoadAndPageReady();
        UtilityMethods.wait3Seconds();
        new Select(primaryOperator).selectByVisibleText("Equals");
        UtilityMethods.wait3Seconds();
        UtilityMethods.evenctvalues(SearchFilter,CompaignCode);
//        UtilityMethods.evenctvalues(SearchFilter,"CMP-2019-0000053");
        closePopup.click();
    }

    public void publishCampaign() throws Throwable{
        new WebDriverWait(driver, 60)
                .until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));
        UtilityMethods.wait2Seconds();
        new Actions(driver).doubleClick(clickRecord).build().perform();
        UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
        UtilityMethods.waitForPageLoadAndPageReady();
        UtilityMethods.wait3Seconds();
        UtilityMethods.evenctClick(publish);
        System.out.println("--Compaign Published Successfully---");
    }

    public void openPublishedCampaign() throws Throwable{
        UtilityMethods.waitForPageLoadAndPageReady();
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", leftmenuIdeas);
        System.out.println("--IDEA Dashboard Load---");
        UtilityMethods.clickElemetJavaSciptExecutor(leftmenuIdeas);
        UtilityMethods.waitForPageLoadAndPageReady();
        UtilityMethods.wait10Seconds();
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", openrecentcompaign);
        UtilityMethods.clickElemetJavaSciptExecutor(openrecentcompaign);
        UtilityMethods.wait3Seconds();
        UtilityMethods.waitForPageLoadAndPageReady();
        System.out.println("--Published Compaign Open for Submit Idea---");
    }

    public void submitIdea(String idea_title,String ideaDesc,String privacy,String type,String Tags) throws Throwable{
        UtilityMethods.evenctvalues(ideatitile,idea_title);
        UtilityMethods.evenctvalues(ideadescription,ideaDesc);
        UtilityMethods.getSelectedOptionByText(ideaprivacy,privacy);
        UtilityMethods.getSelectedOptionByText(ideaownerType,type);
        UtilityMethods.evenctvalues(tag,Tags+ "\n");
        String BannerFile = new PropertyReader().readProperty("BannerLocation");
        UtilityMethods.evenctvalues(fileUpload,BannerFile);
        UtilityMethods.wait1Seconds();
        UtilityMethods.clickElemetJavaSciptExecutor(termsconditions);
        UtilityMethods.clickElemetJavaSciptExecutor(btnSubmit);
        UtilityMethods.wait3Seconds();
        UtilityMethods.wait3Seconds();
        UtilityMethods.waitForPageLoadAndPageReady();
        System.out.println("--Idea Submitted---");
    }

    public void verifyideaSubmited() throws Throwable{
        UtilityMethods.waitForPageLoadAndPageReady();
        UtilityMethods.wait3Seconds();
        String message = ideaNumber.getText();
        IdeaCode = message.substring(message.length() - 17);
        System.out.println("--Idea Submitted IDEA No is: "+IdeaCode+"---");
    }

    public void openSubmittedCampaign() throws Throwable{
        System.out.println("--Navigating to Compaign---");
        UtilityMethods.waitForPageLoadAndPageReady();
        expandWorkSpaceMenu.click();
        UtilityMethods.wait1Seconds();
        marketing.click();
        UtilityMethods.waitForPageLoadAndPageReady();
        campaigns.click();
        UtilityMethods.waitForPageLoadAndPageReady();
        new WebDriverWait(driver, 60)
                .until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
        UtilityMethods.wait3Seconds();
        //Search Campaign
        CustomFilter();
        //Open Campaign
        new WebDriverWait(driver, 60)
                .until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));
        UtilityMethods.wait2Seconds();
        new Actions(driver).doubleClick(clickRecord).build().perform();
        UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
        UtilityMethods.waitForPageLoadAndPageReady();
        System.out.println("--Campaign Opened---");
    }

    public void openSubmittedIdea() throws Throwable{
        UtilityMethods.wait3Seconds();
        new WebDriverWait(driver, 60)
                .until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
        UtilityMethods.wait2Seconds();
        new WebDriverWait(driver, 60)
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\'tab_4_content\']/div[1]/div")));
        UtilityMethods.waitForPageLoadAndPageReady();
        new Actions(driver).doubleClick(submiitedIdea).build().perform();
        UtilityMethods.waitForPageLoadAndPageReady();
        UtilityMethods.wait3Seconds();
        System.out.println("--Opened Submitted IDEA---");
    }

    public void approveSubmittedIdea() throws Throwable{
        UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
        UtilityMethods.waitForPageLoadAndPageReady();
        UtilityMethods.wait3Seconds();
        UtilityMethods.evenctClick(approve);
        UtilityMethods.waitForPageLoadAndPageReady();
        UtilityMethods.wait3Seconds();
        System.out.println("--IDEA Approve Successfully---");
    }

    public void convertToCase() throws Throwable{
        UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
        UtilityMethods.waitForPageLoadAndPageReady();
        UtilityMethods.wait3Seconds();
        UtilityMethods.evenctClick(convertCase);
        UtilityMethods.waitForPageLoadAndPageReady();
        UtilityMethods.wait3Seconds();
        UtilityMethods.wait3Seconds();
        UtilityMethods.wait3Seconds();
        System.out.println("--Case Converted Successfully---");
        driver.switchTo().defaultContent();
        UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
        UtilityMethods.waitForPageLoadAndPageReady();

        new WebDriverWait(driver, 60)
                .until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));

        UtilityMethods.wait3Seconds();


        moveToCaseSubject.click();
        expandCaseSubject.click();

        UtilityMethods.waitForPageLoadAndPageReady();
        UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();

        new WebDriverWait(driver, 60).until(
                ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='InlineDialog_Iframe']")));
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='InlineDialog_Iframe']")));

        expandAboutRta.click();
        UtilityMethods.waitForPageLoadAndPageReady();
        selectSubject.click();
        casesubject.click();
        UtilityMethods.waitForPageLoadAndPageReady();

        new WebDriverWait(driver, 60)
                .until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));

        clickCaseDescription.click();
//        verifyCaseDescription.clear();
//        verifyCaseDescription.sendKeys(description);

        UtilityMethods.waitForPageLoadAndPageReady();
        UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
        casesaveAndCloseButton.click();
        try {
            UtilityMethods.acceptAlert();
        }
        catch(Exception e) {

            System.out.println("Alert was not present");

        }

        UtilityMethods.waitForPageLoadAndPageReady();
        System.out.println("--Case Created Successfully---");

    }
}
