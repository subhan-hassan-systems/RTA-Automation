package Test.Automation.Pages;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.security.UserAndPassword;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Test.Automation.Utils.DriverFactory;
import Test.Automation.Utils.PropertyReader;
import Test.Automation.Utils.UtilityMethods;

public class CasesPage extends DriverFactory {

	@FindBy(css = "span.navTabButtonArrowDown")
	public WebElement expandSettingMenu;

	@FindBy(css = "#CS > span.navActionButtonIconContainer > span.navActionButtonIcon")
	public WebElement expandServicesMenu;

	@FindBy(css = "a#nav_cases.nav-rowBody.normal")
	public WebElement clickCaseMenuOption;

	@FindBy(id = "crmGrid_findCriteria")
	public WebElement findCriteria;

	@FindBy(id = "crmGrid_findCriteriaImg")
	public WebElement hitSearch;

	@FindBy(xpath = "//*[@id='gridBodyTable']/tbody/tr/td[3]/nobr")
	public WebElement selectCase;

	@FindBy(css = "a.ms-crm-Menu-Label")
	public WebElement newCase;

	@FindBy(xpath = "//*[@id='GeneralTab_header_h2']")
	public WebElement generalMenuLink;

	@FindBy(xpath = "//h2[contains(text(),'Additional Data')]")
	public WebElement additionalDataMenuLink;

	@FindBy(xpath = "//*[@id='CoordinationTab_header_h2']")
	public WebElement coordinationMenuLink;

	@FindBy(xpath = "//*[@id='CASERELATIONSHIP_TAB_header_h2']")
	public WebElement caseRelationshipsMenuLink;

	@FindBy(xpath = "//*[@id='KBARTICLE_TAB_header_h2']")
	public WebElement articlesMenuLink;

	@FindBy(xpath = "//*[@id='ACTIVITIESANDNOTES_header_h2']")
	public WebElement activitiesMenuLink;

	@FindBy(xpath = "//h3[contains(text(),'Overview')]")
	public WebElement generalOverviewSection;

	@FindBy(xpath = "//h3[contains(text(),'Case Description and Final Resolution')]")
	public WebElement caseDescriptionAndFinalResolution;

	@FindBy(xpath = "//h3[contains(text(),'Related Event')]")
	public WebElement relatedEvent;

	@FindBy(xpath = "//h3[contains(text(),'Information for Internal Use')]")
	public WebElement informationForInternalUse;

	@FindBy(xpath = "//div[@id='description']/div")
	public WebElement selectInformationForInternalUse;

	@FindBy(id = "description_i")
	public WebElement enterDataInformationForInternalUse;

	@FindBy(xpath = "//h3[contains(text(),'Administration')]")
	public WebElement administration;

	@FindBy(xpath = "//h3[contains(text(),'Complex Enquiry')]")
	public WebElement complexEnquiryText;

	@FindBy(id = "new_faqresolutiondescription_i")
	public WebElement verifycomplexEnquiry;

	@FindBy(id = "new_faqresolutiondescription_cl")
	public WebElement labelForComplexEnquiry;

	@FindBy(css = "#new_faqresolutiondescription_cl_span > img")
	public WebElement checkComplexEnquiryField;

	@FindBy(id = "CASERELATIONSHIP_TAB_Expander")
	public WebElement caseRelationShip;

	@FindBy(xpath = "//*[@id='RelatedSolutionGrid_titleText']")
	public WebElement similarCases;

	@FindBy(xpath = "//*[@id='MergedCasesGrid_titleText']")
	public WebElement mergedCases;

	@FindBy(xpath = "//*[@id='ChildCasesGrid_titleText']")
	public WebElement childCases;

	@FindBy(xpath = "//h3[contains(text(),'ARTICLES')]")
	public WebElement articles;

	@FindBy(css = "#header_process_casetypecode > div")
	public WebElement mainCaseType;

	@FindBy(id = "header_process_casetypecode_i")
	public WebElement caseTypeOption;

	@FindBy(xpath = ".//*[@id='new_previoussladate']/span/img")
	public WebElement administrationSlaDateLocker;

	@FindBy(xpath = ".//*[@id='new_previoussladate']/div")
	public WebElement administrationSlaDate;

	@FindBy(xpath = ".//*[@id='new_prebreachingsladate']/span/img")
	public WebElement administrationPreBreachingSlaDateLocker;

	@FindBy(xpath = ".//*[@id='new_prebreachingsladate']/div")
	public WebElement administrationPreBreachingSlaDate;

	@FindBy(xpath = ".//*[@id='modifiedon']/span/img")
	public WebElement administrationModifiedLocker;

	@FindBy(xpath = ".//*[@id='modifiedon']/div")
	public WebElement administrationModified;

	@FindBy(id = "ownerid")
	public WebElement administrationOwner;

	@FindBy(xpath = ".//*[@id='new_resolvedbyid']/span/img")
	public WebElement administrationResolvedByLocker;

	@FindBy(xpath = ".//*[@id='new_resolvedbyid']/div")
	public WebElement administrationResolvedBy;

	@FindBy(xpath = ".//*[@id='new_noofextension']/span/img")
	public WebElement administrationExtensionLocker;

	@FindBy(xpath = ".//*[@id='new_noofextension']/div")
	public WebElement administrationExtension;

	@FindBy(id = "new_queueassignmentid")
	public WebElement administrationQueueAssigment;

	@FindBy(xpath = ".//*[@id='new_escalationlevelapplied']/span/img")
	public WebElement administrationEscalationLevelAppliedLocker;

	@FindBy(xpath = ".//*[@id='new_escalationlevelapplied']/div")
	public WebElement administrationEscalationLevelApplied;

	@FindBy(xpath = ".//*[@id='new_slaresponserate']/span/img")
	public WebElement administrationSlaResponseRateLocker;

	@FindBy(xpath = ".//*[@id='new_slaresponserate']/div")
	public WebElement administrationSlaResponseRate;

	@FindBy(id = "new_sectionnumber")
	public WebElement administrationSectionNumber;

	@FindBy(id = "new_currentqueue")
	public WebElement administrationCurrentQueue;

	@FindBy(xpath = ".//*[@id='createdon']/span/img")
	public WebElement administrationCreatedOnLocker;

	@FindBy(xpath = ".//*[@id='createdon']/div")
	public WebElement administrationCreatedOn;

	@FindBy(xpath = ".//*[@id='new_originalsladate']/span/img")
	public WebElement administrationOriginalSlaDateLocker;

	@FindBy(xpath = ".//*[@id='new_originalsladate']/div")
	public WebElement administrationOriginalSlaDate;

	@FindBy(xpath = ".//*[@id='followupby']/span/img")
	public WebElement administrationSlaDueDateLocker;

	@FindBy(xpath = ".//*[@id='followupby']/div")
	public WebElement administrationSlaDueDate;

	@FindBy(xpath = ".//*[@id='createdby']/span/img")
	public WebElement administrationCreatedByLocker;

	@FindBy(xpath = ".//*[@id='createdby']/div")
	public WebElement administrationCreatedBy;

	@FindBy(xpath = ".//*[@id='modifiedby']/span/img")
	public WebElement administrationModifiedByLocker;

	@FindBy(xpath = ".//*[@id='modifiedby']/div")
	public WebElement administrationModifiedBy;

	@FindBy(xpath = ".//*[@id='new_totalextensionduration']/span/img")
	public WebElement administrationTotalExtensionDurationLocker;

	@FindBy(xpath = ".//*[@id='new_totalextensionduration']/div")
	public WebElement administrationTotalExtensionDuration;

	@FindBy(xpath = ".//*[@id='new_totaloriginalslaworkinghours']/span/img")
	public WebElement administrationOriginalSlaWorkingHoursLocker;

	@FindBy(xpath = ".//*[@id='new_totaloriginalslaworkinghours']/div")
	public WebElement administrationOriginalSlaWorkingHours;

	@FindBy(css = ".ms-crm-Inline-Value.ms-crm-Inline-EmptyValue.ms-crm-Inline-Lookup.ms-crm-Inline-EditHintState")
	public WebElement customerLookUpDataTypeByCss;

	@FindBy(css = "#customerid > div")
	public WebElement customerField;

	@FindBy(css = "#customerid_ledit.ms-crm-InlineInput.ms-crm-InlineLookupEdit")
	public WebElement verifyCustomerDatatype;

	String[] language = { null, "Arabic", "English", "Urdu" };
	@FindBy(css = "#new_preferdlanguage_i.ms-crm-SelectBox.ms-crm-Inline-OptionSet-AutoOpen")
	public WebElement verifyPreferedLanguage;

	@FindBy(css = "#subjectid_lookupDiv.ms-crm-Lookup.ms-crm-InlineLookupEdit")
	public WebElement verifySubjectDataType;


	@FindBy(css = "#casetypecode > div")
	public WebElement caseTypeField;

	@FindBy(css = "select#header_process_casetypecode_i.ms-crm-SelectBox.ms-crm-Inline-OptionSet-AutoOpen")
	public WebElement mainCaseTypeSelectBox;

	@FindBy(css = "#casetypecode_i.ms-crm-SelectBox.ms-crm-Inline-OptionSet-AutoOpen")
	public WebElement verifyCaseTypeField;

	@FindBy(css = "#prioritycode_i.ms-crm-SelectBox.ms-crm-Inline-OptionSet-AutoOpen")
	public WebElement verifyPriorityCode;

	@FindBy(css = "#caseorigincode_i.ms-crm-SelectBox.ms-crm-Inline-OptionSet-AutoOpen")
	public WebElement verifyCaseOriginCode;

	@FindBy(id = "new_callbacktime_i")
	public WebElement verfiyCallBackTime;

	@FindBy(css = "#rta_sendresolutionsmsemail > div > span")
	public WebElement sendResolution;

	@FindBy(id = "rta_customerfeedbackcomments")
	public WebElement customerFeedBack;

	@FindBy(id = "rta_customerfeedbackcomments_i")
	public WebElement verifyCustomerFeedBackField;

	@FindBy(css = "#new_casereason > div")
	public WebElement caseReasonField;

	@FindBy(css = "#new_casereason_ledit.ms-crm-InlineInput.ms-crm-InlineLookupEdit")
	public WebElement verifyCaseReasonField;

	@FindBy(css = "#parentcaseid_ledit.ms-crm-InlineInput.ms-crm-InlineLookupEdit")
	public WebElement verifyParentCaseField;

	String[] exp = { "Yes", "No" };
	@FindBy(css = "#rta_casebelongs_i.ms-crm-SelectBox.ms-crm-Inline-OptionSet-AutoOpen")
	public WebElement caseBelongsOptions;

	@FindBy(css = "#new_regardingcaseid > div")
	public WebElement regardingCaseField;

	@FindBy(css = "#new_regardingcaseid_ledit.ms-crm-InlineInput.ms-crm-InlineLookupEdit")
	public WebElement verifyRegardingCase;

	@FindBy(css = "#new_other > div.ms-crm-Inline-Value.ms-crm-Inline-EmptyValue")
	public WebElement caseDescription;
	
	@FindBy(id = "new_other")
	public WebElement clickCaseDescription;

	@FindBy(id = "new_other_i")
	public WebElement verifyCaseDescription;

	@FindBy(css = "#new_relatedeventid > div")
	public WebElement relatedEventField;

	@FindBy(css = "#new_relatedeventid_ledit.ms-crm-InlineInput.ms-crm-InlineLookupEdit")
	public WebElement verifyRelatedEvent;

	@FindBy(css = "#new_resolution > div.ms-crm-Inline-Value.ms-crm-Inline-EmptyValue.ms-crm-Inline-Locked")
	public WebElement verifyFinalResolution;

	@FindBy(css = "#description > div.ms-crm-Inline-Value.ms-crm-Inline-EmptyValue")
	public WebElement InfoForInternalUse;

	@FindBy(id = "description_i")
	public WebElement verifyInfoForInternalUseField;

	@FindBy(xpath = "//*[@id='incident|NoRelationship|Form|Mscrm.Form.incident.Save']/span/a/span")
	public WebElement saveButtonOnNewCaseForm;

	@FindBy(xpath = "//*[@id='customerid_requiredImage']")
	public WebElement customer;

	@FindBy(xpath = "//*[@id='subjectid_requiredImage']")
	public WebElement subject;

	@FindBy(xpath = "//*[@id='casetypecode_requiredImage']")
	public WebElement caseType;

	@FindBy(xpath = "//*[@id='caseorigincode_requiredImage']")
	public WebElement origin;

	@FindBy(xpath = "//*[@id='statecode_requiredImage']")
	public WebElement status;

	@FindBy(xpath = "//*[@id='new_preferdlanguage_requiredImage']")
	public WebElement preferredLanguage;

	@FindBy(xpath = "//*[@id='new_agencyid_requiredImage']")
	public WebElement RelatedAgency;

	@FindBy(xpath = "//div[@id='header_process_casetypecode']/div/span")
	public WebElement clickCaseTypeField;

	@FindBy(xpath = "//*[@id='caseorigincode']/div[1]")
	public WebElement expandOriginOptionSet;

	@FindBy(xpath = "//*[@id='incident|NoRelationship|Form|Mscrm.Form.incident.Save']/span/a/span")
	public WebElement SaveButton;

	@FindBy(id = "new_other_i")
	public WebElement caseDescriptionTitle;

	@FindBy(xpath = "//div[@id='new_other']/div/span")
	public WebElement selectDescriptionTitle;

	@FindBy(xpath = "//div[@id='header_statuscode']/div/span")
	public WebElement statusReason;

	@FindBy(css = "label.TreeItem")
	public WebElement selectCaseSubject;

	@FindBy(id = "butBegin")
	public WebElement casesubject;

	@FindBy(css = "div.ms-crm-Inline-Value.ms-crm-Inline-EmptyValue.ms-crm-Inline-Lookup")
	public WebElement selectCustomerField;

	@FindBy(id = "header_process_customerid_i")
	public WebElement expandCustomerField;

	@FindBy(xpath = "//li[@id='item1']/a[2]/span/nobr/div/div[3]")
	public WebElement SelectCustomer;

	@FindBy(xpath = "//div[@id='header_process_subjectid']/div")
	public WebElement moveToCaseSubject;

	@FindBy(id = "header_process_subjectid_i")
	public WebElement expandCaseSubject;

	@FindBy(xpath = "//*[@id='prioritycode']/div")
	public WebElement priority;

	@FindBy(xpath = "//*[@id='prioritycode_i']/option[")
	public WebElement priorityCodeI;

	@FindBy(xpath = "//*[@id='new_callbacktime']/div[1]")
	public WebElement callBackTime;

	@FindBy(xpath = "//*[@id='rta_sendresolutionsmsemail']/div")
	public WebElement sendResolutionSmsEmail;

	@FindBy(xpath = "//*[@id='rta_customerfeedbackcomments']/div[1]/span")
	public WebElement customerFeedBackComments;

	@FindBy(xpath = "//*[@id='new_casereason']/div")
	public WebElement caseReason;

	@FindBy(xpath = "//*[@id='parentcaseid']/div")
	public WebElement parentCase;

	@FindBy(xpath = "//*[@id='rta_casebelongs']/div")
	public WebElement caseBelongs;

	@FindBy(xpath = "//*[@id='new_regardingcaseid']/div")
	public WebElement regardingCase;

	@FindBy(xpath = "//*[@id='new_resolution']/div[1]")
	public WebElement finalResolution;

	@FindBy(xpath = "//*[@id='new_sectionnumber']/div")
	public WebElement sectionNumber;

	@FindBy(xpath = "//*[@id='new_currentqueue']/div")
	public WebElement currentQueue;

	@FindBy(xpath = "//*[@id='new_subjectlevel1']/span/img")
	public WebElement subjectCategory;

	@FindBy(xpath = "//*[@id='new_subjectlevel2']/span/img")
	public WebElement subjectSubCategory;

	@FindBy(xpath = "//*[@id='statuscode']/span/img")
	public WebElement StatusReasonlockedField;

	@FindBy(xpath = "//*[@id='new_agencyid']/span/img")
	public WebElement relatedAgency;

	@FindBy(xpath = "//*[@id='new_departmentid']/span/img")
	public WebElement relatedDepartment;

	@FindBy(xpath = "//*[@id='new_contactsmobile']/span")
	public WebElement contactsMobile;

	@FindBy(xpath = "//*[@id='customersatisfactioncode']/span/img")
	public WebElement satisfaction;

	@FindBy(xpath = "//*[@id='new_customernickname']/span/img")
	public WebElement customerNickName;

	@FindBy(xpath = "//*[@id='new_casecategory']/span/img")
	public WebElement caseCategory;

	@FindBy(xpath = "//*[@id='new_previoussladate']/span/img")
	public WebElement PreviousSLADuedate;

	@FindBy(xpath = "//*[@id='new_prebreachingsladate']/span/img")
	public WebElement prebreachingSLADueDate;

	@FindBy(xpath = "//*[@id='modifiedon']/span/img")
	public WebElement modifiedOn;

	@FindBy(xpath = "//*[@id='new_resolvedbyid']/span/img")
	public WebElement resolvedBy;

	@FindBy(xpath = "//*[@id='new_noofextension']/span/img")
	public WebElement numberOfExtension;

	@FindBy(xpath = "//*[@id='new_escalationlevelapplied']/span/img")
	public WebElement escalationLevelApplied;

	@FindBy(xpath = "//*[@id='new_slaresponserate']/span/img")
	public WebElement slaResponseRate;

	@FindBy(xpath = "//*[@id='createdon']/span/img")
	public WebElement createdOn;

	@FindBy(xpath = "//*[@id='new_originalsladate']/span/img")
	public WebElement originalSlaDate;

	@FindBy(xpath = "//*[@id='followupby']/span/img")
	public WebElement slaDueDate;

	@FindBy(xpath = "//*[@id='createdby']/span/img")
	public WebElement createdBy;

	@FindBy(xpath = "//*[@id='modifiedby']/span/img")
	public WebElement modifiedBy;

	@FindBy(xpath = "//*[@id='new_totalextensionduration']/span/img")
	public WebElement totalExtensionDurationInHours;

	@FindBy(xpath = "//*[@id='new_totaloriginalslaworkinghours']/span/img")
	public WebElement totalOriginalSLAWorkingHours;

	@FindBy(xpath = "//*[@id='header_process_casetypecode_i']/option[2]")
	public WebElement compliment;

	@FindBy(xpath = "//h3[contains(text(),'Compliment')]")
	public WebElement complimentSection;

	@FindBy(xpath = "//h3[contains(text(),'Compliment Details')]")
	public WebElement ComplimentDetailsSection;

	@FindBy(xpath = "//*[@id='header_process_casetypecode_i']/option[3]")
	public WebElement complexEnquiry;

	@FindBy(xpath = "//*[@id='header_process_casetypecode_i']/option[4]")
	public WebElement suggestion;

	@FindBy(xpath = "//*[@id='header_process_casetypecode_i']/option[5]")
	public WebElement notification;

	@FindBy(xpath = "//*[@id='header_process_casetypecode_i']/option[6]")
	public WebElement complaint;

	@FindBy(xpath = "//*[@id='header_process_casetypecode_i']/option[7]")
	public WebElement lostItem;

	@FindBy(xpath = "//*[@id='header_process_casetypecode_i']/option[8]")
	public WebElement request;

	@FindBy(xpath = "//*[@id='header_process_casetypecode_i']/option[9]")
	public WebElement emergency;

	@FindBy(xpath = "//*[@id='header_process_casetypecode_i']/option[10]")
	public WebElement fineObjection;

	@FindBy(xpath = "//*[@id='header_process_casetypecode_i']/option[11]")
	public WebElement grievance;

	@FindBy(xpath = "//*[@id='header_process_casetypecode_i']/option[12]")
	public WebElement mBRIdea;

	@FindBy(xpath = "//*[@id='header_process_casetypecode_i']/option[13]")
	public WebElement mBRComment;

	@FindBy(xpath = "//*[@id='prioritycode_i']/option[1]")
	public WebElement medium;
	@FindBy(xpath = "//*[@id='prioritycode_i']/option[2]")
	public WebElement normal;
	@FindBy(xpath = "//*[@id='prioritycode_i']/option[3]")
	public WebElement high;
	@FindBy(xpath = "//*[@id='prioritycode_i']/option[4]")
	public WebElement urgent;
	@FindBy(xpath = "//*[@id='prioritycode_i']/option[5]")
	public WebElement sensitive;

	@FindBy(xpath = "//*[@id='caseorigincode_i']/option[1]")
	public WebElement brainStormingSession;

	@FindBy(xpath = "//*[@id='caseorigincode_i']/option[2]")
	public WebElement customerSuggestionsCommitte;

	@FindBy(xpath = "//*[@id='caseorigincode_i']/option[3]")
	public WebElement customersCouncil;

	@FindBy(xpath = "//*[@id='caseorigincode_i']/option[4]")
	public WebElement facebook;

	@FindBy(xpath = "//*[@id='caseorigincode_i']/option[5]")
	public WebElement customerWeek;

	@FindBy(xpath = "//*[@id='caseorigincode_i']/option[6]")
	public WebElement twitter;

	@FindBy(xpath = "//*[@id='caseorigincode_i']/option[7]")
	public WebElement metroKiosk;

	@FindBy(xpath = "//*[@id='caseorigincode_i']/option[8]")
	public WebElement smartPhoneApplication;

	@FindBy(xpath = "//*[@id='caseorigincode_i']/option[9]")
	public WebElement phone;

	@FindBy(xpath = "//*[@id='caseorigincode_i']/option[10]")
	public WebElement email;

	@FindBy(xpath = "//*[@id='caseorigincode_i']/option[11]")
	public WebElement chat;

	@FindBy(xpath = "//*[@id='caseorigincode_i']/option[12]")
	public WebElement eCC;

	@FindBy(xpath = "//*[@id='caseorigincode_i']/option[13]")
	public WebElement informationDesk;

	@FindBy(xpath = "//*[@id='caseorigincode_i']/option[14]")
	public WebElement letter;

	@FindBy(xpath = "//*[@id='caseorigincode_i']/option[15]")
	public WebElement fax;

	@FindBy(xpath = "//*[@id='caseorigincode_i']/option[16]")
	public WebElement rTAStaff;

	@FindBy(xpath = "//*[@id='caseorigincode_i']/option[17]")
	public WebElement media;

	@FindBy(xpath = "//*[@id='caseorigincode_i']/option[18]")
	public WebElement madinatiMobileApp;

	@FindBy(xpath = "//*[@id='caseorigincode_i']/option[19]")
	public WebElement internet;

	@FindBy(xpath = "//*[@id='caseorigincode_i']/option[20]")
	public WebElement rTAFacebookApplication;

	@FindBy(xpath = "//*[@id='caseorigincode_i']/option[21]")
	public WebElement socialMedia;

	@FindBy(xpath = "//*[@id='caseorigincode_i']/option[22]")
	public WebElement mobileApplication_ReportProblem;

	@FindBy(xpath = "//*[@id='caseorigincode_i']/option[23]")
	public WebElement mobileApplication_SendFeedback;

	@FindBy(xpath = "//*[@id='caseorigincode_i']/option[24]")
	public WebElement chairmanOffice;

	@FindBy(xpath = "//*[@id='caseorigincode_i']/option[25]")
	public WebElement cEOOffice;

	@FindBy(xpath = "//*[@id='caseorigincode_i']/option[26]")
	public WebElement cSDirector;

	@FindBy(xpath = "//*[@id='caseorigincode_i']/option[27]")
	public WebElement mBR;

	@FindBy(xpath = "//*[@id='caseorigincode_i']/option[28]")
	public WebElement cSDBoxes;

	@FindBy(xpath = "//*[@id='caseorigincode_i']/option[29]")
	public WebElement sHailMobileApp;

	@FindBy(xpath = "//*[@id='caseorigincode_i']/option[30]")
	public WebElement innovationLabs2015;

	@FindBy(xpath = "//*[@id='caseorigincode_i']/option[31]")
	public WebElement innovationLabs2016;

	@FindBy(xpath = "//*[@id='caseorigincode_i']/option[32]")
	public WebElement innovationRace2016;

	@FindBy(xpath = "//*[@id='rta_sendresolutionsmsemail']/div[1]/span")
	public WebElement sendResolutionField;

	@FindBy(xpath = "//*[@id='header_statuscode']/span/img")
	public WebElement statusCode;

	@FindBy(xpath = "//*[@id='header_ticketnumber']/span[1]/img")
	public WebElement ticketNumber;

	@FindBy(xpath = "//*[@id='new_complimentreason_cl_span']/img")
	public WebElement complimentReasonMandatoryValidation;

	@FindBy(xpath = "//*[@id='new_complimentreason_i']")
	public WebElement complimentReasonOptionSetValidation;

	@FindBy(xpath = "//div[@id='new_complimentreason']/div")
	public WebElement clickComplimentReasonOptionSet;

	@FindBy(xpath = "//*[@id='new_complimentreason_i']")
	public WebElement complimentReasonOptionSet;

	@FindBy(xpath = "//*[@id='new_complimentemployeename']/div[1]")
	public WebElement employeeName;

	@FindBy(xpath = "//*[@id='new_complimentservicelocation_i']")
	public WebElement serviceLoc;

	@FindBy(xpath = "//div[@id='new_complimentservicelocation']/div")
	public WebElement expandserviceLoc;

	@FindBy(xpath = "//*[@id='new_complimentstrategicpartnerid_ledit']")
	public WebElement editStrategicpartner;

	@FindBy(xpath = "//*[@id='new_complimentstrategicpartnerid']/div[1]")
	public WebElement clickStrategicpartner;

	@FindBy(css = ".ms-crm-IL-Menu")
	public WebElement strategicPartner;

	@FindBy(xpath = "//body/div[15]")
	public WebElement closeOptionSet;

	@FindBy(xpath = "//*[@id='new_complimentagencyid_ledit']")
	public WebElement expandAgency;

	@FindBy(xpath = "//*[@id='new_complimentagencyid']/div[1]")
	public WebElement clickAgency;

	@FindBy(xpath = "//*[@id='Dialog_new_complimentagencyid_i_IMenu']/div[1]")
	public WebElement agency;

	@FindBy(xpath = "//*[@id='new_complimentdepartmentid']/div[1]")
	public WebElement department;
	
	@FindBy(id = "new_typeofsuggestion")
	public WebElement suggestionType;
	
	@FindBy(id = "new_typeofsuggestion_i")
	public WebElement suggestionTypeOptions;
	
	@FindBy(id = "new_internalteamcommitteename_i")
	public WebElement internalTeamCommitteeEdit;
	
	@FindBy(id = "new_internalteamcommitteename")
	public WebElement internalTeamCommittee;
	
	@FindBy(xpath = "//h3[contains(text(),'Internal Suggestion Details')]")
	public WebElement verifyInternalSuggestionSection;
	
	@FindBy(id = "new_rtaagencyemployee")
	public WebElement rtaAgnecy;
	
	@FindBy(id = "new_rtaroleid")
	public WebElement rtaRole;
	
	@FindBy(xpath = "//*[@id=\"new_titleofexternalvisit\"]/div[1]")
	public WebElement titleOfExternalVisit;
	
	@FindBy(xpath = "//*[@id=\"new_dateofexternalvisit\"]/div[1]")
	public WebElement dateOfExternalVisit;
	
	@FindBy(id = "new_rtadepartmentemployee")
	public WebElement rtaDepartment;
	
	@FindBy(id = "new_rtadepartmentid_i")
	public WebElement selectRtaDepartment;
	
	@FindBy(id = "new_rtaemployeeid")
	public WebElement rtaEmployeeID;
	
	@FindBy(id = "new_employeerelated")
	public WebElement rtaEmployeeJobRelated;
	
	@FindBy(id = "new_issuggestionrelatedtoexternalvisit2")
	public WebElement isSuggestionRelatedToExternalVisit;
	
	@FindBy(id = "new_incompletecase")
	public WebElement verifyIncompleteLost;
	
	@FindBy(id = "new_itemcategory")
	public WebElement itemCategory;
	
	@FindBy(id = "new_itemcategory_i")
	public WebElement itemCategoryOptionSetValues;
	
	@FindBy(id = "new_itemcolor")
	public WebElement itemColor;
	
	@FindBy(id = "new_itemcolor_i")
	public WebElement itemColorOptionSetValues;
	
	@FindBy(xpath = "//h3[contains(text(),'Lost Item')]")
	public WebElement lostItemSectioin;
	
	@FindBy(css = "select#new_itemcategory_i.ms-crm-SelectBox.ms-crm-Inline-OptionSet-AutoOpen")
	public WebElement verifyItemCategoryField;
	
	@FindBy(css = "select#new_itemcolor_i.ms-crm-SelectBox.ms-crm-Inline-OptionSet-AutoOpen")
	public WebElement verifyItemColorField;
	
	@FindBy(css = "div#new_lostondate.ms-crm-Inline-Chrome.datetime")
	public WebElement verifyDateField;
	
	@FindBy(id = "new_lostondate_iimg")
	public WebElement selectDate;
	
	@FindBy(css = "td.ms-crm-MiniCal-Day.ms-crm-MiniCal-Day-Today.ms-crm-MiniCal-Day-Hilited-Current")
	public WebElement currentDate;
	
	@FindBy(css = "#new_matchingfounditemid_ledit.ms-crm-InlineInput.ms-crm-InlineLookupEdit")
	public WebElement verifyMatchingFoundItemField;
	
	@FindBy(id = "new_itemdescription")
	public WebElement itemDescription;
	
	@FindBy(id = "new_itemdescription_i")
	public WebElement verifyItemDescriptionField;
	
	@FindBy(id = "new_locationfoundid")
	public WebElement verifyLocationLostField;
	
	@FindBy(id = "new_matchingfounditemid")
	public WebElement matchingFound;
	
	@FindBy(css = "img#new_itemcategory_warn.ms-crm-ImageStrip-inlineedit_warning")
	public WebElement CheckItemCategoryFieldValidation;
	
	@FindBy(css = "img#new_itemcolor_warn.ms-crm-ImageStrip-inlineedit_warning")
	public WebElement verifyItemColorFieldValidation;
	
	@FindBy(css = "img#new_lostondate_warn.ms-crm-ImageStrip-inlineedit_warning")
	public WebElement verifyDateFieldValidation;
	
	@FindBy(id = "new_complaintreason")
	public WebElement complaintReasons;
	
	@FindBy(id = "new_complaintreason_i")
	public WebElement complaintReasonOptions;
	
	@FindBy(xpath = "//h3[contains(text(),'Assigned Engineer')]")
	public WebElement assignedEngineerSection;
	
	@FindBy(xpath = "//h3[contains(text(),'Defect Reason')]")
	public WebElement defectReasonSection;
	
	@FindBy(css = "div.ms-crm-Inline-Value.ms-crm-Inline-EmptyValue.ms-crm-Inline-Lookup")
	public WebElement assignEngineer;
	
	@FindBy(xpath = "//*[@id=\"new_defectreason\"]/div[1]")
	public WebElement defectReason;
	
	@FindBy(css = "select#new_defectreason_i.ms-crm-SelectBox.ms-crm-Inline-OptionSet-AutoOpen")
	public WebElement defectReasonOptionSet;
	
	@FindBy(xpath = "//h3[contains(text(),'Complaint')]")
	public WebElement verifyComplaintSection;
	
	@FindBy(id = "new_complaintreason")
	public WebElement complaintReason;
	
	@FindBy(css = "select#new_complaintreason_i.ms-crm-SelectBox.ms-crm-Inline-OptionSet-AutoOpen")
	public WebElement verifyComplaintReason;
	
	@FindBy(css = "input#new_area_ledit.ms-crm-InlineInput.ms-crm-InlineLookupEdit")
	public WebElement verifyAreaField;
	
	@FindBy(id = "new_complainttypepriority")
	public WebElement verifyComplaintPriority;
	
	@FindBy(css = "div#new_community.ms-crm-Inline-Chrome.lookup")
	public WebElement verifyCommunityField;
	
	@FindBy(id = "header_process_customerid")
	public WebElement mainCustomerType;
	
	@FindBy(id = "header_process_customerid_ledit")
	public WebElement mainCustomerTypeEdit;
	
	@FindBy(id = "header_process_customerid_i")
	public WebElement mainCustomerTypeSearchBox;
	
	@FindBy(xpath = "//h3[contains(text(),'Request')]")
	public WebElement sectionRequest;
	
	@FindBy(id = "new_requestreason")
	public WebElement requestReason;
	
	@FindBy(css = "select#new_requestreason_i.ms-crm-SelectBox.ms-crm-Inline-OptionSet-AutoOpen")
	public WebElement requestReasonOptionSet;
	
	@FindBy(css = "span.ms-crm-IL-MenuItem-Title-Lookupmore.ms-crm-IL-MenuItem-Title-Lookupmore-Rest")
	public WebElement lookMoreRecord;
	
	@FindBy(id = "butBegin")
	public WebElement addButton;
	
	@FindBy(id = "selObjects")
	public WebElement selectSearchCriteriaForCustomer;
	
	@FindBy(xpath = "//*[@id=\"TreeContainer\"]/ul/li[1]/span/a/img")
	public WebElement expandAboutRta;
	
	@FindBy(xpath = ".//*[@id='TreeContainer']/ul/li[1]/ul/li[2]/span/label")
	public WebElement selectSubject;
	
	@FindBy(xpath = "//*[@id=\"TreeContainer\"]/ul/li[1]/ul/li[9]/span")
	public WebElement selectComplimentSubject;
	
	@FindBy(xpath = "//*[@id=\"incident|NoRelationship|Form|Mscrm.Form.incident.SaveAndClose\"]/span/a/span")
	public WebElement saveAndCloseButton;
	
	@FindBy(id = "incident|NoRelationship|Form|rta.Mscrm.Form.incident.Save")
	public WebElement saveButton;
	
	@FindBy(xpath = "//*[@id=\"gridBodyTable\"]/tbody/tr[1]/td[3]/nobr")
	public WebElement verifyObject;
	
	@FindBy(css = "img#filterButtonImage.ms-crm-ImageStrip-grid_filter")
	public WebElement filter;
	
	@FindBy(xpath = ".//*[@id='picklistFilterPopupcrmGridincidentcasetypecode']/div/a/div")
	public WebElement caseTypeFilter;
	
	@FindBy(xpath = "//*[@id=\"crmGridincidentcasetypecodeCheck4\"]/a[2]/span/nobr")
	public WebElement selectComplaintFilter;
	
	@FindBy(xpath = "//label[contains(text(),'Suggestion')]")
	public WebElement selectSuggestionFilter;
	
	@FindBy(xpath = "//*[@id=\"crmGridincidentcasetypecodeCheck6\"]/a[2]/span/nobr")
	public WebElement selectRequestFilter;
	
	@FindBy(xpath = "//label[contains(text(),'Emergency')]")
	public WebElement selectEmergencyFilter;
	
	@FindBy(xpath = "//label[contains(text(), 'Lost Item')]")
	public WebElement selectLostItemFilter;
	
	@FindBy(xpath = "//label[contains(text(),'Fine Objection')]")
	public WebElement fineObjectionFilter;
	
	@FindBy(xpath = "//label[contains(text(),'Grievance')]")
	public WebElement grievanceFilter;
	
	@FindBy(xpath = "//label[contains(text(),'MBR Idea')]")
	public WebElement mbrIdeaFilter;
	
	@FindBy(xpath = "//label[contains(text(),'MBR Comment')]")
	public WebElement mbrCommentFilter;
	
	@FindBy(xpath = "//label[contains(text(),'Notification')]")
	public WebElement notificationFilter;
	
	@FindBy(xpath = "//label[contains(text(),'Complex Enquiry')]")
	public WebElement complexEnquiryFilter;
	
	@FindBy(xpath = "//label[contains(text(),'Compliment')]")
	public WebElement complimentFilter;
	
	@FindBy(id = "grid-filter-OkbuttonpicklistFilterPopupcrmGridincidentcasetypecode")
	public WebElement selectOkFilter;
	
	@FindBy(id = "subjectid")
	public WebElement rtaSubject;
	
	@FindBy(id = "subjectid_i")
	public WebElement searchSubject;
	
	@FindBy(id = "header_process_subjectid_i")
	public WebElement headerSerachSubject;
	
	@FindBy(id = "casetypecode")
	public WebElement caseTypeFieldFrame;
	
	@FindBy(id = "casetypecode_i")
	public WebElement caseTypeFieldFrameDropDown;
	
	@FindBy(xpath = "//*[@id=\"incident|NoRelationship|Form|rta.incident.Button8.AssigntoDepartment\"]/span/a/span")
	public WebElement assignToDepartmentButton;
	
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
	
	@FindBy(xpath = "//span[contains(text(),'Assign to Follow Up')]")
	public WebElement assignToFollowUpButton;
	
	@FindBy(xpath = "//*[@id=\"stageAdvanceActionContainer\"]/div/span")
	public WebElement nextStepButton;
	
	@FindBy(id = "header_process_rta_readytoclose")
	public WebElement readyToCloseField;
	
	@FindBy(id = "header_process_rta_readytoclose_i")
	public WebElement readyToCloseOptionSet;
	
	@FindBy(xpath = "//*[@id=\"stageFinishActionContainer\"]/div/span")
	public WebElement finishCaseButton;
	
	@FindBy(css = "img.ms-crm-moreCommand-image")
	public WebElement expandMenuOptions;
	
	@FindBy(css = "img.ms-crm-ImageStrip-ResolveCase_16.ms-crm-commandbar-image16by16")
	public WebElement ResolveCaseButton;
	
	@FindBy(id = "ddl_status")
	public WebElement statusReasonResolveCase;
	
	@FindBy(id = "ddlSatisfaction")
	public WebElement satisfactionResloveCase;
	
	@FindBy(id = "ddlCaseResolve")
	public WebElement caseResolutionDescription;
	
	@FindBy(id = "OK")
	public WebElement okButton;
	
	@FindBy(xpath = "//*[@id='InlineDialog1_Iframe']")
	public WebElement switchToPendingEmailWarningPopup;

	@FindBy(id = "butBegin")
	public WebElement closeEmailWarningPopup;
	
	@FindBy(id = "statecode")
	public WebElement stateCode;
	
	@FindBy(id = "new_complimentagencyid")
	public WebElement complimentAgencyField;
	
	@FindBy(id = "new_complimentagencyid_i")
	public WebElement searchComplimentAgency;
	
	@FindBy(id = "new_complimentdepartmentid")
	public WebElement complimentDepartment;
	
	@FindBy(id = "new_complimentdepartmentid_i")
	public WebElement searchComplimentDepartment;
	
	@FindBy(xpath = "//label[contains(text(),'Getting Around/التنقل في دبي')]")
	public WebElement gettingAround;
	
	@FindBy(xpath = "//label[contains(text(),'Metro/المترو')]")
	public WebElement parentMetro;
	
	@FindBy(xpath = "//label[contains(text(),'Metro Construction Rail Right Of Way/ مترو - المشاريع الإنشائية ضمن حرم القطارات')]")
	public WebElement metroConstruction;
	
	@FindBy(xpath = "//label[contains(text(),'Taxi/سيارة أجرة')]")
	public WebElement taxi;
	
	@FindBy(xpath = "//label[contains(text(),'Airport Taxis/تاكسي المطار')]")
	public WebElement airportTaxi;
	
	@FindBy(xpath = "//label[contains(text(),'Buses/ الحافلات')]")
	public WebElement buses;
	
	@FindBy(xpath = "//label[contains(text(),'AC Bus Shelters/مظلات ركاب الحافلات المكيفة')]")
	public WebElement acBuses;
	
	@FindBy(id = "new_faqresolutiondescription")
	public WebElement complexEnquiryDescription;
	
	@FindBy(id = "new_faqresolutiondescription_i")
	public WebElement editDescription;
	
	@FindBy(xpath = "//label[contains(text(),'Dubai Taxi/تاكسي دبي')]")
	public WebElement dubaiTaxi;
	
	@FindBy(xpath = "//label[contains(text(),'MBR')]")
	public WebElement mbr;
	
	@FindBy(xpath = "//label[contains(text(),'MBR Dubai Taxi CEO/مؤسسة  تاكسي')]")
	public WebElement dubaiTaxiCeo;
	
	@FindBy(xpath = "//label[contains(text(),'Salama  Magazine / مجلة سلامة')]")
	public WebElement salmaMagazine;
	
	@FindBy(xpath = "//label[contains(text(),'Road Users/مستخدمي الطرق')]")
	public WebElement expandRodaUser;
	
	@FindBy(xpath = "//label[contains(text(),'Salik/سالك')]")
	public WebElement expandSalikUser;
	
	@FindBy(xpath = "//label[contains(text(),'Salik Fines/مخالفات سالك')]")
	public WebElement selectSalikFine;
	
	@FindBy(id = "new_objectionfinenumber")
	public WebElement fineNumber;
	
	@FindBy(id = "new_objectionfinenumber_i")
	public WebElement editFineNumber;
	
	@FindBy(id = "new_objectionfineamount_i")
	public WebElement editFineAmount;
	
	@FindBy(id = "new_objectionfinedate_iimg")
	public WebElement fineObjectionDate;
	
	@FindBy(id = "rta_grievancereason")
	public WebElement grievanceReason;
	
	@FindBy(id = "rta_grievancereason_i")
	public WebElement grievanceReasonOptionSet;
	
	@FindBy(id = "new_assignedengineerid")
	public WebElement assignedEngineer;
	
	@FindBy(id = "new_assignedengineerid_i")
	public WebElement searchAssignedEngineer;
	
	@FindBy(id = "crmGrid_SavedQuerySelector")
	public WebElement lookUpAssignedEngineer;
	
	@FindBy(xpath = "//span[contains(text(),'Look Up More Records')]")
	public WebElement moreRecords;
	
	@FindBy(xpath = "(//*[@id=\"mnuDown\"])[3]")
	public WebElement statusTypeFilter;
	
	@FindBy(xpath = "//label[contains(text(),'Active')]")
	public WebElement uncheckActive;
	
	@FindBy(xpath = "//label[contains(text(),'Resolved')]")
	public WebElement resolvedFilter;
	
	@FindBy(id = "grid-filter-OkbuttonpicklistFilterPopupcrmGridincidentstatecode")
	public WebElement statusOkFilter;
	
	@FindBy(xpath = "//*[@id=\"incident|NoRelationship|Form|rta.incident.Button10.Button\"]/span/a/span")
	public WebElement esclateGrievance;
	
	@FindBy(xpath = "//span[contains(text(),'Initiation & Dispatch')]")
	public WebElement naviagateToInitiationAndDispatch;
	
	@FindBy(xpath = "(//span[contains(@class,'navTabButtonArrowRight')])[2]")
	public WebElement navigateToConcernedParties;
	
	@FindBy(xpath = "//span[contains(text(),'Concerned Parties')]")
	public WebElement concernedParties;
	
	@FindBy(xpath = "//span[contains(text(),'Add Existing User')]")
	public WebElement addExistingUser;
	
	@FindBy(id = "lookup_crmGrid_new_incident_systemuser_i")
	public WebElement searchUser;
	
//	@FindBy(xpath = "//*[@id=\"gridBodyTable\"]/tbody/tr[1]/td[2]/nobr")
	@FindBy(xpath = "//*[@id=\"gridBodyTable\"]/tbody/tr[1]/td[3]/nobr")
	public WebElement selectContact;

	@FindBy(id = "btnAdd")
	public WebElement selectUser;
	
	@FindBy(id = "savefooter_statuscontrol")
	public WebElement saveParty;
	
	@FindBy(id = "FormTitle")
	public WebElement navigateToResolveCase;

	public void NavigateToCases() throws InterruptedException {

		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.wait3Seconds();
		new WebDriverWait(driver,10).until(ExpectedConditions.elementToBeClickable(expandSettingMenu));
		expandSettingMenu.click();
		new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(expandServicesMenu));
		expandServicesMenu.click();
		new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(clickCaseMenuOption));
		clickCaseMenuOption.click();
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.wait3Seconds();

	}

	public void NewCase() throws Exception {

		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.wait3Seconds();

		UtilityMethods.clickElemetJavaSciptExecutor(newCase);

	}

	public void VerifyTabsOnCaseForm() throws Exception {

		UtilityMethods.waitForPageLoadAndPageReady();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));

		assertEquals("General", generalMenuLink.getText());
		assertEquals("Additional Data", additionalDataMenuLink.getText());
		assertEquals("Coordination", coordinationMenuLink.getText());
		assertEquals("Case Relationships", caseRelationshipsMenuLink.getText());
		assertEquals("Articles", articlesMenuLink.getText());
		assertEquals("Activities/Notes and Associated Knowledge Records", activitiesMenuLink.getText());
		UtilityMethods.waitForPageLoadAndPageReady();
		
	}

	public void VerifySectionsOnCaseForm() throws Exception {

		UtilityMethods.waitForPageLoadAndPageReady();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));

		assertEquals("Overview", generalOverviewSection.getText());
		assertEquals("Case Description and Final Resolution", caseDescriptionAndFinalResolution.getText());
		assertEquals("Related Event", relatedEvent.getText());

		assertEquals("Information for Internal Use", informationForInternalUse.getText());
		assertEquals("Administration", administration.getText());

		UtilityMethods.waitForPageLoadAndPageReady();
		caseRelationShip.click();

		UtilityMethods.waitForPageLoadAndPageReady();

		assertEquals("SIMILAR CASES", similarCases.getText());

		assertEquals("MERGED CASES", mergedCases.getText());
		assertEquals("CHILD CASES", childCases.getText());

		assertEquals("ARTICLES", articles.getText());

	}

	public void VerifyFieldsUnderAdministrationSection() throws Exception {

		UtilityMethods.waitForPageLoadAndPageReady();

		String windowHandle = driver.getWindowHandle();
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));

		UtilityMethods.verifyElementDisplayed(administrationSlaDateLocker);
		UtilityMethods.verifyElementDisplayed(administrationSlaDate);

		UtilityMethods.verifyElementDisplayed(administrationPreBreachingSlaDateLocker);
		UtilityMethods.verifyElementDisplayed(administrationPreBreachingSlaDate);

		UtilityMethods.verifyElementDisplayed(administrationModifiedLocker);
		UtilityMethods.verifyElementDisplayed(administrationModified);
		UtilityMethods.verifyElementDisplayed(administrationOwner);

		UtilityMethods.verifyElementDisplayed(administrationResolvedByLocker);
		UtilityMethods.verifyElementDisplayed(administrationResolvedBy);

		UtilityMethods.verifyElementDisplayed(administrationExtensionLocker);
		UtilityMethods.verifyElementDisplayed(administrationExtension);

		UtilityMethods.verifyElementDisplayed(administrationQueueAssigment);
		UtilityMethods.verifyElementDisplayed(administrationEscalationLevelAppliedLocker);
		UtilityMethods.verifyElementDisplayed(administrationEscalationLevelApplied);

		UtilityMethods.verifyElementDisplayed(administrationSlaResponseRateLocker);
		UtilityMethods.verifyElementDisplayed(administrationSlaResponseRate);
		UtilityMethods.verifyElementDisplayed(administrationSectionNumber);
		UtilityMethods.verifyElementDisplayed(administrationCurrentQueue);

		UtilityMethods.verifyElementDisplayed(administrationCreatedOnLocker);
		UtilityMethods.verifyElementDisplayed(administrationCreatedOn);

		UtilityMethods.verifyElementDisplayed(administrationOriginalSlaDateLocker);
		UtilityMethods.verifyElementDisplayed(administrationOriginalSlaDate);

		UtilityMethods.verifyElementDisplayed(administrationSlaDueDateLocker);
		UtilityMethods.verifyElementDisplayed(administrationSlaDueDate);

		UtilityMethods.verifyElementDisplayed(administrationCreatedByLocker);
		UtilityMethods.verifyElementDisplayed(administrationCreatedBy);

		UtilityMethods.verifyElementDisplayed(administrationModifiedByLocker);
		UtilityMethods.verifyElementDisplayed(administrationModifiedBy);

		UtilityMethods.verifyElementDisplayed(administrationTotalExtensionDurationLocker);
		UtilityMethods.verifyElementDisplayed(administrationTotalExtensionDuration);

		UtilityMethods.verifyElementDisplayed(administrationOriginalSlaWorkingHoursLocker);
		UtilityMethods.verifyElementDisplayed(administrationOriginalSlaWorkingHours);
		
		driver.switchTo().window(windowHandle);
		
		((JavascriptExecutor)driver).executeScript("window.open()");
		driver.close();
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(0));
		UtilityMethods.waitForPageLoadAndPageReady();
		
	}

	public void VerifyDataTypesOfFieldsOnCaseForm() throws Exception {

		UtilityMethods.waitForPageLoadAndPageReady();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));

		new WebDriverWait(driver, 30)
		.until(ExpectedConditions.elementToBeClickable(customerField));
		customerField.click();
		UtilityMethods.verifyElementDisplayed(verifyCustomerDatatype);
		verifyCustomerDatatype.sendKeys(Keys.TAB);

		UtilityMethods.verifyElementDisplayed(verifyPreferedLanguage);
		Select select = new Select(verifyPreferedLanguage);
		List<WebElement> options = select.getOptions();
		for (WebElement item : options)
		{
			for (int i = 0; i < language.length; i++)
			{
				if (item.getText().equals(language[i]))
				{}
			}
		}
		verifyPreferedLanguage.sendKeys(Keys.TAB);

		UtilityMethods.verifyElementDisplayed(verifySubjectDataType);

		caseTypeField.click();
		UtilityMethods.verifyElementDisplayed(verifyCaseTypeField);
		verifyCaseTypeField.sendKeys(Keys.TAB);

		UtilityMethods.verifyElementDisplayed(verifyPriorityCode);
		verifyPriorityCode.sendKeys(Keys.TAB);

		UtilityMethods.verifyElementDisplayed(verifyCaseOriginCode);
		verifyCaseOriginCode.sendKeys(Keys.TAB);

		assertEquals("text", verfiyCallBackTime.getAttribute("type"));

		assertEquals("No", sendResolutionField.getText());
		sendResolutionField.click();
		assertEquals("Yes", sendResolutionField.getText());

		customerFeedBack.click();
		assertEquals("true", verifyCustomerFeedBackField.getAttribute("aria-multiline"));

		caseReasonField.click();
		UtilityMethods.verifyElementDisplayed(verifyCaseReasonField);
		verifyCaseReasonField.sendKeys(Keys.TAB);

		UtilityMethods.verifyElementDisplayed(verifyParentCaseField);
		verifyParentCaseField.sendKeys(Keys.TAB);

		UtilityMethods.verifyElementDisplayed(caseBelongsOptions);

		Select select2 = new Select(caseBelongsOptions);
		List<WebElement> optionsOfCaseBelongs = select2.getOptions();
		for (WebElement item : optionsOfCaseBelongs)
		{
			for (int i = 0; i < exp.length; i++)
			{
				if (item.getText().equals(exp[i]))
				{}
			}
		}

		regardingCaseField.click();
		UtilityMethods.verifyElementDisplayed(verifyRegardingCase);

		caseDescription.click();
		UtilityMethods.verifyElementDisplayed(verifyCaseDescription);
		assertEquals("true", verifyCaseDescription.getAttribute("aria-multiline"));

		relatedEventField.click();
		UtilityMethods.verifyElementDisplayed(verifyRelatedEvent);

		UtilityMethods.verifyElementDisplayed(verifyFinalResolution);

		InfoForInternalUse.click();
		assertEquals("true", verifyInfoForInternalUseField.getAttribute("aria-multiline"));

	}

	public void VerifyFieldsUnderAdditionalTabOnSelectingGrievienceAsCaseType() throws Exception {

		UtilityMethods.waitForPageLoadAndPageReady();
		
		String windowHandle = driver.getWindowHandle();
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));

		mainCaseType.click();

		Select dropdownCaseType = new Select(mainCaseTypeSelectBox);
		dropdownCaseType.selectByVisibleText("Grievance");
		assertEquals("Additional Data", additionalDataMenuLink.getText());
		assertEquals("Information for Internal Use", informationForInternalUse.getText());
		InfoForInternalUse.click();
		assertEquals("true", verifyInfoForInternalUseField.getAttribute("aria-multiline"));
		
		driver.switchTo().window(windowHandle);
		
		((JavascriptExecutor)driver).executeScript("window.open()");
		driver.close();
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(0));
		UtilityMethods.waitForPageLoadAndPageReady();

	}

	public void VerifyFieldsUnderAddiontionalTabOnCaseFormOnSelectingComplexEnquiryAsCaseType() throws Exception {

		UtilityMethods.waitForPageLoadAndPageReady();
		String windowHandle = driver.getWindowHandle();
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));

		mainCaseType.click();

		Select dropdownCaseType = new Select(mainCaseTypeSelectBox);
		dropdownCaseType.selectByVisibleText("Complex Enquiry");
		UtilityMethods.wait3Seconds();
		assertEquals("Additional Data", additionalDataMenuLink.getText());
		assertEquals("Complex Enquiry", complexEnquiryText.getText());
//		complexEnquiry.click();
		assertEquals("Information for Internal Use", informationForInternalUse.getText());
		assertEquals("true", verifycomplexEnquiry.getAttribute("aria-multiline"));
		assertEquals("Steps Taken To Provide Answer", labelForComplexEnquiry.getText());
		UtilityMethods.verifyElementDisplayed(checkComplexEnquiryField);
		assertEquals("true", verifyInfoForInternalUseField.getAttribute("aria-multiline"));

		driver.switchTo().window(windowHandle);
		
		((JavascriptExecutor)driver).executeScript("window.open()");
		driver.close();
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(0));
		UtilityMethods.waitForPageLoadAndPageReady();

	}

	public void VerifySectionsOnAdditionalDataTab() throws Exception {

		UtilityMethods.waitForPageLoadAndPageReady();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));

		assertEquals("Information for Internal Use", informationForInternalUse.getText());

		selectInformationForInternalUse.click();
		enterDataInformationForInternalUse.clear();
		enterDataInformationForInternalUse.sendKeys("Test\nAutomation\nInProgress");

		UtilityMethods.waitForPageLoadAndPageReady();

	}

	public void ClickSaveButtonOnCaseForm() {

		UtilityMethods.waitForPageLoadAndPageReady();
		saveButtonOnNewCaseForm.click();
		UtilityMethods.waitForPageLoadAndPageReady();
	}

	public void ValidationOnGeneralSection() throws Exception {

		UtilityMethods.waitForPageLoadAndPageReady();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));

		UtilityMethods.verifyElementDisplayed(customer);
		UtilityMethods.verifyElementDisplayed(subject);
		UtilityMethods.verifyElementDisplayed(caseType);
		UtilityMethods.verifyElementDisplayed(origin);
		UtilityMethods.verifyElementDisplayed(status);

		UtilityMethods.waitForPageLoadAndPageReady();

	}

	public void VerifyBusinessRequiredFieldsOnCaseForm(String NewCaseDescriptionTitle) throws Throwable {

		UtilityMethods.waitForPageLoadAndPageReady();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));

		UtilityMethods.verifyElementDisplayed(preferredLanguage);
		UtilityMethods.verifyElementDisplayed(RelatedAgency);
		UtilityMethods.waitForPageLoadAndPageReady();

		selectCustomerField.click();

		expandCustomerField.click();

		SelectCustomer.click();

		moveToCaseSubject.click();

		expandCaseSubject.click();

		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();

		new WebDriverWait(driver, 60).until(
				ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='InlineDialog_Iframe']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='InlineDialog_Iframe']")));

		selectCaseSubject.click();
		UtilityMethods.waitForPageLoadAndPageReady();
		casesubject.click();
		UtilityMethods.waitForPageLoadAndPageReady();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));

		clickCaseTypeField.click();

		new Select(driver.findElement(By.id("header_process_casetypecode_i"))).selectByVisibleText("Suggestion");

		selectDescriptionTitle.click();

		caseDescriptionTitle.clear();
		caseDescriptionTitle.sendKeys(NewCaseDescriptionTitle);

		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		UtilityMethods.waitForPageLoadAndPageReady();

		SaveButton.click();
		UtilityMethods.wait3Seconds();

		try {
			Thread.sleep(10000);
			Alert alert = driver.switchTo().alert();
			alert.dismiss();

		} catch (NoAlertPresentException Ex) {
			System.out.print("NoAlertPresentException");

		}

		UtilityMethods.waitForPageLoadAndPageReady();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));

		assertEquals("In Progress / قيد التنفيذ", statusReason.getText());

		UtilityMethods.waitForPageLoadAndPageReady();

	}

	public void VerifyOptionalFieldsOnCaseForm(String NewCaseDescriptionTitle) throws Throwable {

		UtilityMethods.waitForPageLoadAndPageReady();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));

		UtilityMethods.verifyElementDisplayed(priority);
		UtilityMethods.verifyElementDisplayed(callBackTime);
		UtilityMethods.verifyElementDisplayed(sendResolutionSmsEmail);
		UtilityMethods.verifyElementDisplayed(customerFeedBackComments);
		UtilityMethods.verifyElementDisplayed(caseReason);
		UtilityMethods.verifyElementDisplayed(parentCase);
		UtilityMethods.verifyElementDisplayed(caseBelongs);
		UtilityMethods.verifyElementDisplayed(regardingCase);
		UtilityMethods.verifyElementDisplayed(finalResolution);
		UtilityMethods.verifyElementDisplayed(relatedEvent);
		UtilityMethods.verifyElementDisplayed(informationForInternalUse);
		UtilityMethods.verifyElementDisplayed(sectionNumber);
		UtilityMethods.verifyElementDisplayed(currentQueue);

		UtilityMethods.waitForPageLoadAndPageReady();
		selectCustomerField.click();

		expandCustomerField.click();

		SelectCustomer.click();

		moveToCaseSubject.click();

		expandCaseSubject.click();

		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();

		new WebDriverWait(driver, 60).until(
				ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='InlineDialog_Iframe']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='InlineDialog_Iframe']")));

		selectCaseSubject.click();
		UtilityMethods.waitForPageLoadAndPageReady();
		casesubject.click();
		UtilityMethods.waitForPageLoadAndPageReady();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));

		clickCaseTypeField.click();

		new Select(driver.findElement(By.id("header_process_casetypecode_i"))).selectByVisibleText("Suggestion");

		selectDescriptionTitle.click();

		caseDescriptionTitle.clear();
		caseDescriptionTitle.sendKeys(NewCaseDescriptionTitle);

		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		UtilityMethods.waitForPageLoadAndPageReady();

		SaveButton.click();
		UtilityMethods.wait3Seconds();

		try {
			Thread.sleep(10000);
			Alert alert = driver.switchTo().alert();
			alert.dismiss();

		} catch (NoAlertPresentException Ex) {
			System.out.print("NoAlertPresentException");

		}

		UtilityMethods.waitForPageLoadAndPageReady();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));

		assertEquals("In Progress / قيد التنفيذ", statusReason.getText());

		UtilityMethods.waitForPageLoadAndPageReady();

	}

	public void VerifyLockedFieldsOnCaseForm(String NewCaseDescriptionTitle) throws Throwable {

		UtilityMethods.waitForPageLoadAndPageReady();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));

		UtilityMethods.verifyElementDisplayed(subjectCategory);
		UtilityMethods.verifyElementDisplayed(subjectSubCategory);
		UtilityMethods.verifyElementDisplayed(StatusReasonlockedField);
		UtilityMethods.verifyElementDisplayed(relatedAgency);
		UtilityMethods.verifyElementDisplayed(relatedDepartment);
		UtilityMethods.verifyElementDisplayed(contactsMobile);
		UtilityMethods.verifyElementDisplayed(satisfaction);
		UtilityMethods.verifyElementDisplayed(customerNickName);
		UtilityMethods.verifyElementDisplayed(caseCategory);
		UtilityMethods.verifyElementDisplayed(PreviousSLADuedate);
		UtilityMethods.verifyElementDisplayed(prebreachingSLADueDate);
		UtilityMethods.verifyElementDisplayed(modifiedOn);
		UtilityMethods.verifyElementDisplayed(resolvedBy);
		UtilityMethods.verifyElementDisplayed(numberOfExtension);
		UtilityMethods.verifyElementDisplayed(escalationLevelApplied);
		UtilityMethods.verifyElementDisplayed(slaResponseRate);
		UtilityMethods.verifyElementDisplayed(createdOn);
		UtilityMethods.verifyElementDisplayed(originalSlaDate);
		UtilityMethods.verifyElementDisplayed(slaDueDate);
		UtilityMethods.verifyElementDisplayed(createdBy);
		UtilityMethods.verifyElementDisplayed(modifiedBy);
		UtilityMethods.verifyElementDisplayed(totalExtensionDurationInHours);
		UtilityMethods.verifyElementDisplayed(totalOriginalSLAWorkingHours);

		UtilityMethods.waitForPageLoadAndPageReady();
		selectCustomerField.click();

		expandCustomerField.click();

		SelectCustomer.click();

		moveToCaseSubject.click();

		expandCaseSubject.click();

		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();

		new WebDriverWait(driver, 60).until(
				ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='InlineDialog_Iframe']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='InlineDialog_Iframe']")));

		selectCaseSubject.click();
		UtilityMethods.waitForPageLoadAndPageReady();
		casesubject.click();
		UtilityMethods.waitForPageLoadAndPageReady();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));

		clickCaseTypeField.click();

		new Select(driver.findElement(By.id("header_process_casetypecode_i"))).selectByVisibleText("Suggestion");

		selectDescriptionTitle.click();

		caseDescriptionTitle.clear();
		caseDescriptionTitle.sendKeys(NewCaseDescriptionTitle);

		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		UtilityMethods.waitForPageLoadAndPageReady();

		SaveButton.click();
		UtilityMethods.wait3Seconds();

		try {
			Thread.sleep(10000);
			Alert alert = driver.switchTo().alert();
			alert.dismiss();

		} catch (NoAlertPresentException Ex) {
			System.out.print("NoAlertPresentException");

		}

		UtilityMethods.waitForPageLoadAndPageReady();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));

		assertEquals("In Progress / قيد التنفيذ", statusReason.getText());

		UtilityMethods.waitForPageLoadAndPageReady();

	}

	public void verifyValuesOfCaseTypeOnCaseForm() {

		UtilityMethods.waitForPageLoadAndPageReady();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));

		clickCaseTypeField.click();

		assertEquals("Compliment", compliment.getText());
		assertEquals("Complex Enquiry", complexEnquiry.getText());
		assertEquals("Suggestion", suggestion.getText());
		assertEquals("Notification", notification.getText());
		assertEquals("Complaint", complaint.getText());
		assertEquals("Lost Item", lostItem.getText());
		assertEquals("Request", request.getText());
		assertEquals("Emergency", emergency.getText());
		assertEquals("Fine Objection", fineObjection.getText());
		assertEquals("Grievance", grievance.getText());
		assertEquals("MBR Idea", mBRIdea.getText());
		assertEquals("MBR Comment", mBRComment.getText());

		UtilityMethods.waitForPageLoadAndPageReady();

	}

	public void verifyValuesOfOriginOnCaseForm() {

		UtilityMethods.waitForPageLoadAndPageReady();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));

		expandOriginOptionSet.click();

		assertEquals("Brain Storming Session", brainStormingSession.getText());
		assertEquals("Customer Suggestions Committe", customerSuggestionsCommitte.getText());
		assertEquals("Customers Council", customersCouncil.getText());
		assertEquals("Facebook", facebook.getText());
		assertEquals("Customer Week", customerWeek.getText());
		assertEquals("Twitter", twitter.getText());
		assertEquals("Metro Kiosk", metroKiosk.getText());
		assertEquals("Smart phone application", smartPhoneApplication.getText());
		assertEquals("Phone", phone.getText());
		assertEquals("E-mail", email.getText());
		assertEquals("Chat", chat.getText());
		assertEquals("ECC", eCC.getText());
		assertEquals("Information Desk", informationDesk.getText());
		assertEquals("Letter", letter.getText());
		assertEquals("Fax", fax.getText());
		assertEquals("RTA Staff", rTAStaff.getText());
		assertEquals("Media", media.getText());
		assertEquals("Madinati Mobile App", madinatiMobileApp.getText());
		assertEquals("Internet", internet.getText());
		assertEquals("RTA Facebook Application", rTAFacebookApplication.getText());
		assertEquals("Social Media", socialMedia.getText());
		assertEquals("MobileApplication_ReportProblem", mobileApplication_ReportProblem.getText());
		assertEquals("MobileApplication_Send Feedback", mobileApplication_SendFeedback.getText());
		assertEquals("Chairman Office", chairmanOffice.getText());
		assertEquals("CEO Office", cEOOffice.getText());
		assertEquals("CS Director", cSDirector.getText());
		assertEquals("MBR", mBR.getText());
		assertEquals("CSD Boxes", cSDBoxes.getText());
		assertEquals("S Hail Mobile App", sHailMobileApp.getText());
		assertEquals("Innovation Labs 2015", innovationLabs2015.getText());
		assertEquals("Innovation Labs 2016", innovationLabs2016.getText());
		assertEquals("Innovation Race 2016", innovationRace2016.getText());

		UtilityMethods.waitForPageLoadAndPageReady();

	}

	public void verifyValuesOfPriorityOnCaseForm() {

		UtilityMethods.waitForPageLoadAndPageReady();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));

		priority.click();

		assertEquals("Medium", medium.getText());
		assertEquals("Normal", normal.getText());
		assertEquals("High", high.getText());
		assertEquals("Urgent", urgent.getText());
		assertEquals("Sensitive", sensitive.getText());

		UtilityMethods.waitForPageLoadAndPageReady();

	}

	public void verifyValuesOfSendResolutionOnCaseForm() throws Throwable {

		UtilityMethods.waitForPageLoadAndPageReady();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));

		UtilityMethods.verifyElementDisplayed(sendResolution);
		assertEquals("No", sendResolution.getText());
		sendResolution.click();
		assertEquals("Yes", sendResolution.getText());

		UtilityMethods.waitForPageLoadAndPageReady();

	}

	public void verifyCaseFormHeader() throws Throwable {

		UtilityMethods.waitForPageLoadAndPageReady();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));

		UtilityMethods.verifyElementDisplayed(statusCode);

		UtilityMethods.verifyElementDisplayed(ticketNumber);

		UtilityMethods.waitForPageLoadAndPageReady();

	}

	public void verifyAdditionalDataTabAgainstComplimentCaseType() throws Throwable {

		UtilityMethods.waitForPageLoadAndPageReady();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));

		clickCaseTypeField.click();

		new Select(driver.findElement(By.id("header_process_casetypecode_i"))).selectByVisibleText("Compliment");

		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.wait3Seconds();
		UtilityMethods.verifyElementDisplayed(complimentSection);

		UtilityMethods.verifyElementDisplayed(ComplimentDetailsSection);

		UtilityMethods.verifyElementDisplayed(informationForInternalUse);
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.verifyElementDisplayed(complimentReasonMandatoryValidation);

		clickComplimentReasonOptionSet.click();
		UtilityMethods.verifyElementDisplayed(complimentReasonOptionSetValidation);

		UtilityMethods.verifyElementDisplayed(employeeName);

		expandserviceLoc.click();

		assertEquals("ms-crm-SelectBox ms-crm-Inline-OptionSet-AutoOpen", serviceLoc.getAttribute("class"));

		employeeName.click();

		UtilityMethods.waitForPageLoadAndPageReady();

		clickAgency.click();
		UtilityMethods.wait2Seconds();
		expandAgency.click();

		assertEquals("ms-crm-InlineInput ms-crm-InlineLookupEdit", expandAgency.getAttribute("class"));
		expandAgency.sendKeys(Keys.TAB);

		UtilityMethods.verifyElementDisplayed(department);
		UtilityMethods.waitForPageLoadAndPageReady();
		assertEquals("Information for Internal Use", informationForInternalUse.getText());

		selectInformationForInternalUse.click();
		enterDataInformationForInternalUse.clear();
		enterDataInformationForInternalUse.sendKeys("Test\nAutomation\nInProgress");
		UtilityMethods.waitForPageLoadAndPageReady();

		clickStrategicpartner.click();
		UtilityMethods.wait2Seconds();

		assertEquals("ms-crm-InlineInput ms-crm-InlineLookupEdit", editStrategicpartner.getAttribute("class"));
		UtilityMethods.waitForPageLoadAndPageReady();

	}

	public void verifyValuesOfComplimentReasonCaseForm() {

		UtilityMethods.waitForPageLoadAndPageReady();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));

		clickCaseTypeField.click();

		new Select(driver.findElement(By.id("header_process_casetypecode_i"))).selectByVisibleText("Compliment");

		UtilityMethods.waitForPageLoadAndPageReady();

		clickComplimentReasonOptionSet.click();

		String[] ComplimentReason = { null, "Appearance", "Attitude", "Effectiveness", "Efficiency", "Innovation",
				"Quality", "Service" };

		Select select = new Select(complimentReasonOptionSet);
		List<WebElement> options = select.getOptions();

		for (WebElement item : options)
		{
			for (int i = 0; i < ComplimentReason.length; i++)
			{
				if (item.getText().equals(ComplimentReason[i]))
				{}
			}
		}

		UtilityMethods.waitForPageLoadAndPageReady();
	}
	
	public void verifyVisibilityOfInternalSuggestionDetailsSectionWhenTypeOfSuggestionIsInternalTeamOrCommitteeSuggestion() 
			throws Throwable  {
		
		UtilityMethods.waitForPageLoadAndPageReady();
		String windowHandle = driver.getWindowHandle();
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		UtilityMethods.wait2Seconds();
		mainCustomerType.click();
		mainCustomerTypeEdit.sendKeys("External Customer");
		mainCaseType.click();

		Select dropdownCaseType = new Select(mainCaseTypeSelectBox);
		dropdownCaseType.selectByVisibleText("Suggestion");
		
		assertEquals("Additional Data", additionalDataMenuLink.getText());
		suggestionType.click();
		
		Select dropdownSuggestionType = new Select(suggestionTypeOptions);
		dropdownSuggestionType.selectByVisibleText("Internal Team or Committee Suggestion");
		
		assertEquals("Internal Suggestion Details",verifyInternalSuggestionSection.getText());
		UtilityMethods.wait3Seconds();
		UtilityMethods.verifyElementDisplayed(rtaAgnecy);
		UtilityMethods.verifyElementDisplayed(rtaRole);
		UtilityMethods.verifyElementDisplayed(titleOfExternalVisit);
		UtilityMethods.wait3Seconds();
		UtilityMethods.verifyElementDisplayed(dateOfExternalVisit);
		UtilityMethods.verifyElementDisplayed(rtaDepartment);
		UtilityMethods.verifyElementDisplayed(rtaEmployeeID);
		UtilityMethods.wait3Seconds();
		UtilityMethods.verifyElementDisplayed(rtaEmployeeJobRelated);
		UtilityMethods.verifyElementDisplayed(isSuggestionRelatedToExternalVisit);
		
		driver.switchTo().window(windowHandle);
		
		((JavascriptExecutor)driver).executeScript("window.open()");
		driver.close();
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(0));
		UtilityMethods.waitForPageLoadAndPageReady();
		//driver.close();
		//UtilityMethods.acceptAlert();
		//TODO: 3. Following fields should be auto-populated on selecting the customer & are locked:
		//-RTA Agency
		//-RTA Department
		//-RTA Role
		//-RTA Employee ID
		
		
	}
	
	public void verifyVisibilityOfInternalSuggestionDetailsSectionWhenTypeOfSuggestionIsExternalIndividualSuggestion(String ExternalCustomerProfileTypeValue)
	throws Throwable{
		
		UtilityMethods.waitForPageLoadAndPageReady();
		String windowHandle = driver.getWindowHandle();
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		System.out.println(ExternalCustomerProfileTypeValue);
		UtilityMethods.wait2Seconds();
		mainCustomerType.click();
		mainCustomerTypeEdit.sendKeys("External Customer");
		mainCaseType.click();
		
		UtilityMethods.wait3Seconds();
		Select dropdownCaseType = new Select(mainCaseTypeSelectBox);
		dropdownCaseType.selectByVisibleText("Suggestion");
		
		assertEquals("Additional Data", additionalDataMenuLink.getText());
		suggestionType.click();
		
		Select dropdownSuggestionType = new Select(suggestionTypeOptions);
		dropdownSuggestionType.selectByVisibleText("External Individual Suggestion");
		UtilityMethods.wait3Seconds();
		UtilityMethods.verifyElementNotVisible(By.xpath("//h3[contains(text(),'Internal Suggestion Details')]"));
		
		driver.switchTo().window(windowHandle);
		
		((JavascriptExecutor)driver).executeScript("window.open()");
		driver.close();
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(0));
		UtilityMethods.waitForPageLoadAndPageReady();

	}
	
	public void verifyTheVisibilityOfInternalSuggestionDetailsSectionWhenTypeOfSuggestionIsExternalGroupSuggestion(String ExternalCustomerProfileTypeValue)
	throws Throwable{
		
		UtilityMethods.waitForPageLoadAndPageReady();
		String windowHandle = driver.getWindowHandle();
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		UtilityMethods.wait2Seconds();
		mainCustomerType.click();
		mainCustomerTypeEdit.sendKeys("External Customer");
		mainCaseType.click();
		
		caseTypeOption.click();
		

		Select dropdownCaseType = new Select(mainCaseTypeSelectBox);
		dropdownCaseType.selectByVisibleText("Suggestion");
		
		assertEquals("Additional Data", additionalDataMenuLink.getText());
		suggestionType.click();
		
		Select dropdownSuggestionType = new Select(suggestionTypeOptions);
		dropdownSuggestionType.selectByVisibleText("External Group Suggestion");
		UtilityMethods.wait3Seconds();
		UtilityMethods.verifyElementNotVisible(By.xpath("//h3[contains(text(),'Internal Suggestion Details')]"));
		
		driver.switchTo().window(windowHandle);
		
		((JavascriptExecutor)driver).executeScript("window.open()");
		driver.close();
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(0));
		UtilityMethods.waitForPageLoadAndPageReady();
		
	}
	
	public void verifyValuesOfItemCategoryOptionSetOnSelectingCaseTypeAsLostItem() throws Throwable{
	
		UtilityMethods.waitForPageLoadAndPageReady();
		String windowHandle = driver.getWindowHandle();
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		
		mainCaseType.click();

		Select dropdownCaseType = new Select(mainCaseTypeSelectBox);
		dropdownCaseType.selectByVisibleText("Lost Item");
		UtilityMethods.wait3Seconds();
		itemCategory.click();
		
		
		String categoryOptionSet[] = {"Bag","Bank Card","Book","Camera","Clothing","Glasses","Handbag","Hotel Key","ID Card","iPod",
									  "Jeweler","Key/Access Cards","Laptop","Medical Item","Mobile Phone","Money","MP3 Player",
									  "Papers","Passport","PDA","Purse","Sunglasses","Wallet","Watch","Electronics","Other"};
		
		Select select = new Select(itemCategoryOptionSetValues);
		List<WebElement> options = select.getOptions();

		for (WebElement item : options)
		{
			for (int i = 0; i < categoryOptionSet.length; i++)
			{
				if (item.getText().equals(categoryOptionSet[i]))
				{}
			}
		}
		
		driver.switchTo().window(windowHandle);
		
		((JavascriptExecutor)driver).executeScript("window.open()");
		driver.close();
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(0));
		UtilityMethods.waitForPageLoadAndPageReady();
		
	}
	
	public void verifyFieldsAndSectionsUnderAdditionalDataTabOnCaseFormOnSelectingLostItemAsCaseType() throws Throwable{
		
		UtilityMethods.waitForPageLoadAndPageReady();
		String windowHandle = driver.getWindowHandle();
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		
		mainCaseType.click();
		
		Select dropdownCaseType = new Select(mainCaseTypeSelectBox);
		dropdownCaseType.selectByVisibleText("Lost Item");
		UtilityMethods.wait3Seconds();
		assertEquals("Additional Data", additionalDataMenuLink.getText());
		assertEquals("Lost Item",lostItemSectioin.getText());
		assertEquals("Information for Internal Use", informationForInternalUse.getText());
		UtilityMethods.wait3Seconds();	
		itemCategory.click();
		UtilityMethods.verifyElementDisplayed(verifyItemCategoryField);
		verifyItemCategoryField.sendKeys(Keys.TAB);
		UtilityMethods.verifyElementDisplayed(CheckItemCategoryFieldValidation);
		UtilityMethods.wait3Seconds();
		UtilityMethods.verifyElementDisplayed(verifyItemColorField);
		verifyItemColorField.sendKeys(Keys.TAB);
		UtilityMethods.verifyElementDisplayed(verifyItemColorFieldValidation);
		UtilityMethods.wait3Seconds();
		UtilityMethods.verifyElementDisplayed(verifyDateField);
		matchingFound.click();
		UtilityMethods.verifyElementDisplayed(verifyDateFieldValidation);
		
		UtilityMethods.verifyElementDisplayed(verifyMatchingFoundItemField);
		verifyMatchingFoundItemField.sendKeys(Keys.TAB);
		UtilityMethods.wait3Seconds();
		itemDescription.click();
		UtilityMethods.verifyElementDisplayed(verifyItemDescriptionField);
		assertEquals("true",verifyItemDescriptionField.getAttribute("aria-multiline"));
		verifyItemDescriptionField.sendKeys(Keys.TAB);
		UtilityMethods.wait3Seconds();
		UtilityMethods.verifyElementDisplayed(verifyLocationLostField);
		assertEquals("true", verifyInfoForInternalUseField.getAttribute("aria-multiline"));
		
		driver.switchTo().window(windowHandle);
		
		((JavascriptExecutor)driver).executeScript("window.open()");
		driver.close();
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(0));
		UtilityMethods.waitForPageLoadAndPageReady();
			
	}
	
	public void verifyTheValuesOfComplaintReasonOptionSetWhenSelectingCaseTypeAsComplaint() throws Throwable{
		
		UtilityMethods.waitForPageLoadAndPageReady();
		String windowHandle = driver.getWindowHandle();
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		
		mainCaseType.click();

		Select dropdownCaseType = new Select(mainCaseTypeSelectBox);
		dropdownCaseType.selectByVisibleText("Complaint");
		UtilityMethods.wait3Seconds();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", complaintReasons);
		UtilityMethods.wait2Seconds();
		
		String complaintReasonsOptionSet[] = {"Air-conditioning Problem",
				"Broken Journey",
				"Bus Replacement Delays",
				"Cleanliness",
				"Contractual Issues",
				"Crossing red-light at junction",
				"Dangerous lane switching",
				"Delayed Service",
				"Driver geographical awareness",
				"Driving out from bus stop and bay without care",
				"Emergency brake application",
				"Exceeding the permitted speed limit",
				"Exceeding route to increase fare",
				"Fare Dispute",
				"Fare Dispute-Due to Nol Card Issues",
				"Faulty fare gates",
				"Faulty nol card",
				"Flashing other motorist ahead",
				"Hard and frequent use of brakes",
				"Inattentive driving (e.g. talking with passengers, using mobile and tiredness)",
				"Inefficient Transport Integration",
				"Information not updated/ old information",
				"Injury/ Safety Issue",
				"Insufficient time for transfer",
				"Lack of cleanliness",
				"Lack of directional signs in transfer area",
				"Lack of information about fare structure",
				"Lack of shelter/ waiting area",
				"Lighting Problem",
				"Long transfer distance/ time",
				"Lost nol card",
				"Low Clarity or Accuracy",
				"No direction route/easy connections",
				"Noise",
				"Not arriving on time",
				"Objection",
				"Other",
				"Overcharge",
				"Overcrowding",
				"Overtaking other vehicle without care",
				"Passenger Separation",
				"Payment Delays",
				"Penalty Dispute",
				"Pending Transaction",
				"Physical Assault",
				"Physical barriers/ramps/accessibility",
				"Poor language skills",
				"Punctuality (not arriving/leaving) on time",
				"Punctuality",
				"Reckless driving",
				"Refused to Stop",
				"Refusing to Deliver Passengers",
				"RTA Staff",
				"Safety & Security",
				"SALIK Gate - Charge without crossing",
				"SALIK Gate - Delayed Charge",
				"SALIK Gate - Overcharge",
				"Staff Conduct",
				"Talking on mobile without headset",
				"Taxi Payments Through Credit Card",
				"Taxi Payments Through NOL",
				"Technical Issues",
				"Too many number of transfers",
				"Traffic hindrance",
				"Unavailability",
				"Vandalism",
				"Verbal Assault"};
		
		Select select = new Select(complaintReasonOptions);
		List<WebElement> options = select.getOptions();

		for (WebElement item : options)
		{
			for (int i = 0; i < complaintReasonsOptionSet.length; i++)
			{
				if (item.getText().equals(complaintReasonsOptionSet[i])) 
				{}
			}
		}
		
		driver.switchTo().window(windowHandle);
		
		((JavascriptExecutor)driver).executeScript("window.open()");
		driver.close();
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(0));
		UtilityMethods.waitForPageLoadAndPageReady();
		
	}
	
	public void verifyFieldsAndSectionsUnderAdditionalDataTabOnCaseFormOnSelectingNotificationAsCaseType() throws Throwable{
		
		UtilityMethods.waitForPageLoadAndPageReady();
		String windowHandle = driver.getWindowHandle();
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.elementToBeClickable(mainCaseType));
		mainCaseType.click();
		UtilityMethods.wait3Seconds();
		Select dropdownCaseType = new Select(mainCaseTypeSelectBox);
		dropdownCaseType.selectByVisibleText("Notification");
		UtilityMethods.wait3Seconds();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", additionalDataMenuLink);
		UtilityMethods.wait2Seconds();
		UtilityMethods.verifyElementDisplayed(assignedEngineerSection);
		UtilityMethods.verifyElementDisplayed(defectReasonSection);
		UtilityMethods.wait3Seconds();
		UtilityMethods.verifyElementDisplayed(informationForInternalUse);
		UtilityMethods.verifyElementDisplayed(assignEngineer);
	
		driver.switchTo().window(windowHandle);
		
		((JavascriptExecutor)driver).executeScript("window.open()");
		driver.close();
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(0));
		UtilityMethods.waitForPageLoadAndPageReady();
	}
	
	public void verifyValuesOfDefectReasonOptionSetOnCaseFormOnSelectingNotifcationAsCaseType() throws Throwable{
		
		UtilityMethods.waitForPageLoadAndPageReady();
		String windowHandle = driver.getWindowHandle();
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		
		mainCaseType.click();

		Select dropdownCaseType = new Select(mainCaseTypeSelectBox);
		dropdownCaseType.selectByVisibleText("Notification");
		UtilityMethods.wait3Seconds();
		
		defectReason.click();
		String defectReasonsOptionSetArray[] = {"Abuse reputation of authority and the Emirate",
				"Air-conditioning Problem",
				"Cleanliness",
				"Information not updated",
				"Injury/Safety/Road Issue",
				"Invalid",
				"Noise",
				"Overcrowding",
				"Reckless Driving",
				"Road Work",
				"System Error",
				"Traffic Accidents",
				"Traffic Hindrance",
				"Vandalism",
				"Weather Conditions" };
		Select select = new Select(defectReasonOptionSet);
		List<WebElement> options = select.getOptions();

		for (WebElement item : options) 
		{
			for (int i = 0; i < defectReasonsOptionSetArray.length; i++)
			{
				if (item.getText().equals(defectReasonsOptionSetArray[i]))
				{}
			}
		}
		
		driver.switchTo().window(windowHandle);
		
		((JavascriptExecutor)driver).executeScript("window.open()");
		driver.close();
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(0));
		UtilityMethods.waitForPageLoadAndPageReady();
		
	}
	
	public void verifyFieldsAndSectionsUnderAdditionalDataTabOnCaseFormOnSelectingComplaintAsCaseType() throws Throwable{
		
		UtilityMethods.waitForPageLoadAndPageReady();
		String windowHandle = driver.getWindowHandle();
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		
		mainCaseType.click();

		Select dropdownCaseType = new Select(mainCaseTypeSelectBox);
		dropdownCaseType.selectByVisibleText("Complaint");
		UtilityMethods.wait3Seconds();
		
		UtilityMethods.verifyElementDisplayed(verifyComplaintSection);
		UtilityMethods.verifyElementDisplayed(informationForInternalUse);
		UtilityMethods.verifyElementDisplayed(complaintReason);
		complaintReason.click();
		UtilityMethods.verifyElementDisplayed(verifyComplaintReason);
		verifyComplaintReason.sendKeys(Keys.TAB);
		UtilityMethods.wait3Seconds();
		UtilityMethods.verifyElementDisplayed(verifyAreaField);
		verifyAreaField.sendKeys(Keys.TAB);
		UtilityMethods.verifyElementDisplayed(verifyComplaintPriority);
		assertEquals("locked",verifyComplaintPriority.getAttribute("data-controlmode"));
		verifyComplaintPriority.sendKeys(Keys.TAB);
		UtilityMethods.wait3Seconds();
		UtilityMethods.verifyElementDisplayed(verifyCommunityField);
		
		driver.switchTo().window(windowHandle);
		
		((JavascriptExecutor)driver).executeScript("window.open()");
		driver.close();
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(0));
		UtilityMethods.waitForPageLoadAndPageReady();
		
		
	}
	
	public void verifyValuesOfItemColorOptionSetOnSelectingCaseTypeAsLostItem() throws Throwable{
		
		UtilityMethods.waitForPageLoadAndPageReady();
		String windowHandle = driver.getWindowHandle();
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		
		mainCaseType.click();

		Select dropdownCaseType = new Select(mainCaseTypeSelectBox);
		dropdownCaseType.selectByVisibleText("Lost Item");
		UtilityMethods.wait3Seconds();
		itemColor.click();
		
		
		String itemColorOptionSet[] = {"Beige","Black","Blue","Brown","Cream","Gold","Green","Grey",
										"Orange","Pink","Purple","Red","Silver","Turquoise","White","Yellow",
										"Another Color"};
		
		Select select = new Select(itemColorOptionSetValues);
		List<WebElement> options = select.getOptions();

		for (WebElement item : options)
		{
			for (int i = 0; i < itemColorOptionSet.length; i++)
			{
				if (item.getText().equals(itemColorOptionSet[i]))
				{}
			}
		}
		
		driver.switchTo().window(windowHandle);
		
		((JavascriptExecutor)driver).executeScript("window.open()");
		driver.close();
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(0));
		UtilityMethods.waitForPageLoadAndPageReady();
		
	}
	
	public void verifyFieldsAndSectionsUnderAdditionalDataTabOnCaseFormOnSelectingRequestAsCaseType() throws Throwable{
		
		UtilityMethods.waitForPageLoadAndPageReady();
		String windowHandle = driver.getWindowHandle();
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		
		mainCaseType.click();

		Select dropdownCaseType = new Select(mainCaseTypeSelectBox);
		dropdownCaseType.selectByVisibleText("Request");
		UtilityMethods.wait3Seconds();
		
		UtilityMethods.verifyElementDisplayed(sectionRequest);
		UtilityMethods.verifyElementDisplayed(informationForInternalUse);
		UtilityMethods.verifyElementDisplayed(requestReason);
		requestReason.click();
		UtilityMethods.wait3Seconds();
		UtilityMethods.verifyElementDisplayed(requestReasonOptionSet);
		assertEquals("true", verifyInfoForInternalUseField.getAttribute("aria-multiline"));
		
		driver.switchTo().window(windowHandle);
		
		((JavascriptExecutor)driver).executeScript("window.open()");
		driver.close();
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(0));
		UtilityMethods.waitForPageLoadAndPageReady();
		
	}
	
	public void verifyValuesOfRequestReasonOptionSetOnSelectingRequestAsCaseType() throws Throwable{
		
		UtilityMethods.waitForPageLoadAndPageReady();
		String windowHandle = driver.getWindowHandle();
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		
		mainCaseType.click();

		Select dropdownCaseType = new Select(mainCaseTypeSelectBox);
		dropdownCaseType.selectByVisibleText("Request");
		UtilityMethods.wait3Seconds();
		UtilityMethods.verifyElementDisplayed(requestReason);
		requestReason.click();
		
		String itemRequestReasonOptionSetValues[] = {"Other",
				"Funeral Tent Permit",
				"Humps Request",
				"Pedestrians Bridge Request",
				"Public Bus Services",
				"Road & House Numbering",
				"Roads Asfalt",
				"Salik Fines Installments",
				"Temporary Roads",
				"Traffic Calmness Methods",
				"Traffic Congestion",
				"Wedding Tent Permit",
				"Franchise Service Request"};
		
		Select select = new Select(requestReasonOptionSet);
		List<WebElement> options = select.getOptions();

		for (WebElement item : options)
		{
			for (int i = 0; i < itemRequestReasonOptionSetValues.length; i++)
			{
				if (item.getText().equals(itemRequestReasonOptionSetValues[i]))
				{}
			}
		}
		
		driver.switchTo().window(windowHandle);
		
		((JavascriptExecutor)driver).executeScript("window.open()");
		driver.close();
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(0));
		UtilityMethods.waitForPageLoadAndPageReady();
		
	}
	
	
	//////////////Creating new cases starts from here////////////
	public void createNewCaseWithCaseTypeComplaint(String description,String customer) throws Throwable{
		
		UtilityMethods.waitForPageLoadAndPageReady();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		
		mainCustomerType.click();
		System.out.println(customer);
		mainCustomerTypeEdit.sendKeys(customer);
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
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));

		clickCaseTypeField.click();

		new Select(caseTypeOption).selectByVisibleText("Complaint");
		
		
		
		UtilityMethods.wait3Seconds();

		clickCaseDescription.click();
		verifyCaseDescription.clear();
		verifyCaseDescription.sendKeys(description);
		
		UtilityMethods.verifyElementDisplayed(complaintReasons);
		complaintReasons.click();
		new Select(complaintReasonOptions).selectByVisibleText("Airconditioning Problem");
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		saveAndCloseButton.click();
		
		UtilityMethods.waitForPageLoadAndPageReady();
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));
		UtilityMethods.verifyElementDisplayed(findCriteria);
		
		UtilityMethods.wait3Seconds();
		
		UtilityMethods.clickElemetJavaSciptExecutor(filter);
		
		UtilityMethods.clickElemetJavaSciptExecutor(caseTypeFilter);

		UtilityMethods.wait2Seconds();
		JavascriptExecutor executer = (JavascriptExecutor) driver;
		executer.executeScript("arguments[0].scrollIntoView(true);",selectComplaintFilter);
		UtilityMethods.clickElemetJavaSciptExecutor(selectComplaintFilter);
		UtilityMethods.clickElemetJavaSciptExecutor(selectOkFilter);
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.wait3Seconds();
		
		((JavascriptExecutor)driver).executeScript("var evt = document.createEvent('MouseEvents');" + "evt.initMouseEvent('dblclick',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);" + "arguments[0].dispatchEvent(evt);",verifyObject);
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		UtilityMethods.wait3Seconds();
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		
		assertEquals("Complaint",driver.findElement(By.xpath("//*[@id=\"header_process_casetypecode\"]/div[1]/span")).getText());
		UtilityMethods.wait3Seconds();
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		
		
	}
	
	public void createNewCaseWithCaseTypeSuggestion(String description,String customer) throws Throwable{
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		UtilityMethods.waitForPageLoadAndPageReady();
		//For Phase 1
//		new WebDriverWait(driver, 60)
//				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
//		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));

//		For IMS
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));
//		UtilityMethods.wait3Seconds();
//		mainCustomerType.click();
//		mainCustomerTypeEdit.sendKeys(customer);
		
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

//		new WebDriverWait(driver, 60)
//				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
//		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
//
//		clickCaseTypeField.click();
//
//		new Select(caseTypeOption).selectByVisibleText("Suggestion");

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));
		
		clickCaseDescription.click();
		verifyCaseDescription.clear();
		verifyCaseDescription.sendKeys(description);
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		saveAndCloseButton.click();
		try {
			UtilityMethods.acceptAlert();
		}
		catch(Exception e) {

			System.out.println("Alert was not present");

		}
		
		UtilityMethods.waitForPageLoadAndPageReady();
//		new WebDriverWait(driver, 60)
//		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
//		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));
		UtilityMethods.verifyElementDisplayed(findCriteria);
		
		UtilityMethods.wait3Seconds();
		
		UtilityMethods.clickElemetJavaSciptExecutor(filter);
		
		UtilityMethods.clickElemetJavaSciptExecutor(caseTypeFilter);

		UtilityMethods.wait2Seconds();
		JavascriptExecutor executer = (JavascriptExecutor) driver;
		executer.executeScript("arguments[0].scrollIntoView(true);",selectSuggestionFilter);
		UtilityMethods.clickElemetJavaSciptExecutor(selectSuggestionFilter);
		UtilityMethods.clickElemetJavaSciptExecutor(selectOkFilter);
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.wait3Seconds();
		
		((JavascriptExecutor)driver).executeScript("var evt = document.createEvent('MouseEvents');" + "evt.initMouseEvent('dblclick',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);" + "arguments[0].dispatchEvent(evt);",verifyObject);
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		UtilityMethods.wait3Seconds();
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		
		assertEquals("Suggestion",driver.findElement(By.xpath("//*[@id=\"header_process_casetypecode\"]/div[1]/span")).getText());
		UtilityMethods.wait3Seconds();
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();

	}
	
	public void createNewCaseWithCaseTypeRequest(String description,String customer) throws Throwable{
		
		UtilityMethods.waitForPageLoadAndPageReady();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		
		mainCustomerType.click();
		mainCustomerTypeEdit.sendKeys(customer);
		
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
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));

		clickCaseTypeField.click();

		new Select(caseTypeOption).selectByVisibleText("Request");
		
		UtilityMethods.wait3Seconds();

		clickCaseDescription.click();
		verifyCaseDescription.clear();
		verifyCaseDescription.sendKeys(description);
		
		UtilityMethods.verifyElementDisplayed(requestReason);
		requestReason.click();
		new Select(requestReasonOptionSet).selectByVisibleText("Humps Request");
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		saveAndCloseButton.click();
		
		UtilityMethods.waitForPageLoadAndPageReady();
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));
		UtilityMethods.verifyElementDisplayed(findCriteria);
		
		Actions action = new Actions(driver);
		action.doubleClick(verifyObject).perform();
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		UtilityMethods.wait3Seconds();
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		
		assertEquals("Request",driver.findElement(By.xpath("//*[@id=\"header_process_casetypecode\"]/div[1]/span")).getText());
		UtilityMethods.wait3Seconds();
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		
		
	}

	public void createNewCaseWithCaseTypeCompliment(String customer) throws Throwable{
			
			UtilityMethods.waitForPageLoadAndPageReady();

			new WebDriverWait(driver, 60)
					.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
			driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
			
			mainCustomerType.click();
			mainCustomerTypeEdit.sendKeys(customer);
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
			selectComplimentSubject.click();
			casesubject.click();
			UtilityMethods.waitForPageLoadAndPageReady();

			new WebDriverWait(driver, 60)
					.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
			driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));

			clickCaseTypeField.click();

			new Select(caseTypeOption).selectByVisibleText("Compliment");
			
			UtilityMethods.wait3Seconds();

			clickCaseDescription.click();
			verifyCaseDescription.clear();
			verifyCaseDescription.sendKeys("desciption testing");
			
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
			
			
			UtilityMethods.waitForPageLoadAndPageReady();
			UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
			saveAndCloseButton.click();
			
			UtilityMethods.waitForPageLoadAndPageReady();
			new WebDriverWait(driver, 60)
			.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
			driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));
			UtilityMethods.verifyElementDisplayed(findCriteria);
			
			Actions action = new Actions(driver);
			action.doubleClick(verifyObject).perform();
			
			UtilityMethods.waitForPageLoadAndPageReady();
			UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
			UtilityMethods.wait3Seconds();
			new WebDriverWait(driver, 60)
			.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
			driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
			
			assertEquals("Compliment",driver.findElement(By.xpath("//*[@id=\"header_process_casetypecode\"]/div[1]/span")).getText());
			UtilityMethods.wait3Seconds();
			UtilityMethods.waitForPageLoadAndPageReady();
			UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
				
		
	}
	
	public void createNewCaseWithCaseTypeEmergency(String customer) throws Throwable{
		
		UtilityMethods.waitForPageLoadAndPageReady();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		
		mainCustomerType.click();
		mainCustomerTypeEdit.sendKeys(customer);
		UtilityMethods.wait3Seconds();
		
		moveToCaseSubject.click();
		expandCaseSubject.click();
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();

		new WebDriverWait(driver, 60).until(
				ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='InlineDialog_Iframe']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='InlineDialog_Iframe']")));

		gettingAround.click();
		UtilityMethods.waitForPageLoadAndPageReady();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", parentMetro);
		parentMetro.click();
		UtilityMethods.waitForPageLoadAndPageReady();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", metroConstruction);
		metroConstruction.click();
		casesubject.click();
		UtilityMethods.waitForPageLoadAndPageReady();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));

		clickCaseTypeField.click();

		new Select(caseTypeOption).selectByVisibleText("Emergency");
		
		UtilityMethods.wait3Seconds();

		clickCaseDescription.click();
		verifyCaseDescription.clear();
		verifyCaseDescription.sendKeys("desciption testing");
		UtilityMethods.wait2Seconds();
		assignedEngineer.click();
		searchAssignedEngineer.click();
		UtilityMethods.wait2Seconds();
		moreRecords.click();
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();

		new WebDriverWait(driver, 60).until(
				ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='InlineDialog_Iframe']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='InlineDialog_Iframe']")));
		
		lookUpAssignedEngineer.click();
		new Select(lookUpAssignedEngineer).selectByVisibleText("Active Contacts");
		
		UtilityMethods.wait2Seconds();
		addButton.click();
		
		UtilityMethods.waitForPageLoadAndPageReady();
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		
		defectReason.click();
		new Select(defectReasonOptionSet).selectByVisibleText("Cleanliness");
		
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		saveAndCloseButton.click();
		
		UtilityMethods.waitForPageLoadAndPageReady();
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));
		UtilityMethods.verifyElementDisplayed(findCriteria);
		
		Actions action = new Actions(driver);
		action.doubleClick(verifyObject).perform();
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		UtilityMethods.wait3Seconds();
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		
		assertEquals("Emergency",driver.findElement(By.xpath("//*[@id=\"header_process_casetypecode\"]/div[1]/span")).getText());
		UtilityMethods.wait3Seconds();
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		
	}
	
	public void createNewCaseWithCaseTypeLostItem(String customer) throws Throwable{
		
		UtilityMethods.waitForPageLoadAndPageReady();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		
		mainCustomerType.click();
		mainCustomerTypeEdit.sendKeys(customer);
		UtilityMethods.wait3Seconds();
		
		moveToCaseSubject.click();
		expandCaseSubject.click();
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();

		new WebDriverWait(driver, 60).until(
				ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='InlineDialog_Iframe']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='InlineDialog_Iframe']")));

		gettingAround.click();
		UtilityMethods.waitForPageLoadAndPageReady();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", taxi);
		taxi.click();
		UtilityMethods.waitForPageLoadAndPageReady();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", airportTaxi);
		airportTaxi.click();
		casesubject.click();
		UtilityMethods.waitForPageLoadAndPageReady();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));

		clickCaseTypeField.click();

		new Select(caseTypeOption).selectByVisibleText("Lost Item");
		
		UtilityMethods.wait3Seconds();

		clickCaseDescription.click();
		verifyCaseDescription.clear();
		verifyCaseDescription.sendKeys("desciption testing");
		
		itemCategory.click();
		new Select(itemCategoryOptionSetValues).selectByVisibleText("Bag");
		
		itemColor.click();
		new Select(itemColorOptionSetValues).selectByVisibleText("Black");
		
		verifyDateField.click();
		selectDate.click();
		currentDate.click();
		UtilityMethods.wait2Seconds();
		itemDescription.click();
		verifyItemDescriptionField.clear();
		verifyItemDescriptionField.sendKeys("Lost Item description");
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		saveAndCloseButton.click();
		
		UtilityMethods.waitForPageLoadAndPageReady();
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));
		UtilityMethods.verifyElementDisplayed(findCriteria);
		
		Actions action = new Actions(driver);
		action.doubleClick(verifyObject).perform();
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		UtilityMethods.wait3Seconds();
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		
		assertEquals("Lost Item",driver.findElement(By.xpath("//*[@id=\"header_process_casetypecode\"]/div[1]/span")).getText());
		UtilityMethods.wait3Seconds();
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		
	}
	
	public void createNewCaseWithCaseTypeComplexEnquiry(String customer) throws Throwable{
		
		UtilityMethods.waitForPageLoadAndPageReady();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		
		mainCustomerType.click();
		mainCustomerTypeEdit.sendKeys(customer);
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
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", salmaMagazine);
		salmaMagazine.click();
		UtilityMethods.wait2Seconds();
		casesubject.click();
		UtilityMethods.waitForPageLoadAndPageReady();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));

		clickCaseTypeField.click();

		new Select(caseTypeOption).selectByVisibleText("Complex Enquiry");
		
		UtilityMethods.wait3Seconds();

		clickCaseDescription.click();
		verifyCaseDescription.clear();
		verifyCaseDescription.sendKeys("desciption testing");

		complexEnquiryDescription.click();
		editDescription.sendKeys("some description over here too");
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		saveAndCloseButton.click();
		
		UtilityMethods.waitForPageLoadAndPageReady();
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));
		UtilityMethods.verifyElementDisplayed(findCriteria);
		
		Actions action = new Actions(driver);
		action.doubleClick(verifyObject).perform();
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		UtilityMethods.wait3Seconds();
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		
		assertEquals("Complex Enquiry",driver.findElement(By.xpath("//*[@id=\"header_process_casetypecode\"]/div[1]/span")).getText());
		UtilityMethods.wait3Seconds();
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		
	}
	
	public void createNewCaseWithCaseTypeNotification(String customer) throws Throwable{
	
		UtilityMethods.waitForPageLoadAndPageReady();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		
		mainCustomerType.click();
		mainCustomerTypeEdit.sendKeys(customer);
		UtilityMethods.wait3Seconds();
		
		moveToCaseSubject.click();
		expandCaseSubject.click();
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();

		new WebDriverWait(driver, 60).until(
				ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='InlineDialog_Iframe']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='InlineDialog_Iframe']")));

		gettingAround.click();
		UtilityMethods.waitForPageLoadAndPageReady();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", taxi);
		taxi.click();
		UtilityMethods.waitForPageLoadAndPageReady();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", dubaiTaxi);
		dubaiTaxi.click();
		casesubject.click();
		UtilityMethods.waitForPageLoadAndPageReady();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));

		clickCaseTypeField.click();

		new Select(caseTypeOption).selectByVisibleText("Notification");
		
		UtilityMethods.wait3Seconds();

		clickCaseDescription.click();
		verifyCaseDescription.clear();
		verifyCaseDescription.sendKeys("desciption testing");
		
		defectReason.click();
		new Select(defectReasonOptionSet).selectByVisibleText("Cleanliness");
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		saveAndCloseButton.click();
		
		UtilityMethods.waitForPageLoadAndPageReady();
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));
		UtilityMethods.verifyElementDisplayed(findCriteria);
		
		Actions action = new Actions(driver);
		action.doubleClick(verifyObject).perform();
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		UtilityMethods.wait3Seconds();
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		
		assertEquals("Notification",driver.findElement(By.xpath("//*[@id=\"header_process_casetypecode\"]/div[1]/span")).getText());
		UtilityMethods.wait3Seconds();
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		
	}
	
	public void createNewCaseWithCaseTypeMBRIdea(String customer) throws Throwable{
		
		UtilityMethods.waitForPageLoadAndPageReady();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		
		mainCustomerType.click();
		mainCustomerTypeEdit.sendKeys(customer);
		UtilityMethods.wait3Seconds();
		
		moveToCaseSubject.click();
		expandCaseSubject.click();
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();

		new WebDriverWait(driver, 60).until(
				ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='InlineDialog_Iframe']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='InlineDialog_Iframe']")));

		mbr.click();
		UtilityMethods.waitForPageLoadAndPageReady();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", dubaiTaxiCeo);
		dubaiTaxiCeo.click();
		
		casesubject.click();
		UtilityMethods.waitForPageLoadAndPageReady();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));

		clickCaseTypeField.click();

		new Select(caseTypeOption).selectByVisibleText("MBR Idea");
		
		UtilityMethods.wait3Seconds();

		clickCaseDescription.click();
		verifyCaseDescription.clear();
		verifyCaseDescription.sendKeys("desciption testing");
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		saveAndCloseButton.click();
		
		UtilityMethods.waitForPageLoadAndPageReady();
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));
		UtilityMethods.verifyElementDisplayed(findCriteria);
		
		Actions action = new Actions(driver);
		action.doubleClick(verifyObject).perform();
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		UtilityMethods.wait3Seconds();
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		
		assertEquals("MBR Idea",driver.findElement(By.xpath("//*[@id=\"header_process_casetypecode\"]/div[1]/span")).getText());
		UtilityMethods.wait3Seconds();
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		
	}
	
	public void createNewCaseWithCaseTypeMBRComment(String customer) throws Throwable{
		
		UtilityMethods.waitForPageLoadAndPageReady();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		
		mainCustomerType.click();
		mainCustomerTypeEdit.sendKeys(customer);
		UtilityMethods.wait3Seconds();
		
		moveToCaseSubject.click();
		expandCaseSubject.click();
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();

		new WebDriverWait(driver, 60).until(
				ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='InlineDialog_Iframe']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='InlineDialog_Iframe']")));

		mbr.click();
		UtilityMethods.waitForPageLoadAndPageReady();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", dubaiTaxiCeo);
		dubaiTaxiCeo.click();
		
		casesubject.click();
		UtilityMethods.waitForPageLoadAndPageReady();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));

		clickCaseTypeField.click();

		new Select(caseTypeOption).selectByVisibleText("MBR Comment");
		
		UtilityMethods.wait3Seconds();

		clickCaseDescription.click();
		verifyCaseDescription.clear();
		verifyCaseDescription.sendKeys("desciption testing");
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		saveAndCloseButton.click();
		
		UtilityMethods.waitForPageLoadAndPageReady();
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));
		UtilityMethods.verifyElementDisplayed(findCriteria);
		
		Actions action = new Actions(driver);
		action.doubleClick(verifyObject).perform();
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		UtilityMethods.wait3Seconds();
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		
		assertEquals("MBR Comment",driver.findElement(By.xpath("//*[@id=\"header_process_casetypecode\"]/div[1]/span")).getText());
		UtilityMethods.wait3Seconds();
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		
	}
	
	public void createNewCaseWithCaseTypeGrievance() throws Throwable{
		
		UtilityMethods.waitForPageLoadAndPageReady();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		
		mainCustomerType.click();
		mainCustomerTypeSearchBox.click();
		UtilityMethods.wait3Seconds();
		lookMoreRecord.click();
		
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
		
		moveToCaseSubject.click();
		expandCaseSubject.click();
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();

		new WebDriverWait(driver, 60).until(
				ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='InlineDialog_Iframe']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='InlineDialog_Iframe']")));

		expandAboutRta.click();
		UtilityMethods.waitForPageLoadAndPageReady();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", salmaMagazine);
		salmaMagazine.click();
		
		casesubject.click();
		UtilityMethods.waitForPageLoadAndPageReady();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));

		clickCaseTypeField.click();

		new Select(caseTypeOption).selectByVisibleText("Grievance");
		
		UtilityMethods.wait3Seconds();

		clickCaseDescription.click();
		verifyCaseDescription.clear();
		verifyCaseDescription.sendKeys("desciption testing");
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		saveAndCloseButton.click();
		
		UtilityMethods.waitForPageLoadAndPageReady();
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));
		UtilityMethods.verifyElementDisplayed(findCriteria);
		
		Actions action = new Actions(driver);
		action.doubleClick(verifyObject).perform();
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		UtilityMethods.wait3Seconds();
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		
		assertEquals("Grievance",driver.findElement(By.xpath("//*[@id=\"header_process_casetypecode\"]/div[1]/span")).getText());
		UtilityMethods.wait3Seconds();
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		
	}
	
	public void createNewCaseWithCaseTypeFineObjection(String customer) throws Throwable{
		
		UtilityMethods.waitForPageLoadAndPageReady();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		
		mainCustomerType.click();
		mainCustomerTypeEdit.sendKeys(customer);
		UtilityMethods.wait3Seconds();

		moveToCaseSubject.click();
		expandCaseSubject.click();
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();

		new WebDriverWait(driver, 60).until(
				ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='InlineDialog_Iframe']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='InlineDialog_Iframe']")));

		expandRodaUser.click();
		UtilityMethods.waitForPageLoadAndPageReady();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", expandSalikUser);
		expandSalikUser.click();
		UtilityMethods.waitForPageLoadAndPageReady();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", selectSalikFine);
		selectSalikFine.click();
		
		casesubject.click();
		UtilityMethods.waitForPageLoadAndPageReady();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));

		clickCaseTypeField.click();

		new Select(caseTypeOption).selectByVisibleText("Fine Objection");
		
		UtilityMethods.wait3Seconds();

		clickCaseDescription.click();
		verifyCaseDescription.clear();
		verifyCaseDescription.sendKeys("desciption testing");
		
		fineNumber.click();
		editFineNumber.sendKeys("number123");
		editFineNumber.sendKeys(Keys.TAB);
		
		editFineAmount.sendKeys("463");
		editFineAmount.sendKeys(Keys.TAB);
		
		fineObjectionDate.click();
		currentDate.click();
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		saveAndCloseButton.click();
		
		UtilityMethods.waitForPageLoadAndPageReady();
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));
		UtilityMethods.verifyElementDisplayed(findCriteria);
		
		Actions action = new Actions(driver);
		action.doubleClick(verifyObject).perform();
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		UtilityMethods.wait3Seconds();
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		
		assertEquals("Fine Objection",driver.findElement(By.xpath("//*[@id=\"header_process_casetypecode\"]/div[1]/span")).getText());
		UtilityMethods.wait3Seconds();
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		
	}	

////////////////////////////Update cases starts from here////////////////////////////////////////	
	
	
	public void updateCaseWithCaseTypeComplaint() throws Throwable{
		
		UtilityMethods.waitForPageLoadAndPageReady();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));
		UtilityMethods.wait3Seconds();
	
		UtilityMethods.clickElemetJavaSciptExecutor(filter);
		
		UtilityMethods.clickElemetJavaSciptExecutor(caseTypeFilter);

		UtilityMethods.wait2Seconds();
		JavascriptExecutor executer = (JavascriptExecutor) driver;
		executer.executeScript("arguments[0].scrollIntoView(true);",selectComplaintFilter);
		UtilityMethods.clickElemetJavaSciptExecutor(selectComplaintFilter);
		UtilityMethods.clickElemetJavaSciptExecutor(selectOkFilter);
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.wait3Seconds();
		
		((JavascriptExecutor)driver).executeScript("var evt = document.createEvent('MouseEvents');" + "evt.initMouseEvent('dblclick',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);" + "arguments[0].dispatchEvent(evt);",verifyObject);
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		
		naviagateToInitiationAndDispatch.click();
		UtilityMethods.clickElemetJavaSciptExecutor(searchSubject);
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();

		new WebDriverWait(driver, 60).until(
				ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='InlineDialog_Iframe']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='InlineDialog_Iframe']")));

		selectCaseSubject.click();
		UtilityMethods.waitForPageLoadAndPageReady();
		casesubject.click();
		UtilityMethods.waitForPageLoadAndPageReady();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		
		caseTypeFieldFrame.click();
		new Select(caseTypeFieldFrameDropDown).selectByVisibleText("Suggestion");
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		saveAndCloseButton.click();
	
	}
	
	public void updateCaseWithCaseTypeSuggestion() throws Throwable{
		
		UtilityMethods.waitForPageLoadAndPageReady();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));
		UtilityMethods.wait3Seconds();
	
		UtilityMethods.clickElemetJavaSciptExecutor(filter);
		
		UtilityMethods.clickElemetJavaSciptExecutor(caseTypeFilter);

		UtilityMethods.wait2Seconds();
		JavascriptExecutor executer = (JavascriptExecutor) driver;
		executer.executeScript("arguments[0].scrollIntoView(true);",selectSuggestionFilter);
		UtilityMethods.clickElemetJavaSciptExecutor(selectSuggestionFilter);
		UtilityMethods.clickElemetJavaSciptExecutor(selectOkFilter);
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.wait3Seconds();
		
		((JavascriptExecutor)driver).executeScript("var evt = document.createEvent('MouseEvents');" + "evt.initMouseEvent('dblclick',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);" + "arguments[0].dispatchEvent(evt);",verifyObject);
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		
		naviagateToInitiationAndDispatch.click();
		UtilityMethods.clickElemetJavaSciptExecutor(searchSubject);
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();

		new WebDriverWait(driver, 60).until(
				ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='InlineDialog_Iframe']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='InlineDialog_Iframe']")));

		selectCaseSubject.click();
		UtilityMethods.waitForPageLoadAndPageReady();
		casesubject.click();
		UtilityMethods.waitForPageLoadAndPageReady();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		
		caseTypeFieldFrame.click();
		new Select(caseTypeFieldFrameDropDown).selectByVisibleText("Complaint");
		
		UtilityMethods.verifyElementDisplayed(complaintReasons);
		complaintReasons.click();
		new Select(complaintReasonOptions).selectByVisibleText("Airconditioning Problem");
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		saveAndCloseButton.click();
	
	}
	
	public void updateCaseWithCaseTypeRequest() throws Throwable{
		
		UtilityMethods.waitForPageLoadAndPageReady();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));
		UtilityMethods.wait3Seconds();
	
		UtilityMethods.clickElemetJavaSciptExecutor(filter);
		
		UtilityMethods.clickElemetJavaSciptExecutor(caseTypeFilter);

		UtilityMethods.wait2Seconds();
		JavascriptExecutor executer = (JavascriptExecutor) driver;
		executer.executeScript("arguments[0].scrollIntoView(true);",selectRequestFilter);
		UtilityMethods.clickElemetJavaSciptExecutor(selectRequestFilter);
		UtilityMethods.clickElemetJavaSciptExecutor(selectOkFilter);
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.wait3Seconds();
		
		((JavascriptExecutor)driver).executeScript("var evt = document.createEvent('MouseEvents');" + "evt.initMouseEvent('dblclick',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);" + "arguments[0].dispatchEvent(evt);",verifyObject);
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		
		
		naviagateToInitiationAndDispatch.click();
		UtilityMethods.clickElemetJavaSciptExecutor(searchSubject);
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();

		new WebDriverWait(driver, 60).until(
				ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='InlineDialog_Iframe']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='InlineDialog_Iframe']")));

		selectCaseSubject.click();
		UtilityMethods.waitForPageLoadAndPageReady();
		casesubject.click();
		UtilityMethods.waitForPageLoadAndPageReady();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		
		caseTypeFieldFrame.click();
		new Select(caseTypeFieldFrameDropDown).selectByVisibleText("Suggestion");
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		saveAndCloseButton.click();
	
	}
	
	public void updateCaseWithCaseTypeEmergency() throws Throwable{
		
		UtilityMethods.waitForPageLoadAndPageReady();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));
		UtilityMethods.wait3Seconds();
	
		UtilityMethods.clickElemetJavaSciptExecutor(filter);
		
		UtilityMethods.clickElemetJavaSciptExecutor(caseTypeFilter);

		UtilityMethods.wait2Seconds();
		JavascriptExecutor executer = (JavascriptExecutor) driver;
		executer.executeScript("arguments[0].scrollIntoView(true);",selectEmergencyFilter);
		UtilityMethods.clickElemetJavaSciptExecutor(selectEmergencyFilter);
		UtilityMethods.clickElemetJavaSciptExecutor(selectOkFilter);
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.wait3Seconds();
		
		((JavascriptExecutor)driver).executeScript("var evt = document.createEvent('MouseEvents');" + "evt.initMouseEvent('dblclick',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);" + "arguments[0].dispatchEvent(evt);",verifyObject);
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		
		naviagateToInitiationAndDispatch.click();
		UtilityMethods.clickElemetJavaSciptExecutor(headerSerachSubject);
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();

		new WebDriverWait(driver, 60).until(
				ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='InlineDialog_Iframe']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='InlineDialog_Iframe']")));

		selectCaseSubject.click();
		UtilityMethods.waitForPageLoadAndPageReady();
		casesubject.click();
		UtilityMethods.waitForPageLoadAndPageReady();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		
		caseTypeFieldFrame.click();
		new Select(caseTypeFieldFrameDropDown).selectByVisibleText("Suggestion");
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		saveAndCloseButton.click();
		
	}
	
	public void updateCaseWithCaseTypeLostItem() throws Throwable{
		
		UtilityMethods.waitForPageLoadAndPageReady();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));
		UtilityMethods.wait3Seconds();
	
		UtilityMethods.clickElemetJavaSciptExecutor(filter);
		
		UtilityMethods.clickElemetJavaSciptExecutor(caseTypeFilter);

		UtilityMethods.wait2Seconds();
		JavascriptExecutor executer = (JavascriptExecutor) driver;
		executer.executeScript("arguments[0].scrollIntoView(true);",selectLostItemFilter);
		UtilityMethods.clickElemetJavaSciptExecutor(selectLostItemFilter);
		UtilityMethods.clickElemetJavaSciptExecutor(selectOkFilter);
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.wait3Seconds();
		
		((JavascriptExecutor)driver).executeScript("var evt = document.createEvent('MouseEvents');" + "evt.initMouseEvent('dblclick',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);" + "arguments[0].dispatchEvent(evt);",verifyObject);
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		
		naviagateToInitiationAndDispatch.click();
		UtilityMethods.clickElemetJavaSciptExecutor(headerSerachSubject);
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();

		new WebDriverWait(driver, 60).until(
				ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='InlineDialog_Iframe']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='InlineDialog_Iframe']")));

		selectCaseSubject.click();
		UtilityMethods.waitForPageLoadAndPageReady();
		casesubject.click();
		UtilityMethods.waitForPageLoadAndPageReady();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		
		caseTypeFieldFrame.click();
		new Select(caseTypeFieldFrameDropDown).selectByVisibleText("Suggestion");
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		saveAndCloseButton.click();
		
	}
	
	public void updateCaseWithCaseTypeFineObjection() throws Throwable{
		
		UtilityMethods.waitForPageLoadAndPageReady();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));
		UtilityMethods.wait3Seconds();
	
		UtilityMethods.clickElemetJavaSciptExecutor(filter);
		
		UtilityMethods.clickElemetJavaSciptExecutor(caseTypeFilter);

		UtilityMethods.wait2Seconds();
		JavascriptExecutor executer = (JavascriptExecutor) driver;
		executer.executeScript("arguments[0].scrollIntoView(true);",fineObjectionFilter);
		UtilityMethods.clickElemetJavaSciptExecutor(fineObjectionFilter);
		UtilityMethods.clickElemetJavaSciptExecutor(selectOkFilter);
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.wait3Seconds();
		
		((JavascriptExecutor)driver).executeScript("var evt = document.createEvent('MouseEvents');" + "evt.initMouseEvent('dblclick',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);" + "arguments[0].dispatchEvent(evt);",verifyObject);
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		
		
		naviagateToInitiationAndDispatch.click();
		UtilityMethods.clickElemetJavaSciptExecutor(headerSerachSubject);
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();

		new WebDriverWait(driver, 60).until(
				ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='InlineDialog_Iframe']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='InlineDialog_Iframe']")));

		selectCaseSubject.click();
		UtilityMethods.waitForPageLoadAndPageReady();
		casesubject.click();
		UtilityMethods.waitForPageLoadAndPageReady();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		
		caseTypeFieldFrame.click();
		new Select(caseTypeFieldFrameDropDown).selectByVisibleText("Suggestion");
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		saveAndCloseButton.click();
		
	}
	
	public void updateCaseWithCaseTypeGrievance() throws Throwable{
		
		UtilityMethods.waitForPageLoadAndPageReady();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));
		UtilityMethods.wait3Seconds();
	
		UtilityMethods.clickElemetJavaSciptExecutor(filter);
		
		UtilityMethods.clickElemetJavaSciptExecutor(caseTypeFilter);

		UtilityMethods.wait2Seconds();
		JavascriptExecutor executer = (JavascriptExecutor) driver;
		executer.executeScript("arguments[0].scrollIntoView(true);",grievanceFilter);
		UtilityMethods.clickElemetJavaSciptExecutor(grievanceFilter);
		UtilityMethods.clickElemetJavaSciptExecutor(selectOkFilter);
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.wait3Seconds();
		
		((JavascriptExecutor)driver).executeScript("var evt = document.createEvent('MouseEvents');" + "evt.initMouseEvent('dblclick',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);" + "arguments[0].dispatchEvent(evt);",verifyObject);
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		
		naviagateToInitiationAndDispatch.click();
		UtilityMethods.clickElemetJavaSciptExecutor(headerSerachSubject);
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();

		new WebDriverWait(driver, 60).until(
				ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='InlineDialog_Iframe']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='InlineDialog_Iframe']")));

		selectCaseSubject.click();
		UtilityMethods.waitForPageLoadAndPageReady();
		casesubject.click();
		UtilityMethods.waitForPageLoadAndPageReady();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		
		caseTypeFieldFrame.click();
		new Select(caseTypeFieldFrameDropDown).selectByVisibleText("Suggestion");
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		saveAndCloseButton.click();
		
	}
	
	public void updateCaseWithCaseTypeMBRIdea() throws Throwable{
		
		UtilityMethods.waitForPageLoadAndPageReady();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));
		UtilityMethods.wait3Seconds();
	
		UtilityMethods.clickElemetJavaSciptExecutor(filter);
		
		UtilityMethods.clickElemetJavaSciptExecutor(caseTypeFilter);

		UtilityMethods.wait2Seconds();
		JavascriptExecutor executer = (JavascriptExecutor) driver;
		executer.executeScript("arguments[0].scrollIntoView(true);",mbrIdeaFilter);
		UtilityMethods.clickElemetJavaSciptExecutor(mbrIdeaFilter);
		UtilityMethods.clickElemetJavaSciptExecutor(selectOkFilter);
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.wait3Seconds();
		
		((JavascriptExecutor)driver).executeScript("var evt = document.createEvent('MouseEvents');" + "evt.initMouseEvent('dblclick',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);" + "arguments[0].dispatchEvent(evt);",verifyObject);
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		
		naviagateToInitiationAndDispatch.click();
		UtilityMethods.clickElemetJavaSciptExecutor(headerSerachSubject);
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();

		new WebDriverWait(driver, 60).until(
				ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='InlineDialog_Iframe']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='InlineDialog_Iframe']")));

		selectCaseSubject.click();
		UtilityMethods.waitForPageLoadAndPageReady();
		casesubject.click();
		UtilityMethods.waitForPageLoadAndPageReady();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		
		caseTypeFieldFrame.click();
		new Select(caseTypeFieldFrameDropDown).selectByVisibleText("Suggestion");
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		saveAndCloseButton.click();
		
	}
	
	public void updateCaseWithCaseTypeMBRComment() throws Throwable{
		
		UtilityMethods.waitForPageLoadAndPageReady();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));
		UtilityMethods.wait3Seconds();
	
		UtilityMethods.clickElemetJavaSciptExecutor(filter);
		
		UtilityMethods.clickElemetJavaSciptExecutor(caseTypeFilter);

		UtilityMethods.wait2Seconds();
		JavascriptExecutor executer = (JavascriptExecutor) driver;
		executer.executeScript("arguments[0].scrollIntoView(true);",mbrCommentFilter);
		UtilityMethods.clickElemetJavaSciptExecutor(mbrCommentFilter);
		UtilityMethods.clickElemetJavaSciptExecutor(selectOkFilter);
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.wait3Seconds();
		
		((JavascriptExecutor)driver).executeScript("var evt = document.createEvent('MouseEvents');" + "evt.initMouseEvent('dblclick',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);" + "arguments[0].dispatchEvent(evt);",verifyObject);
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		
		naviagateToInitiationAndDispatch.click();
		UtilityMethods.clickElemetJavaSciptExecutor(headerSerachSubject);
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();

		new WebDriverWait(driver, 60).until(
				ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='InlineDialog_Iframe']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='InlineDialog_Iframe']")));

		selectCaseSubject.click();
		UtilityMethods.waitForPageLoadAndPageReady();
		casesubject.click();
		UtilityMethods.waitForPageLoadAndPageReady();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		
		caseTypeFieldFrame.click();
		new Select(caseTypeFieldFrameDropDown).selectByVisibleText("Suggestion");
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		saveAndCloseButton.click();
		
	}
	
	public void updateCaseWithCaseTypeNotification() throws Throwable{
		
		UtilityMethods.waitForPageLoadAndPageReady();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));
		UtilityMethods.wait3Seconds();
	
		UtilityMethods.clickElemetJavaSciptExecutor(filter);
		
		UtilityMethods.clickElemetJavaSciptExecutor(caseTypeFilter);

		UtilityMethods.wait2Seconds();
		JavascriptExecutor executer = (JavascriptExecutor) driver;
		executer.executeScript("arguments[0].scrollIntoView(true);",notificationFilter);
		UtilityMethods.clickElemetJavaSciptExecutor(notificationFilter);
		UtilityMethods.clickElemetJavaSciptExecutor(selectOkFilter);
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.wait3Seconds();
		
		((JavascriptExecutor)driver).executeScript("var evt = document.createEvent('MouseEvents');" + "evt.initMouseEvent('dblclick',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);" + "arguments[0].dispatchEvent(evt);",verifyObject);
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		
		naviagateToInitiationAndDispatch.click();
		UtilityMethods.clickElemetJavaSciptExecutor(headerSerachSubject);
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();

		new WebDriverWait(driver, 60).until(
				ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='InlineDialog_Iframe']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='InlineDialog_Iframe']")));

		selectCaseSubject.click();
		UtilityMethods.waitForPageLoadAndPageReady();
		casesubject.click();
		UtilityMethods.waitForPageLoadAndPageReady();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		
		caseTypeFieldFrame.click();
		new Select(caseTypeFieldFrameDropDown).selectByVisibleText("Suggestion");
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		saveAndCloseButton.click();
		
	}
	
	public void updateCaseWithCaseTypeComplexEnquiry() throws Throwable{
		
		UtilityMethods.waitForPageLoadAndPageReady();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));
		UtilityMethods.wait3Seconds();
	
		UtilityMethods.clickElemetJavaSciptExecutor(filter);
		
		UtilityMethods.clickElemetJavaSciptExecutor(caseTypeFilter);

		UtilityMethods.wait2Seconds();
		JavascriptExecutor executer = (JavascriptExecutor) driver;
		executer.executeScript("arguments[0].scrollIntoView(true);",complexEnquiryFilter);
		UtilityMethods.clickElemetJavaSciptExecutor(complexEnquiryFilter);
		UtilityMethods.clickElemetJavaSciptExecutor(selectOkFilter);
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.wait3Seconds();
		
		((JavascriptExecutor)driver).executeScript("var evt = document.createEvent('MouseEvents');" + "evt.initMouseEvent('dblclick',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);" + "arguments[0].dispatchEvent(evt);",verifyObject);
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		
		naviagateToInitiationAndDispatch.click();
		UtilityMethods.clickElemetJavaSciptExecutor(headerSerachSubject);
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();

		new WebDriverWait(driver, 60).until(
				ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='InlineDialog_Iframe']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='InlineDialog_Iframe']")));

		selectCaseSubject.click();
		UtilityMethods.waitForPageLoadAndPageReady();
		casesubject.click();
		UtilityMethods.waitForPageLoadAndPageReady();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		
		caseTypeFieldFrame.click();
		new Select(caseTypeFieldFrameDropDown).selectByVisibleText("Suggestion");
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		saveAndCloseButton.click();
		
	}
	
	public void updateCaseWithCaseTypeCompliment() throws Throwable{
		
		UtilityMethods.waitForPageLoadAndPageReady();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));
		UtilityMethods.wait3Seconds();
	
		UtilityMethods.clickElemetJavaSciptExecutor(filter);
		
		UtilityMethods.clickElemetJavaSciptExecutor(caseTypeFilter);

		UtilityMethods.wait2Seconds();
		JavascriptExecutor executer = (JavascriptExecutor) driver;
		executer.executeScript("arguments[0].scrollIntoView(true);",complimentFilter);
		UtilityMethods.clickElemetJavaSciptExecutor(complimentFilter);
		UtilityMethods.clickElemetJavaSciptExecutor(selectOkFilter);
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.wait3Seconds();
		
		((JavascriptExecutor)driver).executeScript("var evt = document.createEvent('MouseEvents');" + "evt.initMouseEvent('dblclick',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);" + "arguments[0].dispatchEvent(evt);",verifyObject);
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		
		naviagateToInitiationAndDispatch.click();
		UtilityMethods.clickElemetJavaSciptExecutor(headerSerachSubject);
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();

		new WebDriverWait(driver, 60).until(
				ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='InlineDialog_Iframe']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='InlineDialog_Iframe']")));

		selectCaseSubject.click();
		UtilityMethods.waitForPageLoadAndPageReady();
		casesubject.click();
		UtilityMethods.waitForPageLoadAndPageReady();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		
		caseTypeFieldFrame.click();
		new Select(caseTypeFieldFrameDropDown).selectByVisibleText("Suggestion");
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		saveAndCloseButton.click();
		
	}
	
	///////////////////// Resolve case starts here ///////////////////
	
	public void assignToDepartment() throws Throwable{
		
		UtilityMethods.wait3Seconds();
		UtilityMethods.wait2Seconds();
		
		UtilityMethods.waitForPageLoadAndPageReady();
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));

		
		assignToDepartmentButton.click();
		UtilityMethods.wait3Seconds();
		UtilityMethods.clickOkatAlertIfPresent();
		UtilityMethods.wait3Seconds();
		UtilityMethods.waitForPageLoadAndPageReady();
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		UtilityMethods.wait3Seconds();
		
		mainCaseBelongs.click();
		String parent_window = driver.getWindowHandle();
		new Select(mainCaseBelongsOption).selectByVisibleText("Yes");
		
		Set<String> allWindows = driver.getWindowHandles();
		for(String child:allWindows)
		    if(!parent_window.equalsIgnoreCase(child))
		        driver.switchTo().window(child);
		System.out.println(driver.getTitle());
		String child_window = driver.getWindowHandle();
		System.out.println("Child 1 Window ID is : "+child_window);
	
		driver.findElement(By.id("InteractionStep2_prompt")).click();
		
		departmentComment.sendKeys("department Comment");
		nextButton.click();
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.wait3Seconds();
		
		finishButton.click();
		
		driver.switchTo().window(parent_window);
		UtilityMethods.wait3Seconds();
		saveButton.click();
		
		
	}
	
	public void assignToFollowUp() throws Throwable{
	
		if(driver.findElements(By.cssSelector("iframe[name='contentIFrame1']")).size()!=0){
			
			new WebDriverWait(driver, 60)
			.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
			
			
		}
		else if(driver.findElements(By.cssSelector("iframe[name='contentIFrame0']")).size()!=0){
			
			new WebDriverWait(driver, 60)
			.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
			
			
		}
		
		new WebDriverWait(driver,20)
		.until(ExpectedConditions.elementToBeClickable(assignToFollowUpButton));
		
		UtilityMethods.wait3Seconds();
		UtilityMethods.wait3Seconds();
		
		new Actions(driver).doubleClick(assignToFollowUpButton).build().perform();

		UtilityMethods.wait3Seconds();
		UtilityMethods.clickOkatAlertIfPresent();
		UtilityMethods.wait3Seconds();
		
		UtilityMethods.waitForPageLoadAndPageReady();
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

		/////////////////PHASE TWO CODE/////////////////////
		String parent_window1 = driver.getWindowHandle();

		Set<String> allWindows1 = driver.getWindowHandles();
		for(String child:allWindows1)
			if(!parent_window1.equalsIgnoreCase(child))
				driver.switchTo().window(child);
		System.out.println(driver.getTitle());
		String child_window = driver.getWindowHandle();
		System.out.println("Child 2 Window ID is : "+child_window);
		new WebDriverWait(driver,60).until(ExpectedConditions.elementToBeClickable(By.id("btnUpdate")));

		driver.findElement(By.id("btnUpdate")).click();
		driver.switchTo().window(parent_window1);
		////////////////////////////////////////////////////
		
		//new Actions(driver).doubleClick(verifyObject).perform();
		Thread.sleep(5000);
		UtilityMethods.waitForPageLoadAndPageReady();
		//UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		if(driver.findElements(By.cssSelector("iframe[name='contentIFrame1']")).size()!=0){
			
			new WebDriverWait(driver, 80)
			.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
			driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
			
		}
		else if(driver.findElements(By.cssSelector("iframe[name='contentIFrame0']")).size()!=0){
			
			new WebDriverWait(driver, 80)
			.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
			driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));
			
		}
		UtilityMethods.wait3Seconds();
		UtilityMethods.waitForPageLoadAndPageReady();
		String parent_window = driver.getWindowHandle();
		readyToCloseField.click();
		
		
		new Select(readyToCloseOptionSet).selectByVisibleText("Yes");
		Set<String> allWindows = driver.getWindowHandles();
		for(String child2:allWindows)
		    if(!parent_window.equalsIgnoreCase(child2))
		        driver.switchTo().window(child2);
		System.out.println(driver.getTitle());
		String child_window2 = driver.getWindowHandle();
		System.out.println("Child 2 Window ID is : "+child_window2);
		UtilityMethods.wait3Seconds();
		driver.findElement(By.id("InteractionStep2_prompt")).click();
		
		departmentComment.sendKeys("department Comment");
		nextButton.click();
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.wait3Seconds();
		
		finishButton.click();
		
		driver.switchTo().window(parent_window);
		UtilityMethods.wait3Seconds();
		saveButton.click();
		
	}
	
	public void navigateToClosure() throws Throwable{

		/////////////ADDING BELOW CODE IN PHASE TWO///////////////
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		Thread.sleep(5000);
		//new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(By.id("WebResource_rta_htmlTouchPointDefinationRelatedQuestions")));

		if(UtilityMethods.isElementPresent(By.id("WebResource_rta_htmlTouchPointDefinationRelatedQuestions")))
		{
			driver.switchTo().frame(driver.findElement(By.id("WebResource_rta_htmlTouchPointDefinationRelatedQuestions")));
			Thread.sleep(5000);
		}
		new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(By.id("rta_answer_1")));

		if (driver.findElement(By.id("rta_answer_1")).getAttribute("value").length() <= 0)
		{
			if(UtilityMethods.isElementPresent(By.id("rta_answer_1")))
			{
				driver.findElement(By.id("rta_answer_1")).click();
				UtilityMethods.wait2Seconds();
				driver.findElement(By.id("rta_answer_1")).sendKeys("Touch Point Test Comments");
			}

			if(UtilityMethods.isElementPresent(By.id("rta_answer_2")))
			{
				driver.findElement(By.id("rta_answer_2")).click();
				driver.findElement(By.id("rta_answer_2")).sendKeys("Test Payment Method");
			}
			if(UtilityMethods.isElementPresent(By.id("rta_answer_3")))
			{
				driver.findElement(By.id("rta_answer_3")).click();
				driver.findElement(By.id("rta_answer_3")).sendKeys("Test Reference ID");
				driver.switchTo().parentFrame();
			}
		}


		driver.switchTo().parentFrame();

		/////////////////////////////////////////////////////////
		
		UtilityMethods.waitForPageLoadAndPageReady();
		if(driver.findElements(By.cssSelector("iframe[name='contentIFrame1']")).size()!=0){

			new WebDriverWait(driver, 60)
			.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
			driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
			System.out.println("Frame1");

		}
		else if(driver.findElements(By.cssSelector("iframe[name='contentIFrame0']")).size()!=0){

			new WebDriverWait(driver, 60)
			.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
			driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));
			System.out.println("Frame0");

		}
		UtilityMethods.wait3Seconds();
		
		nextStepButton.click();
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.wait3Seconds();
		UtilityMethods.wait10Seconds();
		new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOf(finishCaseButton));
		finishCaseButton.click();
		
	}
	
	public void resolveCaseForComplaintCases() throws Throwable{
		
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
		new Select(statusReasonResolveCase).selectByIndex(1);
		UtilityMethods.wait3Seconds();
		satisfactionResloveCase.click();
		new Select(satisfactionResloveCase).selectByIndex(1);
		UtilityMethods.wait3Seconds();
		caseResolutionDescription.sendKeys("Case Resolution");
		okButton.click();
	
		
	}
	
	public void resolveCaseForComplimentCase() throws Throwable{
		
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
		new Select(statusReasonResolveCase).selectByIndex(1);
		UtilityMethods.wait2Seconds();
		satisfactionResloveCase.click();
		new Select(satisfactionResloveCase).selectByIndex(1);
		UtilityMethods.wait3Seconds();
		caseResolutionDescription.sendKeys("Case Resolution");
		okButton.click();
		
	}
	
	public void verifyResolveCase() throws Throwable{
		
		try {
			for (String winHandle : driver.getWindowHandles()) {
				driver.switchTo().window(winHandle);
			}

		} catch (NoAlertPresentException Ex) {
			System.out.print("NoAlertPresentException");

		}

		UtilityMethods.wait3Seconds();

		WebDriverWait wait = new WebDriverWait(driver, 15);

		UtilityMethods.waitForPageLoadAndPageReady();
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
		assertEquals("Resolved", stateCode.getAttribute("title"));
		
	}
	
	public void resolveCaseForSuggestionCase() throws Throwable{
		
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
		new Select(statusReasonResolveCase).selectByIndex(1);
		UtilityMethods.wait3Seconds();
		satisfactionResloveCase.click();
		new Select(satisfactionResloveCase).selectByIndex(1);
		UtilityMethods.wait3Seconds();
		caseResolutionDescription.sendKeys("Case Resolution");
		okButton.click();
		
	}
	
	public void resloveCaseForRequestCase() throws Throwable{
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		UtilityMethods.wait3Seconds();
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
		new Select(statusReasonResolveCase).selectByIndex(1);
		UtilityMethods.wait3Seconds();
		satisfactionResloveCase.click();
		new Select(satisfactionResloveCase).selectByIndex(1);
		UtilityMethods.wait3Seconds();
		caseResolutionDescription.sendKeys("Case Resolution");
		
		okButton.click();
		
	}
	
	public void resolveCaseForComplexEnquiry() throws Throwable{
		
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
		new Select(statusReasonResolveCase).selectByIndex(1);
		UtilityMethods.wait2Seconds();
		satisfactionResloveCase.click();
		new Select(satisfactionResloveCase).selectByIndex(1);
		UtilityMethods.wait3Seconds();
		caseResolutionDescription.sendKeys("Case Resolution");
		
		okButton.click();
		
	}
	
	public void resolveCaseForNotificationCase() throws Throwable{

		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='new_defectreason']//div[@class='ms-crm-Inline-Value ms-crm-Inline-EmptyValue']")));
		driver.findElement(By.xpath("//div[@id='new_defectreason']//div[@class='ms-crm-Inline-Value ms-crm-Inline-EmptyValue']")).click();

		new WebDriverWait(driver,60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//option[contains(text(),'Abuse reputation of authority and the Emirate')]")));
		driver.findElement(By.xpath("//option[contains(text(),'Abuse reputation of authority and the Emirate')]")).click();
		assignedEngineer.click();

		new WebDriverWait(driver,60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.id("new_assignedengineerid_ledit")));
		driver.findElement(By.id("new_assignedengineerid_ledit")).sendKeys("test tset");

		driver.switchTo().parentFrame();

		saveButton.click();
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.wait3Seconds();
		//UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
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
		new Select(statusReasonResolveCase).selectByIndex(1);
		satisfactionResloveCase.click();
		new Select(satisfactionResloveCase).selectByIndex(1);
		UtilityMethods.wait3Seconds();
		caseResolutionDescription.sendKeys("Case Resolution");
		
		okButton.click();
		
	}
	
	public void resolveCaseForMBRIdeaCase() throws Throwable{
		
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
		new Select(statusReasonResolveCase).selectByIndex(1);
		satisfactionResloveCase.click();
		new Select(satisfactionResloveCase).selectByIndex(1);
		UtilityMethods.wait3Seconds();
		caseResolutionDescription.sendKeys("Case Resolution");
		
		okButton.click();
		
	}
	
	public void resolveCaseForFineObjection() throws Throwable{
		
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
		new Select(statusReasonResolveCase).selectByIndex(1);
		satisfactionResloveCase.click();
		new Select(satisfactionResloveCase).selectByIndex(1);
		UtilityMethods.wait3Seconds();
		caseResolutionDescription.sendKeys("Case Resolution");
		
		okButton.click();
		
	}
	
	public void resolveCaseForEmergencyCase() throws Throwable{
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='new_defectreason']//div[@class='ms-crm-Inline-Value ms-crm-Inline-EmptyValue']")));
		driver.findElement(By.xpath("//div[@id='new_defectreason']//div[@class='ms-crm-Inline-Value ms-crm-Inline-EmptyValue']")).click();

		new WebDriverWait(driver,60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//option[contains(text(),'Abuse reputation of authority and the Emirate')]")));
		driver.findElement(By.xpath("//option[contains(text(),'Abuse reputation of authority and the Emirate')]")).click();
		assignedEngineer.click();

		new WebDriverWait(driver,60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.id("new_assignedengineerid_ledit")));
		driver.findElement(By.id("new_assignedengineerid_ledit")).sendKeys("test tset");

		driver.switchTo().parentFrame();

		saveButton.click();
		UtilityMethods.waitForPageLoadAndPageReady();
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
		new Select(statusReasonResolveCase).getOptions().get(1).click();
		UtilityMethods.wait3Seconds();
		satisfactionResloveCase.click();
		new Select(satisfactionResloveCase).getOptions().get(1).click();
		UtilityMethods.wait3Seconds();
		caseResolutionDescription.sendKeys("Case Resolution");
		
		okButton.click();
		
	}
	
	public void selectResolveCaseWithCaseTypeComplaint() throws Throwable{
		
		UtilityMethods.waitForPageLoadAndPageReady();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));
		UtilityMethods.wait3Seconds();
	
		UtilityMethods.clickElemetJavaSciptExecutor(filter);
		
		UtilityMethods.clickElemetJavaSciptExecutor(caseTypeFilter);

		UtilityMethods.wait2Seconds();
		JavascriptExecutor executer = (JavascriptExecutor) driver;
		executer.executeScript("arguments[0].scrollIntoView(true);",selectComplaintFilter);
		UtilityMethods.clickElemetJavaSciptExecutor(selectComplaintFilter);
		UtilityMethods.clickElemetJavaSciptExecutor(selectOkFilter);
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.wait3Seconds();
		
		UtilityMethods.clickElemetJavaSciptExecutor(statusTypeFilter);
		UtilityMethods.clickElemetJavaSciptExecutor(uncheckActive);
		UtilityMethods.clickElemetJavaSciptExecutor(resolvedFilter);
		UtilityMethods.clickElemetJavaSciptExecutor(statusOkFilter);
		UtilityMethods.waitForPageLoadAndPageReady();
		
		UtilityMethods.wait3Seconds();
		
		((JavascriptExecutor)driver).executeScript("var evt = document.createEvent('MouseEvents');" + "evt.initMouseEvent('dblclick',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);" + "arguments[0].dispatchEvent(evt);",verifyObject);
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.wait3Seconds();
		UtilityMethods.clickElemetJavaSciptExecutor(esclateGrievance);
		
		UtilityMethods.wait3Seconds();
		UtilityMethods.clickOkatAlertIfPresent();
		
		UtilityMethods.waitForPageLoadAndPageReady();
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		UtilityMethods.wait3Seconds();
		
		UtilityMethods.clickElemetJavaSciptExecutor(expandCaseSubject);
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();

		new WebDriverWait(driver, 60).until(
				ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='InlineDialog_Iframe']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='InlineDialog_Iframe']")));

		expandAboutRta.click();
		UtilityMethods.waitForPageLoadAndPageReady();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", salmaMagazine);
		salmaMagazine.click();
		casesubject.click();
		
		UtilityMethods.waitForPageLoadAndPageReady();
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		UtilityMethods.wait2Seconds();
		clickCaseDescription.click();
		verifyCaseDescription.clear();
		verifyCaseDescription.sendKeys("desciption testing");
		
		grievanceReason.click();
		new Select(grievanceReasonOptionSet).selectByVisibleText("Complaint");
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		saveButton.click();
		UtilityMethods.waitForPageLoadAndPageReady();
		
	}
	
	public void createNewCaseWithCaseTypeSuggestionAndSuggestionTypeInternalIndividualSuggestion() throws Throwable{
		
		UtilityMethods.waitForPageLoadAndPageReady();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		
		mainCustomerType.click();
		mainCustomerTypeEdit.sendKeys("RTA");
		mainCustomerTypeSearchBox.click();
		
		UtilityMethods.wait3Seconds();
		lookMoreRecord.click();
		
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
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));

		clickCaseTypeField.click();

		new Select(caseTypeOption).selectByVisibleText("Suggestion");
		
		UtilityMethods.wait2Seconds();
		clickCaseDescription.click();
		verifyCaseDescription.clear();
		verifyCaseDescription.sendKeys("desciption testing");
		
		suggestionType.click();
		new Select(suggestionTypeOptions).selectByVisibleText("Internal Individual Suggestion");
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		saveAndCloseButton.click();
		
		
		UtilityMethods.waitForPageLoadAndPageReady();
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));
		UtilityMethods.verifyElementDisplayed(findCriteria);
		
		Actions action = new Actions(driver);
		action.doubleClick(verifyObject).perform();
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		UtilityMethods.wait3Seconds();
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		
		assertEquals("Suggestion",driver.findElement(By.xpath("//*[@id=\"header_process_casetypecode\"]/div[1]/span")).getText());
		UtilityMethods.wait3Seconds();
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		
	}
	
	public void createNewCaseWithCaseTypeSuggestionAndSuggestionTypeInternalGroupSuggestion() throws Throwable{
		
		UtilityMethods.waitForPageLoadAndPageReady();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		
		mainCustomerType.click();
		mainCustomerTypeEdit.sendKeys("RTA");
		mainCustomerTypeSearchBox.click();
		
		UtilityMethods.wait3Seconds();
		lookMoreRecord.click();
		
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
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));

		clickCaseTypeField.click();

		new Select(caseTypeOption).selectByVisibleText("Suggestion");
		
		UtilityMethods.wait2Seconds();
		clickCaseDescription.click();
		verifyCaseDescription.clear();
		verifyCaseDescription.sendKeys("desciption testing");
		
		suggestionType.click();
		new Select(suggestionTypeOptions).selectByVisibleText("Internal Group Suggestion");
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		saveAndCloseButton.click();
		
		
		UtilityMethods.waitForPageLoadAndPageReady();
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));
		UtilityMethods.verifyElementDisplayed(findCriteria);
		
		Actions action = new Actions(driver);
		action.doubleClick(verifyObject).perform();
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		UtilityMethods.wait3Seconds();
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		
		assertEquals("Suggestion",driver.findElement(By.xpath("//*[@id=\"header_process_casetypecode\"]/div[1]/span")).getText());
		UtilityMethods.wait3Seconds();
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		
	}
	
	public void createNewCaseWithCaseTypeSuggestionAndSuggestionTypeInternalTeamOrCommitteeSuggestion() throws Throwable{
		
		UtilityMethods.waitForPageLoadAndPageReady();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		
		mainCustomerType.click();
		mainCustomerTypeEdit.sendKeys("RTA");
		mainCustomerTypeSearchBox.click();
		
		UtilityMethods.wait3Seconds();
		lookMoreRecord.click();
		
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
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));

		clickCaseTypeField.click();

		new Select(caseTypeOption).selectByVisibleText("Suggestion");
		
		UtilityMethods.wait2Seconds();
		clickCaseDescription.click();
		verifyCaseDescription.clear();
		verifyCaseDescription.sendKeys("desciption testing");
		
		suggestionType.click();
		new Select(suggestionTypeOptions).selectByVisibleText("Internal Team or Committee Suggestion");
		
		internalTeamCommittee.click();
		internalTeamCommitteeEdit.sendKeys("committee");   
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		saveAndCloseButton.click();
		
		
		UtilityMethods.waitForPageLoadAndPageReady();
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));
		UtilityMethods.verifyElementDisplayed(findCriteria);
		
		Actions action = new Actions(driver);
		action.doubleClick(verifyObject).perform();
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		UtilityMethods.wait3Seconds();
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		
		assertEquals("Suggestion",driver.findElement(By.xpath("//*[@id=\"header_process_casetypecode\"]/div[1]/span")).getText());
		UtilityMethods.wait3Seconds();
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		
	}
	
	public void createNewCaseWithCaseTypeSuggestionAndSuggestionTypeExternalIndividualSuggestion() throws Throwable{
		
		UtilityMethods.waitForPageLoadAndPageReady();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		
		mainCustomerType.click();
		mainCustomerTypeEdit.sendKeys("EXTERNAL CUSTOMER");
		mainCustomerTypeSearchBox.click();
		
		UtilityMethods.wait3Seconds();
		lookMoreRecord.click();
		
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
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));

		clickCaseTypeField.click();

		new Select(caseTypeOption).selectByVisibleText("Suggestion");
		
		UtilityMethods.wait2Seconds();
		clickCaseDescription.click();
		verifyCaseDescription.clear();
		verifyCaseDescription.sendKeys("desciption testing");
		
		suggestionType.click();
		new Select(suggestionTypeOptions).selectByVisibleText("External Individual Suggestion"); 
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		saveAndCloseButton.click();
		
		
		UtilityMethods.waitForPageLoadAndPageReady();
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));
		UtilityMethods.verifyElementDisplayed(findCriteria);
		
		Actions action = new Actions(driver);
		action.doubleClick(verifyObject).perform();
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		UtilityMethods.wait3Seconds();
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		
		assertEquals("Suggestion",driver.findElement(By.xpath("//*[@id=\"header_process_casetypecode\"]/div[1]/span")).getText());
		UtilityMethods.wait3Seconds();
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		
	}
	
	public void createNewCaseWithCaseTypeSuggestionAndSuggestionTypeExternalGroupSuggestion() throws Throwable{
		
		UtilityMethods.waitForPageLoadAndPageReady();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		
		mainCustomerType.click();
	//	mainCustomerTypeEdit.sendKeys("EXTERNAL CUSTOMER");
		mainCustomerTypeSearchBox.click();
		
		UtilityMethods.wait3Seconds();
		lookMoreRecord.click();
		
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
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));

		clickCaseTypeField.click();

		new Select(caseTypeOption).selectByVisibleText("Suggestion");
		
		UtilityMethods.wait2Seconds();
		clickCaseDescription.click();
		verifyCaseDescription.clear();
		verifyCaseDescription.sendKeys("desciption testing");
		
		suggestionType.click();
		new Select(suggestionTypeOptions).selectByVisibleText("External Group Suggestion"); 
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		saveAndCloseButton.click();
		
		
		UtilityMethods.waitForPageLoadAndPageReady();
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));
		UtilityMethods.verifyElementDisplayed(findCriteria);
		
		Actions action = new Actions(driver);
		action.doubleClick(verifyObject).perform();
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		UtilityMethods.wait3Seconds();
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
		
		assertEquals("Suggestion",driver.findElement(By.xpath("//*[@id=\"header_process_casetypecode\"]/div[1]/span")).getText());
		UtilityMethods.wait3Seconds();
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		
	}
	
	public void assigneToConcernedParty() throws Throwable{
		
		UtilityMethods.waitForPageLoadAndPageReady();
		String windowHandle = driver.getWindowHandle();
	
		driver.switchTo().window(windowHandle);
		new WebDriverWait(driver,30).until(ExpectedConditions.elementToBeClickable(navigateToConcernedParties));
		UtilityMethods.clickElemetJavaSciptExecutor(navigateToConcernedParties);
		new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Concerned Parties')]")));
		concernedParties.click();
		UtilityMethods.waitForPageLoadAndPageReady();
		
		
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
	
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#areanew_incident_systemuserFrame")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("#areanew_incident_systemuserFrame")));
			
		UtilityMethods.wait3Seconds();
	//	new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(addExistingUser));
		UtilityMethods.clickElemetJavaSciptExecutor(addExistingUser);
	//	addExistingUser.click();
		
		new WebDriverWait(driver,10).until(ExpectedConditions.elementToBeClickable(searchUser));
		UtilityMethods.wait3Seconds();
		searchUser.click();
		
		UtilityMethods.wait3Seconds();
		lookMoreRecord.click();
		
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		new WebDriverWait(driver, 60).until(
				ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='InlineDialog_Iframe']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='InlineDialog_Iframe']")));
		
//		selectSearchCriteriaForCustomer.click();
//		Select dropDown = new Select(selectSearchCriteriaForCustomer);
//		dropDown.selectByVisibleText("Contact");
		UtilityMethods.wait2Seconds();
		
//		new Actions(driver).click(selectContact).perform();
		selectContact.click();
		new Actions(driver).click(selectUser).perform();
		UtilityMethods.wait2Seconds();
		addButton.click();
		
		
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
//		saveParty.click();
//		UtilityMethods.waitForPageLoadAndPageReady();
		new Actions(driver).moveToElement(navigateToResolveCase).click(navigateToResolveCase).perform();
		UtilityMethods.waitForPageLoadAndPageReady();
	}

	//////////ADDING IN PHASE TWO/////////////////

	public void createNewCaseTypeWithTypeSuggestionAndEndServiceTouchPointReason(String description,String customer) throws Throwable{
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		UtilityMethods.waitForPageLoadAndPageReady();
		//For Phase 1
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));

//		For IMS
//		new WebDriverWait(driver, 60)
//				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
//		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));

//		UtilityMethods.wait3Seconds();
//		mainCustomerType.click();
//		mainCustomerTypeEdit.sendKeys(customer);

		UtilityMethods.wait3Seconds();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='customerid']//div[@class='ms-crm-Inline-Value ms-crm-Inline-EmptyValue ms-crm-Inline-Lookup'][contains(text(),'--')]")));
		driver.findElement(By.xpath("//div[@id='customerid']//div[@class='ms-crm-Inline-Value ms-crm-Inline-EmptyValue ms-crm-Inline-Lookup'][contains(text(),'--')]")).click();

		Thread.sleep(5000);

		//driver.findElement(By.xpath("//div[@id='customerid']//div[@class='ms-crm-Inline-Value ms-crm-Inline-EmptyValue ms-crm-Inline-Lookup'][contains(text(),'--')]")).click();
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='customerid_ledit']")));
		driver.findElement(By.xpath("//input[@id='customerid_ledit']")).click();
		driver.findElement(By.xpath("//input[@id='customerid_ledit']")).sendKeys(customer);



		UtilityMethods.wait3Seconds();
		UtilityMethods.wait3Seconds();
		/////////////// FOR END SERVICE ////////////////////////
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='rta_rtaservice']//div[@class='ms-crm-Inline-Value ms-crm-Inline-EmptyValue ms-crm-Inline-Lookup'][contains(text(),'--')]")));
		driver.findElement(By.xpath("//div[@id='rta_rtaservice']//div[@class='ms-crm-Inline-Value ms-crm-Inline-EmptyValue ms-crm-Inline-Lookup'][contains(text(),'--')]")).click();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='rta_rtaservice_ledit']")));
		driver.findElement(By.xpath("//input[@id='rta_rtaservice_ledit']")).click();
		UtilityMethods.wait3Seconds();
		driver.findElement(By.xpath("//input[@id='rta_rtaservice_ledit']")).click();
		driver.findElement(By.xpath("//input[@id='rta_rtaservice_ledit']")).sendKeys("Checking NOL Balance");



		UtilityMethods.wait3Seconds();
		///////////// FOR TOUCH POINT ////////////////////////
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='rta_touchpoint']//div[@class='ms-crm-Inline-Value ms-crm-Inline-EmptyValue ms-crm-Inline-Lookup'][contains(text(),'--')]")));
		driver.findElement(By.xpath("//div[@id='rta_touchpoint']//div[@class='ms-crm-Inline-Value ms-crm-Inline-EmptyValue ms-crm-Inline-Lookup'][contains(text(),'--')]")).click();
		UtilityMethods.wait3Seconds();
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='rta_touchpoint_ledit']")));
		driver.findElement(By.xpath("//input[@id='rta_touchpoint_ledit']")).click();
		driver.findElement(By.xpath("//input[@id='rta_touchpoint_ledit']")).sendKeys("Website");

		UtilityMethods.wait3Seconds();
		///////////// FOR REASON /////////////////////////////
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='rta_casereason']//div[@class='ms-crm-Inline-Value ms-crm-Inline-EmptyValue ms-crm-Inline-Lookup'][contains(text(),'--')]")));
		driver.findElement(By.xpath("//div[@id='rta_casereason']//div[@class='ms-crm-Inline-Value ms-crm-Inline-EmptyValue ms-crm-Inline-Lookup'][contains(text(),'--')]")).click();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='rta_casereason_ledit']")));
		driver.findElement(By.xpath("//input[@id='rta_casereason_ledit']")).click();
		driver.findElement(By.xpath("//input[@id='rta_casereason_ledit']")).sendKeys("Dispatch Staff Conduct");
		UtilityMethods.wait3Seconds();
		//Commenting below in phase two
//		moveToCaseSubject.click();
//		expandCaseSubject.click();

//		UtilityMethods.waitForPageLoadAndPageReady();
//		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
//
//		new WebDriverWait(driver, 60).until(
//				ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='InlineDialog_Iframe']")));
//		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='InlineDialog_Iframe']")));
//
//		expandAboutRta.click();
//		UtilityMethods.waitForPageLoadAndPageReady();
//		selectSubject.click();
//		casesubject.click();
//		UtilityMethods.waitForPageLoadAndPageReady();

//		new WebDriverWait(driver, 60)
//				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
//		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
//
		clickCaseTypeField.click();

		new Select(caseTypeOption).selectByVisibleText("Suggestion");

//		new WebDriverWait(driver, 60)
//				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
//		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));

		clickCaseDescription.click();
		verifyCaseDescription.clear();
		verifyCaseDescription.sendKeys(description);

		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		//saveAndCloseButton.click();
		saveButton.click();
		try {
			UtilityMethods.acceptAlert();
		}
		catch(Exception e) {

			System.out.println("Alert was not present");

		}

		UtilityMethods.waitForPageLoadAndPageReady();
//		new WebDriverWait(driver, 60)
//		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
//		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));


		//Commenting This in phase 2
//		UtilityMethods.verifyElementDisplayed(findCriteria);
//
//		UtilityMethods.wait3Seconds();
//
//		UtilityMethods.clickElemetJavaSciptExecutor(filter);
//
//		UtilityMethods.clickElemetJavaSciptExecutor(caseTypeFilter);
//
//		UtilityMethods.wait2Seconds();
//		JavascriptExecutor executer = (JavascriptExecutor) driver;
//		executer.executeScript("arguments[0].scrollIntoView(true);",selectSuggestionFilter);
//		UtilityMethods.clickElemetJavaSciptExecutor(selectSuggestionFilter);
//		UtilityMethods.clickElemetJavaSciptExecutor(selectOkFilter);
//		UtilityMethods.waitForPageLoadAndPageReady();
//		UtilityMethods.wait3Seconds();
//
//		((JavascriptExecutor)driver).executeScript("var evt = document.createEvent('MouseEvents');" + "evt.initMouseEvent('dblclick',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);" + "arguments[0].dispatchEvent(evt);",verifyObject);
//
//		UtilityMethods.waitForPageLoadAndPageReady();
//		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
//		UtilityMethods.wait3Seconds();
//		new WebDriverWait(driver, 60)
//				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
//		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
//
//		assertEquals("Suggestion",driver.findElement(By.xpath("//*[@id=\"header_process_casetypecode\"]/div[1]/span")).getText());
//		UtilityMethods.wait3Seconds();
//		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
	}

	public void createNewCaseWithTypeComplaintAndEndServiceTouchPointReason(String description,String customer) throws Throwable{
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		UtilityMethods.waitForPageLoadAndPageReady();
		//For Phase 1
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));

//		For IMS
//		new WebDriverWait(driver, 60)
//				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
//		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));

//		UtilityMethods.wait3Seconds();
//		mainCustomerType.click();
//		mainCustomerTypeEdit.sendKeys(customer);

		UtilityMethods.wait3Seconds();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='customerid']//div[@class='ms-crm-Inline-Value ms-crm-Inline-EmptyValue ms-crm-Inline-Lookup'][contains(text(),'--')]")));
		driver.findElement(By.xpath("//div[@id='customerid']//div[@class='ms-crm-Inline-Value ms-crm-Inline-EmptyValue ms-crm-Inline-Lookup'][contains(text(),'--')]")).click();

		Thread.sleep(5000);

		//driver.findElement(By.xpath("//div[@id='customerid']//div[@class='ms-crm-Inline-Value ms-crm-Inline-EmptyValue ms-crm-Inline-Lookup'][contains(text(),'--')]")).click();
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='customerid_ledit']")));
		driver.findElement(By.xpath("//input[@id='customerid_ledit']")).click();
		driver.findElement(By.xpath("//input[@id='customerid_ledit']")).sendKeys(customer);



		UtilityMethods.wait3Seconds();
		UtilityMethods.wait3Seconds();
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
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='rta_casereason']//div[@class='ms-crm-Inline-Value ms-crm-Inline-EmptyValue ms-crm-Inline-Lookup'][contains(text(),'--')]")));
		driver.findElement(By.xpath("//div[@id='rta_casereason']//div[@class='ms-crm-Inline-Value ms-crm-Inline-EmptyValue ms-crm-Inline-Lookup'][contains(text(),'--')]")).click();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='rta_casereason_ledit']")));
		driver.findElement(By.xpath("//input[@id='rta_casereason_ledit']")).click();
		driver.findElement(By.xpath("//input[@id='rta_casereason_ledit']")).sendKeys("Dispatch Staff Conduct");
		UtilityMethods.wait3Seconds();
		//Commenting below in phase two
//		moveToCaseSubject.click();
//		expandCaseSubject.click();

//		UtilityMethods.waitForPageLoadAndPageReady();
//		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
//
//		new WebDriverWait(driver, 60).until(
//				ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='InlineDialog_Iframe']")));
//		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='InlineDialog_Iframe']")));
//
//		expandAboutRta.click();
//		UtilityMethods.waitForPageLoadAndPageReady();
//		selectSubject.click();
//		casesubject.click();
//		UtilityMethods.waitForPageLoadAndPageReady();

//		new WebDriverWait(driver, 60)
//				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
//		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
//
		clickCaseTypeField.click();

		new Select(caseTypeOption).selectByVisibleText("Complaint");

//		new WebDriverWait(driver, 60)
//				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
//		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));

		clickCaseDescription.click();
		verifyCaseDescription.clear();
		verifyCaseDescription.sendKeys(description);

		UtilityMethods.verifyElementDisplayed(complaintReasons);
		complaintReasons.click();
		new Select(complaintReasonOptions).selectByVisibleText("Airconditioning Problem");

		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		//saveAndCloseButton.click();
		saveButton.click();

		try {
			UtilityMethods.acceptAlert();
		}
		catch(Exception e) {

			System.out.println("Alert was not present");

		}

		UtilityMethods.waitForPageLoadAndPageReady();
//		new WebDriverWait(driver, 60)
//		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
//		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));


		//Commenting This in phase 2
//		UtilityMethods.verifyElementDisplayed(findCriteria);
//
//		UtilityMethods.wait3Seconds();
//
//		UtilityMethods.clickElemetJavaSciptExecutor(filter);
//
//		UtilityMethods.clickElemetJavaSciptExecutor(caseTypeFilter);
//
//		UtilityMethods.wait2Seconds();
//		JavascriptExecutor executer = (JavascriptExecutor) driver;
//		executer.executeScript("arguments[0].scrollIntoView(true);",selectSuggestionFilter);
//		UtilityMethods.clickElemetJavaSciptExecutor(selectSuggestionFilter);
//		UtilityMethods.clickElemetJavaSciptExecutor(selectOkFilter);
//		UtilityMethods.waitForPageLoadAndPageReady();
//		UtilityMethods.wait3Seconds();
//
//		((JavascriptExecutor)driver).executeScript("var evt = document.createEvent('MouseEvents');" + "evt.initMouseEvent('dblclick',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);" + "arguments[0].dispatchEvent(evt);",verifyObject);
//
//		UtilityMethods.waitForPageLoadAndPageReady();
//		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
//		UtilityMethods.wait3Seconds();
//		new WebDriverWait(driver, 60)
//				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
//		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
//
//		assertEquals("Suggestion",driver.findElement(By.xpath("//*[@id=\"header_process_casetypecode\"]/div[1]/span")).getText());
//		UtilityMethods.wait3Seconds();
//		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
	}

	public void createNewCaseWithCaseTypeFineObjectionAndEndServiceTouchPointReason(String customer) throws Throwable{
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		UtilityMethods.waitForPageLoadAndPageReady();
		//For Phase 1
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));

//		For IMS
//		new WebDriverWait(driver, 60)
//				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
//		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));

//		UtilityMethods.wait3Seconds();
//		mainCustomerType.click();
//		mainCustomerTypeEdit.sendKeys(customer);

		UtilityMethods.wait3Seconds();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='customerid']//div[@class='ms-crm-Inline-Value ms-crm-Inline-EmptyValue ms-crm-Inline-Lookup'][contains(text(),'--')]")));
		driver.findElement(By.xpath("//div[@id='customerid']//div[@class='ms-crm-Inline-Value ms-crm-Inline-EmptyValue ms-crm-Inline-Lookup'][contains(text(),'--')]")).click();

		Thread.sleep(5000);

		//driver.findElement(By.xpath("//div[@id='customerid']//div[@class='ms-crm-Inline-Value ms-crm-Inline-EmptyValue ms-crm-Inline-Lookup'][contains(text(),'--')]")).click();
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='customerid_ledit']")));
		driver.findElement(By.xpath("//input[@id='customerid_ledit']")).click();
		driver.findElement(By.xpath("//input[@id='customerid_ledit']")).sendKeys(customer);



		UtilityMethods.wait3Seconds();
		UtilityMethods.wait3Seconds();
		/////////////// FOR END SERVICE ////////////////////////
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='rta_rtaservice']//div[@class='ms-crm-Inline-Value ms-crm-Inline-EmptyValue ms-crm-Inline-Lookup'][contains(text(),'--')]")));
		driver.findElement(By.xpath("//div[@id='rta_rtaservice']//div[@class='ms-crm-Inline-Value ms-crm-Inline-EmptyValue ms-crm-Inline-Lookup'][contains(text(),'--')]")).click();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='rta_rtaservice_ledit']")));
		driver.findElement(By.xpath("//input[@id='rta_rtaservice_ledit']")).click();
		UtilityMethods.wait3Seconds();
		driver.findElement(By.xpath("//input[@id='rta_rtaservice_ledit']")).click();
		driver.findElement(By.xpath("//input[@id='rta_rtaservice_ledit']")).sendKeys("Checking NOL Balance");



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
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='rta_casereason']//div[@class='ms-crm-Inline-Value ms-crm-Inline-EmptyValue ms-crm-Inline-Lookup'][contains(text(),'--')]")));
		driver.findElement(By.xpath("//div[@id='rta_casereason']//div[@class='ms-crm-Inline-Value ms-crm-Inline-EmptyValue ms-crm-Inline-Lookup'][contains(text(),'--')]")).click();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='rta_casereason_ledit']")));
		driver.findElement(By.xpath("//input[@id='rta_casereason_ledit']")).click();
		driver.findElement(By.xpath("//input[@id='rta_casereason_ledit']")).sendKeys("Dispatch Staff Conduct");
		UtilityMethods.wait3Seconds();

		///////////////COMMENING IN PHASE2////////////////////

//		moveToCaseSubject.click();
//		expandCaseSubject.click();
//
//		UtilityMethods.waitForPageLoadAndPageReady();
//		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
//
//		new WebDriverWait(driver, 60).until(
//				ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='InlineDialog_Iframe']")));
//		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='InlineDialog_Iframe']")));
//
//		expandRodaUser.click();
//		UtilityMethods.waitForPageLoadAndPageReady();
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", expandSalikUser);
//		expandSalikUser.click();
//		UtilityMethods.waitForPageLoadAndPageReady();
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", selectSalikFine);
//		selectSalikFine.click();
//
//		casesubject.click();


//		UtilityMethods.waitForPageLoadAndPageReady();

//		new WebDriverWait(driver, 60)
//				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
//		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
/////////////////////////////////////////////////////////////////////////

		clickCaseTypeField.click();

		new Select(caseTypeOption).selectByVisibleText("Fine Objection");

		UtilityMethods.wait3Seconds();

		clickCaseDescription.click();
		verifyCaseDescription.clear();
		verifyCaseDescription.sendKeys("desciption testing");

		fineNumber.click();
		editFineNumber.sendKeys("number123");
		editFineNumber.sendKeys(Keys.TAB);

		editFineAmount.sendKeys("463");
		editFineAmount.sendKeys(Keys.TAB);

		fineObjectionDate.click();
		currentDate.click();

		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		saveAndCloseButton.click();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));

		UtilityMethods.wait3Seconds();

		if(UtilityMethods.isElementPresent(By.id("rta_parkingfinenumber_i")))
		{
			driver.findElement(By.id("rta_parkingfinenumber_i")).click();
			driver.findElement(By.id("rta_parkingfinenumber_i")).sendKeys("number123");
		}

		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		saveAndCloseButton.click();
		//saveButton.click();

		UtilityMethods.waitForPageLoadAndPageReady();
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));
		UtilityMethods.verifyElementDisplayed(findCriteria);

		Actions action = new Actions(driver);
		action.doubleClick(verifyObject).perform();

		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		UtilityMethods.wait3Seconds();
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));

		assertEquals("Fine Objection",driver.findElement(By.xpath("//*[@id=\"header_process_casetypecode\"]/div[1]/span")).getText());
		UtilityMethods.wait3Seconds();
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();



	}

	public void createNewCaseWithCaseTypeComplimentAndEndServiceTouchPointReason(String customer) throws Throwable{

		UtilityMethods.waitForPageLoadAndPageReady();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));

//		mainCustomerType.click();
//		mainCustomerTypeEdit.sendKeys(customer);
//		UtilityMethods.wait3Seconds();

//		moveToCaseSubject.click();
//		expandCaseSubject.click();
//
//		UtilityMethods.waitForPageLoadAndPageReady();
//		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
//
//		new WebDriverWait(driver, 60).until(
//				ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='InlineDialog_Iframe']")));
//		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='InlineDialog_Iframe']")));
//
//		expandAboutRta.click();
//		UtilityMethods.waitForPageLoadAndPageReady();
//		selectComplimentSubject.click();
//		casesubject.click();
//		UtilityMethods.waitForPageLoadAndPageReady();

//		new WebDriverWait(driver, 60)
//				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
//		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='customerid']//div[@class='ms-crm-Inline-Value ms-crm-Inline-EmptyValue ms-crm-Inline-Lookup'][contains(text(),'--')]")));
		driver.findElement(By.xpath("//div[@id='customerid']//div[@class='ms-crm-Inline-Value ms-crm-Inline-EmptyValue ms-crm-Inline-Lookup'][contains(text(),'--')]")).click();

		Thread.sleep(5000);

		//driver.findElement(By.xpath("//div[@id='customerid']//div[@class='ms-crm-Inline-Value ms-crm-Inline-EmptyValue ms-crm-Inline-Lookup'][contains(text(),'--')]")).click();
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='customerid_ledit']")));
		driver.findElement(By.xpath("//input[@id='customerid_ledit']")).click();
		driver.findElement(By.xpath("//input[@id='customerid_ledit']")).sendKeys(customer);



		UtilityMethods.wait3Seconds();
		UtilityMethods.wait3Seconds();
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
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='rta_casereason']//div[@class='ms-crm-Inline-Value ms-crm-Inline-EmptyValue ms-crm-Inline-Lookup'][contains(text(),'--')]")));
		driver.findElement(By.xpath("//div[@id='rta_casereason']//div[@class='ms-crm-Inline-Value ms-crm-Inline-EmptyValue ms-crm-Inline-Lookup'][contains(text(),'--')]")).click();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='rta_casereason_ledit']")));
		driver.findElement(By.xpath("//input[@id='rta_casereason_ledit']")).click();
		driver.findElement(By.xpath("//input[@id='rta_casereason_ledit']")).sendKeys("Dispatch Staff Conduct");
		UtilityMethods.wait3Seconds();

		clickCaseTypeField.click();

		new Select(caseTypeOption).selectByVisibleText("Compliment");

		UtilityMethods.wait3Seconds();

		clickCaseDescription.click();
		verifyCaseDescription.clear();
		verifyCaseDescription.sendKeys("desciption testing");

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

		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		saveAndCloseButton.click();

		UtilityMethods.waitForPageLoadAndPageReady();
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));
		UtilityMethods.verifyElementDisplayed(findCriteria);

		Actions action = new Actions(driver);
		action.doubleClick(verifyObject).perform();

		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		UtilityMethods.wait3Seconds();
		UtilityMethods.wait3Seconds();
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));

		assertEquals("Compliment",driver.findElement(By.xpath("//*[@id=\"header_process_casetypecode\"]/div[1]/span")).getText());
		UtilityMethods.wait3Seconds();
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
	}

	public void createNewCaseWithCaseTypeComplexEnquiryAndEndServiceTouchPointReason(String customer) throws Throwable{
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		UtilityMethods.waitForPageLoadAndPageReady();
		//For Phase 1
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));

//		For IMS
//		new WebDriverWait(driver, 60)
//				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
//		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));

//		UtilityMethods.wait3Seconds();
//		mainCustomerType.click();
//		mainCustomerTypeEdit.sendKeys(customer);

		UtilityMethods.wait3Seconds();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='customerid']//div[@class='ms-crm-Inline-Value ms-crm-Inline-EmptyValue ms-crm-Inline-Lookup'][contains(text(),'--')]")));
		driver.findElement(By.xpath("//div[@id='customerid']//div[@class='ms-crm-Inline-Value ms-crm-Inline-EmptyValue ms-crm-Inline-Lookup'][contains(text(),'--')]")).click();

		Thread.sleep(5000);

		//driver.findElement(By.xpath("//div[@id='customerid']//div[@class='ms-crm-Inline-Value ms-crm-Inline-EmptyValue ms-crm-Inline-Lookup'][contains(text(),'--')]")).click();
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='customerid_ledit']")));
		driver.findElement(By.xpath("//input[@id='customerid_ledit']")).click();
		driver.findElement(By.xpath("//input[@id='customerid_ledit']")).sendKeys(customer);



		UtilityMethods.wait3Seconds();
		UtilityMethods.wait3Seconds();
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
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='rta_casereason']//div[@class='ms-crm-Inline-Value ms-crm-Inline-EmptyValue ms-crm-Inline-Lookup'][contains(text(),'--')]")));
		driver.findElement(By.xpath("//div[@id='rta_casereason']//div[@class='ms-crm-Inline-Value ms-crm-Inline-EmptyValue ms-crm-Inline-Lookup'][contains(text(),'--')]")).click();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='rta_casereason_ledit']")));
		driver.findElement(By.xpath("//input[@id='rta_casereason_ledit']")).click();
		driver.findElement(By.xpath("//input[@id='rta_casereason_ledit']")).sendKeys("Dispatch Staff Conduct");
		UtilityMethods.wait3Seconds();
		//Commenting below in phase two
//		moveToCaseSubject.click();
//		expandCaseSubject.click();

//		UtilityMethods.waitForPageLoadAndPageReady();
//		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
//
//		new WebDriverWait(driver, 60).until(
//				ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='InlineDialog_Iframe']")));
//		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='InlineDialog_Iframe']")));
//
//		expandAboutRta.click();
//		UtilityMethods.waitForPageLoadAndPageReady();
//		selectSubject.click();
//		casesubject.click();
//		UtilityMethods.waitForPageLoadAndPageReady();

//		new WebDriverWait(driver, 60)
//				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
//		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));
//
		clickCaseTypeField.click();

		new Select(caseTypeOption).selectByVisibleText("Complex Enquiry");

//		new WebDriverWait(driver, 60)
//				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
//		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));

		clickCaseDescription.click();
		verifyCaseDescription.clear();
		verifyCaseDescription.sendKeys("desciption testing");

		complexEnquiryDescription.click();
		editDescription.sendKeys("some description over here too");

		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		saveAndCloseButton.click();

		UtilityMethods.waitForPageLoadAndPageReady();
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));
		UtilityMethods.verifyElementDisplayed(findCriteria);

		Actions action = new Actions(driver);
		action.doubleClick(verifyObject).perform();

		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		UtilityMethods.wait3Seconds();
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));

		assertEquals("Complex Enquiry",driver.findElement(By.xpath("//*[@id=\"header_process_casetypecode\"]/div[1]/span")).getText());
		UtilityMethods.wait3Seconds();
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();

	}

	public void createNewCaseWithCaseTypeEmergencyAndEndServiceTouchPointReason(String customer) throws Throwable{

		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		UtilityMethods.waitForPageLoadAndPageReady();
		//For Phase 1
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));

		UtilityMethods.wait3Seconds();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='customerid']//div[@class='ms-crm-Inline-Value ms-crm-Inline-EmptyValue ms-crm-Inline-Lookup'][contains(text(),'--')]")));
		driver.findElement(By.xpath("//div[@id='customerid']//div[@class='ms-crm-Inline-Value ms-crm-Inline-EmptyValue ms-crm-Inline-Lookup'][contains(text(),'--')]")).click();

		Thread.sleep(5000);

		//driver.findElement(By.xpath("//div[@id='customerid']//div[@class='ms-crm-Inline-Value ms-crm-Inline-EmptyValue ms-crm-Inline-Lookup'][contains(text(),'--')]")).click();
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='customerid_ledit']")));
		driver.findElement(By.xpath("//input[@id='customerid_ledit']")).click();
		driver.findElement(By.xpath("//input[@id='customerid_ledit']")).sendKeys(customer);
		UtilityMethods.wait3Seconds();
		UtilityMethods.wait3Seconds();


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
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='rta_casereason']//div[@class='ms-crm-Inline-Value ms-crm-Inline-EmptyValue ms-crm-Inline-Lookup'][contains(text(),'--')]")));
		driver.findElement(By.xpath("//div[@id='rta_casereason']//div[@class='ms-crm-Inline-Value ms-crm-Inline-EmptyValue ms-crm-Inline-Lookup'][contains(text(),'--')]")).click();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='rta_casereason_ledit']")));
		driver.findElement(By.xpath("//input[@id='rta_casereason_ledit']")).click();
		driver.findElement(By.xpath("//input[@id='rta_casereason_ledit']")).sendKeys("Dispatch Staff Conduct");
		UtilityMethods.wait3Seconds();
		clickCaseTypeField.click();

		new Select(caseTypeOption).selectByVisibleText("Emergency");

		clickCaseDescription.click();
		verifyCaseDescription.clear();
		verifyCaseDescription.sendKeys("Some Description");

		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		//saveAndCloseButton.click();
		saveButton.click();
		try {
			UtilityMethods.acceptAlert();
		}
		catch(Exception e) {

			System.out.println("Alert was not present");

		}

		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
	}

	public void createNewCaseWithCaseTypeLostItemAndEndServiceTouchPointReason(String customer) throws Throwable {
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		UtilityMethods.waitForPageLoadAndPageReady();
		//For Phase 1
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));

		UtilityMethods.wait3Seconds();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='customerid']//div[@class='ms-crm-Inline-Value ms-crm-Inline-EmptyValue ms-crm-Inline-Lookup'][contains(text(),'--')]")));
		driver.findElement(By.xpath("//div[@id='customerid']//div[@class='ms-crm-Inline-Value ms-crm-Inline-EmptyValue ms-crm-Inline-Lookup'][contains(text(),'--')]")).click();

		Thread.sleep(5000);

		//driver.findElement(By.xpath("//div[@id='customerid']//div[@class='ms-crm-Inline-Value ms-crm-Inline-EmptyValue ms-crm-Inline-Lookup'][contains(text(),'--')]")).click();
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='customerid_ledit']")));
		driver.findElement(By.xpath("//input[@id='customerid_ledit']")).click();
		driver.findElement(By.xpath("//input[@id='customerid_ledit']")).sendKeys(customer);
		UtilityMethods.wait3Seconds();
		UtilityMethods.wait3Seconds();


		/////////////// FOR END SERVICE ////////////////////////
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='rta_rtaservice']//div[@class='ms-crm-Inline-Value ms-crm-Inline-EmptyValue ms-crm-Inline-Lookup'][contains(text(),'--')]")));
		driver.findElement(By.xpath("//div[@id='rta_rtaservice']//div[@class='ms-crm-Inline-Value ms-crm-Inline-EmptyValue ms-crm-Inline-Lookup'][contains(text(),'--')]")).click();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='rta_rtaservice_ledit']")));
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
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='rta_casereason']//div[@class='ms-crm-Inline-Value ms-crm-Inline-EmptyValue ms-crm-Inline-Lookup'][contains(text(),'--')]")));
		driver.findElement(By.xpath("//div[@id='rta_casereason']//div[@class='ms-crm-Inline-Value ms-crm-Inline-EmptyValue ms-crm-Inline-Lookup'][contains(text(),'--')]")).click();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='rta_casereason_ledit']")));
		driver.findElement(By.xpath("//input[@id='rta_casereason_ledit']")).click();
		driver.findElement(By.xpath("//input[@id='rta_casereason_ledit']")).sendKeys("Dispatch Staff Conduct");
		UtilityMethods.wait3Seconds();

		clickCaseTypeField.click();

		new Select(caseTypeOption).selectByVisibleText("Lost Item");

		UtilityMethods.wait3Seconds();

		clickCaseDescription.click();
		verifyCaseDescription.clear();
		verifyCaseDescription.sendKeys("desciption testing");

		itemCategory.click();
		new Select(itemCategoryOptionSetValues).selectByVisibleText("Bag");

		itemColor.click();
		new Select(itemColorOptionSetValues).selectByVisibleText("Black");

		verifyDateField.click();
		selectDate.click();
		currentDate.click();
		UtilityMethods.wait2Seconds();
		itemDescription.click();
		verifyItemDescriptionField.clear();
		verifyItemDescriptionField.sendKeys("Lost Item description");

		callBackTime.click();
		new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOf(verfiyCallBackTime));
		verfiyCallBackTime.sendKeys("Test Time");


		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		saveAndCloseButton.click();

		UtilityMethods.waitForPageLoadAndPageReady();
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));
		UtilityMethods.verifyElementDisplayed(findCriteria);

		Actions action = new Actions(driver);
		action.doubleClick(verifyObject).perform();

		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		UtilityMethods.wait3Seconds();
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));

		assertEquals("Lost Item",driver.findElement(By.xpath("//*[@id=\"header_process_casetypecode\"]/div[1]/span")).getText());
		UtilityMethods.wait3Seconds();
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
	}

	public void createNewCaseWithCaseTypeNotificationAndEndServiceTouchPointReason(String customer) throws Throwable{
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		UtilityMethods.waitForPageLoadAndPageReady();
		//For Phase 1
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));

		UtilityMethods.wait3Seconds();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='customerid']//div[@class='ms-crm-Inline-Value ms-crm-Inline-EmptyValue ms-crm-Inline-Lookup'][contains(text(),'--')]")));
		driver.findElement(By.xpath("//div[@id='customerid']//div[@class='ms-crm-Inline-Value ms-crm-Inline-EmptyValue ms-crm-Inline-Lookup'][contains(text(),'--')]")).click();

		Thread.sleep(5000);

		//driver.findElement(By.xpath("//div[@id='customerid']//div[@class='ms-crm-Inline-Value ms-crm-Inline-EmptyValue ms-crm-Inline-Lookup'][contains(text(),'--')]")).click();
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='customerid_ledit']")));
		driver.findElement(By.xpath("//input[@id='customerid_ledit']")).click();
		driver.findElement(By.xpath("//input[@id='customerid_ledit']")).sendKeys(customer);
		UtilityMethods.wait3Seconds();
		UtilityMethods.wait3Seconds();


		/////////////// FOR END SERVICE ////////////////////////
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='rta_rtaservice']//div[@class='ms-crm-Inline-Value ms-crm-Inline-EmptyValue ms-crm-Inline-Lookup'][contains(text(),'--')]")));
		driver.findElement(By.xpath("//div[@id='rta_rtaservice']//div[@class='ms-crm-Inline-Value ms-crm-Inline-EmptyValue ms-crm-Inline-Lookup'][contains(text(),'--')]")).click();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='rta_rtaservice_ledit']")));
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
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='rta_casereason']//div[@class='ms-crm-Inline-Value ms-crm-Inline-EmptyValue ms-crm-Inline-Lookup'][contains(text(),'--')]")));
		driver.findElement(By.xpath("//div[@id='rta_casereason']//div[@class='ms-crm-Inline-Value ms-crm-Inline-EmptyValue ms-crm-Inline-Lookup'][contains(text(),'--')]")).click();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='rta_casereason_ledit']")));
		driver.findElement(By.xpath("//input[@id='rta_casereason_ledit']")).click();
		driver.findElement(By.xpath("//input[@id='rta_casereason_ledit']")).sendKeys("Dispatch Staff Conduct");
		UtilityMethods.wait3Seconds();

		clickCaseTypeField.click();

		new Select(caseTypeOption).selectByVisibleText("Notification");

		UtilityMethods.wait3Seconds();

		clickCaseDescription.click();
		verifyCaseDescription.clear();
		verifyCaseDescription.sendKeys("desciption testing");


		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		saveAndCloseButton.click();

		UtilityMethods.waitForPageLoadAndPageReady();
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));
		UtilityMethods.verifyElementDisplayed(findCriteria);

		Actions action = new Actions(driver);
		action.doubleClick(verifyObject).perform();

		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		UtilityMethods.wait3Seconds();
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));

		assertEquals("Notification",driver.findElement(By.xpath("//*[@id=\"header_process_casetypecode\"]/div[1]/span")).getText());
		UtilityMethods.wait3Seconds();
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();

	}

	public void resolveCaseTypeLostItemInPhaseTwo() throws Throwable
	{
		UtilityMethods.waitForPageLoadAndPageReady();

		UtilityMethods.wait3Seconds();

		driver.findElement(By.id("new_matchingfounditemid")).click();
		UtilityMethods.waitForElementClickable(driver.findElement(By.id("new_matchingfounditemid_ledit")));
		driver.findElement(By.id("new_matchingfounditemid_ledit")).click();
		driver.findElement(By.id("new_matchingfounditemid_ledit")).sendKeys("F2");
		clickCaseDescription.click();
		UtilityMethods.wait3Seconds();

		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		saveButton.click();
		UtilityMethods.waitForPageLoadAndPageReady();
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
		new Select(statusReasonResolveCase).selectByIndex(1);
		UtilityMethods.wait2Seconds();
		satisfactionResloveCase.click();
		new Select(satisfactionResloveCase).selectByIndex(1);
		UtilityMethods.wait3Seconds();
		caseResolutionDescription.sendKeys("Case Resolution");
		okButton.click();
	}

	public void createNewCaseWithCaseTypeRequestAndEndServiceTouchPointReason(String customer) throws Throwable{
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		UtilityMethods.waitForPageLoadAndPageReady();
		//For Phase 1
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));

		UtilityMethods.wait3Seconds();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='customerid']//div[@class='ms-crm-Inline-Value ms-crm-Inline-EmptyValue ms-crm-Inline-Lookup'][contains(text(),'--')]")));
		driver.findElement(By.xpath("//div[@id='customerid']//div[@class='ms-crm-Inline-Value ms-crm-Inline-EmptyValue ms-crm-Inline-Lookup'][contains(text(),'--')]")).click();

		Thread.sleep(5000);

		//driver.findElement(By.xpath("//div[@id='customerid']//div[@class='ms-crm-Inline-Value ms-crm-Inline-EmptyValue ms-crm-Inline-Lookup'][contains(text(),'--')]")).click();
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='customerid_ledit']")));
		driver.findElement(By.xpath("//input[@id='customerid_ledit']")).click();
		driver.findElement(By.xpath("//input[@id='customerid_ledit']")).sendKeys(customer);
		UtilityMethods.wait3Seconds();
		UtilityMethods.wait3Seconds();


		/////////////// FOR END SERVICE ////////////////////////
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='rta_rtaservice']//div[@class='ms-crm-Inline-Value ms-crm-Inline-EmptyValue ms-crm-Inline-Lookup'][contains(text(),'--')]")));
		driver.findElement(By.xpath("//div[@id='rta_rtaservice']//div[@class='ms-crm-Inline-Value ms-crm-Inline-EmptyValue ms-crm-Inline-Lookup'][contains(text(),'--')]")).click();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='rta_rtaservice_ledit']")));
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
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='rta_casereason']//div[@class='ms-crm-Inline-Value ms-crm-Inline-EmptyValue ms-crm-Inline-Lookup'][contains(text(),'--')]")));
		driver.findElement(By.xpath("//div[@id='rta_casereason']//div[@class='ms-crm-Inline-Value ms-crm-Inline-EmptyValue ms-crm-Inline-Lookup'][contains(text(),'--')]")).click();

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='rta_casereason_ledit']")));
		driver.findElement(By.xpath("//input[@id='rta_casereason_ledit']")).click();
		driver.findElement(By.xpath("//input[@id='rta_casereason_ledit']")).sendKeys("Dispatch Staff Conduct");
		UtilityMethods.wait3Seconds();

		clickCaseTypeField.click();

		new Select(caseTypeOption).selectByVisibleText("Request");

		UtilityMethods.wait3Seconds();

		clickCaseDescription.click();
		verifyCaseDescription.clear();
		verifyCaseDescription.sendKeys("desciption testing");

		UtilityMethods.verifyElementDisplayed(requestReason);
		requestReason.click();
		new Select(requestReasonOptionSet).selectByVisibleText("Humps Request");

		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		saveAndCloseButton.click();

		UtilityMethods.waitForPageLoadAndPageReady();
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame0']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame0']")));
		UtilityMethods.verifyElementDisplayed(findCriteria);

		Actions action = new Actions(driver);
		action.doubleClick(verifyObject).perform();

		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
		UtilityMethods.wait3Seconds();
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name='contentIFrame1']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='contentIFrame1']")));

		assertEquals("Request",driver.findElement(By.xpath("//*[@id=\"header_process_casetypecode\"]/div[1]/span")).getText());
		UtilityMethods.wait3Seconds();
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();
	}

	public void searchCreatedCase() throws Throwable {

		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.waitForVisibility(driver.findElement(By.id("contentIFrame0")));
		driver.switchTo().frame(driver.findElement(By.id("contentIFrame0")));
		System.out.println(CustomerPortal.refNo);
		UtilityMethods.waitForElementClickable(findCriteria);
		UtilityMethods.verifyElementDisplayed(findCriteria);
		//findCriteria.click();
		findCriteria.sendKeys(CustomerPortal.refNo);
		UtilityMethods.clickElemetJavaSciptExecutor(hitSearch);
		UtilityMethods.waitForPageLoadAndPageReady();

		Actions action = new Actions(driver);
		action.doubleClick(verifyObject).perform();
		UtilityMethods.wait3Seconds();
		UtilityMethods.waitForPageLoadAndPageReady();
		UtilityMethods.switchToSubWindowAndReturnParentWindowHandler();

	}

	public CasesPage(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, this);
	}

}