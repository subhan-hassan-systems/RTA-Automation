package Test.Automation.Pages;

import static org.junit.Assert.assertEquals;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.UUID;

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

import Test.Automation.Utils.DriverFactory;
import Test.Automation.Utils.UtilityMethods;


public class CustomerPage extends DriverFactory {
	
	@FindBy(xpath = "//span[contains(text(),'New')]")
	public WebElement newCustomer;
	
	@FindBy(id = "firstname")
	public WebElement clickFirstName;
	
	@FindBy(id = "firstname_i")
	public WebElement firstName;
	
	@FindBy(id = "lastname")
	public WebElement clickLastName;
	
	@FindBy(id = "lastname_i")
	public WebElement lastName;
	
	@FindBy(id = "new_preferredlanguage")
	public WebElement clickLanguage;
	
	@FindBy(xpath = "//*[@id=\"new_preferredlanguage_i\"]/option[2]")
	public WebElement selectLanguage;
	
	@FindBy(id = "preferredcontactmethodcode")
	public WebElement contactMethod;
	
	@FindBy(xpath = "//*[@id=\"preferredcontactmethodcode_i\"]/option[2]")
	public WebElement selectContactMethod;
	
	@FindBy(id = "emailaddress1")
	public WebElement emailField;
	
	@FindBy(id = "emailaddress1_i")
	public WebElement emailAddress;
	
	@FindBy(xpath = ".//*[@id='contact|NoRelationship|Form|Mscrm.Form.contact.SaveAndClose']/span/a/span")
	public WebElement saveAndCloseButton;
	
	@FindBy(id = "crmGrid_findCriteria")
	public WebElement findCriteria;

	@FindBy(id = "crmGrid_findCriteriaImg")
	public WebElement hitSearch;
	
	@FindBy(xpath = "//*[@id=\"gridBodyTable\"]/tbody/tr/td[2]/nobr")
	public WebElement customerName;
	
	@FindBy(id = "new_profiletype")
	public WebElement profileType;
	
	@FindBy(id = "new_profiletype_i")
	public WebElement profileDropDown;
	
	@FindBy()
	public WebElement selectDubaiTaxiStaff;
	
	@FindBy(id = "new_rtaagencyid")
	public WebElement rtaAgencyField;
	
	@FindBy(id = "new_rtaagencyid_i")
	public WebElement searchRtaAgency;
	
	@FindBy(xpath = "//*[@id=\"new_rtaagencyid_cl_span\"]/img")
	public WebElement checkRtaAgencyFieldMandatory;
	
	@FindBy(id = "new_rtajoindate")
	public WebElement rtaJoinDate;
	
	@FindBy(id = "new_rtajoindate_iimg")
	public WebElement dateValue;
	
	@FindBy(css = "td.ms-crm-MiniCal-Day.ms-crm-MiniCal-Day-Today.ms-crm-MiniCal-Day-Hilited-Current")
	public WebElement currentDate;
	
	@FindBy(xpath = "//*[@id=\"new_rtajoindate_cl_span\"]/img")
	public WebElement checkRtaJoinDateMandatory;
	
	@FindBy(id = "new_rtadepartmentid")
	public WebElement rtaDepartment;
	
	@FindBy(id = "new_rtadepartmentid_i")
	public WebElement selectRtaDepartment;
	
	@FindBy(xpath = "//*[@id=\"new_rtadepartmentid_cl_span\"]/img")
	public WebElement checkRtaDepartmentMandatory;
	
	@FindBy(id = "new_rtajobtitleid")
	public WebElement rtaJobTitle;
	
	@FindBy(id = "new_employeegrade")
	public WebElement employeeGrade;
	
	@FindBy(id = "new_rtastaffid")
	public WebElement rtaStaffId;
	
	@FindBy(id = "new_rtastaffid_i")
	public WebElement sendRtaStaffId;
	
	@FindBy(xpath = "//*[@id=\"new_rtastaffid_cl_span\"]/img")
	public WebElement checkRtaStaffIdMandatory;
	
	@FindBy(id = "new_rtaemployeerole")
	public WebElement rtaRole;
	
	@FindBy(xpath = "//*[@id=\"new_rtaemployeerole_cl_span\"]/img")
	public WebElement checkRtaRoleMandatory;
	
	@FindBy(id = "new_rtaemployeerole_i")
	public WebElement rtaRoleDropDown;
	
	@FindBy(css = "span.ms-crm-IL-MenuItem-Title-Lookupmore.ms-crm-IL-MenuItem-Title-Lookupmore-Rest")
	public WebElement lookMoreRecord;

	@FindBy(id = "butBegin")
	public WebElement addButton;
	
	@FindBy(id = "mobilephone_i")
	public WebElement mobileNumber;
	
	@FindBy(id = "mobilephone")
	public WebElement mobilePhone;
	
	@FindBy(id = "rta_nationality")
	public WebElement nationalityField;
	
	@FindBy(id = "rta_nationality_i")
	public WebElement searchNationality;
	
	@FindBy(id = "new_driverid")
	public WebElement driverID;
	
	@FindBy(xpath = "//*[@id=\"new_driverid_cl_span\"]/img")
	public WebElement checkDriverIDField;
	
	@FindBy(id = "new_driverid_i")
	public WebElement driverIdValue;
	
	@FindBy(xpath = "//*[@id=\"new_driveridexpirydate_cl_span\"]/img")
	public WebElement checkExpiryDate;
	
	@FindBy(id = "new_driveridexpirydate")
	public WebElement expiryDateField;
	
	@FindBy(id = "new_driveridexpirydate_iimg")
	public WebElement selectDateExpiry;
	
	@FindBy(id = "new_platenumber")
	public WebElement plateNumberField;
	
	@FindBy(id = "new_sidenumber")
	public WebElement sideNumberField;
	
	@FindBy(xpath = "//*[@id=\"new_drivercompany_cl_span\"]/img")
	public WebElement checkDriverCompanyField;
	
	@FindBy(id = "new_drivercompany")
	public WebElement driverCompanyField;
	
	@FindBy(id = "new_drivercompany_i")
	public WebElement driverCompanyDropDown;
	
	@FindBy(xpath = "//h3[contains(text(),'RTA Partnership')]")
	public WebElement verifyRTAPatnershipSection;
	
	@FindBy(xpath = "//*[@id=\"rta_partnershipname_cl_span\"]/img")
	public WebElement checkRTAPatnership;
	
	@FindBy(id = "rta_partnershipname")
	public WebElement verifyRTAPatnershipField;
	
	@FindBy(id = "rta_partnershipname_i")
	public WebElement rtaPatnership;
	
	@FindBy(xpath = "//h3[contains(text(),'RTA Vendor Staff')]")
	public WebElement verifyCompanySection;
	
	@FindBy(id = "rta_companyname")
	public WebElement verifyRtaCompanyField;
	
	@FindBy(xpath = "//*[@id=\"rta_companyname_cl_span\"]/img")
	public WebElement checkCompanyField;
	
	@FindBy(id = "rta_companyname_i")
	public WebElement company;
	
	@FindBy(xpath = "//*[@id=\"gridBodyTable\"]/tbody/tr[1]/td[2]/nobr")
	public WebElement selectContact;
	
	@FindBy(id = "crmGrid_clearCriteriaImg")
	public WebElement clearSearchField;
	
	@FindBy(xpath = "//label[contains(text(),'Created On')]")
	public WebElement orderDate;
	
	@FindBy(xpath = "//img[contains(@alt,'The data is sorted in descending order on this column')]")
	public WebElement checkDateOrder;
	
	@FindBy(xpath = ".//*[@id='gridBodyTable']/tbody/tr[1]/td[2]/nobr")
	public WebElement verifyObject;
	
	public void createCustomerWithProfileTypeExternalAndVerify(String email) throws Throwable{
		
		UtilityMethods.waitForPageLoadAndPageReady();
		String parentWindowHandler = driver.getWindowHandle();
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		
		clickFirstName.click();
		firstName.clear();
		firstName.sendKeys("EXTERNAL");
		
		clickLastName.click();
		lastName.clear();
		lastName.sendKeys("CUSTOMER");
		
		profileType.click();
		Select internalRtaOption = new Select(profileDropDown);
		internalRtaOption.selectByVisibleText("External Customer");
		
		clickLanguage.click();
		selectLanguage.click();
		
		mobilePhone.click();
		mobileNumber.sendKeys("0514756556");
	
		emailField.click();
		emailAddress.sendKeys(email);
		
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		saveAndCloseButton.click();
		
		UtilityMethods.wait3Seconds();
		
		try{
			
			if(driver.findElements(By.cssSelector("iframe[name='InlineDialog_Iframe")).size() != 0){
				driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='InlineDialog_Iframe']")));
				addButton.click();
				}
			}
			catch(NoSuchElementException e){
				System.out.println("duplicate data entry pop up not dispalayed");
			}
		
		UtilityMethods.clickOkatAlertIfPresent();
		UtilityMethods.waitForPageLoadAndPageReady();
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));
		
		findCriteria.clear();
		findCriteria.sendKeys("external customer");

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
		
		new Actions(driver).doubleClick(verifyObject).perform();
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		
		assertEquals(profileType.getAttribute("title"),"External Customer");
		
		UtilityMethods.waitForPageLoadAndPageReady();
		driver.switchTo().window(parentWindowHandler);
		saveAndCloseButton.click();
		
		UtilityMethods.wait3Seconds();
		
		try{
			
			if(driver.findElements(By.cssSelector("iframe[name='InlineDialog_Iframe")).size() != 0){
				driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='InlineDialog_Iframe']")));
				addButton.click();
				}
			}
			catch(NoSuchElementException e){
				System.out.println("duplicate data entry pop up not dispalayed");
			}
		
		UtilityMethods.clickOkatAlertIfPresent();
		driver.switchTo().window(parentWindowHandler);
		
	}
	
	public void createCustomerWithProfileTypeInternalRTAStaff() throws Throwable{
		
		UtilityMethods.waitForPageLoadAndPageReady();
		String parentWindowHandler = driver.getWindowHandle();
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		
		clickFirstName.click();
		firstName.clear();
		firstName.sendKeys("RTA");
		
		clickLastName.click();
		lastName.clear();
		lastName.sendKeys("STAFF");
		
		clickLanguage.click();
		selectLanguage.click();
			
		profileType.click();
		Select internalRtaOption = new Select(profileDropDown);
		internalRtaOption.selectByVisibleText("Internal RTA Staff");
		
		mobilePhone.click();
		mobileNumber.sendKeys("0514756556");
	
		emailField.click();
		emailAddress.sendKeys("testing@testing.com");
		
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		saveAndCloseButton.click();
		
		UtilityMethods.waitForPageLoadAndPageReady();
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		
		UtilityMethods.verifyElementDisplayed(rtaAgencyField);
		UtilityMethods.verifyElementDisplayed(checkRtaAgencyFieldMandatory);
		UtilityMethods.verifyElementDisplayed(rtaJoinDate);
		UtilityMethods.verifyElementDisplayed(checkRtaJoinDateMandatory);
		UtilityMethods.verifyElementDisplayed(rtaDepartment);
		UtilityMethods.verifyElementDisplayed(checkRtaDepartmentMandatory);
		UtilityMethods.verifyElementDisplayed(rtaJobTitle);
		UtilityMethods.verifyElementDisplayed(employeeGrade);
		UtilityMethods.verifyElementDisplayed(rtaStaffId);
		UtilityMethods.verifyElementDisplayed(checkRtaStaffIdMandatory);
		UtilityMethods.verifyElementDisplayed(rtaRole);
		UtilityMethods.verifyElementDisplayed(checkRtaRoleMandatory);

		searchRtaAgency.click();
		
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
		
		rtaJoinDate.click();

		dateValue.click();
		currentDate.click();
		
		rtaDepartment.click();
		selectRtaDepartment.click();
		UtilityMethods.wait2Seconds();
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
		
		rtaStaffId.click();
		sendRtaStaffId.sendKeys("123");
		
		rtaRole.click();
		
		Select RoleDropDown = new Select(rtaRoleDropDown);
		RoleDropDown.selectByVisibleText("Trainer");
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		saveAndCloseButton.click();
		
		UtilityMethods.wait3Seconds();
		
		try{
			
			if(driver.findElements(By.cssSelector("iframe[name='InlineDialog_Iframe")).size() != 0){
				driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='InlineDialog_Iframe']")));
				addButton.click();
				}
			}
			catch(NoSuchElementException e){
				System.out.println("duplicate data entry pop up not dispalayed");
			}
		
		UtilityMethods.clickOkatAlertIfPresent();
		UtilityMethods.waitForPageLoadAndPageReady();
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));
		
		findCriteria.clear();
		findCriteria.sendKeys("RTA");

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
		
		new Actions(driver).doubleClick(verifyObject).perform();
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		
		assertEquals(profileType.getAttribute("title"),"Internal RTA Staff");
		
		UtilityMethods.waitForPageLoadAndPageReady();
		driver.switchTo().window(parentWindowHandler);
		saveAndCloseButton.click();
		
		UtilityMethods.wait3Seconds();
		
		try{
			
			if(driver.findElements(By.cssSelector("iframe[name='InlineDialog_Iframe")).size() != 0){
				driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='InlineDialog_Iframe']")));
				addButton.click();
				}
			}
			catch(NoSuchElementException e){
				System.out.println("duplicate data entry pop up not dispalayed");
			}
		
		UtilityMethods.clickOkatAlertIfPresent();
		
		driver.switchTo().window(parentWindowHandler);
		
	}
	
	public void createCustomerWithProfileTypeDubaiTaxiStaff() throws Throwable{
		
		UtilityMethods.waitForPageLoadAndPageReady();
		String parentWindowHandler = driver.getWindowHandle();
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		
		clickFirstName.click();
		firstName.clear();
		firstName.sendKeys("DUBAI");
		
		clickLastName.click();
		lastName.clear();
		lastName.sendKeys("TAXI");
		
		clickLanguage.click();
		selectLanguage.click();
			
		profileType.click();
		Select dubaiTaxiOption = new Select(profileDropDown);
		dubaiTaxiOption.selectByVisibleText("Dubai Taxi Staff");
		
		mobilePhone.click();
		mobileNumber.sendKeys("0514756556");
	
		emailField.click();
		emailAddress.sendKeys("testing@testing.com");
		
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		saveAndCloseButton.click();
		
		UtilityMethods.waitForPageLoadAndPageReady();
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		
		UtilityMethods.verifyElementDisplayed(rtaAgencyField);
		UtilityMethods.verifyElementDisplayed(checkRtaAgencyFieldMandatory);
		UtilityMethods.verifyElementDisplayed(rtaJoinDate);
		UtilityMethods.verifyElementDisplayed(rtaDepartment);
		UtilityMethods.verifyElementDisplayed(checkRtaDepartmentMandatory);
		UtilityMethods.verifyElementDisplayed(rtaJobTitle);
		UtilityMethods.verifyElementDisplayed(employeeGrade);
		UtilityMethods.verifyElementDisplayed(rtaStaffId);
		UtilityMethods.verifyElementDisplayed(rtaRole);

		rtaDepartment.click();
		selectRtaDepartment.click();
		UtilityMethods.wait2Seconds();
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
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		saveAndCloseButton.click();

		UtilityMethods.wait3Seconds();
		
		try{
			
			if(driver.findElements(By.cssSelector("iframe[name='InlineDialog_Iframe")).size() != 0){
				driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='InlineDialog_Iframe']")));
				addButton.click();
				}
			}
			catch(NoSuchElementException e){
				System.out.println("duplicate data entry pop up not dispalayed");
			}
		
		UtilityMethods.clickOkatAlertIfPresent();
		UtilityMethods.waitForPageLoadAndPageReady();
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));
		
		findCriteria.clear();
		findCriteria.sendKeys("DUBAI");

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
		
		new Actions(driver).doubleClick(verifyObject).perform();
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		
		assertEquals(profileType.getAttribute("title"),"Dubai Taxi Staff");
		
		UtilityMethods.waitForPageLoadAndPageReady();
		driver.switchTo().window(parentWindowHandler);
		saveAndCloseButton.click();

		UtilityMethods.wait3Seconds();
		
		try{
			
			if(driver.findElements(By.cssSelector("iframe[name='InlineDialog_Iframe")).size() != 0){
				driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='InlineDialog_Iframe']")));
				addButton.click();
				}
			}
			catch(NoSuchElementException e){
				System.out.println("duplicate data entry pop up not dispalayed");
			}
		
		UtilityMethods.clickOkatAlertIfPresent();
		UtilityMethods.waitForPageLoadAndPageReady();
		driver.switchTo().window(parentWindowHandler);
		
		
	}
	
	public void createCustomerWithProfileTypeDrivers() throws Throwable{
		
		UtilityMethods.waitForPageLoadAndPageReady();
		String parentWindowHandler = driver.getWindowHandle();
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		
		clickFirstName.click();
		firstName.clear();
		firstName.sendKeys("DRIVER");
		
		clickLastName.click();
		lastName.clear();
		lastName.sendKeys("TEST");
		
		clickLanguage.click();
		selectLanguage.click();
			
		profileType.click();
		Select dubaiTaxiOption = new Select(profileDropDown);
		dubaiTaxiOption.selectByVisibleText("Drivers");
		
		mobilePhone.click();
		mobileNumber.sendKeys("0514756556");
//		UtilityMethods.wait10Seconds();
//		nationalityField.click();
//		searchNationality.click();
//		UtilityMethods.wait2Seconds();
//		lookMoreRecord.click();
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		new WebDriverWait(driver, 60).until(
				ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='InlineDialog_Iframe']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='InlineDialog_Iframe']")));
		addButton.click();

		
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		saveAndCloseButton.click();
		
		UtilityMethods.waitForPageLoadAndPageReady();
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		
		UtilityMethods.verifyElementDisplayed(driverID);
		UtilityMethods.verifyElementDisplayed(checkDriverIDField);
		UtilityMethods.verifyElementDisplayed(checkExpiryDate);
		UtilityMethods.verifyElementDisplayed(expiryDateField);
		UtilityMethods.verifyElementDisplayed(plateNumberField);
		UtilityMethods.verifyElementDisplayed(sideNumberField);
		UtilityMethods.verifyElementDisplayed(checkDriverCompanyField);
		UtilityMethods.verifyElementDisplayed(driverCompanyField);
		
		int driverIdNumber = (int)(Math.random()*((67576-45)+1))+2;
		String driverId = String.valueOf(driverIdNumber);
		
		 
		driverID.click();
		driverIdValue.sendKeys(driverId);
		
		expiryDateField.click();
		selectDateExpiry.click();
		
		DateFormat dateFormat = new SimpleDateFormat("d");
	    Calendar cal = Calendar.getInstance();
	    cal.setTime(new Date());
	    cal.add(Calendar.DATE, 7);
	    String newDate = dateFormat.format(cal.getTime());
		
		WebElement dateWidget = driver.findElement(By.id("Dialog_new_driveridexpirydate_iCalContainerDateInput_miniCal"));
		List<WebElement> columns = dateWidget.findElements(By.tagName("td"));

		for (WebElement cell: columns){
			
		   if (cell.getText().equals(newDate))
		   {
		      cell.click();
		      break;
		   }
		}
		
		
		driverCompanyField.click();
		Select driverCompanyOpiton = new Select(driverCompanyDropDown);
		driverCompanyOpiton.selectByVisibleText("City Taxi");
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		saveAndCloseButton.click();
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.wait3Seconds();
		
		UtilityMethods.wait3Seconds();
		
		try{
			
			if(driver.findElements(By.cssSelector("iframe[name='InlineDialog_Iframe")).size() != 0){
				driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='InlineDialog_Iframe']")));
				addButton.click();
				}
			}
			catch(NoSuchElementException e){
				System.out.println("duplicate data entry pop up not dispalayed");
			}
		
		UtilityMethods.clickOkatAlertIfPresent();
		UtilityMethods.waitForPageLoadAndPageReady();
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));
		
		findCriteria.clear();
		findCriteria.sendKeys("DRIVER");

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
		
		new Actions(driver).doubleClick(verifyObject).perform();
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		
		assertEquals(profileType.getAttribute("title"),"Drivers");
		
		UtilityMethods.waitForPageLoadAndPageReady();
		driver.switchTo().window(parentWindowHandler);
		saveAndCloseButton.click();
		
		UtilityMethods.wait3Seconds();
		
		try{
			
			if(driver.findElements(By.cssSelector("iframe[name='InlineDialog_Iframe")).size() != 0){
				driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='InlineDialog_Iframe']")));
				addButton.click();
				}
			}
			catch(NoSuchElementException e){
				System.out.println("duplicate data entry pop up not dispalayed");
			}
		
		UtilityMethods.clickOkatAlertIfPresent();
		UtilityMethods.waitForPageLoadAndPageReady();
		driver.switchTo().window(parentWindowHandler);
		
		
	}
	
	public void createCustomerWithProfileTypeRTAPatnership() throws Throwable{
		
		UtilityMethods.waitForPageLoadAndPageReady();
		String parentWindowHandler = driver.getWindowHandle();
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		
		clickFirstName.click();
		firstName.clear();
		firstName.sendKeys("RTA");
		
		clickLastName.click();
		lastName.clear();
		lastName.sendKeys("PATNERSHIP");
		
		clickLanguage.click();
		selectLanguage.click();
			
		profileType.click();
		Select RTAPatnershipOption = new Select(profileDropDown);
		RTAPatnershipOption.selectByVisibleText("RTA Partnership");
		
		mobilePhone.click();
		mobileNumber.sendKeys("0514756556");
		
		emailField.click();
		emailAddress.sendKeys("test@test.com");
		
		UtilityMethods.verifyElementDisplayed(verifyRTAPatnershipSection);
		UtilityMethods.verifyElementDisplayed(checkRTAPatnership);
		UtilityMethods.verifyElementDisplayed(verifyRTAPatnershipField);
		verifyRTAPatnershipField.click();
		rtaPatnership.sendKeys("john doe");
		
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		saveAndCloseButton.click();
		
		UtilityMethods.wait3Seconds();
		
		try{
			
			if(driver.findElements(By.cssSelector("iframe[name='InlineDialog_Iframe")).size() != 0){
				driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='InlineDialog_Iframe']")));
				addButton.click();
				}
			}
			catch(NoSuchElementException e){
				System.out.println("duplicate data entry pop up not dispalayed");
			}
		
		UtilityMethods.clickOkatAlertIfPresent();
		UtilityMethods.waitForPageLoadAndPageReady();
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));
		
		findCriteria.clear();
		findCriteria.sendKeys("RTA");

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
		
		new Actions(driver).doubleClick(verifyObject).perform();
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		
		assertEquals(profileType.getAttribute("title"),"RTA Partnership");
		
		
		UtilityMethods.waitForPageLoadAndPageReady();
		driver.switchTo().window(parentWindowHandler);
		saveAndCloseButton.click();
		
		UtilityMethods.wait3Seconds();
		
		try{
			
			if(driver.findElements(By.cssSelector("iframe[name='InlineDialog_Iframe")).size() != 0){
				driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='InlineDialog_Iframe']")));
				addButton.click();
				}
			}
			catch(NoSuchElementException e){
				System.out.println("duplicate data entry pop up not dispalayed");
			}
		
		UtilityMethods.clickOkatAlertIfPresent();
		
		driver.switchTo().window(parentWindowHandler);
		
	}
	
	public void createCustomerWithProfileTypeRTAVendorStaff() throws Throwable{
		
		UtilityMethods.waitForPageLoadAndPageReady();
		String parentWindowHandler = driver.getWindowHandle();
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		
		clickFirstName.click();
		firstName.clear();
		firstName.sendKeys("RTA Vendor");
		
		clickLastName.click();
		lastName.clear();
		lastName.sendKeys("STAFF");
		
		clickLanguage.click();
		selectLanguage.click();
			
		profileType.click();
		Select RTAVendorStaffOption = new Select(profileDropDown);
		RTAVendorStaffOption.selectByVisibleText("RTA Vendor Staff");
		
		mobilePhone.click();
		mobileNumber.sendKeys("0514756556");
		
		emailField.click();
		emailAddress.sendKeys("testing@testing.com");
		
		UtilityMethods.verifyElementDisplayed(verifyCompanySection);
		UtilityMethods.verifyElementDisplayed(verifyRtaCompanyField);
		UtilityMethods.verifyElementDisplayed(checkCompanyField);
		
		verifyRtaCompanyField.click();
		company.sendKeys("company testing updated");
		
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		saveAndCloseButton.click();
		
		UtilityMethods.wait3Seconds();
		
		try{
			
			if(driver.findElements(By.cssSelector("iframe[name='InlineDialog_Iframe")).size() != 0){
				driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='InlineDialog_Iframe']")));
				addButton.click();
				}
			}
			catch(NoSuchElementException e){
				System.out.println("duplicate data entry pop up not dispalayed");
			}
		
		UtilityMethods.clickOkatAlertIfPresent();
		UtilityMethods.waitForPageLoadAndPageReady();
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));
		
		findCriteria.clear();
		findCriteria.sendKeys("RTA Vendor");

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
		
		new Actions(driver).doubleClick(verifyObject).perform();
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		
		assertEquals(profileType.getAttribute("title"),"RTA Vendor Staff");
		
		UtilityMethods.waitForPageLoadAndPageReady();
		driver.switchTo().window(parentWindowHandler);
		saveAndCloseButton.click();
		UtilityMethods.wait3Seconds();
		
		try{
			
			if(driver.findElements(By.cssSelector("iframe[name='InlineDialog_Iframe")).size() != 0){
				driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='InlineDialog_Iframe']")));
				addButton.click();
				}
			}
			catch(NoSuchElementException e){
				System.out.println("duplicate data entry pop up not dispalayed");
			}
		
		UtilityMethods.clickOkatAlertIfPresent();
		driver.switchTo().window(parentWindowHandler);
		
	}
	
	public void updateCustomerWithProfileTypeAny() throws Throwable{
		
		UtilityMethods.waitForPageLoadAndPageReady();
		String parentWindowHandler = driver.getWindowHandle();
		new WebDriverWait(driver, 60)                                 
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));
		
		Actions action = new Actions(driver);
		action.doubleClick(selectContact).perform();
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		
		String currentProfileType = profileType.getAttribute("title");
		String externalCustomer = "External Customer";
		
		if(currentProfileType.contentEquals(externalCustomer))
		{
			
			profileType.click();
			Select RTAVendorStaffOption = new Select(profileDropDown);
			RTAVendorStaffOption.selectByVisibleText("RTA Vendor Staff");
			
			clickFirstName.click();
			firstName.clear();
			firstName.sendKeys("RTA Vendor");
			
			clickLastName.click();
			lastName.clear();
			lastName.sendKeys("STAFF Updated");
			
			clickLanguage.click();
			selectLanguage.click();
			
			mobilePhone.click();
			mobileNumber.sendKeys("0514756556");
			
//			emailField.click();
//			emailAddress.sendKeys("testing@testing.com");
			
			UtilityMethods.verifyElementDisplayed(verifyCompanySection);
			UtilityMethods.verifyElementDisplayed(verifyRtaCompanyField);
			UtilityMethods.verifyElementDisplayed(checkCompanyField);
			
			verifyRtaCompanyField.click();
			company.sendKeys("company testing updated");
			
			
			UtilityMethods.waitForPageLoadAndPageReady();
			UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
			saveAndCloseButton.click();
		
			UtilityMethods.wait3Seconds();
			
			try{
				
				if(driver.findElements(By.cssSelector("iframe[name='InlineDialog_Iframe")).size() != 0){
					driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='InlineDialog_Iframe']")));
					addButton.click();
					}
				}
				catch(NoSuchElementException e){
					System.out.println("duplicate data entry pop up not dispalayed");
				}
			
			UtilityMethods.clickOkatAlertIfPresent();
			UtilityMethods.waitForPageLoadAndPageReady();
			
			
		}
		else
		{
			
			profileType.click();
			Select RTAVendorStaffOption = new Select(profileDropDown);
			RTAVendorStaffOption.selectByVisibleText("External Customer");
			
			clickFirstName.click();
			firstName.clear();
			firstName.sendKeys("CONTACT");
			
			clickLastName.click();
			lastName.clear();
			lastName.sendKeys("UPDATED");
			
			clickLanguage.click();
			selectLanguage.click();
			
			mobilePhone.click();
			mobileNumber.sendKeys("0514756556");
			
//			emailField.click();
//			emailAddress.sendKeys("testing@testing.com");
			
			UtilityMethods.waitForPageLoadAndPageReady();
			UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
			saveAndCloseButton.click();
			
			UtilityMethods.wait3Seconds();
			
			try{
				
				if(driver.findElements(By.cssSelector("iframe[name='InlineDialog_Iframe")).size() != 0){
					driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='InlineDialog_Iframe']")));
					addButton.click();
					}
				}
				catch(NoSuchElementException e){
					System.out.println("duplicate data entry pop up not dispalayed");
				}
			
			UtilityMethods.clickOkatAlertIfPresent();
			UtilityMethods.waitForPageLoadAndPageReady();
					
		}
		
		UtilityMethods.waitForPageLoadAndPageReady();
		
		driver.switchTo().window(parentWindowHandler);
		
		((JavascriptExecutor)driver).executeScript("window.open()");
		driver.close();
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(0));
		UtilityMethods.waitForPageLoadAndPageReady();
		
		
	}
	
	public void updateCustomerWithProfileTypeExternalCustomer() throws Throwable{
		
		UtilityMethods.waitForPageLoadAndPageReady();
		String parentWindowHandler = driver.getWindowHandle();
		new WebDriverWait(driver, 60)                                 
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));
		
		Actions action = new Actions(driver);
		action.doubleClick(selectContact).perform();
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		
		clickFirstName.click();
		firstName.clear();
		firstName.sendKeys("EXTERNAL");
		
		clickLastName.click();
		lastName.clear();
		lastName.sendKeys("CUSTOMER UPDATED");
		
		clickLanguage.click();
		selectLanguage.click();
		
		mobilePhone.click();
		mobileNumber.sendKeys("0514756556");
		
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		saveAndCloseButton.click();
		
		UtilityMethods.wait3Seconds();
		
		try{
			
			if(driver.findElements(By.cssSelector("iframe[name='InlineDialog_Iframe")).size() != 0){
				driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='InlineDialog_Iframe']")));
				addButton.click();
				}
			}
			catch(NoSuchElementException e){
				System.out.println("duplicate data entry pop up not dispalayed");
			}
		
		UtilityMethods.clickOkatAlertIfPresent();
		
		UtilityMethods.waitForPageLoadAndPageReady();
		
		driver.switchTo().window(parentWindowHandler);
		
	}
	
	public void updateCustomerWithProfileTypeRTAPatnership() throws Throwable{
		
		UtilityMethods.waitForPageLoadAndPageReady();
		String parentWindowHandler = driver.getWindowHandle();
		new WebDriverWait(driver, 60)                                 
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));
		
		UtilityMethods.wait3Seconds();
		
		Actions action = new Actions(driver);
		action.doubleClick(selectContact).perform();
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		
		clickFirstName.click();
		firstName.clear();
		firstName.sendKeys("RTA");
		
		clickLastName.click();
		lastName.clear();
		lastName.sendKeys("PATNERSHIP UPDATED");
		
		mobilePhone.click();
		mobileNumber.sendKeys("0514756556");
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		UtilityMethods.wait3Seconds();
		saveAndCloseButton.click();
		
		UtilityMethods.wait3Seconds();
		
		try{
			
			if(driver.findElements(By.cssSelector("iframe[name='InlineDialog_Iframe")).size() != 0){
				driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='InlineDialog_Iframe']")));
				addButton.click();
				}
			}
			catch(NoSuchElementException e){
				System.out.println("duplicate data entry pop up not dispalayed");
			}
		
		UtilityMethods.clickOkatAlertIfPresent();
		
		driver.switchTo().window(parentWindowHandler);
		
			
	}
	
	public void updateCustomerWithProfileTypeRTAVendorStaff() throws Throwable{
		
		UtilityMethods.waitForPageLoadAndPageReady();
		String parentWindowHandler = driver.getWindowHandle();
		new WebDriverWait(driver, 60)                                 
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));
		
		UtilityMethods.wait3Seconds();
		
		Actions action = new Actions(driver);
		action.doubleClick(selectContact).perform();
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		
		clickFirstName.click();
		firstName.clear();
		firstName.sendKeys("RTA Vendor");
		
		clickLastName.click();
		lastName.clear();
		lastName.sendKeys("STAFF UPDATED");
		
		mobilePhone.click();
		mobileNumber.sendKeys("0514756556");
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		UtilityMethods.wait3Seconds();
		saveAndCloseButton.click();
		
		UtilityMethods.wait3Seconds();
		
		try{
			
			if(driver.findElements(By.cssSelector("iframe[name='InlineDialog_Iframe")).size() != 0){
				driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='InlineDialog_Iframe']")));
				addButton.click();
				}
			}
			catch(NoSuchElementException e){
				System.out.println("duplicate data entry pop up not dispalayed");
			}
		UtilityMethods.clickOkatAlertIfPresent();
		
		driver.switchTo().window(parentWindowHandler);
		
	}
	
	public void updateCustomerWithProfileTypeInternalRTAStaff() throws Throwable{
		
		UtilityMethods.waitForPageLoadAndPageReady();
		String parentWindowHandler = driver.getWindowHandle();
		new WebDriverWait(driver, 60)                                 
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));
		
		UtilityMethods.wait3Seconds();
		Actions action = new Actions(driver);
		action.doubleClick(selectContact).perform();
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		
		clickFirstName.click();
		firstName.clear();
		firstName.sendKeys("RTA");
		
		clickLastName.click();
		lastName.clear();
		lastName.sendKeys("STAFF UPDATED");
		
		mobilePhone.click();
		mobileNumber.sendKeys("0514756556");
		
		assertEquals("Internal RTA Staff",profileType.getAttribute("title"));
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		UtilityMethods.wait3Seconds();
		saveAndCloseButton.click();

		UtilityMethods.wait3Seconds();
		
		try{
			
			if(driver.findElements(By.cssSelector("iframe[name='InlineDialog_Iframe")).size() != 0){
				driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='InlineDialog_Iframe']")));
				addButton.click();
				}
			}
			catch(NoSuchElementException e){
				System.out.println("duplicate data entry pop up not dispalayed");
			}
		

		UtilityMethods.clickOkatAlertIfPresent();
		
		UtilityMethods.waitForPageLoadAndPageReady();
		
		driver.switchTo().window(parentWindowHandler);
		
	}
	
	public void updateCustomerWithProfileTypeDrivers() throws Throwable{
		
		UtilityMethods.waitForPageLoadAndPageReady();
		String parentWindowHandler = driver.getWindowHandle();
		new WebDriverWait(driver, 60)                                 
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));
		
		UtilityMethods.wait3Seconds();
		Actions action = new Actions(driver);
		action.doubleClick(selectContact).perform();
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		
		clickFirstName.click();
		firstName.clear();
		firstName.sendKeys("DRIVER");
		
		clickLastName.click();
		lastName.clear();
		lastName.sendKeys("UPDATED");
		
		assertEquals("Drivers",profileType.getAttribute("title"));
		
		mobilePhone.click();
		mobileNumber.sendKeys("0514756556");
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		UtilityMethods.wait3Seconds();
		saveAndCloseButton.click();

		UtilityMethods.wait3Seconds();
		
		try{
			
			if(driver.findElements(By.cssSelector("iframe[name='InlineDialog_Iframe")).size() != 0){
				driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='InlineDialog_Iframe']")));
				addButton.click();
				}
			}
			catch(NoSuchElementException e){
				System.out.println("duplicate data entry pop up not dispalayed");
			}
		
		UtilityMethods.clickOkatAlertIfPresent();
		UtilityMethods.waitForPageLoadAndPageReady();
		driver.switchTo().window(parentWindowHandler);
		
	}
	
	public void updateCustomerWithProfileTypeDubaiTaxi() throws Throwable{
		
		UtilityMethods.waitForPageLoadAndPageReady();
		String parentWindowHandler = driver.getWindowHandle();
		new WebDriverWait(driver, 60)                                 
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));
		
		Actions action = new Actions(driver);
		action.doubleClick(selectContact).perform();
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		
		clickFirstName.click();
		firstName.clear();
		firstName.sendKeys("DUBAI TAXI");
		
		clickLastName.click();
		lastName.clear();
		lastName.sendKeys("UPDATED");
		
		assertEquals("Dubai Taxi Staff",profileType.getAttribute("title"));
		
		mobilePhone.click();
		mobileNumber.sendKeys("0514756556");
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		UtilityMethods.wait3Seconds();
		saveAndCloseButton.click();
		UtilityMethods.wait3Seconds();
		
		try{
			
			if(driver.findElements(By.cssSelector("iframe[name='InlineDialog_Iframe")).size() != 0){
				driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='InlineDialog_Iframe']")));
				addButton.click();
				}
			}
			catch(NoSuchElementException e){
				System.out.println("duplicate data entry pop up not dispalayed");
			}
		
		UtilityMethods.clickOkatAlertIfPresent();
		UtilityMethods.waitForPageLoadAndPageReady();
		driver.switchTo().window(parentWindowHandler);
		
	}
	
	public void navigateToNewCustomerPage() throws Throwable{
		
		UtilityMethods.waitForPageLoadAndPageReady();
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
		new WebDriverWait(driver,20)
		.until(ExpectedConditions.elementToBeClickable(newCustomer));
		UtilityMethods.wait3Seconds();
		UtilityMethods.clickElemetJavaSciptExecutor(newCustomer);
		
	}
	
	
	public CustomerPage(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, this);
	}
	
}