package Test.Automation.Pages;

import java.util.List;

import gherkin.lexer.Th;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
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
import static org.junit.Assert.*;

public class CustomerPortal extends DriverFactory {

	public static String refNo="";
	
	@FindBy(id = "switchToEnglishbtn")
	public WebElement changeLanguage;
	
	@FindBy(xpath = "//i[@class = 'cases-box-icon icon-suggestion']")
	public WebElement suggestion;
	
	@FindBy(xpath = "//i[@class = 'cases-box-icon icon-compliment']")
	public WebElement compliment;
	
	@FindBy(xpath = "//i[@class = 'cases-box-icon icon-request']")
	public WebElement request;
	
	@FindBy(xpath = "//i[@class = 'cases-box-icon icon-notification']")
	public WebElement notification;
	
	@FindBy(xpath = "//i[@class = 'cases-box-icon icon-complaint']")
	public WebElement complaint;
	
	@FindBy(xpath = "//i[@class = 'cases-box-icon icon-report-lost-item']")
	public WebElement lostItem;
	
	@FindBy(xpath = "//i[@class = 'cases-box-icon icon-fine-objection']")
	public WebElement fineObjection;
	
	@FindBy(id = "rtaMainService")
	public WebElement rtaMainService;
	
	@FindBy(id = "rtaSubService")
	public WebElement rtaSubService;
	
	@FindBy(id = "description")
	public WebElement description;
	
	@FindBy(css = "input.btn.BtnRed.next")
	public WebElement submitFormButton;

	@FindBy(css = "input.btn.BtnRed.next.active-shadow")
	public WebElement submitFormButton2;
	
	@FindBy(xpath = "//input[@value='Submit']")
	public WebElement submitFormButton3;
	
	@FindBy(id = "suggestionTypes")
	public WebElement suggestionTypes;
	
	@FindBy(id = "isexternalvisit")
	public WebElement isExternalVisitOption;
	
	@FindBy(xpath = "//h4[contains(text(),'Your case has been successfully submitted')]")
	public WebElement confirmCaseCreation;
	
	@FindBy(id = "subject")
	public WebElement subject;
	
	@FindBy(id = "salikGate")
	public WebElement salikGate;
	
	@FindBy(id = "startLocation")
	public WebElement startLocation;
	
	@FindBy(id = "endLocation")
	public WebElement endLocation;
	
	@FindBy(id = "salikGate")
	public WebElement salikGateOptions;
	
	@FindBy(id = "itemCategory")
	public WebElement itemTypeOptions;
	
	@FindBy(id = "itemLocation")
	public WebElement itemLocationOptions;
	
	@FindBy(id = "itemColour")
	public WebElement itemColourOptions;
	
	@FindBy(id = "pickupLocation")
	public WebElement pickUpLocationOption;
	
	@FindBy(id = "driverNumber")
	public WebElement driverNumber;
	
	@FindBy(id = "dropLocation")
	public WebElement dropLocationOption;
	
	@FindBy(id = "receiptNumber")
	public WebElement receiptNumber;
	
	@FindBy(id = "fare")
	public WebElement fare;
	
	@FindBy(id = "vehiclePlateNo")
	public WebElement vehiclePlateNo;
	
	@FindBy(id = "vehicleSideNo")
	public WebElement vehicleSideNo;
	
	@FindBy(id = "sideNumberAbbrv")
	public WebElement sideNumberAbbrOptions;
	
	@FindBy(id = "driverName")
	public WebElement driverName;
	
	@FindBy(id = "customerLocation")
	public WebElement customerLocation;
	
	@FindBy(id = "fineNumber")
	public WebElement fineNumber;
	
	@FindBy(id = "fineAmount")
	public WebElement fineAmount;
	
	@FindBy(id = "kioskLocation")
	public WebElement kioskLocationOption;
	
	@FindBy(id = "serviceName")
	public WebElement serviceNameOption;
	
	@FindBy(id = "plateNumber")
	public WebElement plateNumber;
	
	@FindBy(id = "trafficFileNumber")
	public WebElement trafficFileNumber;
	
	@FindBy(id = "trnxRefNumber")
	public WebElement transactionRefrenceNum;
	
	@FindBy(id = "parkingCardNumber")
	public WebElement parkingCardNum;
	
	@FindBy(id = "svcTrnxNumber")
	public WebElement serviceTransNum;

	@FindBy (id = "service")
	public WebElement service;

	@FindBy (id = "touchpoint")
	public WebElement touchpoint;

	@FindBy(id = "caseReason")
	public WebElement caseReason;

	@FindBy (xpath = "//div[@class='accordion-wrap']//app-case-confirmation")
	public WebElement refCreator;
	

	public void changeLanguageToEnglish() throws Throwable{
		
		UtilityMethods.waitForPageLoadAndPageReady();
		new WebDriverWait(driver, 20)
		.until(ExpectedConditions.elementToBeClickable(changeLanguage));
		UtilityMethods.clickElemetJavaSciptExecutor(changeLanguage);

	}

	public void navigateToCaseTypeSuggestion() throws Throwable{
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.wait3Seconds();
		new WebDriverWait(driver, 20)
		.until(ExpectedConditions.elementToBeClickable(suggestion));
		new Actions(driver).moveToElement(suggestion).click().perform();
		UtilityMethods.wait3Seconds();
		
	}
	
	public void navigateToCaseTypeProvideACompliment() throws Throwable{
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.wait3Seconds();
		new WebDriverWait(driver, 20)
		.until(ExpectedConditions.elementToBeClickable(compliment));
		new Actions(driver).moveToElement(compliment).click().perform();
		UtilityMethods.wait3Seconds();
		
	}
	
	public void navigateToCaseTypeRequest() throws Throwable{
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.wait3Seconds();
		new WebDriverWait(driver, 20)
		.until(ExpectedConditions.elementToBeClickable(request));
		new Actions(driver).moveToElement(request).click().perform();
		UtilityMethods.wait3Seconds();
		
	}
	
	public void navigateToCaseTypeNotification() throws Throwable{
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.wait3Seconds();
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].scrollIntoView(true);", notification);
		new Actions(driver).moveToElement(notification).click().perform();
		UtilityMethods.wait3Seconds();
		
	}
	
	public void navigateToCaseTypeMakeAComplaint() throws Throwable{
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.wait3Seconds();
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].scrollIntoView(true);", complaint);
		new Actions(driver).moveToElement(complaint).click().perform();
		
	}
	
	public void navigateToCaseTypeReportLostItem() throws Throwable{
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.wait3Seconds();
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].scrollIntoView(true);", lostItem);
		new Actions(driver).moveToElement(lostItem).click().perform();
		
	}
	
	public void naviagetToCaseTypeFineObjection() throws Throwable{
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.wait3Seconds();
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].scrollIntoView(true);", fineObjection);
		new Actions(driver).moveToElement(fineObjection).click().perform();
		
	}

	public void createCaseTypeSuggestion() throws Throwable{

		UtilityMethods.waitForPageLoadAndPageReady();
		JavascriptExecutor executer = (JavascriptExecutor) driver;
		executer.executeScript("arguments[0].scrollIntoView(true);", rtaMainService);
		new Select(rtaMainService).selectByVisibleText("About RTA");
		rtaMainService.sendKeys(Keys.TAB);
		UtilityMethods.wait2Seconds();
		new Select(rtaSubService).selectByVisibleText("Salama Magazine");
		executer.executeScript("arguments[0].scrollIntoView(true);", description);
		description.sendKeys("some description over here consisting round about hundred characters.some description over here consisting round about hundred characters."
				+ "some description over here consisting round about hundred characters.");
		UtilityMethods.wait2Seconds();
		submitFormButton.click();

		UtilityMethods.waitForPageLoadAndPageReady();
		executer.executeScript("arguments[0].scrollIntoView(true);", suggestionTypes);
		new Select(suggestionTypes).selectByVisibleText("Internal Individual Suggestion");
		suggestionTypes.sendKeys(Keys.TAB);
		new Select(isExternalVisitOption).selectByVisibleText("No");
		isExternalVisitOption.sendKeys(Keys.TAB);
		UtilityMethods.wait2Seconds();
		submitFormButton2.click();

		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.wait3Seconds();

		executer.executeScript("arguments[0].scrollIntoView(true);", submitFormButton3);
		submitFormButton3.click();
	}
	
	public void createCaseTypeProvideACompliment() throws Throwable{
		
		UtilityMethods.waitForPageLoadAndPageReady();
		JavascriptExecutor executer = (JavascriptExecutor) driver;
		executer.executeScript("arguments[0].scrollIntoView(true);", rtaMainService);
		new Select(rtaMainService).selectByVisibleText("Getting Around");
		rtaMainService.sendKeys(Keys.TAB);
		UtilityMethods.wait2Seconds();
		new Select(rtaSubService).selectByVisibleText("Taxi");
		rtaSubService.sendKeys(Keys.TAB);
		new Select(subject).selectByVisibleText("Airport Taxis");
		executer.executeScript("arguments[0].scrollIntoView(true);", description);
		description.sendKeys("some description over here consisting round about hundred characters.some description over here consisting round about hundred characters.");
		UtilityMethods.wait2Seconds();
		submitFormButton.click();
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.wait3Seconds();
		
		executer.executeScript("arguments[0].scrollIntoView(true);", submitFormButton3);
		submitFormButton3.click();
		
	}
	
	public void createCaseTypeRequest() throws Throwable{
		
		UtilityMethods.waitForPageLoadAndPageReady();
		JavascriptExecutor executer = (JavascriptExecutor) driver;
		executer.executeScript("arguments[0].scrollIntoView(true);", rtaMainService);
		new Select(rtaMainService).selectByVisibleText("Road Users");
		rtaMainService.sendKeys(Keys.TAB);
		UtilityMethods.wait2Seconds();
		new Select(rtaSubService).selectByVisibleText("Salik");
		rtaSubService.sendKeys(Keys.TAB);
		executer.executeScript("arguments[0].scrollIntoView(true);", subject);
		new Select(subject).selectByVisibleText("Salik Gate");
		description.sendKeys("some description over here consisting round about hundred characters.some description over here consisting round about hundred characters.");
		UtilityMethods.wait2Seconds();
		executer.executeScript("arguments[0].scrollIntoView(true);", submitFormButton);
		submitFormButton.click();
		
//		UtilityMethods.waitForPageLoadAndPageReady();
//		executer.executeScript("arguments[0].scrollIntoView(true);", salikGateOptions);
//		new Select(salikGateOptions).selectByVisibleText("Airport Tunnel");
//		salikGateOptions.sendKeys(Keys.TAB);
//		UtilityMethods.wait2Seconds();
//		submitFormButton2.click();
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.wait3Seconds();
		
		executer.executeScript("arguments[0].scrollIntoView(true);", submitFormButton3);
		submitFormButton3.click();
		
	}
	
	public void createCaseTypeReportANotification() throws Throwable{
		
		UtilityMethods.waitForPageLoadAndPageReady();
		JavascriptExecutor executer = (JavascriptExecutor) driver;
		executer.executeScript("arguments[0].scrollIntoView(true);", rtaMainService);
		new Select(rtaMainService).selectByVisibleText("About RTA");
		rtaMainService.sendKeys(Keys.TAB);
		UtilityMethods.wait2Seconds();
		new Select(rtaSubService).selectByVisibleText("RTA Cars");
		executer.executeScript("arguments[0].scrollIntoView(true);", description);
		description.sendKeys("some description over here consisting round about hundred characters.some description over here consisting round about hundred characters.");
		UtilityMethods.wait2Seconds();
		submitFormButton.click();
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.wait3Seconds();
		
		executer.executeScript("arguments[0].scrollIntoView(true);", submitFormButton3);
		submitFormButton3.click();
		
	}
	
	public void createCaseTypeMakeAComplaint() throws Throwable{
		
		UtilityMethods.waitForPageLoadAndPageReady();
		JavascriptExecutor executer = (JavascriptExecutor) driver;
		executer.executeScript("arguments[0].scrollIntoView(true);", rtaMainService);
		new Select(rtaMainService).selectByVisibleText("About RTA");
		rtaMainService.sendKeys(Keys.TAB);
		UtilityMethods.wait2Seconds();
		new Select(rtaSubService).selectByVisibleText("Salama Magazine");
		executer.executeScript("arguments[0].scrollIntoView(true);", description);
		description.sendKeys("some description over here consisting round about hundred characters.some description over here consisting round about hundred characters.");
		UtilityMethods.wait2Seconds();
		executer.executeScript("arguments[0].scrollIntoView(true);", submitFormButton);
		submitFormButton.click();
		
		UtilityMethods.waitForPageLoadAndPageReady();
		executer.executeScript("arguments[0].scrollIntoView(true);", startLocation);
		startLocation.sendKeys("start location");
		startLocation.sendKeys(Keys.TAB);
		endLocation.sendKeys("end location");
		UtilityMethods.wait2Seconds();
		UtilityMethods.clickElemetJavaSciptExecutor(submitFormButton);
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.wait3Seconds();
		
		
		executer.executeScript("arguments[0].scrollIntoView(true);", submitFormButton3);
		submitFormButton3.click();
		
	}
	
	public void createCaseTypeReportLostItem() throws Throwable{
		
		UtilityMethods.waitForPageLoadAndPageReady();
		JavascriptExecutor executer = (JavascriptExecutor) driver;
		executer.executeScript("arguments[0].scrollIntoView(true);", rtaMainService);
		new Select(rtaMainService).selectByVisibleText("Getting Around");
		rtaMainService.sendKeys(Keys.TAB);
		UtilityMethods.wait2Seconds();
		new Select(rtaSubService).selectByVisibleText("Taxi");
		rtaSubService.sendKeys(Keys.TAB);
		executer.executeScript("arguments[0].scrollIntoView(true);", subject);
		new Select(subject).selectByVisibleText("Airport Taxis");
		
		subject.sendKeys(Keys.TAB);
		new Select(itemTypeOptions).selectByVisibleText("Bag");
		
		itemTypeOptions.sendKeys(Keys.TAB);
		new Select(itemLocationOptions).selectByVisibleText("Loc A");
		
		itemLocationOptions.sendKeys(Keys.TAB);
		new Select(itemColourOptions).selectByVisibleText("Black");
		
		
		executer.executeScript("arguments[0].scrollIntoView(true);", description);
		description.sendKeys("some description over here consisting round about hundred characters.some description over here consisting round about hundred characters.");
		UtilityMethods.wait2Seconds();
		executer.executeScript("arguments[0].scrollIntoView(true);", submitFormButton);
		submitFormButton.click();
		
		
//		UtilityMethods.waitForPageLoadAndPageReady();
//		executer.executeScript("arguments[0].scrollIntoView(true);", pickUpLocationOption);
//		new Select(pickUpLocationOption).selectByVisibleText("Loc B");
//		pickUpLocationOption.sendKeys(Keys.TAB);
//
//		driverNumber.sendKeys("123");
//		driverNumber.sendKeys(Keys.TAB);
//
//		new Select(dropLocationOption).selectByVisibleText("Loc A");
//		dropLocationOption.sendKeys(Keys.TAB);
//
//		receiptNumber.sendKeys("123");
//		receiptNumber.sendKeys(Keys.TAB);
//
//		fare.sendKeys("324");
//		fare.sendKeys(Keys.TAB);
//		UtilityMethods.wait2Seconds();
//		vehiclePlateNo.sendKeys("1234");
//		vehiclePlateNo.sendKeys(Keys.TAB);
//
//		vehicleSideNo.sendKeys("123456");
//		vehicleSideNo.sendKeys(Keys.TAB);
//
//		new Select(sideNumberAbbrOptions).selectByVisibleText("A");
//		sideNumberAbbrOptions.sendKeys(Keys.TAB);
//		UtilityMethods.wait2Seconds();
//		driverName.sendKeys("john");
//		driverName.sendKeys(Keys.TAB);
//
//		new Select(customerLocation).selectByVisibleText("Inside Taxi");
//
//		UtilityMethods.wait2Seconds();
//		UtilityMethods.clickElemetJavaSciptExecutor(submitFormButton);
		
		
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.wait3Seconds();
		executer.executeScript("arguments[0].scrollIntoView(true);", submitFormButton3);
		submitFormButton3.click();
		
	}
	
	public void createANewCaseWithCaseTypeSubmitFineObjection() throws Throwable{
		
		UtilityMethods.waitForPageLoadAndPageReady();
		JavascriptExecutor executer = (JavascriptExecutor) driver;
		executer.executeScript("arguments[0].scrollIntoView(true);", rtaMainService);
		new Select(rtaMainService).selectByVisibleText("Road Users");
		rtaMainService.sendKeys(Keys.TAB);
		UtilityMethods.wait2Seconds();
		new Select(rtaSubService).selectByVisibleText("Salik");
		
		executer.executeScript("arguments[0].scrollIntoView(true);", subject);
		new Select(subject).selectByVisibleText("Salik Fines");
		
		subject.sendKeys(Keys.TAB);
		
		fineNumber.sendKeys("234");
		fineNumber.sendKeys(Keys.TAB);
		executer.executeScript("arguments[0].scrollIntoView(true);", fineAmount);
		fineAmount.sendKeys("324");
		
		executer.executeScript("arguments[0].scrollIntoView(true);", description);
		description.sendKeys("some description over here consisting round about hundred characters.some description over here consisting round about hundred characters.");
		UtilityMethods.wait2Seconds();
		submitFormButton.click();
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.wait2Seconds();
		UtilityMethods.clickElemetJavaSciptExecutor(submitFormButton);
		
		
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.wait3Seconds();
		
//		executer.executeScript("arguments[0].scrollIntoView(true);", submitFormButton3);
//		submitFormButton3.click();
		
	}
	
	public void verifyCaseCreation() throws Throwable{
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.wait3Seconds();
		JavascriptExecutor executer = (JavascriptExecutor) driver;
		try{	
		executer.executeScript("arguments[0].scrollIntoView(true);", confirmCaseCreation);
		
		new Actions(driver).moveToElement(confirmCaseCreation).perform();
		confirmCaseCreation.isDisplayed();
		}
		catch(Exception e){
			System.out.println("Case has not been created successfully");
		}
		
	}

	//////////////////////////////////////////////////////////////////////////////////////////////////////
	public void createSuggestionCaseTypePhaseTwo() throws Throwable{

		UtilityMethods.waitForPageLoadAndPageReady();
		JavascriptExecutor executer = (JavascriptExecutor) driver;
		executer.executeScript("arguments[0].scrollIntoView(true);", service);
		UtilityMethods.wait3Seconds();
		new Select(service).selectByVisibleText("Issuing Personal Gold/Silver NOL Card");
		service.sendKeys(Keys.TAB);
		UtilityMethods.wait2Seconds();

		new Select(touchpoint).selectByVisibleText("Mobile App");
		touchpoint.sendKeys(Keys.TAB);
		UtilityMethods.wait2Seconds();

		new Select(caseReason).selectByVisibleText("Dispatch Staff Conduct");
		caseReason.sendKeys(Keys.TAB);
		UtilityMethods.wait2Seconds();

		executer.executeScript("arguments[0].scrollIntoView(true);", description);
		description.sendKeys("some description over here consisting round about hundred characters.some description over here consisting round about hundred characters."
				+ "some description over here consisting round about hundred characters.");
		UtilityMethods.wait2Seconds();
		submitFormButton.click();

		UtilityMethods.waitForPageLoadAndPageReady();
		executer.executeScript("arguments[0].scrollIntoView(true);", suggestionTypes);
		UtilityMethods.wait3Seconds();
		new Select(suggestionTypes).selectByVisibleText("External Individual Suggestion");
		suggestionTypes.sendKeys(Keys.TAB);
		//new Select(isExternalVisitOption).selectByVisibleText("No");
		//isExternalVisitOption.sendKeys(Keys.TAB);
		UtilityMethods.wait2Seconds();
		submitFormButton2.click();

		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.wait3Seconds();

		executer.executeScript("arguments[0].scrollIntoView(true);", submitFormButton3);
		submitFormButton3.click();


		new WebDriverWait(driver,60)
				.until(ExpectedConditions.visibilityOf(refCreator));
		refNo = refCreator.getAttribute("ng-reflect-ref-no");
		System.out.println(refNo);

	}

	public void createComplaintCaseTypePhaseTwo() throws Throwable{
		UtilityMethods.waitForPageLoadAndPageReady();
		JavascriptExecutor executer = (JavascriptExecutor) driver;
		executer.executeScript("arguments[0].scrollIntoView(true);", service);
		UtilityMethods.wait3Seconds();
		new Select(service).selectByVisibleText("Issuing Personal Gold/Silver NOL Card");
		service.sendKeys(Keys.TAB);
		UtilityMethods.wait2Seconds();

		new Select(touchpoint).selectByVisibleText("Mobile App");
		touchpoint.sendKeys(Keys.TAB);
		UtilityMethods.wait2Seconds();

		new Select(caseReason).selectByVisibleText("Dispatch Staff Conduct");
		caseReason.sendKeys(Keys.TAB);
		UtilityMethods.wait2Seconds();

		executer.executeScript("arguments[0].scrollIntoView(true);", description);
		description.sendKeys("some description over here consisting round about hundred characters.some description over here consisting round about hundred characters."
				+ "some description over here consisting round about hundred characters.");
		UtilityMethods.wait2Seconds();
		submitFormButton.click();

		UtilityMethods.waitForPageLoadAndPageReady();
//		executer.executeScript("arguments[0].scrollIntoView(true);", suggestionTypes);
//		UtilityMethods.wait3Seconds();
//		new Select(suggestionTypes).selectByVisibleText("External Individual Suggestion");
//		suggestionTypes.sendKeys(Keys.TAB);
//		//new Select(isExternalVisitOption).selectByVisibleText("No");
//		//isExternalVisitOption.sendKeys(Keys.TAB);
//		UtilityMethods.wait2Seconds();
//		submitFormButton2.click();
//
//		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.wait3Seconds();

		executer.executeScript("arguments[0].scrollIntoView(true);", submitFormButton3);
		submitFormButton3.click();


		new WebDriverWait(driver,60)
				.until(ExpectedConditions.visibilityOf(refCreator));
		refNo = refCreator.getAttribute("ng-reflect-ref-no");
		System.out.println(refNo);

	}

	public void createComplimentCaseTypePhaseTwo () throws Throwable {

		UtilityMethods.waitForPageLoadAndPageReady();
		JavascriptExecutor executer = (JavascriptExecutor) driver;
		executer.executeScript("arguments[0].scrollIntoView(true);", service);
		UtilityMethods.wait3Seconds();
		new Select(service).selectByVisibleText("Issuing Personal Gold/Silver NOL Card");
		service.sendKeys(Keys.TAB);
		UtilityMethods.wait2Seconds();

		new Select(touchpoint).selectByVisibleText("Mobile App");
		touchpoint.sendKeys(Keys.TAB);
		UtilityMethods.wait2Seconds();

		new Select(caseReason).selectByVisibleText("Dispatch Staff Conduct");
		caseReason.sendKeys(Keys.TAB);
		UtilityMethods.wait2Seconds();

		executer.executeScript("arguments[0].scrollIntoView(true);", description);
		description.sendKeys("some description over here consisting round about hundred characters.some description over here consisting round about hundred characters."
				+ "some description over here consisting round about hundred characters.");
		UtilityMethods.wait2Seconds();
		submitFormButton.click();

		UtilityMethods.waitForPageLoadAndPageReady();
//		executer.executeScript("arguments[0].scrollIntoView(true);", suggestionTypes);
//		UtilityMethods.wait3Seconds();
//		new Select(suggestionTypes).selectByVisibleText("External Individual Suggestion");
//		suggestionTypes.sendKeys(Keys.TAB);
//		//new Select(isExternalVisitOption).selectByVisibleText("No");
//		//isExternalVisitOption.sendKeys(Keys.TAB);
//		UtilityMethods.wait2Seconds();
//		submitFormButton2.click();
//
//		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.wait3Seconds();

		executer.executeScript("arguments[0].scrollIntoView(true);", submitFormButton3);
		submitFormButton3.click();


		new WebDriverWait(driver,60)
				.until(ExpectedConditions.visibilityOf(refCreator));
		refNo = refCreator.getAttribute("ng-reflect-ref-no");
		System.out.println(refNo);
	}

	public void createRequestCaseTypePhaseTwo() throws Throwable {

		UtilityMethods.waitForPageLoadAndPageReady();
		JavascriptExecutor executer = (JavascriptExecutor) driver;
		executer.executeScript("arguments[0].scrollIntoView(true);", service);
		UtilityMethods.wait3Seconds();
		new Select(service).selectByVisibleText("Issuing Personal Gold/Silver NOL Card");
		service.sendKeys(Keys.TAB);
		UtilityMethods.wait2Seconds();

		new Select(touchpoint).selectByVisibleText("Mobile App");
		touchpoint.sendKeys(Keys.TAB);
		UtilityMethods.wait2Seconds();

		new Select(caseReason).selectByVisibleText("Dispatch Staff Conduct");
		caseReason.sendKeys(Keys.TAB);
		UtilityMethods.wait2Seconds();

		executer.executeScript("arguments[0].scrollIntoView(true);", description);
		description.sendKeys("some description over here consisting round about hundred characters.some description over here consisting round about hundred characters."
				+ "some description over here consisting round about hundred characters.");
		UtilityMethods.wait2Seconds();
		submitFormButton.click();

		UtilityMethods.waitForPageLoadAndPageReady();
//		executer.executeScript("arguments[0].scrollIntoView(true);", suggestionTypes);
//		UtilityMethods.wait3Seconds();
//		new Select(suggestionTypes).selectByVisibleText("External Individual Suggestion");
//		suggestionTypes.sendKeys(Keys.TAB);
//		//new Select(isExternalVisitOption).selectByVisibleText("No");
//		//isExternalVisitOption.sendKeys(Keys.TAB);
//		UtilityMethods.wait2Seconds();
//		submitFormButton2.click();
//
//		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.wait3Seconds();

		executer.executeScript("arguments[0].scrollIntoView(true);", submitFormButton3);
		submitFormButton3.click();

		new WebDriverWait(driver,60)
				.until(ExpectedConditions.visibilityOf(refCreator));
		refNo = refCreator.getAttribute("ng-reflect-ref-no");
		System.out.println(refNo);
	}

	public void createNotificationCaseTypePhaseTwo() throws Throwable {
		UtilityMethods.waitForPageLoadAndPageReady();
		JavascriptExecutor executer = (JavascriptExecutor) driver;
		executer.executeScript("arguments[0].scrollIntoView(true);", service);
		UtilityMethods.wait3Seconds();
		new Select(service).selectByVisibleText("Issuing Personal Gold/Silver NOL Card");
		service.sendKeys(Keys.TAB);
		UtilityMethods.wait2Seconds();

		new Select(touchpoint).selectByVisibleText("Mobile App");
		touchpoint.sendKeys(Keys.TAB);
		UtilityMethods.wait2Seconds();

		new Select(caseReason).selectByVisibleText("Dispatch Staff Conduct");
		caseReason.sendKeys(Keys.TAB);
		UtilityMethods.wait2Seconds();

		executer.executeScript("arguments[0].scrollIntoView(true);", description);
		description.sendKeys("some description over here consisting round about hundred characters.some description over here consisting round about hundred characters."
				+ "some description over here consisting round about hundred characters.");
		UtilityMethods.wait2Seconds();
		submitFormButton.click();

		UtilityMethods.waitForPageLoadAndPageReady();
//		executer.executeScript("arguments[0].scrollIntoView(true);", suggestionTypes);
//		UtilityMethods.wait3Seconds();
//		new Select(suggestionTypes).selectByVisibleText("External Individual Suggestion");
//		suggestionTypes.sendKeys(Keys.TAB);
//		//new Select(isExternalVisitOption).selectByVisibleText("No");
//		//isExternalVisitOption.sendKeys(Keys.TAB);
//		UtilityMethods.wait2Seconds();
//		submitFormButton2.click();
//
//		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.wait3Seconds();

		executer.executeScript("arguments[0].scrollIntoView(true);", submitFormButton3);
		submitFormButton3.click();

		new WebDriverWait(driver,60)
				.until(ExpectedConditions.visibilityOf(refCreator));
		refNo = refCreator.getAttribute("ng-reflect-ref-no");
		System.out.println(refNo);
	}

	public void createFineObjectionCaseTypePhaseTwo() throws Throwable{

		UtilityMethods.waitForPageLoadAndPageReady();
		JavascriptExecutor executer = (JavascriptExecutor) driver;
		UtilityMethods.wait3Seconds();
		executer.executeScript("arguments[0].scrollIntoView(true);", service);
		UtilityMethods.wait3Seconds();
		new Select(service).selectByVisibleText("Issuing Personal Gold/Silver NOL Card");
		service.sendKeys(Keys.TAB);
		UtilityMethods.wait2Seconds();

		new Select(touchpoint).selectByVisibleText("Mobile App");
		touchpoint.sendKeys(Keys.TAB);
		UtilityMethods.wait2Seconds();

		new Select(caseReason).selectByVisibleText("Dispatch Staff Conduct");
		caseReason.sendKeys(Keys.TAB);
		UtilityMethods.wait2Seconds();

		fineNumber.sendKeys("234");
		fineNumber.sendKeys(Keys.TAB);
		executer.executeScript("arguments[0].scrollIntoView(true);", fineAmount);
		fineAmount.sendKeys("324");

		executer.executeScript("arguments[0].scrollIntoView(true);", description);
		description.sendKeys("some description over here consisting round about hundred characters.some description over here consisting round about hundred characters."
				+ "some description over here consisting round about hundred characters.");
		UtilityMethods.wait2Seconds();
		submitFormButton.click();

		UtilityMethods.waitForPageLoadAndPageReady();
//		executer.executeScript("arguments[0].scrollIntoView(true);", suggestionTypes);
//		UtilityMethods.wait3Seconds();
//		new Select(suggestionTypes).selectByVisibleText("External Individual Suggestion");
//		suggestionTypes.sendKeys(Keys.TAB);
//		//new Select(isExternalVisitOption).selectByVisibleText("No");
//		//isExternalVisitOption.sendKeys(Keys.TAB);
//		UtilityMethods.wait2Seconds();
//		submitFormButton2.click();
//
//		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.wait3Seconds();

		executer.executeScript("arguments[0].scrollIntoView(true);", submitFormButton3);
		submitFormButton3.click();

		new WebDriverWait(driver,60)
				.until(ExpectedConditions.visibilityOf(refCreator));
		refNo = refCreator.getAttribute("ng-reflect-ref-no");
		System.out.println(refNo);

	}

	public void createLostItemCaseTypePhaseTwo() throws Throwable {

		UtilityMethods.waitForPageLoadAndPageReady();
		JavascriptExecutor executer = (JavascriptExecutor) driver;
		UtilityMethods.wait3Seconds();
		executer.executeScript("arguments[0].scrollIntoView(true);", service);
		UtilityMethods.wait3Seconds();
		new Select(service).selectByVisibleText("Issuing Personal Gold/Silver NOL Card");
		service.sendKeys(Keys.TAB);
		UtilityMethods.wait2Seconds();

		new Select(touchpoint).selectByVisibleText("Mobile App");
		touchpoint.sendKeys(Keys.TAB);
		UtilityMethods.wait2Seconds();

		new Select(caseReason).selectByVisibleText("Dispatch Staff Conduct");
		caseReason.sendKeys(Keys.TAB);
		UtilityMethods.wait2Seconds();

		new Select(itemTypeOptions).selectByVisibleText("Bag");

		itemTypeOptions.sendKeys(Keys.TAB);
		new Select(itemLocationOptions).selectByVisibleText("Loc A");

		itemLocationOptions.sendKeys(Keys.TAB);
		new Select(itemColourOptions).selectByVisibleText("Black");

		executer.executeScript("arguments[0].scrollIntoView(true);", description);
		description.sendKeys("some description over here consisting round about hundred characters.some description over here consisting round about hundred characters."
				+ "some description over here consisting round about hundred characters.");
		UtilityMethods.wait2Seconds();
		submitFormButton.click();

		UtilityMethods.waitForPageLoadAndPageReady();
//		executer.executeScript("arguments[0].scrollIntoView(true);", suggestionTypes);
//		UtilityMethods.wait3Seconds();
//		new Select(suggestionTypes).selectByVisibleText("External Individual Suggestion");
//		suggestionTypes.sendKeys(Keys.TAB);
//		//new Select(isExternalVisitOption).selectByVisibleText("No");
//		//isExternalVisitOption.sendKeys(Keys.TAB);
//		UtilityMethods.wait2Seconds();
//		submitFormButton2.click();
//
//		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.wait3Seconds();

		executer.executeScript("arguments[0].scrollIntoView(true);", submitFormButton3);
		submitFormButton3.click();

		new WebDriverWait(driver,60)
				.until(ExpectedConditions.visibilityOf(refCreator));
		refNo = refCreator.getAttribute("ng-reflect-ref-no");
		System.out.println(refNo);
	}
	
	public CustomerPortal(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, this);
	}
	
}
