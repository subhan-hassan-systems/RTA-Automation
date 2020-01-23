package Test.Automation.Pages;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
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
import edu.emory.mathcs.backport.java.util.concurrent.Executor;

public class ChatPage extends DriverFactory {
	
	@FindBy(xpath = "//*[@id=\"activitypointer|NoRelationship|HomePageGrid|Mscrm.HomepageGrid.activitypointer.NewCustomActivities\"]/span/a/span")
	public WebElement clickOtherActivities;
	
	@FindBy(xpath = "//span[contains(text(),'CHAT')]")
	public WebElement clickChatActivity;
	
	@FindBy(id = "subject")
	public WebElement clickTitle;
	
	@FindBy(id = "subject_i")
	public WebElement title;
	
	@FindBy(id = "rta_dispositionreason")
	public WebElement rtaDispositionReasonField;
	
	@FindBy(id = "rta_dispositionreason_i")
	public WebElement dropDowndispositionReason;
	
	@FindBy(id = "rta_chattype")
	public WebElement rtaChatType;
	
	@FindBy(id = "rta_chattype_i")
	public WebElement dropDownChatType;
	
	@FindBy(css = "div#description.ntext.ms-crm-Inline-Chrome")
	public WebElement changedescription;
	
	@FindBy(id = "description_i")
	public WebElement description;
	
	@FindBy(id = "rta_rtasubject")
	public WebElement rtaSubject;
	
	@FindBy(css = "img#rta_rtasubject_i.ms-crm-InlineLookupEdit")
	public WebElement rtaSubjectSearch;
	
	@FindBy(css = "label.TreeItem")
	public WebElement selectCallQuerySubject;
	
	@FindBy(id = "butBegin")
	public WebElement subject;
	
	@FindBy(xpath = ".//*[@id='rta_chat|NoRelationship|Form|Mscrm.Form.rta_chat.SaveAndClose']/span/a/span")
	public WebElement saveAndCloseButton;
	
	@FindBy(xpath = "//*[@id=\"gridBodyTable\"]/tbody/tr[1]/td[3]/nobr")
	public WebElement selectChatObject;
	
	@FindBy(id = "filterButtonImage")
	public WebElement filter;
	
	@FindBy(xpath = "(//*[@id=\"mnuDown\"])[2]")
	public WebElement activityTypeFilter;
	
	@FindBy(xpath = "//label[contains(text(),'Chat')]")
	public WebElement selectChatFilter;
	
	@FindBy(id = "grid-filter-OkbuttonpicklistFilterPopupcrmGridactivitypointeractivitytypecode")
	public WebElement selectOkFilter;
	
	@FindBy(css = "span.navTabButtonArrowDown")
	public WebElement expandWorkSpaceMenu;
	
	@FindBy(css = "img[alt=\"Workplace\"]")
	public WebElement clickWorkSpace;
	
	@FindBy(css = "#nav_conts > span.nav-iconContainer > span > img")
	public WebElement clickContacts;
	
	@FindBy(xpath = ".//*[@id='gridBodyTable']/tbody/tr[1]/td[2]/nobr")
	public WebElement selectContact;
	
	@FindBy(xpath = ".//*[@id='TabNode_tab0Tab']/a/span/span")
	public WebElement navigateToActivity;
	
	@FindBy(css = ".ms-crm-ImageStrip-NavBar_ActionImgs_Activities_32")
	public WebElement clickActivities;
	
	@FindBy(xpath = "//span[contains(text(),' Add New Activity ')]")
	public WebElement addNewActivity;
	
	@FindBy(xpath = "//span[contains(text(),' Chat ')]")
	public WebElement selectChatActivity;
	
	@FindBy(xpath = ".//*[@id='FormSecNavigationControl-Icon']/img")
	public WebElement testing;
	
	@FindBy(id = "rta_chattype")
	public WebElement chatType;
	
	@FindBy(id = "rta_chattype_i")
	public WebElement chatTypeOption;
	
	@FindBy(id = "rta_dispositionreason")
	public WebElement dispositionReason;
	
	@FindBy(id = "rta_dispositionreason_i")
	public WebElement dispositionReasonOption;
	
	@FindBy(xpath = "//span[contains(text(),' Mark Complete ')]")
	public WebElement markCompleteButton;
	
	@FindBy(id = "crmGrid_SavedNewQuerySelector")
	public WebElement myActivity;
	
	@FindBy(id = "ViewSelector_rta_chat")
	public WebElement chatActivities;
	
	@FindBy(xpath = "//span[contains(text(),'Closed Chats')]")
	public WebElement closedChats;
	
	@FindBy(xpath = "//span[contains(text(),'Completed')]")
	public WebElement activityStatus;
	
	@FindBy(xpath = "//label[contains(text(),'Date Created')]")
	public WebElement dateCreatedFilter;
	
	@FindBy(xpath = "//span[contains(text(),' Close Chat ')]")
	public WebElement closeChatButton;
	
	@FindBy(id = "ok_id")
	public WebElement closeButton;
	
	@FindBy(id = "State_label")
	public WebElement checkStatus;
	
	@FindBy(xpath = "//span[contains(text(),' Convert to case ')]")
	public WebElement convertToCaseButton;
	
	@FindBy(id = "title")
	public WebElement caseTitle;
	
	public void addNewChat() throws Throwable{
		
		UtilityMethods.waitForPageLoadAndPageReady();
	//	clickOtherActivities.click();
		UtilityMethods.wait2Seconds();
		Actions action = new Actions(driver);
		action.doubleClick(clickChatActivity).perform();
		
		UtilityMethods.waitForPageLoadAndPageReady();
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		UtilityMethods.wait3Seconds();
		clickTitle.click();
		title.sendKeys("testing");
		
		rtaDispositionReasonField.click();
		UtilityMethods.wait3Seconds();
		Select dispositionReasonOption = new Select(dropDowndispositionReason);
		dispositionReasonOption.selectByIndex(2);
		
		rtaChatType.click();
		Select chatTypeOption = new Select(dropDownChatType);
		chatTypeOption.selectByIndex(2);
		
		rtaSubject.click();

		rtaSubjectSearch.click();
		UtilityMethods.waitForPageLoadAndPageReady();

		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		new WebDriverWait(driver, 60).until(
				ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='InlineDialog_Iframe']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='InlineDialog_Iframe']")));

		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.wait3Seconds();
		selectCallQuerySubject.click();
        UtilityMethods.wait3Seconds();
		UtilityMethods.waitForPageLoadAndPageReady();

		subject.click();

		UtilityMethods.waitForPageLoadAndPageReady();
		
		saveAndCloseButton.click();
	}
	
	public void verifyChatActivity() throws Throwable{
		
		UtilityMethods.waitForPageLoadAndPageReady();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));

		filter.click();

		UtilityMethods.waitForPageLoadAndPageReady();
		
		activityTypeFilter.click();
		UtilityMethods.wait2Seconds();
		JavascriptExecutor executer = (JavascriptExecutor) driver;
		executer.executeScript("arguments[0].scrollIntoView(true);",selectChatFilter);
		selectChatFilter.click();
		selectOkFilter.click();
		UtilityMethods.waitForPageLoadAndPageReady();
		Actions action = new Actions(driver);
		action.doubleClick(selectChatObject).perform();
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		
		assertEquals("testing", clickTitle.getAttribute("title"));

		UtilityMethods.waitForPageLoadAndPageReady();

		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		saveAndCloseButton.click();
		
	}
	
	public void navigateToContactActivities() throws Throwable{
		
		UtilityMethods.waitForPageLoadAndPageReady();

		expandWorkSpaceMenu.click();
		clickWorkSpace.click();
		
		UtilityMethods.waitForPageLoadAndPageReady();

		clickContacts.click();
	}
	
	public void navigateToContactChatActivity() throws Throwable{
		
		UtilityMethods.waitForPageLoadAndPageReady();
		
		if(driver.findElements(By.cssSelector("iframe[name='contentIFrame0']")).size()!=0)
		{
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));
		}
		else if(driver.findElements(By.cssSelector("iframe[name='contentIFrame1']")).size()!=0)
		{
			new WebDriverWait(driver, 60)
			.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
			driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		}
		Actions action = new Actions(driver);
		action.doubleClick(selectContact).perform();
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().defaultContent();
		navigateToActivity.click();
		clickActivities.click();
		
		UtilityMethods.waitForPageLoadAndPageReady();
		new WebDriverWait(driver, 60)
			.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));

		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		UtilityMethods.wait3Seconds();
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe#areaActivitiesFrame")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe#areaActivitiesFrame")));

		UtilityMethods.clickElemetJavaSciptExecutor(addNewActivity);
		UtilityMethods.wait3Seconds();
		
		String parent_window = driver.getWindowHandle();
		System.out.println("Parent Window ID is : "+parent_window);
		
		UtilityMethods.clickElemetJavaSciptExecutor(selectChatActivity);
		
		Set<String> allWindows = driver.getWindowHandles();
		for(String child:allWindows)
		    if(!parent_window.equalsIgnoreCase(child))
		         driver.switchTo().window(child);
		System.out.println(driver.getTitle());
		String child_window = driver.getWindowHandle();
		System.out.println("Child 1 Window ID is : "+child_window);
		
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));
		UtilityMethods.wait3Seconds();
		new WebDriverWait(driver,60).until(ExpectedConditions.elementToBeClickable(clickTitle));
		clickTitle.click();
		title.sendKeys("testing change");
		
		chatType.click();
		new Select(chatTypeOption).selectByIndex(2);
		
		dispositionReason.click();
		new Select(dispositionReasonOption).selectByIndex(2);
		
		rtaSubject.click();
		rtaSubjectSearch.click();
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		new WebDriverWait(driver, 60).until(
				ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='InlineDialog_Iframe']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='InlineDialog_Iframe']")));

		UtilityMethods.waitForPageLoadAndPageReady();
		
		selectCallQuerySubject.click();
		UtilityMethods.waitForPageLoadAndPageReady();

		subject.click();

		UtilityMethods.waitForPageLoadAndPageReady();
		
		saveAndCloseButton.click();
		
		driver.close();

		for (String winHandle : driver.getWindowHandles()) {

			driver.switchTo().window(winHandle);
		}

		driver.getWindowHandle();
		
		UtilityMethods.waitForPageLoadAndPageReady();
		driver.getCurrentUrl();
		    
//		driver.switchTo().defaultContent();
//		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.wait2Seconds();
//		driver.switchTo().window(parent_window);
		

	}
	
	public void updateChatActivity() throws Throwable{
		
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		
		clickTitle.click();
		UtilityMethods.wait2Seconds();
		title.clear();
		title.sendKeys("testing change");
		
		rtaSubject.click();
		rtaSubjectSearch.click();
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		new WebDriverWait(driver, 60).until(
				ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='InlineDialog_Iframe']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='InlineDialog_Iframe']")));

		UtilityMethods.waitForPageLoadAndPageReady();
		
		selectCallQuerySubject.click();
		UtilityMethods.waitForPageLoadAndPageReady();

		subject.click();

		UtilityMethods.waitForPageLoadAndPageReady();
		
		saveAndCloseButton.click();
		
	}
	
	public void selectChatActivity() throws Throwable{
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));

		UtilityMethods.clickElemetJavaSciptExecutor(filter);

		UtilityMethods.waitForPageLoadAndPageReady();
		
		activityTypeFilter.click();
		UtilityMethods.wait2Seconds();
		JavascriptExecutor executer = (JavascriptExecutor) driver;
		executer.executeScript("arguments[0].scrollIntoView(true);",selectChatFilter);
		selectChatFilter.click();
		selectOkFilter.click();
		UtilityMethods.waitForPageLoadAndPageReady();
		Actions action = new Actions(driver);
		action.doubleClick(selectChatObject).perform();

	}
	
	public void updateActivityToCloseUsingMarkComplete() throws Throwable{
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		
		markCompleteButton.click();

	}
	
	public void verifyTheUpdatedChatActivity() throws Throwable{
		
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));
		
		myActivity.click();
		UtilityMethods.wait2Seconds();
		JavascriptExecutor executer = (JavascriptExecutor) driver;
		executer.executeScript("arguments[0].scrollIntoView(true);",chatActivities);
		chatActivities.click();
		UtilityMethods.wait2Seconds();
		UtilityMethods.clickElemetJavaSciptExecutor(closedChats);	
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));
		
		dateCreatedFilter.click();
		dateCreatedFilter.click();
		UtilityMethods.wait2Seconds();
		new Actions(driver).doubleClick(selectChatObject).perform();
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		
		assertEquals("Completed", activityStatus.getText());
		
		
	}
	
	public void selectCloseChat() throws Throwable{
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		
		closeChatButton.click();
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		new WebDriverWait(driver, 60).until(
				ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='InlineDialog_Iframe']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='InlineDialog_Iframe']")));
		
		try{
		assertEquals("Completed", checkStatus.getText());
		closeButton.click();
		}
		catch(Exception e){
			
			System.out.println("status is not marked completed by default");
			
		}
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		
		assertEquals("Completed", activityStatus.getText());
		
		
	}
	
	public void convertChatActivityToCaseAndVerify() throws Throwable{
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		
		String titleValue = clickTitle.getAttribute("title");
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		convertToCaseButton.click();
		
		
		driver.close();

		for (String winHandle : driver.getWindowHandles()) {

			driver.switchTo().window(winHandle);
		}

		driver.getWindowHandle();
		
		UtilityMethods.waitForPageLoadAndPageReady();
		driver.getCurrentUrl();
		
//		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
//		driver.switchTo().window(tabs.get(1));
		

		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));
		
		
		String caseTitleValue = caseTitle.getAttribute("title");
		
		assertEquals(titleValue,caseTitleValue);
		
		
	}
	
	public ChatPage(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, this);
	}
	
}