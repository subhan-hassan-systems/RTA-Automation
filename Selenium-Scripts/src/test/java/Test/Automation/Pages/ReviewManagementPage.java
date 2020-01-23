package Test.Automation.Pages;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
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

public class ReviewManagementPage extends DriverFactory{


	@FindBy(xpath = "(//*[@title='Reviews'])[1]")
	public WebElement clickReviewFilter;

	@FindBy(css = "span.navTabButtonArrowDown")
	public WebElement expandWorkSpaceMenu;
	
	@FindBy(xpath = "//span[contains(text(),'EPQ')]")

	public WebElement clickEPQ;

	@FindBy(xpath = "//*[@class='ms-crm-Inline-Value ms-crm-Inline-EmptyValue ms-crm-Inline-Lookup']")
	public WebElement DepartmentLable;

	@FindBy(id= "rta_specializationdepartment_ledit")
	public WebElement AssignedDepartment;

	@FindBy(css = "span.nav-rowLabel")
	public WebElement clickReviews;
	
	@FindBy(css = "img.ms-crm-View-icon-associated-lite.ms-crm-ImageStrip-Dropdown_Arrow")
	public WebElement openList;
	
	@FindBy(xpath = "//span[contains(text(),'My Pending Reviews - PQ Engineer')]")
	public WebElement pqEngineer;

	//@FindBy(xpath = "//span[contains(text(),'Pending Reviews')]")
	@FindBy(xpath = "//span[@title='Pending Reviews']")
	public WebElement pendingReviews;

	@FindBy(xpath = "//*[@id='gridBodyTable']/tbody/tr[1]/td[1]")
	public WebElement clickRecord;

	@FindBy(id="btnAdd")
	public WebElement AddVendor;
	
	@FindBy(xpath = "(//*[@id='ddlAnswer'])[4]")
	public WebElement selectBox4;

	@FindBy(xpath = "//*[@id='ddlAnswer']")
	public WebElement selectBoxSubContractor;
	@FindBy(id = "new_finalrecommendation")
	public WebElement recommendation;

	@FindBy(id = "new_finalrecommendation")
	public WebElement recommendationSubContractor;

	@FindBy(id = "new_finalrecommendation_i")
	public WebElement recommendationSelectBox;

	@FindBy(id = "new_initialrecommendation_i")
	public WebElement recommendationSelectBoxTech;

	@FindBy(id = "new_initialrecommendation")
	public WebElement recommendationTect;

	@FindBy(xpath = "(//*[@class='ms-crm-CommandBar-Menu'])[1]")
	public WebElement headerBar;
	@FindBy(xpath = "(//*[@class='ms-crm-CommandBar-Menu'])[3]")
	public WebElement headerBar2;

	@FindBy(xpath = "//span[contains(text(),'Submit')]")
	public WebElement submitButton;

	@FindBy(xpath = "//h3[contains(text(),'PQ ENGINEER RECOMMENDATION')]")
	public WebElement clickEngineer;

	@FindBy(id = "closeButton")
	public WebElement closeButton;
	
	@FindBy(id = "new_commentsinternalfinal")
	public WebElement internalCommentsClick;
	
	@FindBy(id = "new_commentsinternalfinal_i")
	public WebElement internalComments;

	@FindBy(id = "Internal Comments_label")
	public WebElement internalCommentsTech;

	//@FindBy(xpath = ("//*[@class='ms-crm-Inline-Value ms-crm-Inline-EmptyValue'])[2]"))
	@FindBy(xpath = "(//*[@class='ms-crm-Inline-Value ms-crm-Inline-EmptyValue'])[1]")
	public WebElement internalCommentsTechClick;

	@FindBy(id = "new_commentsexternal")
	public WebElement commentsexternalClick;

	@FindBy(id = "new_commentsexternal_i")
	public WebElement new_commentsexternal_i;

	@FindBy(id="new_finalrejectionreason_cl")
	public WebElement new_finalrejectionreasonClick;

	@FindBy(id="new_finalrejectionreason_i")
	public WebElement new_finalrejectionreason;
	
	@FindBy(xpath = "//span[contains(text(),'Review has been submitted successfully')]")
	public WebElement recordSubmitted;
	
	@FindBy(xpath = "//*[@id='InlineDialog1_Iframe']")
	public WebElement switchToPendingPopup;
	
	@FindBy(id = "butBegin")
	public WebElement closePopup;
	
	@FindBy(xpath = "//span[contains(text(),'My Pending Reviews - Department Coordinator')]")
	public WebElement departmentCoordinator;
	
	@FindBy(id = "filterButtonImage")
	public WebElement mainFilter;
	
	@FindBy(xpath = "(//*[@id='mnuDown'])[3]")
	public WebElement selectReviewFilter;
	
	@FindBy(xpath = "//span[contains(text(),'Filter by specific Review Type')]")
	public WebElement clickReview;
	
	@FindBy(id = "crmGrid_findCriteria")
	public WebElement searchReview;
	
	@FindBy(id = "crmGrid_findCriteriaImg")
	public WebElement searchButton;
	
	@FindBy(id = "new_initialrejectionreason")
	public WebElement rejectionReason;
	
	@FindBy(id = "new_initialrejectionreason_i")
	public WebElement rejectionReasonOption;
	
	@FindBy(id="new_initialrecommendation")
	public WebElement initialRecommendtaion;

	@FindBy(xpath = "//*[@class='ms-crm-Inline-Value ms-crm-Inline-EmptyValue'][1]")
	public WebElement initialRecommendtaionSubContractor;

	@FindBy(id = "new_initialrecommendation_i")
	public WebElement initialrecommendationSelectBox;

	@FindBy(id = "new_finalrecommendation_i")
	public WebElement initialrecommendationselectbox2;

	@FindBy (id = "rta_onholdof_d")
	public WebElement onHoldSelectBox;
	@FindBy (id = "rta_onholdof_i")
	public WebElement onHoldOf;

	@FindBy(id = "new_commentsinternalinitial")
	public WebElement intialInternalCommentsClick;

	@FindBy (id = "new_commentsinternalfinal_i")
	public WebElement finalCommentsClick;

	@FindBy(id = "new_commentsinternalinitial_i")
	public WebElement intialInternalComments;
	
	@FindBy(id = "new_finalrejectionreason")
	public WebElement rejectionReasonFinal;
	
	@FindBy(id = "new_finalrejectionreason_i")
	public WebElement rejectionReasonOptionFinal;
	
	@FindBy(xpath = "//*[@id='aVendor' and text()='Completeness Review']")
	public WebElement completnessForm;

	@FindBy(xpath = "//*[@id='aVendor' and text()='Completeness Appeal Review']")
	public WebElement completnessForm_debug;

	@FindBy(xpath = "//*[@id='aVendor' and text()='Completeness Review ROW']")
	public WebElement completnessFormROW;

	
	@FindBy(xpath = "//span[contains(text(),'My Pending Reviews - Department Director')]")
	public WebElement departmentDirector;
	
	@FindBy(id = "new_commentsinternalinitial_cl")
	public WebElement internalCommentlabel;


	@FindBy(xpath = "(//*[@class='ms-crm-Inline-Value ms-crm-Inline-EmptyValue'])[1]")
	public WebElement internalCommentlabelSubContractor;


	@FindBy (xpath = "//*[@class='ms-crm-Inline-Value ms-crm-Inline-EmptyValue ms-crm-Inline-Lookup']")
	public WebElement finalRecommendationSubContractor;

	@FindBy ( id = "new_finalrecommendedcategoryid_ledit")
	public WebElement finalRecommendedCategory;

	@FindBy (xpath = "(//*[@class='ms-crm-Inline-Value ms-crm-Inline-EmptyValue'])[1]")
	public WebElement holdOfComment;

	@FindBy(id = "new_commentsinternalfinal_cl")
	public WebElement interCommentfinalLabel;

    @FindBy(id = "new_finalrecommendedcategoryid_cl")
    public WebElement recommendedCategory;

    @FindBy(id = "new_finalrecommendedcategoryid_ledit")
    public WebElement finalRecommendedCategorySubContractor;

	@FindBy(xpath = "//span[contains(text(),'My Pending Reviews - Legal Representative')]")
	public WebElement legalReview;
	
	@FindBy(xpath = "//span[contains(text(),'My Pending Reviews - Finance Representative')]")
	public WebElement financialReview;
	
	@FindBy(xpath = "//span[contains(text(),'My Pending Reviews - HSE Coordinator')]")
	public WebElement hseCoordinatorReview;
	
	@FindBy(xpath = "//span[contains(text(),'My Pending Reviews - Green Procurement Coordinator')]")
	public WebElement greenProcurementReview;

	@FindBy(xpath = "//span[contains(text(),'My Pending Reviews - PQ Committee Head')]")
	public WebElement PQcommitteeReview;

	@FindBy(xpath = "//span[contains(text(),'My Pending Reviews - Procurement Director')]")
    public WebElement ProcurementDirectorReview;

	@FindBy(xpath = "(//*[@id='mnuDown'])[8]")
	public WebElement selectVendorFilter;

//	@FindBy(xpath = "//span[contains(text(),'Contains Data')]")
//	public WebElement clickVendorType;

	@FindBy(xpath = "//span[contains(text(),'Sort Z to A')]")
	public WebElement clickVendorType1;

	@FindBy(xpath = "//span[contains(text(),'Custom Filter...')]")
	public WebElement clickVendorType;

	@FindBy(id="primaryOperator")
	public WebElement primaryOperator;

	@FindBy(xpath = "//div[@role='list']")
	public WebElement SearchFilter;

	@FindBy(id="primaryValue_lookupTable_img")
	public WebElement Search;

	@FindBy(id = "new_finalstatus")
	public WebElement status;
	
	@FindBy(xpath = "//*[@id='aVendor' and text()='Technical Review']")
	public WebElement technicalForm;
	
	@FindBy(id = "new_finalrecommendedcategoryid")
	public WebElement finalRecommendation;

	@FindBy(id = "new_initialrecommendedcategoryid")
	public WebElement initialRecommendationcateogory;

	@FindBy(id = "new_initialrecommendedcategoryid_i")
	public WebElement searchImgIconInitial;

	@FindBy(id = "new_finalrecommendedcategoryid_i")
	public WebElement searchImgIcon;
	
	@FindBy(xpath = "//span[contains(text(),'Look Up More Record')]")
	public WebElement moreRecords;
	
	@FindBy(xpath = "//*[@id='aVendor' and text()='Legal Review']")
	public WebElement legalForm;
	
	@FindBy(xpath = "//*[@id='aVendor' and text()='Finance Review']")
	public WebElement financeForm;
	
	@FindBy(xpath = "//*[@id='aVendor' and text()='HSE Review']")
	public WebElement hseForm;
	
	@FindBy(xpath = "//*[@id='aVendor' and text()='Green Procurement Review']")
	public WebElement greenProcurementForm;
	
	@FindBy(xpath = "//*[@id='aVendor' and text()='PQ Committee Prequalification Review']")
	public WebElement pqCommitteeForm;
	
	@FindBy(xpath = "//*[@id='aVendor' and text()='CP Director Prequalification Review']")
	public WebElement cpDirectorForm;

	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@FindBy(xpath = "//span[contains(text(),'My Pending Reviews - ROW PQ Engineer')]")
	public WebElement RowpqEngineer;

	@FindBy(xpath = "//span[contains(text(),'My Pending Reviews - Sub-contractor PQ Engineer')]")
	public WebElement SubContractorpqEngineer;

	@FindBy(xpath = "//span[contains(text(),'My Pending Reviews - ROW Department Coordinator')]")
	public WebElement ROWdepartmentCoordinator;

    @FindBy(xpath = "//*[@id='aVendor' and text()='Technical Review ROW']")
    public WebElement technicalFormROW;


    public void clickReviewFilter() throws Throwable{
    	UtilityMethods.waitForPageLoadAndPageReady();
    	clickReviewFilter.click();

		UtilityMethods.waitForPageLoadAndPageReady();
	}

	
	public void NavigateToReview() throws Throwable{

		UtilityMethods.waitForPageLoadAndPageReady();

		expandWorkSpaceMenu.click();
		clickEPQ.click();

		UtilityMethods.waitForPageLoadAndPageReady();
		clickReviews.click();

	}
	
	public void NavigateToPQEngineer() throws Throwable{
		
		UtilityMethods.waitForPageLoadAndPageReady();
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));
		UtilityMethods.wait2Seconds();
		openList.click();
		UtilityMethods.wait2Seconds();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", pqEngineer);
		pqEngineer.click();
		
	}
	
	public void ClickARecord(String VendorName) throws Throwable{
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.clickElemetJavaSciptExecutor(mainFilter);
//		new WebDriverWait(driver, 60)
//				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
//		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));
		Filter(VendorName);
		UtilityMethods.waitForPageLoadAndPageReady();
		new Actions(driver).doubleClick(clickRecord).build().perform();

	}


	public void CompleteCPDirectorAppealReview(String questionarieValue, String RecommentationValueCP) throws Throwable{

			UtilityMethods.waitForPageLoadAndPageReady();
			UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
			new WebDriverWait(driver, 60)
					.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
			driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
			UtilityMethods.wait2Seconds();
			new WebDriverWait(driver,60)
					.until(ExpectedConditions.visibilityOfElementLocated(By.id("WebResource_rta_htmlRelatedReviews")));
			driver.switchTo().frame(driver.findElement(By.id("WebResource_rta_htmlRelatedReviews")));
			//UtilityMethods.wait3Seconds();
			//UtilityMethods.wait3Seconds();
			//UtilityMethods.wait2Seconds();
			//UtilityMethods.wait4Seconds();
			//UtilityMethods.wait4Seconds();
			//UtilityMethods.wait4Seconds();
			UtilityMethods.wait4Seconds();

			UtilityMethods.wait4Seconds();
			//UtilityMethods.wait4Seconds();
			//UtilityMethods.wait4Seconds();
			//completnessForm.click();
			//completnessFormApprove.click();
			try {
				UtilityMethods.acceptAlert();
			}
			catch(Exception e) {

				System.out.println("Alert was not present");

			}
			UtilityMethods.waitForPageLoadAndPageReady();
			UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
			new WebDriverWait(driver, 60)
					.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
			driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
			new WebDriverWait(driver,60)
					.until(ExpectedConditions.visibilityOfElementLocated(By.id("WebResource_rta_htmlRelatedReviews")));
			UtilityMethods.wait2Seconds();
			UtilityMethods.wait2Seconds();

			System.out.println("switch into frame1");

			UtilityMethods.waitForPageLoadAndPageReady();
			UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
			driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
			UtilityMethods.wait2Seconds();
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", recommendation);

			//clickEngineer.click();
			recommendation.click();
			new Select(recommendationSelectBox).selectByVisibleText(RecommentationValueCP);
			UtilityMethods.wait2Seconds();
			internalCommentsClick.click();
			System.out.println("comments");
			UtilityMethods.evenctvalues(internalComments, "Testing");

			UtilityMethods.wait2Seconds();
			//hereAMD
			//recommendationTect.click();
			//new Select(recommendationSelectBoxTech).selectByVisibleText(RecommentationValueCP);
			//UtilityMethods.wait3Seconds();

			//System.out.println("At internal comments");
			//internalCommentsTechClick.click();
			UtilityMethods.wait1Seconds();
			System.out.println("comment completed CP director");
			//UtilityMethods.evenctvalues(internalCommentsTech, "Testing");
			//UtilityMethods.evenctvalues(intialInternalComments, "Testing");
			//here

			System.out.println("Select Decision");
			if(RecommentationValueCP.equals("Maintain Status")){
				UtilityMethods.wait2Seconds();
				UtilityMethods.wait2Seconds();
				UtilityMethods.wait4Seconds();

				//asdasd
				//DepartmentLable.click();
				//UtilityMethods.evenctvalues(AssignedDepartment, "Information technology");
				UtilityMethods.wait4Seconds();
				UtilityMethods.wait4Seconds();

				driver.switchTo().defaultContent();
				//clickCPDirectorAppeal.click();
				UtilityMethods.wait2Seconds();

			}

			UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
			submitButton.click();

			UtilityMethods.acceptAlert();
			UtilityMethods.wait2Seconds();

			UtilityMethods.waitForPageLoadAndPageReady();

			try {

				(new WebDriverWait(driver, 20))
						.until(ExpectedConditions.textToBe(By.xpath("//span[contains(text(),'Review has been submitted successfully')]"), "Review has been submitted successfully"));

				System.out.println("Element clicked");
				new Actions(driver).moveToElement(recordSubmitted).click().build().perform();

			}
			catch(TimeoutException e)
			{

				if(driver.findElements(By.id("InlineDialog_Iframe")).size()!=0){

					new WebDriverWait(driver,30)
							.until(ExpectedConditions.visibilityOfElementLocated(By.id("InlineDialog_Iframe")));
					driver.switchTo().frame(driver.findElement(By.id("InlineDialog_Iframe")));

					new Actions(driver).moveToElement(closePopup).doubleClick().build().perform();

				}
			}

		}

	public void CompletePQCommitteeAppealReview() throws Throwable{

    	GenericSubmitReviewMethod();
		/*{
			UtilityMethods.waitForPageLoadAndPageReady();
			UtilityMethods.waitForElementVisible(headerBar);

			//UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
			submitButton.click();
			UtilityMethods.wait2Seconds();
			UtilityMethods.acceptAlert();
			UtilityMethods.wait2Seconds();

			UtilityMethods.waitForPageLoadAndPageReady();

			try {

				(new WebDriverWait(driver, 20))
						.until(ExpectedConditions.textToBe(By.xpath("//span[contains(text(),'Review has been submitted successfully')]"), "Review has been submitted successfully"));

				System.out.println("Element clicked");
				new Actions(driver).moveToElement(recordSubmitted).click().build().perform();

			}
			catch(TimeoutException e)
			{

				if(driver.findElements(By.id("InlineDialog_Iframe")).size()!=0){

					new WebDriverWait(driver,30)
							.until(ExpectedConditions.visibilityOfElementLocated(By.id("InlineDialog_Iframe")));
					driver.switchTo().frame(driver.findElement(By.id("InlineDialog_Iframe")));

					new Actions(driver).moveToElement(closePopup).doubleClick().build().perform();

				}
			}
		}
*/
	}

	public void GenericSubmitReviewMethod() throws Throwable{


    	System.out.println("Under GenericSubmitReviewMethod");
		UtilityMethods.wait10Seconds();
			UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		UtilityMethods.wait10Seconds();

			UtilityMethods.waitForElementVisible25(headerBar);

			//UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
			submitButton.click();
			UtilityMethods.wait2Seconds();
			UtilityMethods.acceptAlert();

			//if(Alert().isDisplayed)

			UtilityMethods.wait10Seconds();

			UtilityMethods.waitForPageLoadAndPageReady();

			//if()
		try {
			UtilityMethods.acceptAlert();
		}
		catch(Exception e) {
			try{
				UtilityMethods.wait2Seconds();
				UtilityMethods.acceptAlert();
			}
			catch(Exception ee){
				System.out.println("Alert was not present");
			}
			System.out.println("Alert was not present");
		}

			try {
				(new WebDriverWait(driver, 35))
						.until(ExpectedConditions.textToBe(By.xpath("//span[contains(text(),'Review has been submitted successfully')]"), "Review has been submitted successfully"));

				System.out.println("Element clicked");
				new Actions(driver).moveToElement(recordSubmitted).click().build().perform();
			}
			catch(TimeoutException e)
			{

				if(driver.findElements(By.id("InlineDialog_Iframe")).size()!=0){

					new WebDriverWait(driver,30)
							.until(ExpectedConditions.visibilityOfElementLocated(By.id("InlineDialog_Iframe")));
					driver.switchTo().frame(driver.findElement(By.id("InlineDialog_Iframe")));

					new Actions(driver).moveToElement(closePopup).doubleClick().build().perform();

				}
			}
		}
	public void GenericSubmitReviewMethod2() throws Throwable{


		System.out.println("Under GenericSubmitReviewMethod2");
		UtilityMethods.wait10Seconds();
		UtilityMethods.waitForPageLoadAndPageReady();

		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();

		UtilityMethods.wait2Seconds();
		UtilityMethods.wait10Seconds();
		UtilityMethods.waitForElementVisible25(headerBar2);
		System.out.println("click on submit button");
		//headerBar2.click(); // click on submit button

		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		UtilityMethods.wait2Seconds();
		UtilityMethods.wait4Seconds();
		UtilityMethods.wait10Seconds();
		headerBar2.click(); // click on submit button
		//submitButton.click();
		UtilityMethods.wait4Seconds();
		UtilityMethods.acceptAlert();

		UtilityMethods.wait10Seconds();

		UtilityMethods.waitForPageLoadAndPageReady();

		try {
			UtilityMethods.acceptAlert2();
		}
		catch(Exception e) {
			try{
				UtilityMethods.wait10Seconds();
				UtilityMethods.acceptAlert3();
			}
			catch(Exception ee){
				System.out.println("Alert was not present");
			}
			System.out.println("Alert was not present");
		}

		try {
			(new WebDriverWait(driver, 35))
					.until(ExpectedConditions.textToBe(By.xpath("//span[contains(text(),'Review has been submitted successfully')]"), "Review has been submitted successfully"));

			System.out.println("Element clicked");
			new Actions(driver).moveToElement(recordSubmitted).click().build().perform();

		}
		catch(TimeoutException e)
		{

			if(driver.findElements(By.id("InlineDialog_Iframe")).size()!=0){

				new WebDriverWait(driver,30)
						.until(ExpectedConditions.visibilityOfElementLocated(By.id("InlineDialog_Iframe")));
				driver.switchTo().frame(driver.findElement(By.id("InlineDialog_Iframe")));

				new Actions(driver).moveToElement(closePopup).doubleClick().build().perform();

			}
		}
	}

	public void CompleteChairmanAppealReview() throws Throwable{
		//GenericSubmitReviewMethod2();
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.wait4Seconds();
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		UtilityMethods.wait10Seconds();
		UtilityMethods.wait10Seconds();
		//UtilityMethods.clickElemetJavaSciptExecutor(submitButton);
		submitButton.click();
		UtilityMethods.wait2Seconds();
		UtilityMethods.acceptAlert();

		/*UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.waitForElementVisible(headerBar);

		//UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		submitButton.click();
		UtilityMethods.wait2Seconds();
		UtilityMethods.acceptAlert();
		UtilityMethods.wait2Seconds();

		UtilityMethods.waitForPageLoadAndPageReady();

		try {

			(new WebDriverWait(driver, 35))
					.until(ExpectedConditions.textToBe(By.xpath("//span[contains(text(),'Review has been submitted successfully')]"), "Review has been submitted successfully"));

			System.out.println("Element clicked");
			new Actions(driver).moveToElement(recordSubmitted).click().build().perform();

		}
		catch(TimeoutException e)
		{

			if(driver.findElements(By.id("InlineDialog_Iframe")).size()!=0){

				new WebDriverWait(driver,30)
						.until(ExpectedConditions.visibilityOfElementLocated(By.id("InlineDialog_Iframe")));
				driver.switchTo().frame(driver.findElement(By.id("InlineDialog_Iframe")));

				new Actions(driver).moveToElement(closePopup).doubleClick().build().perform();

			}
		}*/
	}

	public void CompleteTechnicalReqview(String questionarieValue, String RecommentationValueTech) throws Throwable{
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		UtilityMethods.wait2Seconds();
		new WebDriverWait(driver,60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.id("WebResource_rta_htmlRelatedReviews")));
		driver.switchTo().frame(driver.findElement(By.id("WebResource_rta_htmlRelatedReviews")));
		//UtilityMethods.wait3Seconds();
		//UtilityMethods.wait3Seconds();
		//UtilityMethods.wait2Seconds();
		//UtilityMethods.wait4Seconds();
		UtilityMethods.wait4Seconds();
		UtilityMethods.wait4Seconds();
		UtilityMethods.wait4Seconds();

		UtilityMethods.wait4Seconds();
		//UtilityMethods.wait4Seconds();
		//UtilityMethods.wait4Seconds();
		//completnessForm.click();
		//completnessFormApprove.click();
		try {
			UtilityMethods.acceptAlert();
		}
		catch(Exception e) {

			System.out.println("Alert was not present");

		}
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		new WebDriverWait(driver,60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.id("WebResource_rta_htmlRelatedReviews")));
		UtilityMethods.wait2Seconds();
		UtilityMethods.wait2Seconds();

		System.out.println("switch into frame1");

		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		UtilityMethods.wait2Seconds();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", recommendation);

		//clickEngineer.click();
		recommendation.click();
		new Select(recommendationSelectBox).selectByVisibleText(RecommentationValueTech);
		UtilityMethods.wait2Seconds();
		internalCommentsClick.click();
		System.out.println("comments");
		UtilityMethods.evenctvalues(internalComments, "Testing");

		UtilityMethods.wait2Seconds();
		//hereAMD
		recommendationTect.click();
		new Select(recommendationSelectBoxTech).selectByVisibleText(RecommentationValueTech);
		UtilityMethods.wait3Seconds();

		System.out.println("At internal comments");
		internalCommentsTechClick.click();
		UtilityMethods.wait1Seconds();
		System.out.println("comments");
		//UtilityMethods.evenctvalues(internalCommentsTech, "Testing");
		UtilityMethods.evenctvalues(intialInternalComments, "Testing");
		//here

		System.out.println("assign department");
		if(RecommentationValueTech.equals("Approve")){
			UtilityMethods.wait2Seconds();
			UtilityMethods.wait2Seconds();
			UtilityMethods.wait4Seconds();

			//asdasd
			DepartmentLable.click();
			UtilityMethods.evenctvalues(AssignedDepartment, "Information technology");
			UtilityMethods.wait4Seconds();
			UtilityMethods.wait4Seconds();
			clickEngineer.click();
			UtilityMethods.wait2Seconds();

		}

		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		submitButton.click();

		UtilityMethods.acceptAlert();
		UtilityMethods.wait2Seconds();

		UtilityMethods.waitForPageLoadAndPageReady();

		try {

			(new WebDriverWait(driver, 20))
					.until(ExpectedConditions.textToBe(By.xpath("//span[contains(text(),'Review has been submitted successfully')]"), "Review has been submitted successfully"));

			System.out.println("Element clicked");
			new Actions(driver).moveToElement(recordSubmitted).click().build().perform();

		}
		catch(TimeoutException e)
		{

			if(driver.findElements(By.id("InlineDialog_Iframe")).size()!=0){

				new WebDriverWait(driver,30)
						.until(ExpectedConditions.visibilityOfElementLocated(By.id("InlineDialog_Iframe")));
				driver.switchTo().frame(driver.findElement(By.id("InlineDialog_Iframe")));

				new Actions(driver).moveToElement(closePopup).doubleClick().build().perform();

			}
		}

	}


	public void CompletePQEnigeerReview(String questionarieValue, String recommendationValue) throws Throwable{
		
		/*UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		UtilityMethods.wait2Seconds();
		new WebDriverWait(driver,60)                               
		.until(ExpectedConditions.visibilityOfElementLocated(By.id("WebResource_rta_htmlRelatedReviews")));
		driver.switchTo().frame(driver.findElement(By.id("WebResource_rta_htmlRelatedReviews")));
		UtilityMethods.wait3Seconds();
		UtilityMethods.wait3Seconds();
		UtilityMethods.wait2Seconds();
		//completnessForm.click();
		//completnessForm_debug.click();
		try {
		UtilityMethods.acceptAlert();
		}
		catch(Exception e) {

			System.out.println("Alert was not present");

		}
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		new WebDriverWait(driver,60)
		.until(ExpectedConditions.visibilityOfElementLocated(By.id("WebResource_rta_htmlRelatedReviews")));
		UtilityMethods.wait2Seconds();
		new WebDriverWait(driver,60)                               
		.until(ExpectedConditions.visibilityOfElementLocated(By.id("WebResource_rta_htmlCompletenessReview")));
		
		driver.switchTo().frame(driver.findElement(By.id("WebResource_rta_htmlCompletenessReview")));
		UtilityMethods.wait2Seconds();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", selectBox4);	
		
		List<WebElement> list = driver.findElements(By.xpath("(//*[@id='ddlAnswer' ])"));
	    int count = list.size();
		
		for(int i=1;i<=count;i++)
		{
			new Select(driver.findElement((By.xpath("(//*[@id='ddlAnswer' ])[ "+i+" ]")))).selectByVisibleText(questionarieValue);
			
		}
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		UtilityMethods.wait2Seconds();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", recommendation);
	
		clickEngineer.click();
		recommendation.click();
		new Select(recommendationSelectBox).selectByVisibleText(recommendationValue);
		UtilityMethods.wait2Seconds();
		internalCommentsClick.click();
		UtilityMethods.evenctvalues(internalComments, "Testing");
		if(recommendationValue.equals("Reject")){
			UtilityMethods.wait2Seconds();
			commentsexternalClick.click();
			UtilityMethods.evenctvalues(new_commentsexternal_i, "Reject Review Case");
			UtilityMethods.wait2Seconds();
			new_finalrejectionreasonClick.click();
			new Select(new_finalrejectionreason).selectByVisibleText("Missing documents");
			UtilityMethods.wait2Seconds();
		}

		
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		submitButton.click();
		
		UtilityMethods.acceptAlert();
		UtilityMethods.wait2Seconds();
		
		UtilityMethods.waitForPageLoadAndPageReady();
		
		try {
			
			(new WebDriverWait(driver, 20))
			  .until(ExpectedConditions.textToBe(By.xpath("//span[contains(text(),'Review has been submitted successfully')]"), "Review has been submitted successfully"));
			
			System.out.println("Element clicked");
			new Actions(driver).moveToElement(recordSubmitted).click().build().perform();
			
		}
		catch(TimeoutException e)
		{
			
			if(driver.findElements(By.id("InlineDialog_Iframe")).size()!=0){
				
				new WebDriverWait(driver,30)                               
				.until(ExpectedConditions.visibilityOfElementLocated(By.id("InlineDialog_Iframe")));
				driver.switchTo().frame(driver.findElement(By.id("InlineDialog_Iframe")));

				new Actions(driver).moveToElement(closePopup).doubleClick().build().perform();
			
			}
		}*/

			UtilityMethods.waitForPageLoadAndPageReady();
			UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
			new WebDriverWait(driver, 60)
					.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
			driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
			UtilityMethods.wait2Seconds();
			new WebDriverWait(driver,60)
					.until(ExpectedConditions.visibilityOfElementLocated(By.id("WebResource_rta_htmlRelatedReviews")));
			driver.switchTo().frame(driver.findElement(By.id("WebResource_rta_htmlRelatedReviews")));
			UtilityMethods.wait3Seconds();
			UtilityMethods.wait3Seconds();
			UtilityMethods.wait2Seconds();
			UtilityMethods.wait4Seconds();
			UtilityMethods.wait4Seconds();
			UtilityMethods.wait4Seconds();
			//UtilityMethods.wait4Seconds();

			//UtilityMethods.wait4Seconds();
			//UtilityMethods.wait4Seconds();
			UtilityMethods.wait4Seconds();
			//completnessForm.click();
			//completnessFormApprove.click();
			try {
				UtilityMethods.acceptAlert();
			}
			catch(Exception e) {

				System.out.println("Alert was not present");

			}
			UtilityMethods.waitForPageLoadAndPageReady();
			UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
			new WebDriverWait(driver, 60)
					.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
			driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
			new WebDriverWait(driver,60)
					.until(ExpectedConditions.visibilityOfElementLocated(By.id("WebResource_rta_htmlRelatedReviews")));
			UtilityMethods.wait2Seconds();
			UtilityMethods.wait2Seconds();

			System.out.println("switch into frame1");
//		new WebDriverWait(driver,60)
//				.until(ExpectedConditions.visibilityOfElementLocated(By.id("WebResource_rta_htmlCompletenessReview")));
//		System.out.println("switch into frame2");
//		driver.switchTo().frame(driver.findElement(By.id("WebResource_rta_htmlCompletenessReview")));
//		UtilityMethods.wait2Seconds();
//		System.out.println("switch into frame3");
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", selectBox4);
//		System.out.println("switch into frame4");
//		List<WebElement> list = driver.findElements(By.xpath("(//*[@id='ddlAnswer' ])"));
//		int count = list.size();
//
//		for(int i=1;i<=count;i++)
//		{
//			new Select(driver.findElement((By.xpath("(//*[@id='ddlAnswer' ])[ "+i+" ]")))).selectByVisibleText(questionarieValue);
//
//		}

			UtilityMethods.waitForPageLoadAndPageReady();
			UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
			driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
			UtilityMethods.wait2Seconds();
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", recommendation);

			clickEngineer.click();
			recommendation.click();
			new Select(recommendationSelectBox).selectByVisibleText(recommendationValue);
			UtilityMethods.wait2Seconds();
			internalCommentsClick.click();
			System.out.println("comments");
			UtilityMethods.evenctvalues(internalComments, "Testing");
			System.out.println("assign department");
			if(recommendationValue.equals("Approve")){
				UtilityMethods.wait2Seconds();
				UtilityMethods.wait2Seconds();
				UtilityMethods.wait4Seconds();
				DepartmentLable.click();
				UtilityMethods.evenctvalues(AssignedDepartment, "Information technology");
				UtilityMethods.wait4Seconds();
				UtilityMethods.wait4Seconds();
				clickEngineer.click();
				UtilityMethods.wait2Seconds();

			}

			UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
			submitButton.click();

			UtilityMethods.acceptAlert();
			UtilityMethods.wait2Seconds();
		    UtilityMethods.wait2Seconds();

			UtilityMethods.waitForPageLoadAndPageReady();

			try {

				(new WebDriverWait(driver, 20))
						.until(ExpectedConditions.textToBe(By.xpath("//span[contains(text(),'Review has been submitted successfully')]"), "Review has been submitted successfully"));

				System.out.println("Element clicked");
				new Actions(driver).moveToElement(recordSubmitted).click().build().perform();

			}
			catch(TimeoutException e)
			{

				if(driver.findElements(By.id("InlineDialog_Iframe")).size()!=0){

					new WebDriverWait(driver,30)
							.until(ExpectedConditions.visibilityOfElementLocated(By.id("InlineDialog_Iframe")));
					driver.switchTo().frame(driver.findElement(By.id("InlineDialog_Iframe")));

					new Actions(driver).moveToElement(closePopup).doubleClick().build().perform();

				}
			}

		}
		

	
	public void NavigateToDepartmentCoordinator() throws Throwable{
		
		UtilityMethods.waitForPageLoadAndPageReady();
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));
		openList.click();
		if(openList.getText().equals(departmentCoordinator)){
			departmentCoordinator.click();
		}
		else {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", departmentCoordinator);
			departmentCoordinator.click();
		}
	}
	
	public void ClickADepartmentCoordinatorReview(String VendorName) throws Throwable{

		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.clickElemetJavaSciptExecutor(mainFilter);
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.clickElemetJavaSciptExecutor(selectReviewFilter);
		UtilityMethods.wait2Seconds();
		clickReview.click();
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		new WebDriverWait(driver,60)
			.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#InlineDialog_Iframe")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("#InlineDialog_Iframe")));
		
		searchReview.sendKeys("Technical Review");
		searchButton.click();
		UtilityMethods.waitForPageLoadAndPageReady();
		new Actions(driver).doubleClick(clickRecord).build().perform();
		closePopup.click();

		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();



		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));
		Filter(VendorName);

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));
		UtilityMethods.wait2Seconds();
		new Actions(driver).doubleClick(clickRecord).build().perform();
		
		
	}
	
	public void CompleteDepartmentReview(String questionarie,String recommendationValue) throws Throwable{
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		UtilityMethods.wait2Seconds();
		new WebDriverWait(driver,60)                               
		.until(ExpectedConditions.visibilityOfElementLocated(By.id("WebResource_rta_htmlRelatedReviews")));
		UtilityMethods.wait3Seconds();
		driver.switchTo().frame(driver.findElement(By.id("WebResource_rta_htmlRelatedReviews")));
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.wait2Seconds();
		technicalForm.click();
		try {
		UtilityMethods.acceptAlert();
		}
		catch(Exception e) {

			System.out.println("Alert was not present");

		}
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		new WebDriverWait(driver,60)
		.until(ExpectedConditions.visibilityOfElementLocated(By.id("WebResource_rta_htmlRelatedReviews")));
		UtilityMethods.wait2Seconds();
		new WebDriverWait(driver,60)                               
		.until(ExpectedConditions.visibilityOfElementLocated(By.id("WebResource_rta_htmlTechnicalReview")));
		
		driver.switchTo().frame(driver.findElement(By.id("WebResource_rta_htmlTechnicalReview")));
		UtilityMethods.wait2Seconds();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", selectBox4);	
		
		List<WebElement> list = driver.findElements(By.xpath("(//*[@id='ddlAnswer' ])"));
	    int count = list.size();
		
		for(int i=1;i<=count;i++)
		{
			new Select(driver.findElement((By.xpath("(//*[@id='ddlAnswer' ])[ "+i+" ]")))).selectByVisibleText(questionarie);
			UtilityMethods.wait1Seconds();
			
		}
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		UtilityMethods.wait2Seconds();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", recommendation);
	
		initialRecommendtaion.click();
		new Select(initialrecommendationSelectBox).selectByVisibleText(recommendationValue);
		UtilityMethods.wait2Seconds();
		internalCommentlabel.click();
		intialInternalCommentsClick.click();
		UtilityMethods.evenctvalues(intialInternalComments, "Testing");

		UtilityMethods.wait2Seconds();
		recommendation.click();
		new Select(recommendationSelectBox).selectByVisibleText(recommendationValue);
		UtilityMethods.wait1Seconds();
		UtilityMethods.wait2Seconds();
		initialRecommendationcateogory.click();
		UtilityMethods.wait2Seconds();
//		searchImgIcon.click();
		UtilityMethods.clickElemetJavaSciptExecutor(searchImgIconInitial);
		UtilityMethods.wait2Seconds();
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", moreRecords);
		UtilityMethods.clickElemetJavaSciptExecutor(moreRecords);
//		UtilityMethods.scrollToElementAndClick(moreRecords);
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		new WebDriverWait(driver,60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.id("InlineDialog_Iframe")));

		driver.switchTo().frame(driver.findElement(By.id("InlineDialog_Iframe")));
		UtilityMethods.wait2Seconds();
		closePopup.click();
		UtilityMethods.waitForPageLoadAndPageReady();
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		UtilityMethods.wait2Seconds();
		recommendation.click();
		new Select(recommendationSelectBox).selectByVisibleText(recommendationValue);
		UtilityMethods.wait2Seconds();
		interCommentfinalLabel.click();
		internalCommentsClick.click();
		UtilityMethods.evenctvalues(internalComments, "Technical Review");
//
		UtilityMethods.wait1Seconds();

		finalRecommendation.click();
		UtilityMethods.clickElemetJavaSciptExecutor(searchImgIcon);
		UtilityMethods.scrollToElementAndClick(moreRecords);
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		new WebDriverWait(driver,60)
		.until(ExpectedConditions.visibilityOfElementLocated(By.id("InlineDialog_Iframe")));

		driver.switchTo().frame(driver.findElement(By.id("InlineDialog_Iframe")));
		UtilityMethods.wait2Seconds();
		closePopup.click();
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		submitButton.click();
		
		UtilityMethods.acceptAlert();
		
	}

	public void NavigateToDepartmentDirector() throws Throwable{
		
		UtilityMethods.waitForPageLoadAndPageReady();
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));
		openList.click();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", departmentDirector);
		departmentDirector.click();
		
	}
	
	public void NavigateToLegalReview() throws Throwable{
		
		UtilityMethods.waitForPageLoadAndPageReady();
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));
		openList.click();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", legalReview);
		legalReview.click();
		
	}

	public void CompleteLegalReview(String recommendationValue) throws Throwable{
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		UtilityMethods.wait2Seconds();
		new WebDriverWait(driver,60)                               
		.until(ExpectedConditions.visibilityOfElementLocated(By.id("WebResource_rta_htmlRelatedReviews")));
		UtilityMethods.wait3Seconds();
		driver.switchTo().frame(driver.findElement(By.id("WebResource_rta_htmlRelatedReviews")));
		UtilityMethods.wait2Seconds();
		legalForm.click();
		try {
		UtilityMethods.acceptAlert();
		}
		catch(Exception e) {

			System.out.println("Alert was not present");

		}
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		UtilityMethods.wait2Seconds();
		new WebDriverWait(driver,60)                               
		.until(ExpectedConditions.visibilityOfElementLocated(By.id("WebResource_rta_htmlRelatedReviews")));
		
		UtilityMethods.wait2Seconds();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", recommendation);
	
		recommendation.click();	
		new Select(recommendationSelectBox).selectByVisibleText(recommendationValue);
		UtilityMethods.wait2Seconds();
		interCommentfinalLabel.click();
		internalCommentsClick.click();
		UtilityMethods.evenctvalues(internalComments, "Testing");
		
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		submitButton.click();
		
		UtilityMethods.acceptAlert();
		
	}
	
	public void NavigateToFinancialReview() throws Throwable{
		
		UtilityMethods.waitForPageLoadAndPageReady();
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));
		openList.click();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", financialReview);
		financialReview.click();
		
		
	}
	
	public void NavigateToHSECoordinatorReview() throws Throwable{
		
		UtilityMethods.waitForPageLoadAndPageReady();
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));
		openList.click();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", hseCoordinatorReview);
		hseCoordinatorReview.click();
		
		
	}
	
	public void CompleteHSECoordinatorReview(String questionarie, String recommendationValue) throws Throwable{
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		UtilityMethods.wait2Seconds();
		new WebDriverWait(driver,60)                               
		.until(ExpectedConditions.visibilityOfElementLocated(By.id("WebResource_rta_htmlRelatedReviews")));
		UtilityMethods.wait3Seconds();
		driver.switchTo().frame(driver.findElement(By.id("WebResource_rta_htmlRelatedReviews")));
		UtilityMethods.wait2Seconds();
		hseForm.click();
		try {
		UtilityMethods.acceptAlert();
		}
		catch(Exception e) {

			System.out.println("Alert was not present");

		}
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		UtilityMethods.wait2Seconds();
		new WebDriverWait(driver,60)                               
		.until(ExpectedConditions.visibilityOfElementLocated(By.id("WebResource_rta_htmlHSEReview")));
		
		driver.switchTo().frame(driver.findElement(By.id("WebResource_rta_htmlHSEReview")));
		UtilityMethods.wait2Seconds();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", selectBox4);
		
		List<WebElement> list = driver.findElements(By.xpath("(//*[@id='ddlAnswer' ])"));
	    int count = list.size();
		
		driver.findElement((By.xpath("(//*[@id='ddlAnswer' ])[ '"+count+"' ]")));
		
		for(int i=1;i<=count;i++)
		{
			new Select(driver.findElement((By.xpath("(//*[@id='ddlAnswer' ])[ "+i+" ]")))).selectByVisibleText(questionarie);
			
		}
		
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		UtilityMethods.wait2Seconds();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", recommendation);
		
		recommendation.click();	
		new Select(recommendationSelectBox).selectByVisibleText(recommendationValue);
		UtilityMethods.wait2Seconds();
		interCommentfinalLabel.click();
		internalCommentsClick.click();
		UtilityMethods.evenctvalues(internalComments, "Testing");
		
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		submitButton.click();
		
		UtilityMethods.acceptAlert();
		
	}
	
	public void NavigateToGreenProcurementReview() throws Throwable{
		
		UtilityMethods.waitForPageLoadAndPageReady();
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));
		openList.click();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", greenProcurementReview);
		greenProcurementReview.click();
		
	}
	
	public void CompleteGreenProcurementReview(String questionarie, String recommendationValue) throws Throwable{
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();	
		
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		UtilityMethods.wait2Seconds();
		new WebDriverWait(driver,60)                               
		.until(ExpectedConditions.visibilityOfElementLocated(By.id("WebResource_rta_htmlRelatedReviews")));
		UtilityMethods.wait3Seconds();
		driver.switchTo().frame(driver.findElement(By.id("WebResource_rta_htmlRelatedReviews")));
		UtilityMethods.wait2Seconds();
		greenProcurementForm.click();
		try {
		UtilityMethods.acceptAlert();
		}
		catch(Exception e) {

			System.out.println("Alert was not present");

		}
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		UtilityMethods.wait2Seconds();
		new WebDriverWait(driver,60)                               
		.until(ExpectedConditions.visibilityOfElementLocated(By.id("WebResource_rta_htmlRelatedReviews")));
		new WebDriverWait(driver,60)                               
		.until(ExpectedConditions.visibilityOfElementLocated(By.id("WebResource_rta_htmlGreenProcurementReview")));
		
		driver.switchTo().frame(driver.findElement(By.id("WebResource_rta_htmlGreenProcurementReview")));
		UtilityMethods.wait2Seconds();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", selectBox4);	
		
		List<WebElement> list = driver.findElements(By.xpath("(//*[@id='ddlAnswer' ])"));
	    int count = list.size();
		
		
		for(int i=1;i<=count;i++)
		{
			new Select(driver.findElement((By.xpath("(//*[@id='ddlAnswer' ])[ "+i+" ]")))).selectByVisibleText(questionarie);
			
		}
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		UtilityMethods.wait2Seconds();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", recommendation);
		
		recommendation.click();	
		new Select(recommendationSelectBox).selectByVisibleText(recommendationValue);
		UtilityMethods.wait2Seconds();
		interCommentfinalLabel.click();
		internalCommentsClick.click();
		UtilityMethods.evenctvalues(internalComments, "Testing");
		
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		submitButton.click();
		
		UtilityMethods.acceptAlert();
		
		
	}

	public void NavigateToPQcommitteeReviews() throws Throwable{

		UtilityMethods.waitForPageLoadAndPageReady();
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));
		openList.click();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", PQcommitteeReview);
		PQcommitteeReview.click();

	}

	public void ClickAPQcommitteePrequalificationReview(String VendorName) throws Throwable{

		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.clickElemetJavaSciptExecutor(mainFilter);
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.clickElemetJavaSciptExecutor(selectReviewFilter);
		UtilityMethods.wait2Seconds();
		clickReview.click();
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		new WebDriverWait(driver,60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#InlineDialog_Iframe")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("#InlineDialog_Iframe")));

		searchReview.sendKeys("PQ Committee Prequalification Review");
		searchButton.click();
		UtilityMethods.waitForPageLoadAndPageReady();
		new Actions(driver).doubleClick(clickRecord).build().perform();
		closePopup.click();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));
		Filter(VendorName);

		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));
		UtilityMethods.wait2Seconds();
		new Actions(driver).doubleClick(clickRecord).build().perform();


	}

	public void CompletePQcommitteePrequalificationReview(String recommendationValue,String RejectionReason) throws Throwable{

		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		UtilityMethods.wait2Seconds();
		new WebDriverWait(driver,60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.id("WebResource_rta_htmlRelatedReviews")));
		driver.switchTo().frame(driver.findElement(By.id("WebResource_rta_htmlRelatedReviews")));
		UtilityMethods.wait2Seconds();
		pqCommitteeForm.click();
		try {
			UtilityMethods.acceptAlert();
		}
		catch(Exception e) {

			System.out.println("Alert was not present");

		}
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		UtilityMethods.wait2Seconds();
		new WebDriverWait(driver,60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.id("WebResource_rta_htmlRelatedReviews")));

		UtilityMethods.wait2Seconds();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", recommendation);

		recommendation.click();
		new Select(recommendationSelectBox).selectByVisibleText(recommendationValue);
		UtilityMethods.wait2Seconds();
		interCommentfinalLabel.click();
		internalCommentsClick.click();
		UtilityMethods.evenctvalues(internalComments, "Testing");
		UtilityMethods.wait1Seconds();

		finalRecommendation.click();
		UtilityMethods.clickElemetJavaSciptExecutor(searchImgIcon);
		UtilityMethods.scrollToElementAndClick(moreRecords);
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		new WebDriverWait(driver,60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.id("InlineDialog_Iframe")));

		driver.switchTo().frame(driver.findElement(By.id("InlineDialog_Iframe")));
		UtilityMethods.wait2Seconds();
		closePopup.click();
		UtilityMethods.waitForPageLoadAndPageReady();
//		if (recommendationValue.equals("Reject"))
//        {
//            rejectionReasonFinal.click();
//            new Select(rejectionReasonOptionFinal).selectByVisibleText(RejectionReason);
//        }
//		else
//        {
//            if (finalRecommendedCategory.getAttribute("value").equals(""))

//            {
//                recommendedCategory.click();
//                UtilityMethods.evenctvalues(finalRecommendedCategory, RecommendedCategory);
//                finalRecommendedCategory.sendKeys(Keys.TAB);
//            }

//            new Select(rejectionReasonOptionFinal).selectByVisibleText(RejectionReason);

//        }
		UtilityMethods.wait2Seconds();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		submitButton.click();

		UtilityMethods.acceptAlert();

	}

    public void NavigatetoProcurementDirectorReview() throws Throwable{

        UtilityMethods.waitForPageLoadAndPageReady();
        new WebDriverWait(driver, 60)
                .until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));
        openList.click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ProcurementDirectorReview);
        ProcurementDirectorReview.click();

    }

    public void ClickCPDirectorPrequalificationReview(String VendorName) throws Throwable{

        UtilityMethods.waitForPageLoadAndPageReady();
        UtilityMethods.clickElemetJavaSciptExecutor(mainFilter);
        UtilityMethods.waitForPageLoadAndPageReady();
        UtilityMethods.clickElemetJavaSciptExecutor(selectReviewFilter);
        UtilityMethods.wait2Seconds();
        clickReview.click();
        UtilityMethods.waitForPageLoadAndPageReady();
        UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
        new WebDriverWait(driver,60)
                .until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#InlineDialog_Iframe")));
        driver.switchTo().frame(driver.findElement(By.cssSelector("#InlineDialog_Iframe")));

        searchReview.sendKeys("CP Director Prequalification Review");
        searchButton.click();
        UtilityMethods.waitForPageLoadAndPageReady();
        new Actions(driver).doubleClick(clickRecord).build().perform();
        closePopup.click();

		new WebDriverWait(driver, 60)

				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));
		Filter(VendorName);
        UtilityMethods.waitForPageLoadAndPageReady();
        UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
        new WebDriverWait(driver, 60)
                .until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));
        UtilityMethods.wait2Seconds();
        new Actions(driver).doubleClick(clickRecord).build().perform();


    }

    public void CompleteCPDirectorPrequalificationReview() throws Throwable{

        UtilityMethods.waitForPageLoadAndPageReady();
        UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
        new WebDriverWait(driver, 60)
                .until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
        UtilityMethods.wait2Seconds();
        new WebDriverWait(driver,60)
                .until(ExpectedConditions.visibilityOfElementLocated(By.id("WebResource_rta_htmlRelatedReviews")));
        driver.switchTo().frame(driver.findElement(By.id("WebResource_rta_htmlRelatedReviews")));
		UtilityMethods.wait2Seconds();
		cpDirectorForm.click();
		try {
		UtilityMethods.acceptAlert();
		}
		catch(Exception e) {

			System.out.println("Alert was not present");

		}
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		UtilityMethods.wait2Seconds();
		new WebDriverWait(driver,60)                               
		.until(ExpectedConditions.visibilityOfElementLocated(By.id("WebResource_rta_htmlRelatedReviews")));
      
        UtilityMethods.wait2Seconds();
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", interCommentfinalLabel);

        interCommentfinalLabel.click();
        internalCommentsClick.click();
        UtilityMethods.evenctvalues(internalComments, "Testing");
        UtilityMethods.wait2Seconds();
        UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
        submitButton.click();

        UtilityMethods.acceptAlert();

	}

	public void Filter(String VendorName)throws Throwable{
		UtilityMethods.wait2Seconds();
		UtilityMethods.clickElemetJavaSciptExecutor(selectVendorFilter);
		UtilityMethods.wait2Seconds();
		clickVendorType.click();
		UtilityMethods.wait3Seconds();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
//		new WebDriverWait(driver,60)
//				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#InlineDialog_Iframe")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("#InlineDialog_Iframe")));

		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.wait3Seconds();
		UtilityMethods.wait3Seconds();
		//driver.switchTo().frame(driver.findElement(By.cssSelector("#InlineDialog_Iframe")));
		//UtilityMethods.wait3Seconds();
		new Select(primaryOperator).selectByVisibleText("Equals");
		UtilityMethods.wait3Seconds();
		UtilityMethods.evenctClick(SearchFilter);
		UtilityMethods.evenctClick(Search);
		UtilityMethods.wait3Seconds();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		new WebDriverWait(driver,60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#InlineDialog1_Iframe")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("#InlineDialog1_Iframe")));
		UtilityMethods.wait3Seconds();
		searchReview.sendKeys(VendorName);
		searchButton.click();
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.wait3Seconds();
//		new Actions(driver).doubleClick(clickRecord).build().perform();
		clickRecord.click();
		UtilityMethods.wait1Seconds();
		AddVendor.click();
		closePopup.click();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		new WebDriverWait(driver,60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#InlineDialog_Iframe")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("#InlineDialog_Iframe")));
		UtilityMethods.wait3Seconds();
		closePopup.click();
	}


	public void clickRecord() throws Throwable{
    	UtilityMethods.waitForPageLoadAndPageReady();

    	clickRecord.click();
		clickRecord.sendKeys(Keys.ENTER);
    	System.out.println("first record clicked..");
	}


	public void ClickAPQEngineerReview(String VendorName) throws Throwable{

		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.clickElemetJavaSciptExecutor(mainFilter);
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.wait2Seconds();
		Filter(VendorName);
//		UtilityMethods.clickElemetJavaSciptExecutor(selectVendorFilter);
//		UtilityMethods.wait2Seconds();
//		clickVendorType.click();
//		UtilityMethods.wait2Seconds();
//		UtilityMethods.clickElemetJavaSciptExecutor(selectVendorFilter);
//		UtilityMethods.wait2Seconds();
//		clickVendorType1.click();
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.wait2Seconds();
		driver.switchTo().defaultContent(); //new
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']"))); //new
		UtilityMethods.wait3Seconds();

		try {
			Actions actions = new Actions(driver);
			actions.doubleClick(clickRecord).build().perform();
			System.out.println("try...");
		}

		catch(Exception e){
			clickRecord.click();
			clickRecord.sendKeys(Keys.ENTER);
			System.out.println("Catch...");
		}

		driver.switchTo().parentFrame();

	}
	
	public void OpenNewTab() throws Throwable{
		
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		
		((JavascriptExecutor)driver).executeScript("window.open()");
		driver.close();
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(0));
		UtilityMethods.waitForPageLoadAndPageReady();
		
		
	}

	public void CompleteFinancialReview(String recommendationValue) throws Throwable{
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		UtilityMethods.wait2Seconds();
		new WebDriverWait(driver,60)                               
		.until(ExpectedConditions.visibilityOfElementLocated(By.id("WebResource_rta_htmlRelatedReviews")));
		UtilityMethods.wait3Seconds();
		driver.switchTo().frame(driver.findElement(By.id("WebResource_rta_htmlRelatedReviews")));
		UtilityMethods.wait2Seconds();
		financeForm.click();
		try {
		UtilityMethods.acceptAlert();
		}
		catch(Exception e) {

			System.out.println("Alert was not present");

		}
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		UtilityMethods.wait2Seconds();
		new WebDriverWait(driver,60)                               
		.until(ExpectedConditions.visibilityOfElementLocated(By.id("WebResource_rta_htmlRelatedReviews")));
		
		UtilityMethods.wait2Seconds();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", recommendation);
	
		recommendation.click();	
		new Select(recommendationSelectBox).selectByVisibleText(recommendationValue);
		UtilityMethods.wait2Seconds();
		interCommentfinalLabel.click();
		internalCommentsClick.click();
		UtilityMethods.evenctvalues(internalComments, "Testing");
		
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		submitButton.click();
		UtilityMethods.wait10Seconds();
		
		UtilityMethods.acceptAlert();
		
	}

	public void CloseReview() throws Throwable{
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));//*[@id="new_finalstatus"]/div[1]/span
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		UtilityMethods.wait2Seconds();
		new WebDriverWait(driver, 60).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='new_finalstatus']/div[1]/span[contains(text(),'Submitted')]")));
		UtilityMethods.wait2Seconds();
		UtilityMethods.wait10Seconds();
		UtilityMethods.wait10Seconds();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		UtilityMethods.wait4Seconds();
		UtilityMethods.wait10Seconds();
		closeButton.click();
	}
//////// ------------sub contractor----------------


public void NavigateToSubContractorPQEngineer() throws Throwable{
	UtilityMethods.waitForPageLoadAndPageReady();
	new WebDriverWait(driver, 60)
			.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
	driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));
	UtilityMethods.wait2Seconds();
	openList.click();
	UtilityMethods.wait2Seconds();
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", SubContractorpqEngineer);
	SubContractorpqEngineer.click();
}

	public void NavigateToSubContractorDepartmentCoordinator(){
		//.SelectReviewsDropdown();


		UtilityMethods.waitForPageLoadAndPageReady();
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));

		openList.click();
		if(openList.getText().equals(pendingReviews)){
			pendingReviews.click();

		}
		else {

			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", pendingReviews);
			pendingReviews.click();
		}
	}
	public void ClickASubContractorDepartmentCoordinatorReview(String VendorName) throws Throwable{
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.clickElemetJavaSciptExecutor(mainFilter);
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.clickElemetJavaSciptExecutor(selectReviewFilter);
		UtilityMethods.wait2Seconds();
		clickReview.click();
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		new WebDriverWait(driver,60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#InlineDialog_Iframe")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("#InlineDialog_Iframe")));
   System.out.println("Value search in filter");
		searchReview.sendKeys("Technical Review Sub-Contractor");
		searchButton.click();
		UtilityMethods.waitForPageLoadAndPageReady();

		//new Actions(driver).doubleClick(clickRecord).build().perform();
		clickRecord.click();
		clickRecord.sendKeys(Keys.ENTER);
		System.out.println("AMD1");
		UtilityMethods.wait1Seconds();
		closePopup.click();
		System.out.println("AMD2");
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();



		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));
		Filter(VendorName);

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));
		UtilityMethods.wait2Seconds();
		//new Actions(driver).doubleClick(clickRecord).build().perform();
		clickRecord.click();
		System.out.println("AMD3");
		clickRecord.sendKeys(Keys.ENTER);
		UtilityMethods.wait1Seconds();
	}

	public void CompleteTechnicalReviewSubcontractor(String questionarie,String recommendationValue) throws Throwable{
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		UtilityMethods.wait2Seconds();
		new WebDriverWait(driver,60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.id("WebResource_rta_htmlRelatedReviews")));
		UtilityMethods.wait3Seconds();
		driver.switchTo().frame(driver.findElement(By.id("WebResource_rta_htmlRelatedReviews")));
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.wait2Seconds();
//		technicalForm.click();
//        technicalFormROW.click();
		try {
			UtilityMethods.acceptAlert();
		}
		catch(Exception e) {

			System.out.println("Alert was not present");

		}
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		/*new WebDriverWait(driver,60)WebResource_rta_htmlTechnicalReview
				.until(ExpectedConditions.visibilityOfElementLocated(By.id("WebResource_rta_htmlRelatedReviews")));
		UtilityMethods.wait2Seconds();
		new WebDriverWait(driver,60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.id("WebResource_rta_htmlTechnicalReview")));
*/
		driver.switchTo().frame(driver.findElement(By.id("WebResource_rta_htmlTechnicalReview")));
		UtilityMethods.wait2Seconds();

		System.out.println("enter values ");
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", selectBoxSubContractor);

		List<WebElement> list = driver.findElements(By.xpath("(//*[@id='ddlAnswer' ])"));
		int count = list.size();

		for(int i=1;i<=count;i++)
		{
			new Select(driver.findElement((By.xpath("(//*[@id='ddlAnswer' ])[ "+i+" ]")))).selectByVisibleText(questionarie);
			UtilityMethods.wait1Seconds();

		}

		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		UtilityMethods.wait2Seconds();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", recommendationSubContractor);

		initialRecommendtaionSubContractor.click();
		UtilityMethods.wait2Seconds();
		new Select(initialrecommendationselectbox2).selectByVisibleText(recommendationValue);
		UtilityMethods.wait2Seconds();

		//internalCommentlabel.click();
		internalCommentlabelSubContractor.click();
		UtilityMethods.evenctvalues(finalCommentsClick, "Testing");

		UtilityMethods.wait2Seconds();
		finalRecommendationSubContractor.click();
		UtilityMethods.evenctvalues(finalRecommendedCategorySubContractor, "A - 10,000");
		//new Select(recommendationSelectBox).selectByVisibleText(recommendationValue);
		UtilityMethods.wait2Seconds();

		holdOfComment.click();
		new Select(onHoldOf).selectByVisibleText("Final Signing");

//		initialRecommendationcateogory.click();
		UtilityMethods.wait2Seconds();
//		searchImgIcon.click();
//		UtilityMethods.clickElemetJavaSciptExecutor(searchImgIconInitial);
//		UtilityMethods.wait2Seconds();
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", moreRecords);
//		UtilityMethods.clickElemetJavaSciptExecutor(moreRecords);
//		UtilityMethods.scrollToElementAndClick(moreRecords);
//		UtilityMethods.waitForPageLoadAndPageReady();
//		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
//		new WebDriverWait(driver,60)
//				.until(ExpectedConditions.visibilityOfElementLocated(By.id("InlineDialog_Iframe")));
//
//		driver.switchTo().frame(driver.findElement(By.id("InlineDialog_Iframe")));
//		UtilityMethods.wait2Seconds();
//		closePopup.click();
//		UtilityMethods.waitForPageLoadAndPageReady();
//		new WebDriverWait(driver, 60)
//				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
//		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
//		UtilityMethods.wait2Seconds();
//		recommendation.click();
//		new Select(recommendationSelectBox).selectByVisibleText(recommendationValue);
//		UtilityMethods.wait2Seconds();
		//interCommentfinalLabel.click();
		//internalCommentsClick.click();
		//UtilityMethods.evenctvalues(internalComments, "Technical Review ROW");
//
		UtilityMethods.wait1Seconds();

//		finalRecommendation.click();
//		UtilityMethods.clickElemetJavaSciptExecutor(searchImgIcon);
//		UtilityMethods.scrollToElementAndClick(moreRecords);
//		UtilityMethods.waitForPageLoadAndPageReady();
//		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
//		new WebDriverWait(driver,60)
//				.until(ExpectedConditions.visibilityOfElementLocated(By.id("InlineDialog_Iframe")));
//
//		driver.switchTo().frame(driver.findElement(By.id("InlineDialog_Iframe")));
//		UtilityMethods.wait2Seconds();
//		closePopup.click();
//		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
//		UtilityMethods.clickElemetJavaSciptExecutor(submitButton);
		submitButton.click();
//		Actions action = new Actions(driver);
//		action.moveToElement(submitButton).click().build().perform();
		UtilityMethods.wait2Seconds();

		UtilityMethods.acceptAlert();
	}


	public void ClickASubContractorGreenProcurementReview(String VendorName) throws Throwable{
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.clickElemetJavaSciptExecutor(mainFilter);
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.clickElemetJavaSciptExecutor(selectReviewFilter);
		UtilityMethods.wait2Seconds();
		clickReview.click();
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		new WebDriverWait(driver,60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#InlineDialog_Iframe")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("#InlineDialog_Iframe")));
		System.out.println("Value search in filter");
		searchReview.sendKeys("Green Procurement Review");
		searchButton.click();
		UtilityMethods.waitForPageLoadAndPageReady();

		//new Actions(driver).doubleClick(clickRecord).build().perform();
		clickRecord.click();
		clickRecord.sendKeys(Keys.ENTER);
		System.out.println("AMD1");
		UtilityMethods.wait1Seconds();
		closePopup.click();
		System.out.println("AMD2");
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();



		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));
		Filter(VendorName);

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));
		UtilityMethods.wait2Seconds();
		//new Actions(driver).doubleClick(clickRecord).build().perform();
		clickRecord.click();
		System.out.println("AMD3");
		clickRecord.sendKeys(Keys.ENTER);
		UtilityMethods.wait1Seconds();
	}


	public void ClickASubContractorPQCommitteReview(String VendorName) throws Throwable{
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.clickElemetJavaSciptExecutor(mainFilter);
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.clickElemetJavaSciptExecutor(selectReviewFilter);
		UtilityMethods.wait2Seconds();
		clickReview.click();
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		new WebDriverWait(driver,60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#InlineDialog_Iframe")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("#InlineDialog_Iframe")));
		System.out.println("Value search in filter");
		searchReview.sendKeys("PQ Committee Review Sub-Contractor");
		searchButton.click();
		UtilityMethods.waitForPageLoadAndPageReady();

		//new Actions(driver).doubleClick(clickRecord).build().perform();
		clickRecord.click();
		clickRecord.sendKeys(Keys.ENTER);
		System.out.println("AMD1");
		UtilityMethods.wait1Seconds();
		closePopup.click();
		System.out.println("AMD2");
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();



		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));
		Filter(VendorName);

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));
		UtilityMethods.wait2Seconds();
		//new Actions(driver).doubleClick(clickRecord).build().perform();
		clickRecord.click();
		System.out.println("AMD3");
		clickRecord.sendKeys(Keys.ENTER);
		UtilityMethods.wait1Seconds();
	}


	public void CompleteGreenProcurementReviewSubcontractor(String questionarie,String recommendationValue) throws Throwable{
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		UtilityMethods.wait2Seconds();
		new WebDriverWait(driver,60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.id("WebResource_rta_htmlRelatedReviews")));
		UtilityMethods.wait3Seconds();
		driver.switchTo().frame(driver.findElement(By.id("WebResource_rta_htmlRelatedReviews")));
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.wait2Seconds();
//		technicalForm.click();
//        technicalFormROW.click();
		try {
			UtilityMethods.acceptAlert();
		}
		catch(Exception e) {

			System.out.println("Alert was not present");

		}
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		/*new WebDriverWait(driver,60)WebResource_rta_htmlTechnicalReview
				.until(ExpectedConditions.visibilityOfElementLocated(By.id("WebResource_rta_htmlRelatedReviews")));
		UtilityMethods.wait2Seconds();
		new WebDriverWait(driver,60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.id("WebResource_rta_htmlTechnicalReview")));
*/
		driver.switchTo().frame(driver.findElement(By.id("WebResource_rta_htmlGreenProcurementReview")));
		UtilityMethods.wait2Seconds();

		System.out.println("enter values ");
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", selectBoxSubContractor);

		List<WebElement> list = driver.findElements(By.xpath("(//*[@id='ddlAnswer' ])"));
		int count = list.size();

		for(int i=1;i<=count;i++)
		{
			new Select(driver.findElement((By.xpath("(//*[@id='ddlAnswer' ])[ "+i+" ]")))).selectByVisibleText(questionarie);
			UtilityMethods.wait1Seconds();

		}

		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		UtilityMethods.wait2Seconds();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", recommendationSubContractor);

		initialRecommendtaionSubContractor.click();
		UtilityMethods.wait2Seconds();
		new Select(initialrecommendationselectbox2).selectByVisibleText(recommendationValue);
		UtilityMethods.wait2Seconds();

		//internalCommentlabel.click();
		internalCommentlabelSubContractor.click();
		UtilityMethods.evenctvalues(finalCommentsClick, "Testing");

		UtilityMethods.wait2Seconds();
		//finalRecommendationSubContractor.click();
		//UtilityMethods.evenctvalues(finalRecommendedCategorySubContractor, "A - 10,000");
		//new Select(recommendationSelectBox).selectByVisibleText(recommendationValue);
		UtilityMethods.wait2Seconds();

		//holdOfComment.click();
		//new Select(onHoldOf).selectByVisibleText("Final Signing");

//		initialRecommendationcateogory.click();
		UtilityMethods.wait2Seconds();
		UtilityMethods.wait1Seconds();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
//		UtilityMethods.clickElemetJavaSciptExecutor(submitButton);
		submitButton.click();
		UtilityMethods.wait2Seconds();
		UtilityMethods.acceptAlert();
	}

	public void CompletePQCommitteReviewSubcontractor(String questionarie,String recommendationValue) throws Throwable{

		/*UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		UtilityMethods.wait2Seconds();
		new WebDriverWait(driver,60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.id("WebResource_rta_htmlRelatedReviews")));
		UtilityMethods.wait3Seconds();
		driver.switchTo().frame(driver.findElement(By.id("WebResource_rta_htmlRelatedReviews")));
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.wait2Seconds();
//		technicalForm.click();
//        technicalFormROW.click();
		try {
			UtilityMethods.acceptAlert();
		}
		catch(Exception e) {

			System.out.println("Alert was not present");

		}
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		*//*new WebDriverWait(driver,60)WebResource_rta_htmlTechnicalReview
				.until(ExpectedConditions.visibilityOfElementLocated(By.id("WebResource_rta_htmlRelatedReviews")));
		UtilityMethods.wait2Seconds();
		new WebDriverWait(driver,60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.id("WebResource_rta_htmlTechnicalReview")));
*//*
		driver.switchTo().frame(driver.findElement(By.id("WebResource_rta_htmlGreenProcurementReview")));
		UtilityMethods.wait2Seconds();

		System.out.println("enter values ");
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", selectBoxSubContractor);

		List<WebElement> list = driver.findElements(By.xpath("(//*[@id='ddlAnswer' ])"));
		int count = list.size();

		for(int i=1;i<=count;i++)
		{
			new Select(driver.findElement((By.xpath("(//*[@id='ddlAnswer' ])[ "+i+" ]")))).selectByVisibleText(questionarie);
			UtilityMethods.wait1Seconds();

		}

		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		UtilityMethods.wait2Seconds();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", recommendationSubContractor);

		initialRecommendtaionSubContractor.click();
		UtilityMethods.wait2Seconds();
		new Select(initialrecommendationselectbox2).selectByVisibleText(recommendationValue);
		UtilityMethods.wait2Seconds();

		//internalCommentlabel.click();
		internalCommentlabelSubContractor.click();
		UtilityMethods.evenctvalues(finalCommentsClick, "Testing");

		UtilityMethods.wait2Seconds();
		//finalRecommendationSubContractor.click();
		//UtilityMethods.evenctvalues(finalRecommendedCategorySubContractor, "A - 10,000");
		//new Select(recommendationSelectBox).selectByVisibleText(recommendationValue);
		UtilityMethods.wait2Seconds();

		//holdOfComment.click();
		//new Select(onHoldOf).selectByVisibleText("Final Signing");

//		initialRecommendationcateogory.click();
		UtilityMethods.wait2Seconds();
//		searchImgIcon.click();
//		UtilityMethods.clickElemetJavaSciptExecutor(searchImgIconInitial);
//		UtilityMethods.wait2Seconds();
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", moreRecords);
//		UtilityMethods.clickElemetJavaSciptExecutor(moreRecords);
//		UtilityMethods.scrollToElementAndClick(moreRecords);
//		UtilityMethods.waitForPageLoadAndPageReady();
//		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
//		new WebDriverWait(driver,60)
//				.until(ExpectedConditions.visibilityOfElementLocated(By.id("InlineDialog_Iframe")));
//
//		driver.switchTo().frame(driver.findElement(By.id("InlineDialog_Iframe")));
//		UtilityMethods.wait2Seconds();
//		closePopup.click();
//		UtilityMethods.waitForPageLoadAndPageReady();
//		new WebDriverWait(driver, 60)
//				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
//		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
//		UtilityMethods.wait2Seconds();
//		recommendation.click();
//		new Select(recommendationSelectBox).selectByVisibleText(recommendationValue);
//		UtilityMethods.wait2Seconds();
		//interCommentfinalLabel.click();
		//internalCommentsClick.click();
		//UtilityMethods.evenctvalues(internalComments, "Technical Review ROW");
//
		UtilityMethods.wait1Seconds();

//		finalRecommendation.click();
//		UtilityMethods.clickElemetJavaSciptExecutor(searchImgIcon);
//		UtilityMethods.scrollToElementAndClick(moreRecords);
//		UtilityMethods.waitForPageLoadAndPageReady();
//		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
//		new WebDriverWait(driver,60)
//				.until(ExpectedConditions.visibilityOfElementLocated(By.id("InlineDialog_Iframe")));
//
//		driver.switchTo().frame(driver.findElement(By.id("InlineDialog_Iframe")));
//		UtilityMethods.wait2Seconds();
//		closePopup.click();*/
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.wait4Seconds();
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		UtilityMethods.wait10Seconds();
		UtilityMethods.wait10Seconds();
    	//UtilityMethods.clickElemetJavaSciptExecutor(submitButton);
		submitButton.click();
		UtilityMethods.wait2Seconds();
		UtilityMethods.acceptAlert();
	}
	//////////////////////////////////////////////////

	public void NavigateToROWPQEngineer() throws Throwable{
		UtilityMethods.waitForPageLoadAndPageReady();
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));
		UtilityMethods.wait2Seconds();
		openList.click();
		UtilityMethods.wait2Seconds();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", RowpqEngineer);
		RowpqEngineer.click();
	}

	public void CompleteROWPQEngineerReview(String questionarieValue, String recommendationValue) throws Throwable{

		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		UtilityMethods.wait2Seconds();
		new WebDriverWait(driver,60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.id("WebResource_rta_htmlRelatedReviews")));
		driver.switchTo().frame(driver.findElement(By.id("WebResource_rta_htmlRelatedReviews")));
		UtilityMethods.wait3Seconds();
		UtilityMethods.wait3Seconds();
		UtilityMethods.wait2Seconds();
		//completnessFormROW.click();
		try {
			UtilityMethods.acceptAlert();
		}
		catch(Exception e) {

			System.out.println("Alert was not present");

		}
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		new WebDriverWait(driver,60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.id("WebResource_rta_htmlRelatedReviews")));
		UtilityMethods.wait10Seconds();
		new WebDriverWait(driver,60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.id("WebResource_rta_htmlCompletenessReview")));

		driver.switchTo().frame(driver.findElement(By.id("WebResource_rta_htmlCompletenessReview")));
		UtilityMethods.wait20Seconds();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", selectBox4);

		List<WebElement> list = driver.findElements(By.xpath("(//*[@id='ddlAnswer' ])"));
		int count = list.size();

		for(int i=1;i<=count;i++)
		{
			new Select(driver.findElement((By.xpath("(//*[@id='ddlAnswer' ])[ "+i+" ]")))).selectByVisibleText(questionarieValue);

		}

		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		UtilityMethods.wait10Seconds();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", recommendation);

		clickEngineer.click();
		recommendation.click();
		new Select(recommendationSelectBox).selectByVisibleText(recommendationValue);
		UtilityMethods.wait10Seconds();
		internalCommentsClick.click();
		UtilityMethods.evenctvalues(internalComments, "Testing");
		if(recommendationValue.equals("Reject")){
			UtilityMethods.wait10Seconds();
			commentsexternalClick.click();
			UtilityMethods.evenctvalues(new_commentsexternal_i, "Reject Review Case");
			UtilityMethods.wait2Seconds();
			new_finalrejectionreasonClick.click();
			new Select(new_finalrejectionreason).selectByVisibleText("Missing documents");
			UtilityMethods.wait2Seconds();
		}

		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		submitButton.click();
		UtilityMethods.acceptAlert();
		UtilityMethods.wait2Seconds();
		UtilityMethods.waitForPageLoadAndPageReady();
		try {
			(new WebDriverWait(driver, 20))
					.until(ExpectedConditions.textToBe(By.xpath("//span[contains(text(),'Review has been submitted successfully')]"), "Review has been submitted successfully"));

			System.out.println("Element clicked");
			new Actions(driver).moveToElement(recordSubmitted).click().build().perform();
		}
		catch(TimeoutException e)
		{
			if(driver.findElements(By.id("InlineDialog_Iframe")).size()!=0){
				new WebDriverWait(driver,30)
						.until(ExpectedConditions.visibilityOfElementLocated(By.id("InlineDialog_Iframe")));
				driver.switchTo().frame(driver.findElement(By.id("InlineDialog_Iframe")));
				new Actions(driver).moveToElement(closePopup).doubleClick().build().perform();
			}
		}
	}

	public void NavigateToROWDepartmentCoordinator(){

		UtilityMethods.waitForPageLoadAndPageReady();
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));
		openList.click();
		if(openList.getText().equals(ROWdepartmentCoordinator)){
			ROWdepartmentCoordinator.click();
		}
		else {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ROWdepartmentCoordinator);
			ROWdepartmentCoordinator.click();
		}
	}

	public void ClickAROWDepartmentCoordinatorReview(String VendorName) throws Throwable{
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.clickElemetJavaSciptExecutor(mainFilter);
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.clickElemetJavaSciptExecutor(selectReviewFilter);
		UtilityMethods.wait2Seconds();
		clickReview.click();
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		new WebDriverWait(driver,60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#InlineDialog_Iframe")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("#InlineDialog_Iframe")));

		searchReview.sendKeys("Technical Review ROW");
		searchButton.click();
		UtilityMethods.waitForPageLoadAndPageReady();

		//new Actions(driver).doubleClick(clickRecord).build().perform();
		clickRecord.click();
		clickRecord.sendKeys(Keys.ENTER);
		System.out.println("AMD1");
		UtilityMethods.wait1Seconds();
		closePopup.click();
		System.out.println("AMD2");
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();



		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));
		Filter(VendorName);

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));
		UtilityMethods.wait2Seconds();
		//new Actions(driver).doubleClick(clickRecord).build().perform();
		clickRecord.click();
		System.out.println("AMD3");
		clickRecord.sendKeys(Keys.ENTER);
		UtilityMethods.wait1Seconds();
	}

	public void CompleteROWDepartmentReview(String questionarie,String recommendationValue) throws Throwable{
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		UtilityMethods.wait2Seconds();
		new WebDriverWait(driver,60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.id("WebResource_rta_htmlRelatedReviews")));
		UtilityMethods.wait3Seconds();
		driver.switchTo().frame(driver.findElement(By.id("WebResource_rta_htmlRelatedReviews")));
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.wait2Seconds();
//		technicalForm.click();
//        technicalFormROW.click();
		try {
			UtilityMethods.acceptAlert();
		}
		catch(Exception e) {

			System.out.println("Alert was not present");

		}
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		new WebDriverWait(driver,60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.id("WebResource_rta_htmlRelatedReviews")));
		UtilityMethods.wait2Seconds();
		new WebDriverWait(driver,60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.id("WebResource_rta_htmlTechnicalReview")));

		driver.switchTo().frame(driver.findElement(By.id("WebResource_rta_htmlTechnicalReview")));
		UtilityMethods.wait2Seconds();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", selectBox4);

		List<WebElement> list = driver.findElements(By.xpath("(//*[@id='ddlAnswer' ])"));
		int count = list.size();

		for(int i=1;i<=count;i++)
		{
			new Select(driver.findElement((By.xpath("(//*[@id='ddlAnswer' ])[ "+i+" ]")))).selectByVisibleText(questionarie);
			UtilityMethods.wait1Seconds();

		}

		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		UtilityMethods.wait2Seconds();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", recommendation);

		initialRecommendtaion.click();
		new Select(initialrecommendationSelectBox).selectByVisibleText(recommendationValue);
		UtilityMethods.wait2Seconds();
		internalCommentlabel.click();
		intialInternalCommentsClick.click();
		UtilityMethods.evenctvalues(intialInternalComments, "Testing");

		UtilityMethods.wait2Seconds();
		recommendation.click();
		new Select(recommendationSelectBox).selectByVisibleText(recommendationValue);
		UtilityMethods.wait1Seconds();
		UtilityMethods.wait2Seconds();
//		initialRecommendationcateogory.click();
		UtilityMethods.wait2Seconds();
//		searchImgIcon.click();
//		UtilityMethods.clickElemetJavaSciptExecutor(searchImgIconInitial);
//		UtilityMethods.wait2Seconds();
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", moreRecords);
//		UtilityMethods.clickElemetJavaSciptExecutor(moreRecords);
//		UtilityMethods.scrollToElementAndClick(moreRecords);
//		UtilityMethods.waitForPageLoadAndPageReady();
//		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
//		new WebDriverWait(driver,60)
//				.until(ExpectedConditions.visibilityOfElementLocated(By.id("InlineDialog_Iframe")));
//
//		driver.switchTo().frame(driver.findElement(By.id("InlineDialog_Iframe")));
//		UtilityMethods.wait2Seconds();
//		closePopup.click();
//		UtilityMethods.waitForPageLoadAndPageReady();
//		new WebDriverWait(driver, 60)
//				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
//		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
//		UtilityMethods.wait2Seconds();
//		recommendation.click();
//		new Select(recommendationSelectBox).selectByVisibleText(recommendationValue);
//		UtilityMethods.wait2Seconds();
		interCommentfinalLabel.click();
		internalCommentsClick.click();
		UtilityMethods.evenctvalues(internalComments, "Technical Review ROW");
//
		UtilityMethods.wait1Seconds();

//		finalRecommendation.click();
//		UtilityMethods.clickElemetJavaSciptExecutor(searchImgIcon);
//		UtilityMethods.scrollToElementAndClick(moreRecords);
//		UtilityMethods.waitForPageLoadAndPageReady();
//		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
//		new WebDriverWait(driver,60)
//				.until(ExpectedConditions.visibilityOfElementLocated(By.id("InlineDialog_Iframe")));
//
//		driver.switchTo().frame(driver.findElement(By.id("InlineDialog_Iframe")));
//		UtilityMethods.wait2Seconds();
//		closePopup.click();
//		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
//		UtilityMethods.clickElemetJavaSciptExecutor(submitButton);
		submitButton.click();
//		Actions action = new Actions(driver);
//		action.moveToElement(submitButton).click().build().perform();
		UtilityMethods.wait2Seconds();

		UtilityMethods.acceptAlert();
	}

	public ReviewManagementPage(WebDriver driver) throws Exception {

		PageFactory.initElements(driver, this);
		
	}


}
