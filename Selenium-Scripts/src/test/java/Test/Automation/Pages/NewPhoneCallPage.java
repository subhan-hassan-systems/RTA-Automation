package Test.Automation.Pages;
//Author Omer Aqeel

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Test.Automation.Utils.DriverFactory;
import Test.Automation.Utils.UtilityMethods;

public class NewPhoneCallPage extends DriverFactory {

	@FindBy(css = "span.navTabButtonArrowDown")
	public WebElement expandWorkSpaceMenu;

	@FindBy(css = "img[alt=\"Workplace\"]")
	public WebElement clickWorkSpace;

	@FindBy(css = "#nav_activities > span.nav-rowLabel")
	public WebElement clickActivities;

	@FindBy(xpath = "//span[contains(text(),'phonecall')]")
	public WebElement clickPhoneCallActivityButton;

	@FindBy(id = "from")
	public WebElement selectCallFrom;

	@FindBy(id = "from_ledit")
	public WebElement callFrom;
	
	@FindBy(id = "from_i")
	public WebElement searchCallFrom;

	@FindBy(xpath = "//div[@id='to']/div")
	public WebElement SelectcallTo;
	
	@FindBy(id = "to_i")
	public WebElement searchCallTo;

	@FindBy(id = "to_ledit_multi")
	public WebElement callTo;

	@FindBy(xpath = "//div[@id='subject']/div")
	public WebElement selectPhonecallTitle;

	@FindBy(id = "subject_i")
	public WebElement enterCallDescriptionTitle;

	@FindBy(xpath = "//div[@id='new_calltype']/div")
	public WebElement clickCallType;

	@FindBy(xpath = "//div[@id='new_rtasubjectid']/div")
	public WebElement clickCallQuerySubject;

	@FindBy(id = "new_rtasubjectid_i")
	public WebElement openCallQuerySubjectPopup;

	@FindBy(css = "label.TreeItem")
	public WebElement selectCallQuerySubject;

	@FindBy(xpath = "//*[@id='phonecall|NoRelationship|Form|Mscrm.Form.phonecall.SaveAndClose']/span/a")
	public WebElement saveAndCloseButton;

	@FindBy(id = "crmGrid_findCriteria")
	public WebElement findCriteria;

	@FindBy(id = "crmGrid_findCriteriaImg")
	public WebElement hitSearch;

	@FindBy(xpath = "//*[@id='gridBodyTable']/tbody/tr/td[3]/nobr")
	public WebElement SelectPhoneCallActivity;

	@FindBy(css = "img[alt=\"Microsoft Dynamics 365\"]")
	public WebElement navigateToHomePage;

	@FindBy(xpath = "//*[@id='incident|NoRelationship|Form|rta.incident.Button8.AssigntoDepartment']/span/a")
	public WebElement AssignToDeptmentButton;

	@FindBy(css = "img.ms-crm-moreCommand-image")
	public WebElement expandMenuOptions;

	@FindBy(xpath = "//span[contains(text(), 'Convert To Case')]")
	public WebElement ConvertToCaseButton;

	@FindBy(xpath = "//div[@id='header_process_casetypecode']/div/span")
	public WebElement ClickCaseTypeField;
	
	@FindBy(id = "incident|NoRelationship|Form|rta.Mscrm.Form.incident.Save")
	public WebElement SaveButtonOnConvertToCaseForm;

	@FindBy(id = "new_other_i")
	public WebElement callDescriptionTitle;

	@FindBy(css = "span.stageNameContent")
	public WebElement InitiationDispatch;

	@FindBy(css = "img.ms-crm-ImageStrip-ResolveCase_16.ms-crm-commandbar-image16by16")
	public WebElement ResolveCaseButton;

	@FindBy(xpath = "//div[@id='description']/div/span")
	public WebElement PhoneCallDiscription;

	@FindBy(css = "#regardingobjectid > div.ms-crm-Inline-Value.ms-crm-Inline-Lookup > span.ms-crm-Lookup-Item")
	public WebElement OpenCaseForm;

	@FindBy(id = "ddlCaseResolve")
	public WebElement DDCaseResolve;

	@FindBy(id = "OK")
	public WebElement ResolveCaseOkayButton;

	@FindBy(xpath = "//div[@id='new_other']/div/span")
	public WebElement SelectDescriptionTitle;

	@FindBy(id = "butBegin")
	public WebElement subject;
	
	@FindBy(xpath = "(//span[contains(text(),'Look Up More Record')])[1]")
	public WebElement lookMoreRecord;
	
	@FindBy(id = "selObjects")
	public WebElement selectSearchCriteriaForCustomer;
	
	@FindBy(xpath = "//*[@id=\"gridBodyTable\"]/tbody/tr[1]/td[2]/nobr")
	public WebElement selectContact;
	
	@FindBy(id = "butBegin")
	public WebElement addButton;
	
	@FindBy(id = "new_preferredlanguage")
	public WebElement language;
	
	@FindBy(id = "new_preferredlanguage_i")
	public WebElement languageSelectBox;
	
	@FindBy(id = "directioncode")
	public WebElement direction;
	
	@FindBy(id = "phonenumber")
	public WebElement number;
	
	@FindBy(id = "phonenumber_i")
	public WebElement phoneNumber;
	
	@FindBy(id = "new_callreason")
	public WebElement callReason;

	@FindBy(id = "new_callreason_i")
	public WebElement callReasonSelectBox;
	
	@FindBy(xpath = "//label[contains(text(),'Date Created')]")
	public WebElement orderDate;
	
	@FindBy(xpath = "//img[contains(@alt,'The data is sorted in descending order on this column')]")
	public WebElement checkDateOrder;
	
	@FindBy(id = "filterButtonImage")
	public WebElement filter;
	
	@FindBy(xpath = "(//*[@id=\"mnuDown\"])[2]")
	public WebElement activityTypeFilter;
	
	@FindBy(xpath = "//label[contains(text(),'Phone Call')]")
	public WebElement phoneCallActivity;
	
	@FindBy(id = "grid-filter-OkbuttonpicklistFilterPopupcrmGridactivitypointeractivitytypecode")
	public WebElement selectOkFilter;
	
	@FindBy(id = "ddl_status")
	public WebElement statusReasonResolveCase;
	
	@FindBy(id = "ddlSatisfaction")
	public WebElement satisfactionResloveCase;
	
	@FindBy(id = "ddlCaseResolve")
	public WebElement caseResolutionDescription;
	
	@FindBy(id = "OK")
	public WebElement okButton;
	
	@FindBy(xpath = "//label[contains(text(),'Al Masar  Magazine /مجلة المسار')]")
	public WebElement selectCaseType;
	
	@FindBy(id = "header_process_rta_casebelongs")
	public WebElement mainCaseBelongs;
	
	@FindBy(id = "header_process_rta_casebelongs_i")
	public WebElement mainCaseBelongsOption;
	
	@FindBy(id = "InteractionStep2")
	public WebElement departmentComment;
	
	@FindBy(id = "butNext")
	public WebElement nextButton;
	
	@FindBy(id = "butFinish")
	public WebElement finishButton;
	
	@FindBy(id = "incident|NoRelationship|Form|rta.Mscrm.Form.incident.Save")
//	@FindBy(id = "incident|NoRelationship|Form|Mscrm.Form.incident.Save")
	public WebElement saveButton;
	
	@FindBy(id = "crmGrid_SavedNewQuerySelector")
	public WebElement activity;
	
	@FindBy(id = "ViewSelector_activitypointer")
	public WebElement allActvities;
	
	@FindBy(xpath = "//span[contains(text(),'My Activities')]")
	public WebElement myActivities;
	
	@FindBy(xpath = "(//span[contains(text(),'My Activities')])[2]")
	public WebElement myActivities2;
	
	@FindBy(id = "header_process_new_departmentid_cl")
	public WebElement assignedDepartment;

	@FindBy(id = "new_complaintreason")
	public WebElement complaintReasons;

	@FindBy(id = "new_complaintreason_i")
	public WebElement complaintReasonOptions;

	@FindBy(xpath = "//*[@id='new_complimentreason_cl_span']/img")
	public WebElement complimentReasonMandatoryValidation;

	@FindBy(xpath = "//*[@id='new_complimentreason_i']")
	public WebElement complimentReasonOptionSetValidation;

	@FindBy(xpath = "//div[@id='new_complimentreason']/div")
	public WebElement clickComplimentReasonOptionSet;

	@FindBy(xpath = "//*[@id='new_complimentreason_i']")
	public WebElement complimentReasonOptionSet;

	@FindBy(id = "new_complimentdepartmentid")
	public WebElement complimentDepartment;

	@FindBy(id = "new_complimentdepartmentid_i")
	public WebElement searchComplimentDepartment;

	@FindBy(id = "new_complimentagencyid")
	public WebElement complimentAgencyField;

	@FindBy(id = "new_complimentagencyid_i")
	public WebElement searchComplimentAgency;

	@FindBy(id = "new_requestreason")
	public WebElement requestReason;

	@FindBy(css = "select#new_requestreason_i.ms-crm-SelectBox.ms-crm-Inline-OptionSet-AutoOpen")
	public WebElement requestReasonOptionSet;

	@FindBy(id = "new_callbacktime_i")
	public WebElement verfiyCallBackTime;

	@FindBy(xpath = "//*[@id='new_callbacktime']/div[1]")
	public WebElement callBackTime;
	
	public void NewPhoneCall() throws Throwable{

		UtilityMethods.waitForPageLoadAndPageReady();

		expandWorkSpaceMenu.click();
		clickWorkSpace.click();

		UtilityMethods.waitForPageLoadAndPageReady();

		clickActivities.click();

		UtilityMethods.waitForPageLoadAndPageReady();
		
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
		
		UtilityMethods.wait3Seconds();
		clickPhoneCallActivityButton.click();

		UtilityMethods.waitForPageLoadAndPageReady();

	}

	public void NavigateToActivities() {

		UtilityMethods.waitForPageLoadAndPageReady();

		expandWorkSpaceMenu.click();
		clickWorkSpace.click();

		UtilityMethods.waitForPageLoadAndPageReady();

		clickActivities.click();

		UtilityMethods.waitForPageLoadAndPageReady();

	}

	public void CreatePhoneCallActivity(String CallFromValue, String CallToValue, String CallDescriptionTitle,
			String CallType) throws InterruptedException {

		UtilityMethods.waitForPageLoadAndPageReady();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));

		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));

		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.wait3Seconds();
		UtilityMethods.wait3Seconds();

		selectCallFrom.click();
		callFrom.clear();
		searchCallFrom.click();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", lookMoreRecord);
		UtilityMethods.clickElemetJavaSciptExecutor(lookMoreRecord);
		UtilityMethods.wait3Seconds();
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
			new WebDriverWait(driver, 60).until(
					ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='InlineDialog_Iframe']")));
			driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='InlineDialog_Iframe']")));
			
			selectSearchCriteriaForCustomer.click();
			Select dropDown = new Select(selectSearchCriteriaForCustomer);
			dropDown.selectByVisibleText("Contact");
			
			addButton.click();

		UtilityMethods.waitForPageLoadAndPageReady();
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));

		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		UtilityMethods.wait3Seconds();
		
		language.click();
		new Select(languageSelectBox).selectByVisibleText("English");
		
		number.click();
		phoneNumber.clear();
		phoneNumber.sendKeys("0517584957");
		
		selectPhonecallTitle.click();
		SelectcallTo.click();
		UtilityMethods.wait3Seconds();
		PhoneCallDiscription.click();
		selectPhonecallTitle.click();

		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.wait3Seconds();
		enterCallDescriptionTitle.clear();

		enterCallDescriptionTitle.sendKeys(CallDescriptionTitle);

		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.wait3Seconds();

		clickCallType.click();
		new Select(driver.findElement(By.id("new_calltype_i"))).selectByVisibleText(CallType);

		/////////////// FOR END SERVICE ////////////////////////
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='rta_rtaservice']//div[@class='ms-crm-Inline-Value ms-crm-Inline-EmptyValue ms-crm-Inline-Lookup'][contains(text(),'--')]")));
		driver.findElement(By.xpath("//div[@id='rta_rtaservice']//div[@class='ms-crm-Inline-Value ms-crm-Inline-EmptyValue ms-crm-Inline-Lookup'][contains(text(),'--')]")).click();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='rta_rtaservice_ledit']")));
		driver.findElement(By.xpath("//input[@id='rta_rtaservice_ledit']")).click();
		UtilityMethods.wait3Seconds();
		driver.findElement(By.xpath("//input[@id='rta_rtaservice_ledit']")).click();
		driver.findElement(By.xpath("//input[@id='rta_rtaservice_ledit']")).sendKeys("Issuing Personal Gold/Silver NOL Card");



		UtilityMethods.wait3Seconds();
		///////////// FOR TOUCH POINT ////////////////////////
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='rta_touchpoint']//div[@class='ms-crm-Inline-Value ms-crm-Inline-EmptyValue ms-crm-Inline-Lookup'][contains(text(),'--')]")));
		driver.findElement(By.xpath("//div[@id='rta_touchpoint']//div[@class='ms-crm-Inline-Value ms-crm-Inline-EmptyValue ms-crm-Inline-Lookup'][contains(text(),'--')]")).click();
		UtilityMethods.wait3Seconds();
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='rta_touchpoint_ledit']")));
		driver.findElement(By.xpath("//input[@id='rta_touchpoint_ledit']")).click();
		driver.findElement(By.xpath("//input[@id='rta_touchpoint_ledit']")).sendKeys("Mobile App");

		UtilityMethods.wait3Seconds();
		///////////// FOR REASON /////////////////////////////
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='rta_reason']//div[@class='ms-crm-Inline-Value ms-crm-Inline-EmptyValue ms-crm-Inline-Lookup'][contains(text(),'--')]")));
		driver.findElement(By.xpath("//div[@id='rta_reason']//div[@class='ms-crm-Inline-Value ms-crm-Inline-EmptyValue ms-crm-Inline-Lookup'][contains(text(),'--')]")).click();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='rta_reason_ledit']")));
		driver.findElement(By.xpath("//input[@id='rta_reason_ledit']")).click();
		driver.findElement(By.xpath("//input[@id='rta_reason_ledit']")).sendKeys("Dispatch Staff Conduct");
		UtilityMethods.wait3Seconds();

		UtilityMethods.waitForPageLoadAndPageReady();
		//clickCallQuerySubject.click();

		//openCallQuerySubjectPopup.click();

//		UtilityMethods.waitForPageLoadAndPageReady();
//		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();

//		new WebDriverWait(driver, 60).until(
//				ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='InlineDialog_Iframe']")));
//		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='InlineDialog_Iframe']")));
//
//		UtilityMethods.waitForPageLoadAndPageReady();

		//selectCallQuerySubject.click();
		UtilityMethods.wait3Seconds();
//		selectCaseType.click();
		UtilityMethods.waitForPageLoadAndPageReady();

		//subject.click();

		//UtilityMethods.waitForPageLoadAndPageReady();
		driver.switchTo().parentFrame();

		saveAndCloseButton.click();

	}
	
	public void CreatePhoneCallActivityWithOutgoingDirection(String CallDescriptionTitle) throws Throwable{
		
		UtilityMethods.waitForPageLoadAndPageReady();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));

		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		UtilityMethods.wait3Seconds();
		direction.click();
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.wait2Seconds();
		SelectcallTo.click();
		searchCallTo.click();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", lookMoreRecord);
		UtilityMethods.clickElemetJavaSciptExecutor(lookMoreRecord);

		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
			new WebDriverWait(driver, 60).until(
					ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='InlineDialog_Iframe']")));
			driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='InlineDialog_Iframe']")));
			
			selectSearchCriteriaForCustomer.click();
			Select dropDown = new Select(selectSearchCriteriaForCustomer);
			dropDown.selectByVisibleText("Contact");
			UtilityMethods.wait2Seconds();
			new Actions(driver).moveToElement(selectContact).doubleClick(selectContact).build().perform();

			UtilityMethods.wait2Seconds();
			
			addButton.click();
		 
		UtilityMethods.waitForPageLoadAndPageReady();
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		 
		language.click();
		new Select(languageSelectBox).selectByVisibleText("English");
		
		number.click();
		phoneNumber.clear();
		phoneNumber.sendKeys("0517584957");
		selectPhonecallTitle.click();
		UtilityMethods.wait3Seconds();
	
		enterCallDescriptionTitle.clear();
		enterCallDescriptionTitle.sendKeys(CallDescriptionTitle);
		
		callReason.click();
		new Select(callReasonSelectBox).selectByVisibleText("Obtain Case Missing Information");
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		
		saveAndCloseButton.click();
		
	}

	public void VerifyPhoneCallActivity(String CallDescriptionTitle) throws Throwable{
		UtilityMethods.wait3Seconds();
		UtilityMethods.waitForPageLoadAndPageReady();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));

		findCriteria.clear();
		findCriteria.sendKeys(CallDescriptionTitle);

		hitSearch.click();
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));
		
		orderDate.click();
		orderDate.click();
		try{
			
		checkDateOrder.getAttribute("title");
		
		}
		catch(Exception e){
			
			orderDate.click();
			System.out.println(checkDateOrder.getAttribute("title"));
		}

		Actions action = new Actions(driver);
		action.doubleClick(SelectPhoneCallActivity).perform();

		UtilityMethods.waitForPageLoadAndPageReady();

		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));

		assertEquals(CallDescriptionTitle, driver.findElement(By.cssSelector("h1.ms-crm-TextAutoEllipsis")).getText());

		UtilityMethods.waitForPageLoadAndPageReady();

		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();

		saveAndCloseButton.click();

		UtilityMethods.waitForPageLoadAndPageReady();

		navigateToHomePage.click();
		UtilityMethods.waitForPageLoadAndPageReady();
	}

	public void EditPhoneCallActivity(String CallDescriptionTitle) throws Throwable{

		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));
		
		
		activity.click();
//		UtilityMethods.wait2Seconds();
//		JavascriptExecutor executer = (JavascriptExecutor) driver;
//		executer.executeScript("arguments[0].scrollIntoView(true);",chatActivities);
		new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOf(allActvities));
		allActvities.click();
		
//			if(driver.findElements(By.xpath("//span[contains(text(),'My Activities')]")).size()!=0)
//			{
//				UtilityMethods.wait2Seconds();
//				new WebDriverWait(driver, 20)
//				.until(ExpectedConditions.visibilityOf(myActivities2));
//
//				UtilityMethods.clickElemetJavaSciptExecutor(myActivities2);
//			}
//			else
//			{
				UtilityMethods.wait2Seconds();
				new WebDriverWait(driver, 20)
				.until(ExpectedConditions.visibilityOf(myActivities));
		
				UtilityMethods.clickElemetJavaSciptExecutor(myActivities);
				
			//}
	
		UtilityMethods.waitForPageLoadAndPageReady();
//		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
//		new WebDriverWait(driver, 60)
//				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
//		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));
//		
//		dateCreatedFilter.click();
//		dateCreatedFilter.click();
//		UtilityMethods.wait2Seconds();
//		new Actions(driver).doubleClick(selectChatObject).perform();
		
		UtilityMethods.clickElemetJavaSciptExecutor(filter);

		UtilityMethods.waitForPageLoadAndPageReady();
		
		activityTypeFilter.click();
		UtilityMethods.wait2Seconds();
		JavascriptExecutor executer = (JavascriptExecutor) driver;
		executer.executeScript("arguments[0].scrollIntoView(true);",phoneCallActivity);
		phoneCallActivity.click();
		selectOkFilter.click();
		UtilityMethods.wait3Seconds();
		Actions action = new Actions(driver);
		action.doubleClick(SelectPhoneCallActivity).perform();

		UtilityMethods.waitForPageLoadAndPageReady();

		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));

		assertEquals(CallDescriptionTitle, driver.findElement(By.cssSelector("h1.ms-crm-TextAutoEllipsis")).getText());

		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		
		UtilityMethods.wait3Seconds();
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOf(saveAndCloseButton));
		saveAndCloseButton.click();

	}

	public void ConvertToCase() throws Throwable {
		
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));

		new Actions(driver).doubleClick(SelectPhoneCallActivity).perform();
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		new WebDriverWait(driver,60).until(ExpectedConditions.elementToBeClickable(ConvertToCaseButton));

		UtilityMethods.wait3Seconds();
		//UtilityMethods.clickElemetJavaSciptExecutor(ConvertToCaseButton);
		ConvertToCaseButton.click();

//		driver.close();
//
//		for (String winHandle : driver.getWindowHandles()) {
//
//			driver.switchTo().window(winHandle);
//		}
//
//		driver.getWindowHandle();
		UtilityMethods.wait10Seconds();
		
		UtilityMethods.waitForPageLoadAndPageReady();
		driver.switchTo().defaultContent();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		UtilityMethods.waitForPageLoadAndPageReady();
		System.out.println(driver.getCurrentUrl());

		try {
			Thread.sleep(10000);
			Alert alert = driver.switchTo().alert();
			alert.dismiss();

		} catch (NoAlertPresentException Ex) {
			System.out.print("NoAlertPresentException");

		}

	}

	public void FillAndSaveConvertToCaseForm(String CallDescriptionTitle) throws Throwable {

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));

		ClickCaseTypeField.click();
		
		new Select(driver.findElement(By.id("header_process_casetypecode_i"))).selectByVisibleText("Complaint");

		SelectDescriptionTitle.click();

		callDescriptionTitle.clear();
		callDescriptionTitle.sendKeys(CallDescriptionTitle);

		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		UtilityMethods.waitForPageLoadAndPageReady();
		
		UtilityMethods.wait3Seconds();
		new Actions(driver).doubleClick(SaveButtonOnConvertToCaseForm).perform();
		UtilityMethods.wait10Seconds();
		UtilityMethods.wait10Seconds();
		UtilityMethods.wait10Seconds();
		UtilityMethods.wait10Seconds();
		UtilityMethods.waitForPageLoadAndPageReady();
		

		try {
			Thread.sleep(10000);
			Alert alert = driver.switchTo().alert();
			alert.dismiss();

		} catch (NoAlertPresentException Ex) {
			System.out.print("NoAlertPresentException");

		}
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));

	}

	public void VerifyConvertedActivityToCase() throws Throwable {

		UtilityMethods.waitForPageLoadAndPageReady();
		String windowHandle = driver.getWindowHandle();
		UtilityMethods.verifyElementDisplayed(AssignToDeptmentButton);
		
		driver.switchTo().window(windowHandle);
		
		((JavascriptExecutor)driver).executeScript("window.open()");
		driver.close();
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(0));
		UtilityMethods.waitForPageLoadAndPageReady();
		

	}

	public void HitAssignToDepartmentButton() throws Throwable {


		/////////////ADDING BELOW CODE IN PHASE TWO///////////////
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		driver.switchTo().defaultContent();
		UtilityMethods.wait3Seconds();
		UtilityMethods.wait3Seconds();
//		new WebDriverWait(driver,60)
//				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
//		new WebDriverWait(driver,20)
//				.until(ExpectedConditions.visibilityOfElementLocated(By.id("header_process_casetypecode")));

		//driver.switchTo().parentFrame();
		//driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(By.id("WebResource_rta_htmlTouchPointDefinationRelatedQuestions")));
		driver.switchTo().frame(driver.findElement(By.id("WebResource_rta_htmlTouchPointDefinationRelatedQuestions")));
		Thread.sleep(5000);
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.id("rta_answer_1")));
		driver.findElement(By.id("rta_answer_1")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("rta_answer_1")).sendKeys("Touch Point Test Comments");

		if(UtilityMethods.isElementPresent(By.id("rta_answer_2")))
		{
			driver.findElement(By.id("rta_answer_2")).click();
			driver.findElement(By.id("rta_answer_2")).sendKeys("Test Payment Method");
		}
		if(UtilityMethods.isElementPresent(By.id("rta_answer_3")))
		{
			driver.findElement(By.id("rta_answer_3")).click();
			driver.findElement(By.id("rta_answer_3")).sendKeys("Test Reference ID");
		}

		driver.switchTo().parentFrame();
		driver.switchTo().parentFrame();
		UtilityMethods.wait3Seconds();
		new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(saveButton));
		saveButton.click();
		//UtilityMethods.waitForPageLoadAndPageReady();

		/////////////////////////////////////////////////////////

		UtilityMethods.wait10Seconds();
		new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(AssignToDeptmentButton));
		AssignToDeptmentButton.click();

		try {
			Thread.sleep(5000);
			Alert alert = driver.switchTo().alert();
			alert.accept();

		} catch (NoAlertPresentException Ex) {
			System.out.print("NoAlertPresentException");

		}
		UtilityMethods.waitForPageLoadAndPageReady();
		try {
			Thread.sleep(5000);
			Alert alert = driver.switchTo().alert();
			alert.accept();

		} catch (NoAlertPresentException Ex) {
			System.out.print("NoAlertPresentException");

		}


	}

	
	public void verifyAssignToDepartment() throws Throwable{
		
		UtilityMethods.waitForPageLoadAndPageReady();
		String windowHandle = driver.getWindowHandle();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		if(driver.findElements(By.cssSelector("iframe[name='contentIFrame1']")).size()!=0){
			
			new WebDriverWait(driver, 60)
			.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
			driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
			
		}
		else if(driver.findElements(By.cssSelector("iframe[name='contentIFrame0']")).size()!=0){
			
			new WebDriverWait(driver, 60)
			.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
			driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));
			
		}
		UtilityMethods.wait3Seconds();
		((JavascriptExecutor)driver).executeScript("var evt = document.createEvent('MouseEvents');" + "evt.initMouseEvent('dblclick',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);" + "arguments[0].dispatchEvent(evt);",SelectPhoneCallActivity);
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		if(driver.findElements(By.cssSelector("iframe[name='contentIFrame1']")).size()!=0){
			
			new WebDriverWait(driver, 60)
			.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
			driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
			
		}
		else if(driver.findElements(By.cssSelector("iframe[name='contentIFrame0']")).size()!=0){
			
			new WebDriverWait(driver, 60)
			.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
			driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));
			
		}
		
		UtilityMethods.wait3Seconds();
		UtilityMethods.verifyElementDisplayed(assignedDepartment);
		UtilityMethods.waitForPageLoadAndPageReady();
		
		driver.switchTo().window(windowHandle);
		
		((JavascriptExecutor)driver).executeScript("window.open()");
		driver.close();
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(0));
		UtilityMethods.waitForPageLoadAndPageReady();
		
		
	}
	
	public void fillUpValuesForDepartment() throws Throwable{
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		if(driver.findElements(By.cssSelector("iframe[name='contentIFrame1']")).size()!=0){
			
			new WebDriverWait(driver, 60)
			.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
			driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
			
		}
		else if(driver.findElements(By.cssSelector("iframe[name='contentIFrame0']")).size()!=0){
			
			new WebDriverWait(driver, 60)
			.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
			driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));
			
		}
		UtilityMethods.wait3Seconds();
		String parent_window = driver.getWindowHandle();
		
		mainCaseBelongs.click();
		new Select(mainCaseBelongsOption).selectByVisibleText("Yes");
		
		Set<String> allWindows = driver.getWindowHandles();
		for(String child:allWindows)
		    if(!parent_window.equalsIgnoreCase(child))
		        driver.switchTo().window(child);
		System.out.println(driver.getTitle());
		String child_window = driver.getWindowHandle();
		System.out.println("Child 2 Window ID is : "+child_window);
	
		driver.findElement(By.id("InteractionStep2_prompt")).click();
		
		departmentComment.sendKeys("department Comment");
		nextButton.click();
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.wait3Seconds();
		
		finishButton.click();
		
		driver.switchTo().window(parent_window);
		UtilityMethods.wait3Seconds();
		System.out.println("===Department Page Completed===");
		//////Phase2/////////////
		new WebDriverWait(driver,60).until(ExpectedConditions.elementToBeClickable(By.id("incident|NoRelationship|Form|rta.Mscrm.Form.incident.Save")));
		driver.findElement(By.id("incident|NoRelationship|Form|rta.Mscrm.Form.incident.Save")).click();
		//saveButton.click();
		/////////////////////////
		
		
	}
	
	public void resolveCaseForPhoneCallActivity() throws Throwable{
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		UtilityMethods.wait3Seconds();
		expandMenuOptions.click();
		UtilityMethods.waitForElementClickable(ResolveCaseButton);
		ResolveCaseButton.click();
		UtilityMethods.waitForPageLoadAndPageReady();



		try {
			for (String winHandle : driver.getWindowHandles()) {
				driver.switchTo().window(winHandle);
			}

		} catch (NoAlertPresentException Ex) {
			System.out.print("NoAlertPresentException");

		}
		UtilityMethods.wait3Seconds();
		statusReasonResolveCase.click();
		new Select(statusReasonResolveCase).selectByVisibleText("Insufficient Information/معلومات غير كافية");
		satisfactionResloveCase.click();
		new Select(satisfactionResloveCase).selectByVisibleText("Very Satisfied / راض جدا");
		UtilityMethods.wait3Seconds();
		caseResolutionDescription.sendKeys("Case Resolution");
		
		okButton.click();
		
	}

	public void VerifyDepartmentAssigned() throws Throwable {

		// assertEquals("Initiation & Dispatch", InitiationDispatch);

		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		expandMenuOptions.click();
		UtilityMethods.verifyElementDisplayed(ResolveCaseButton);

	}

	public void NavigateToCaseForm() throws Throwable{

		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		if(driver.findElements(By.cssSelector("iframe[name='contentIFrame1']")).size()!=0){
			
			new WebDriverWait(driver, 60)
			.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
			driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
			
		}
		else if(driver.findElements(By.cssSelector("iframe[name='contentIFrame0']")).size()!=0){
			
			new WebDriverWait(driver, 60)
			.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
			driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));
			
		}
		
		
		UtilityMethods.wait3Seconds();
	//	new Actions(driver).doubleClick(SelectPhoneCallActivity).perform();
		((JavascriptExecutor)driver).executeScript("var evt = document.createEvent('MouseEvents');" + "evt.initMouseEvent('dblclick',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);" + "arguments[0].dispatchEvent(evt);",SelectPhoneCallActivity);
	//	OpenCaseForm.click();

	}

	public void ResolveCase(String DiscriptionCaseResolve) throws Throwable {

		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		expandMenuOptions.click();
		ResolveCaseButton.click();
		UtilityMethods.waitForPageLoadAndPageReady();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));

		try {
			for (String winHandle : driver.getWindowHandles()) {
				driver.switchTo().window(winHandle);
			}

		} catch (NoAlertPresentException Ex) {
			System.out.print("NoAlertPresentException");

		}

		new Select(driver.findElement(By.id("ddl_status"))).selectByVisibleText("Rejected - Duplicate/مرفوض - مكرر");
		new Select(driver.findElement(By.id("ddlSatisfaction")))
				.selectByVisibleText("Called Customer - No Reply / تم الاتصال بالعميل ولم يرد");

		DDCaseResolve.clear();
		DDCaseResolve.sendKeys(DiscriptionCaseResolve);

		ResolveCaseOkayButton.click();

	}

	public void HitAssignToDeptForPortalCases() throws Throwable {

		/////////////ADDING BELOW CODE IN PHASE TWO///////////////
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		driver.switchTo().defaultContent();
		UtilityMethods.wait3Seconds();
//		new WebDriverWait(driver,60)
//				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
//		new WebDriverWait(driver,20)
//				.until(ExpectedConditions.visibilityOfElementLocated(By.id("header_process_casetypecode")));
		UtilityMethods.wait10Seconds();
		String ctype = driver.findElement(By.id("header_process_casetypecode")).getAttribute("title");

		if (ctype.toLowerCase().equals("complaint"))
		{
			//driver.switchTo().parentFrame();
			//driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
			UtilityMethods.verifyElementDisplayed(complaintReasons);
			complaintReasons.click();
			new Select(complaintReasonOptions).selectByVisibleText("Airconditioning Problem");

			//saveButton.click();
			//UtilityMethods.wait3Seconds();
			//UtilityMethods.waitForPageLoadAndPageReady();

		}

		if (ctype.toLowerCase().equals("compliment"))
		{
			clickComplimentReasonOptionSet.click();
			new Select(complimentReasonOptionSet).selectByVisibleText("Attitude");

			complimentAgencyField.click();
			searchComplimentAgency.click();

			UtilityMethods.wait3Seconds();
			lookMoreRecord.click();
			UtilityMethods.waitForPageLoadAndPageReady();
			UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
			new WebDriverWait(driver, 60).until(
					ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='InlineDialog_Iframe']")));
			driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='InlineDialog_Iframe']")));
			addButton.click();

			UtilityMethods.waitForPageLoadAndPageReady();
			new WebDriverWait(driver, 60)
					.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
			driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));

			complimentDepartment.click();
			searchComplimentDepartment.click();
			UtilityMethods.wait2Seconds();
			lookMoreRecord.click();
			UtilityMethods.waitForPageLoadAndPageReady();
			UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
			new WebDriverWait(driver, 60).until(
					ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='InlineDialog_Iframe']")));
			driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='InlineDialog_Iframe']")));
			addButton.click();
			driver.switchTo().parentFrame();
		}

		if (ctype.toLowerCase().equals("request"))
		{
			UtilityMethods.verifyElementDisplayed(requestReason);
			requestReason.click();
			UtilityMethods.wait2Seconds();
			new Select(requestReasonOptionSet).selectByVisibleText("Humps Request");
		}

		if (ctype.toLowerCase().equals("lost item"))
		{
			callBackTime.click();
			new WebDriverWait(driver,10)
					.until(ExpectedConditions.visibilityOf(verfiyCallBackTime));
			verfiyCallBackTime.sendKeys("Test Time");
		}


		driver.switchTo().parentFrame();
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(By.id("WebResource_rta_htmlTouchPointDefinationRelatedQuestions")));
		driver.switchTo().frame(driver.findElement(By.id("WebResource_rta_htmlTouchPointDefinationRelatedQuestions")));
		Thread.sleep(5000);
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.id("rta_answer_1")));
		driver.findElement(By.id("rta_answer_1")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("rta_answer_1")).sendKeys("Touch Point Test Comments");

		if(UtilityMethods.isElementPresent(By.id("rta_answer_2")))
		{
			driver.findElement(By.id("rta_answer_2")).click();
			driver.findElement(By.id("rta_answer_2")).sendKeys("Test Payment Method");
		}
		if(UtilityMethods.isElementPresent(By.id("rta_answer_3")))
		{
			driver.findElement(By.id("rta_answer_3")).click();
			driver.findElement(By.id("rta_answer_3")).sendKeys("Test Reference ID");
		}

		driver.switchTo().parentFrame();
		driver.switchTo().parentFrame();
		UtilityMethods.wait3Seconds();
		new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(saveButton));
		saveButton.click();
		//UtilityMethods.waitForPageLoadAndPageReady();

		/////////////////////////////////////////////////////////

		UtilityMethods.wait10Seconds();
		new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(AssignToDeptmentButton));
		AssignToDeptmentButton.click();

		try {
			Thread.sleep(5000);
			Alert alert = driver.switchTo().alert();
			alert.accept();

		} catch (NoAlertPresentException Ex) {
			System.out.print("NoAlertPresentException");

		}
		UtilityMethods.waitForPageLoadAndPageReady();
		try {
			Thread.sleep(5000);
			Alert alert = driver.switchTo().alert();
			alert.accept();

		} catch (NoAlertPresentException Ex) {
			System.out.print("NoAlertPresentException");

		}

	}

	/*
	 * public void VerifyCaseResolutionDetails() {
	 * 
	 * UtilityMethods.waitForPageLoadAndPageReady();
	 * 
	 * }
	 */

	public NewPhoneCallPage(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, this);
	}
}