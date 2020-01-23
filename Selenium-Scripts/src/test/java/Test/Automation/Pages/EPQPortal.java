package Test.Automation.Pages;

import Test.Automation.Utils.DriverFactory;
import Test.Automation.Utils.PropertyReader;
import Test.Automation.Utils.UtilityMethods;
//import net.bytebuddy.implementation.bytecode.Throw;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.security.Key;


/**
 * Created by waqar.tufail on 4/5/2019.
 */
public class EPQPortal extends DriverFactory {

    //    @FindBy(xpath = "//*[text()=\"Prequalification Requirements\"]")
    @FindBy(css = "#side-navbar > ul > li:nth-child(3) > a.expand-link.collapsed")
    public WebElement PreReq;

    @FindBy(xpath = "//*[@class='expand-link']")
    public WebElement PageHeader;

    @FindBy(id = "ctl00_cphDefault_txtPrimaryMobile")
    public WebElement primaryMobileNo;

    @FindBy(id = "ctl00_cphDefault_txtSecondaryMobile")
    public WebElement secondaryMobileNo;

    @FindBy(id = "ctl00_cphDefault_txtPrimaryEmail")
    public WebElement primaryEmail;

    @FindBy(id = "ctl00_cphDefault_txtSecondaryEmail")
    public WebElement secondaryEmail;

    @FindBy(xpath = "//*[@tabindex='7']")
    public WebElement MakaniNumber;

    @FindBy(xpath = "//*[@tabindex='9']")
    public WebElement TRNNumber;

    @FindBy(xpath = "//a[contains(@href,'VATTrn')]")
    public WebElement compnayUpload;

    @FindBy(id = "singleFile")
    public WebElement choseFile;

    @FindBy(id = "multiFile_NeatUploadInternalInputFile")
    public WebElement multifile;

    @FindBy(id = "btnSubmit")
    public WebElement Upload;

    @FindBy(xpath = "//*[@name='ctl16']")
    public WebElement Close;

    @FindBy(xpath = "//*[@tabindex='10']")
    public WebElement tradeLicenseClassifications;

    @FindBy(xpath = "//a[contains(@href,'TradeLicense')]")
    public WebElement tradeUploadAttachment;

    @FindBy(xpath = "//a[contains(@href,'Memorandum')]")
    public WebElement MemorandamUpload;

    @FindBy(xpath = "//*[@name='ctl00$cphDefault$txtOwnersPartners']")
    public WebElement Owners;

    @FindBy(xpath = "//*[@name='ctl00$cphDefault$ddOwnershipType']")
    public WebElement OwnerType;

    @FindBy(xpath = "//*[@name='ctl00$cphDefault$txtEmiratiPartner']")
    public WebElement EmiratiSponserPartenrName;

    @FindBy(xpath = "//*[@name='ctl00$cphDefault$txtEPpassportNum']")
    public WebElement PassportNumber;

    @FindBy(xpath = "//*[@name='ctl00_cphDefault_EPpassportExp_dateInput_text']")
    public WebElement PassportExpiryDate;

    @FindBy(xpath = "//*[@name='ctl00$cphDefault$txtEmiratiID']")
    public WebElement EmirateID;

    @FindBy(xpath = "//*[@name='ctl00$cphDefault$txtEmiratiID']")
    public WebElement EmirateExpiryDate;

    @FindBy(xpath = "//a[contains(@href,'hFileEmiratiPartnerID')]")
    public WebElement CompanyUploadAttachment;

    @FindBy(id = "calendarButtonEPpassportExp")
    public WebElement PassportCalender;

    @FindBy(id = "ctl00_cphDefault_EPpassportExp_calendar_FNN")
    public WebElement PassportCalenderNext;

    @FindBy(id = "calendarButtonEmIdExp")
    public WebElement Calender;

    @FindBy(id = "ctl00_cphDefault_EPpassportExp_calendar_Title")
    public WebElement passportCalenderHeading;

    @FindBy(id = "ctl00_cphDefault_EmIdExp_calendar_Title")
    public WebElement CalenderHeading;

    @FindBy(id = "ctl00_cphDefault_EmIdExp_calendar_FNN")
    public WebElement CalenderNext;

    @FindBy(xpath = "//*[@title='Tuesday, March 31, 2020']")
    public WebElement CalDate;

    @FindBy(xpath = "//*[@name='ctl00$cphDefault$btnNext']")
    public WebElement Next;

    @FindBy(id = "StructureandOrganisation")
    public WebElement CompanyStructure;

    @FindBy(xpath = "//a[contains(@href,'CompanyProfile')]")
    public WebElement CompanyProfileUploadAttachment;

    @FindBy(xpath = "//a[contains(@href,'OrgChart')]")
    public WebElement OrganizationChartUploadAttachment;

    @FindBy(id = "FinancialInformation")
    public WebElement FinancialInfo;

    @FindBy(id = "ctl00_cphDefault_txtMaximumContractSize_text")
    public WebElement Financial_ContractSize;

    @FindBy(xpath = "//a[contains(@href,'EtihadRiskReport')]")
    public WebElement Financial_EtihadRiskUpload;

    @FindBy(id = "ctl00_cphDefault_RB_BkStatement")
    public WebElement Financial_InformationBank;

    @FindBy(id = "ctl00_cphDefault_RB_AuditRpt")
    public WebElement Financial_InformationAudit;

    @FindBy(xpath = "//a[contains(@href,'BankStatement')]")
    public WebElement Financial_BankStatementUpload;

    @FindBy(xpath = "//a[contains(@href,'AuditReport')]")
    public WebElement Financial_AuditRptUpload;

    @FindBy(id = "ctl00_cphDefault_txt_bnkStatement_text")
    public WebElement Financial_AvgBalance;

    @FindBy(xpath = "//a[contains(@href,'ctl00$cphDefault$GridVendorBankers$ctl00$ctl02$ctl00$InitInsertButton')]")
    public WebElement Financial_BankVandors;

    @FindBy(id = "ctl00_cphDefault_GridVendorBankers_ctl00__ctl00_cphDefault_GridVendorBankers_ctl00_ctl00___PEF")
    public WebElement VendorHeading;

    @FindBy(id = "ctl00_cphDefault_GridVendorBankers_ctl00_ctl02_ctl03_EditFormControl_txtName")
    public WebElement BankVandors_Name;

    @FindBy(id = "ctl00_cphDefault_GridVendorBankers_ctl00_ctl02_ctl03_EditFormControl_txtStreet")
    public WebElement BankVandors_AddressLine1;

    @FindBy(id = "ctl00_cphDefault_GridVendorBankers_ctl00_ctl02_ctl03_EditFormControl_txtCity")
    public WebElement BankVandors_City;

    @FindBy(id = "ctl00_cphDefault_GridVendorBankers_ctl00_ctl02_ctl03_EditFormControl_ddCountry")
    public WebElement BankVandors_Country;

    @FindBy(id = "ctl00_cphDefault_GridVendorBankers_ctl00_ctl02_ctl03_EditFormControl_txtEmail")
    public WebElement BankVandors_Email;

    @FindBy(id = "ctl00_cphDefault_GridVendorBankers_ctl00_ctl02_ctl03_EditFormControl_txtContactNumber")
    public WebElement BankVandors_ContactNumber;

    @FindBy(id = "ctl00_cphDefault_GridVendorBankers_ctl00_ctl02_ctl03_EditFormControl_btnInsert")
    public WebElement BankVandors_Submit;

    @FindBy(xpath = "//*[@class='GridRow_Office2007']/td[1]")
    public WebElement BankVandors_NameVerification;

    @FindBy(xpath = "//*[@class='GridRow_Office2007']/td[2]")
    public WebElement BankVandors_AddressVerification;

    @FindBy(id = "RelevantExperience")
    public WebElement RelevantExperience;

    @FindBy(id = "ctl00_cphDefault_txtExperienceInOwnCountry_text")
    public WebElement OwnCountry;

    @FindBy(id = "ctl00_cphDefault_txtExperienceInGCC_text")
    public WebElement GCC;

    @FindBy(id = "ctl00_cphDefault_txtExperienceInternationally_text")
    public WebElement Internationally;

    @FindBy(id = "ctl00_cphDefault_GridVendorExperience_ctl00_ctl02_ctl00_InitInsertButton")
    public WebElement AddrelevanatExp;

    @FindBy(id = "ctl00_cphDefault_GridVendorExperience_ctl00__ctl00_cphDefault_GridVendorExperience_ctl00_ctl00___PEF")
    public WebElement RelevantProjectDetails;

    @FindBy(id = "ctl00_cphDefault_GridVendorExperience_ctl00_ctl02_ctl03_EditFormControl_txtNameOfClient_text")
    public WebElement R_Exp_Name;

    @FindBy(id = "ctl00_cphDefault_GridVendorExperience_ctl00_ctl02_ctl03_EditFormControl_txtLocation_text")
    public WebElement R_Exp_Location;

    @FindBy(id = "ctl00_cphDefault_GridVendorExperience_ctl00_ctl02_ctl03_EditFormControl_txtTypeOfProject_text")
    public WebElement R_Exp_ProjectType;

    @FindBy(id = "ctl00_cphDefault_GridVendorExperience_ctl00_ctl02_ctl03_EditFormControl_txtNameOfKeyContact_text")
    public WebElement R_Exp_Contact;

    @FindBy(id = "ctl00_cphDefault_GridVendorExperience_ctl00_ctl02_ctl03_EditFormControl_txtDescriptionOfProject_text")
    public WebElement R_Exp_ProjectText;

    @FindBy(id = "ctl00_cphDefault_GridVendorExperience_ctl00_ctl02_ctl03_EditFormControl_txtContractPrice_text")
    public WebElement R_Exp_PriceText;

    @FindBy(id = "ctl00_cphDefault_GridVendorExperience_ctl00_ctl02_ctl03_EditFormControl_ddStatus")
    public WebElement R_Exp_ddStatus;

    @FindBy(id = "ctl00_cphDefault_GridVendorExperience_ctl00_ctl02_ctl03_EditFormControl_ddlTypeOfDocument")
    public WebElement R_Exp_ddDocType;

    @FindBy(xpath = "//a[contains(@href,'RelevantExperience')]")
    public WebElement Upload_RelevantExperience;

    @FindBy(id = "ctl00_cphDefault_GridVendorExperience_ctl00_ctl02_ctl03_EditFormControl_btnInsert")
    public WebElement R_Exp_Add;

    @FindBy(xpath = "//*[@class='GridRow_Office2007']/td[1]")
    public WebElement R_Exp_Record;

    @FindBy(id = "CVs")
    public WebElement Personal;

    @FindBy(id = "ctl00_cphDefault_txtNumberOfAdminStaff_text")
    public WebElement Personal_Administrative;

    @FindBy(id = "ctl00_cphDefault_txtNumberOfTechStaff_text")
    public WebElement Personal_Tech_Staff;

    @FindBy(id = "ctl00_cphDefault_txtNumberOfStaffReleased_text")
    public WebElement Personal_Rel_Staff;

    @FindBy(id = "ctl00_cphDefault_txtNumberOfAcquired_text")
    public WebElement Personal_Acq_Staff;

    @FindBy(xpath = "//a[contains(@href,'LabourStatement')]")
    public WebElement Personal_Lab_Statement;

    @FindBy(id = "ctl00_cphDefault_txtAdditionalInformation")
    public WebElement Personal_Additional;

    @FindBy(id = "ctl00_cphDefault_GridContacts_ctl00_ctl02_ctl00_InitInsertButton")
    public WebElement Personal_C_K_Add;

    @FindBy(id = "ctl00_cphDefault_GridContacts_ctl00__ctl00_cphDefault_GridContacts_ctl00_ctl00___PEF")
    public WebElement Personal_C_K_Title;

    @FindBy(id = "ctl00_cphDefault_GridContacts_ctl00_ctl02_ctl03_EditFormControl_txtFirstName_text")
    public WebElement Personal_C_K_First_Name;

    @FindBy(id = "ctl00_cphDefault_GridContacts_ctl00_ctl02_ctl03_EditFormControl_txtLastName_text")
    public WebElement Personal_C_K_Last_Name;

    @FindBy(id = "ctl00_cphDefault_GridContacts_ctl00_ctl02_ctl03_EditFormControl_ddNationality")
    public WebElement Personal_C_K_Nationality;

    @FindBy(id = "ctl00_cphDefault_GridContacts_ctl00_ctl02_ctl03_EditFormControl_txtPresentPosition_text")
    public WebElement Personal_C_K_Position;

    @FindBy(id = "ctl00_cphDefault_GridContacts_ctl00_ctl02_ctl03_EditFormControl_txtYearsOfExperience_text")
    public WebElement Personal_C_K_YrsExp;

    @FindBy(id = "ctl00_cphDefault_GridContacts_ctl00_ctl02_ctl03_EditFormControl_txtYearsWithFirm_text")
    public WebElement Personal_C_K_YrsFirm;

    @FindBy(id = "ctl00_cphDefault_GridContacts_ctl00_ctl02_ctl03_EditFormControl_ddContactType")
    public WebElement Personal_C_K_ContactType;

    @FindBy(id = "ctl00_cphDefault_GridContacts_ctl00_ctl02_ctl03_EditFormControl_txtEmail_text")
    public WebElement Personal_C_K_Email;

    @FindBy(id = "ctl00_cphDefault_GridContacts_ctl00_ctl02_ctl03_EditFormControl_txtMobile_text")
    public WebElement Personal_C_K_Mobile;

    @FindBy(id = "ctl00_cphDefault_GridContacts_ctl00_ctl02_ctl03_EditFormControl_btnInsert")
    public WebElement Personal_CK_Add;

    @FindBy(xpath = "//*[@class='GridRow_Office2007']/td[1]")
    public WebElement C_K_Record;

    @FindBy(id = "ctl00_cphDefault_GridCVs_ctl00_ctl02_ctl00_InitInsertButton")
    public WebElement Personal_CVAdd;

    @FindBy(id = "ctl00_cphDefault_GridCVs_ctl00__ctl00_cphDefault_GridCVs_ctl00_ctl00___PEF")
    public WebElement Personal_CV_Popup_Title;

    @FindBy(id = "ctl00_cphDefault_GridCVs_ctl00_ctl02_ctl03_EditFormControl_txtFirstName_text")
    public WebElement Personal_CV_First_Name;

    @FindBy(id = "ctl00_cphDefault_GridCVs_ctl00_ctl02_ctl03_EditFormControl_txtLastName_text")
    public WebElement Personal_CV_Last_Name;

    @FindBy(id = "ctl00_cphDefault_GridCVs_ctl00_ctl02_ctl03_EditFormControl_ddNationality")
    public WebElement Personal_CV_Nationality;

    @FindBy(id = "ctl00_cphDefault_GridCVs_ctl00_ctl02_ctl03_EditFormControl_txtPresentPosition_text")
    public WebElement Personal_CV_Position;

    @FindBy(id = "ctl00_cphDefault_GridCVs_ctl00_ctl02_ctl03_EditFormControl_txtProposedPosition_text")
    public WebElement Personal_CV_Pro_Position;

    @FindBy(id = "ctl00_cphDefault_GridCVs_ctl00_ctl02_ctl03_EditFormControl_txtYearsOfExperience_text")
    public WebElement Personal_CV_YrsExp;

    @FindBy(id = "ctl00_cphDefault_GridCVs_ctl00_ctl02_ctl03_EditFormControl_txtYearsWithFirm_text")
    public WebElement Personal_CV_YrsFirmExp;

    @FindBy(id = "ctl00_cphDefault_GridCVs_ctl00_ctl02_ctl03_EditFormControl_txtMajorWorks_text")
    public WebElement Personal_CV_Type;

    @FindBy(id = "ctl00_cphDefault_GridCVs_ctl00_ctl02_ctl03_EditFormControl_ddEnglishLevel")
    public WebElement Personal_CV_English;

    @FindBy(id = "ctl00_cphDefault_GridCVs_ctl00_ctl02_ctl03_EditFormControl_ddArabicLevel")
    public WebElement Personal_CV_Arabic;

    @FindBy(id = "ctl00_cphDefault_GridCVs_ctl00_ctl02_ctl03_EditFormControl_txtOtherLanguage_text")
    public WebElement Personal_CV_Other;

    @FindBy(xpath = "//a[contains(@href,'ctl00_cphDefault_GridCVs_ctl00_ctl02_ctl03_EditFormControl_hFileList')]")
    public WebElement Personal_CV;

    @FindBy(id = "ctl00_cphDefault_GridCVs_ctl00_ctl02_ctl03_EditFormControl_btnInsert")
    public WebElement Personal_CV_Add;

    @FindBy(xpath = "//*[@id='ctl00_cphDefault_GridCVs_ctl00__0']/td[1]")
    public WebElement CV_Record;

    @FindBy(id = "HSEGreenEconomy")
    public WebElement HSE;

    @FindBy (id = "ctl00_cphDefault_rgCompletnessAnswers_ctl00_ctl04_ddlAnswer")
    public WebElement HSE_Q1_S1;

    @FindBy(xpath = "//a[contains(@href,'ctl00_cphDefault_rgCompletnessAnswers_ctl00_ctl04_hFileHSEAnswer')]")
    public WebElement HSE_Q1_A1;

    @FindBy (id = "ctl00_cphDefault_rgCompletnessAnswers_ctl00_ctl06_ddlAnswer")
    public WebElement HSE_Q1_S2;

    @FindBy(xpath = "//a[contains(@href,'ctl00_cphDefault_rgCompletnessAnswers_ctl00_ctl06_hFileHSEAnswer')]")
    public WebElement HSE_Q1_A2;

    @FindBy (id = "ctl00_cphDefault_rgCompletnessAnswers_ctl00_ctl08_ddlAnswer")
    public WebElement HSE_Q1_S3;

    @FindBy(xpath = "//a[contains(@href,'ctl00_cphDefault_rgCompletnessAnswers_ctl00_ctl08_hFileHSEAnswer')]")
    public WebElement HSE_Q1_A3;

    @FindBy (id = "ctl00_cphDefault_rgCompletnessAnswers_ctl00_ctl10_ddlAnswer")
    public WebElement HSE_Q1_S4;

    @FindBy(xpath = "//a[contains(@href,'ctl00_cphDefault_rgCompletnessAnswers_ctl00_ctl10_hFileHSEAnswer')]")
    public WebElement HSE_Q1_A4;

    @FindBy (id = "ctl00_cphDefault_rgCompletnessAnswers_ctl00_ctl12_ddlAnswer")
    public WebElement HSE_Q1_S5;

    @FindBy(xpath = "//a[contains(@href,'ctl00_cphDefault_rgCompletnessAnswers_ctl00_ctl12_hFileHSEAnswer')]")
    public WebElement HSE_Q1_A5;

    @FindBy (id = "ctl00_cphDefault_rgCompletnessAnswers_ctl00_ctl14_ddlAnswer")
    public WebElement HSE_Q1_S6;

    @FindBy(xpath = "//a[contains(@href,'ctl00_cphDefault_rgCompletnessAnswers_ctl00_ctl14_hFileHSEAnswer')]")
    public WebElement HSE_Q1_A6;

    @FindBy (id = "ctl00_cphDefault_rgCompletnessAnswers_ctl00_ctl16_ddlAnswer")
    public WebElement HSE_Q1_S7;

    @FindBy(xpath = "//a[contains(@href,'ctl00_cphDefault_rgCompletnessAnswers_ctl00_ctl16_hFileHSEAnswer')]")
    public WebElement HSE_Q1_A7;

    @FindBy (id = "ctl00_cphDefault_rgCompletnessAnswers_ctl00_ctl18_ddlAnswer")
    public WebElement HSE_Q1_S8;

    @FindBy(xpath = "//a[contains(@href,'ctl00_cphDefault_rgCompletnessAnswers_ctl00_ctl18_hFileHSEAnswer')]")
    public WebElement HSE_Q1_A8;

    @FindBy (id = "ctl00_cphDefault_rgCompletnessAnswers_ctl00_ctl20_ddlAnswer")
    public WebElement HSE_Q1_S9;

    @FindBy(xpath = "//a[contains(@href,'ctl00_cphDefault_rgCompletnessAnswers_ctl00_ctl20_hFileHSEAnswer')]")
    public WebElement HSE_Q1_A9;

    @FindBy (id = "ctl00_cphDefault_rgCompletnessAnswers_ctl00_ctl22_ddlAnswer")
    public WebElement HSE_Q1_S10;

    @FindBy(xpath = "//a[contains(@href,'ctl00_cphDefault_rgCompletnessAnswers_ctl00_ctl22_hFileHSEAnswer')]")
    public WebElement HSE_Q1_A10;

    @FindBy(id = "GreenEconomy")
    public WebElement GreenEconomy;

    @FindBy(id = "Resources")
    public WebElement OtherResources;

    @FindBy(xpath = "//a[contains(@href,'RegistrationCopy')]")
    public WebElement Resources_Reg_Copy;

    @FindBy(id = "ctl00_cphDefault_GridContractorEquipment_ctl00_ctl02_ctl00_InitInsertButton")
    public WebElement AddContractEquipment;

    @FindBy(id = "ctl00_cphDefault_GridContractorEquipment_ctl00__ctl00_cphDefault_GridContractorEquipment_ctl00_ctl00___PEF")
    public WebElement TitleContractEquipment;

    @FindBy(id = "ctl00_cphDefault_GridContractorEquipment_ctl00_ctl02_ctl03_EditFormControl_txtEquipment_text")
    public WebElement CED_Equipment;

    @FindBy(id = "ctl00_cphDefault_GridContractorEquipment_ctl00_ctl02_ctl03_EditFormControl_ddOwnershipStatus")
    public WebElement CED_OwnerShipStatus;

    @FindBy(id = "ctl00_cphDefault_GridContractorEquipment_ctl00_ctl02_ctl03_EditFormControl_txtAge_text")
    public WebElement CED_Age;

    @FindBy(id = "ctl00_cphDefault_GridContractorEquipment_ctl00_ctl02_ctl03_EditFormControl_txtQuantity_text")
    public WebElement CED_Quantity;

    @FindBy(id = "ctl00_cphDefault_GridContractorEquipment_ctl00_ctl02_ctl03_EditFormControl_txtOperatingCondition_text")
    public WebElement CED_OperatingCondition;

    @FindBy(id = "ctl00_cphDefault_GridContractorEquipment_ctl00_ctl02_ctl03_EditFormControl_ddLocation")
    public WebElement CED_CurrentLocation;

    @FindBy(id = "ctl00_cphDefault_GridContractorEquipment_ctl00_ctl02_ctl03_EditFormControl_btnInsert")
    public WebElement CED_Add;

    @FindBy(xpath = "//a[contains(@href,'CEOwnerRentCont')]")
    public WebElement Resources_Rental_Contract;

    @FindBy(id = "ctl00_cphDefault_GridFabrication_ctl00_ctl02_ctl00_InitInsertButton")
    public WebElement AddFabrication;

    @FindBy(id = "ctl00_cphDefault_GridFabrication_ctl00__ctl00_cphDefault_GridFabrication_ctl00_ctl00___PEF")
    public WebElement TitleFabrication;

    @FindBy(id = "ctl00_cphDefault_GridFabrication_ctl00_ctl02_ctl03_EditFormControl_txtName_text")
    public WebElement Fabrication_Name;

    @FindBy(id = "ctl00_cphDefault_GridFabrication_ctl00_ctl02_ctl03_EditFormControl_txtDescription_text")
    public WebElement Fabrication_Description;

    @FindBy(id = "ctl00_cphDefault_GridFabrication_ctl00_ctl02_ctl03_EditFormControl_txtLocation_text")
    public WebElement Fabrication_Location;

    @FindBy(id = "ctl00_cphDefault_GridFabrication_ctl00_ctl02_ctl03_EditFormControl_ddCountry")
    public WebElement Fabrication_Country;

    @FindBy(id = "ctl00_cphDefault_GridFabrication_ctl00_ctl02_ctl03_EditFormControl_txtCapacity_text")
    public WebElement Fabrication_Capacity;

    @FindBy(id = "ctl00_cphDefault_GridFabrication_ctl00_ctl02_ctl03_EditFormControl_txtAnnualProduction_text")
    public WebElement Fabrication_AnnualProduction;

    @FindBy(id = "ctl00_cphDefault_GridFabrication_ctl00_ctl02_ctl03_EditFormControl_btnInsert")
    public WebElement Fabrication_Add;

    @FindBy(id = "ctl00_cphDefault_GridContractorEquipment_ctl00_ctl04_EditButton")
    public WebElement CED_Grid_Edit;

    @FindBy(id = "ctl00_cphDefault_GridFabrication_ctl00_ctl04_EditButton")
    public WebElement Fab_Grid_Edit;

    @FindBy(id = "Additional")
    public WebElement VendorUnderTaken;

    @FindBy(xpath = "//a[contains(@href,'VendorUndertaken')]")
    public WebElement VendorTaken_Attachment;

    @FindBy (id = "ctl00_cphDefault_txtNotes")
    public WebElement Vendor_Note;

    @FindBy (id = "ctl00_cphDefault_btnAddAdditional")
    public WebElement SaveUnderTaken;

    @FindBy (id = "ctl00_cphDefault_btnComplete")
    public WebElement Submit;

    @FindBy (xpath = "//span[contains(text(),'Manage / Submit Vendor Prequalifications')]")
    public WebElement preqlink;

    @FindBy (xpath = "//span[contains(text(),'e-Prequalification Home')]")
    public WebElement epreqlink;
                     //*[contains(text(),'Manage/Submit Vendor Prequalification Applications')]
    //@FindBy(xpath = "(//*[@class='cases-box-icon icon-activecontracts'])[1]")
    @FindBy(xpath = "(//*[@class='cases-box-icon icon-managepreq'])[1]")
    public WebElement befX;

    @FindBy(xpath = "//*[@class='page-header']")
    public WebElement befX2;
    //*[@class='cases-box-icon icon-cert-row']

   // (//*[@class='cases-box-icon icon-activecontracts'])[1]
/*
    @FindBy (xpath = "//*[@name='ctl00$cphDefault$submitAppeal']")
    public WebElement SubmitAppealButton;
*/
   @FindBy (xpath = "//*[@name='ctl00$cphDefault$submitAppeal']")
   public WebElement SubmitAppealButton;


    @FindBy (xpath = "//*[@class='cases-box-icon icon-managepreq-row']")
    public WebElement SubmitContractButton;

    @FindBy (xpath = "//*[@class='cases-box-icon icon-managepreq-subcontract']")
    public WebElement SubmitSubContractButton;

    @FindBy (xpath = "//*[contains(text(),'Click Here to Add Scopes/Projects')]")
    public WebElement Addproject;

    @FindBy (xpath = "//*[contains(text(),'Agency')]")
    public WebElement Agency;

    @FindBy (xpath = "//*[contains(text(),'No records found')]")
    public WebElement norecordfound;

    @FindBy (xpath = "(//*[@class='form-control styled-select ddMajorscope'])[1]")
    public WebElement AddMajorScope;

    @FindBy (xpath = "(//*[@class='form-control styled-select ddlDepartment'])[1]")
    public WebElement Department;

    @FindBy (xpath = "//*[@value='a09fd572-7c33-e911-80db-005056be5c49']")
    public WebElement Scope;

    @FindBy (xpath = "//*[@id='ctl00_cphDefault_rgPrequalifications_ctl00_ctl02_ctl03_EditFormControl_btnAdd']")
    public WebElement Add_button;

    public EPQPortal(WebDriver driver) throws Exception {
        PageFactory.initElements(driver, this);
    }

    //Vector edit start
    public void preqlink() throws Throwable{
        UtilityMethods.waitForElementClickable(preqlink);
        preqlink.click();
    }

    public void SubmitAppealButton() throws Throwable {

        UtilityMethods.waitForPageLoadAndPageReady();

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", befX2);
        Thread.sleep(500);
        //UtilityMethods.scrollToElement(befX2);
System.out.println("SUBHNA");
        //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", SubmitAppealButton);
        //UtilityMethods.scrollToElement(befX);

        //UtilityMethods.scrollToElement();
        System.out.println("befX");
        UtilityMethods.waitForElementClickable(SubmitAppealButton);
        System.out.println("here 2");
        SubmitAppealButton.click();
/*
        Robot scroll = new Robot();
        scroll.keyPress();*/

        System.out.println("Submit appeal button clicked..");
      /*  UtilityMethods.waitForPageLoadAndPageReady();
        UtilityMethods.wait4Seconds();
        //UtilityMethods.wait4Seconds();
        System.out.println("looking for xpath");
        UtilityMethods.scrollToElement(befX);
        System.out.println("befX");
        UtilityMethods.wait2Seconds();
        UtilityMethods.waitForElementClickable(SubmitAppealButton);
        UtilityMethods.wait2Seconds();
        System.out.println("click on submit button");
        SubmitAppealButton.click();

        System.out.println("Submit appeal button clicked..");*/

        UtilityMethods.wait10Seconds();
    }

    public void SubmitContractButton() throws Throwable {

        UtilityMethods.waitForPageLoadAndPageReady();

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", befX2);
        Thread.sleep(500);
        //UtilityMethods.scrollToElement(befX2);
        System.out.println("SUBHNA");
        //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", SubmitAppealButton);
        //UtilityMethods.scrollToElement(befX);

        //UtilityMethods.scrollToElement();
        System.out.println("befX");
        UtilityMethods.waitForElementClickable(SubmitContractButton);
        System.out.println("here 2");
        SubmitContractButton.click();
/*
        Robot scroll = new Robot();
        scroll.keyPress();*/

        System.out.println("Submit appeal button clicked..");
      /*  UtilityMethods.waitForPageLoadAndPageReady();
        UtilityMethods.wait4Seconds();
        //UtilityMethods.wait4Seconds();
        System.out.println("looking for xpath");
        UtilityMethods.scrollToElement(befX);
        System.out.println("befX");
        UtilityMethods.wait2Seconds();
        UtilityMethods.waitForElementClickable(SubmitAppealButton);
        UtilityMethods.wait2Seconds();
        System.out.println("click on submit button");
        SubmitAppealButton.click();

        System.out.println("Submit appeal button clicked..");*/

        UtilityMethods.wait10Seconds();
    }

    public void SubmitSubContractButton() throws Throwable {

        UtilityMethods.waitForPageLoadAndPageReady();

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", befX2);
        Thread.sleep(500);
        //UtilityMethods.scrollToElement(befX2);
        System.out.println("SUBHNA");
        //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", SubmitAppealButton);
        //UtilityMethods.scrollToElement(befX);

        //UtilityMethods.scrollToElement();
        System.out.println("befX");
        UtilityMethods.waitForElementClickable(SubmitSubContractButton);
        System.out.println("here 2");
        SubmitSubContractButton.click();
/*
        Robot scroll = new Robot();
        scroll.keyPress();*/

        System.out.println("Submit appeal button clicked..");
      /*  UtilityMethods.waitForPageLoadAndPageReady();
        UtilityMethods.wait4Seconds();
        //UtilityMethods.wait4Seconds();
        System.out.println("looking for xpath");
        UtilityMethods.scrollToElement(befX);
        System.out.println("befX");
        UtilityMethods.wait2Seconds();
        UtilityMethods.waitForElementClickable(SubmitAppealButton);
        UtilityMethods.wait2Seconds();
        System.out.println("click on submit button");
        SubmitAppealButton.click();

        System.out.println("Submit appeal button clicked..");*/

        UtilityMethods.wait10Seconds();
    }
    public void epreqlink() throws Throwable{
        UtilityMethods.waitForElementClickable(epreqlink);
        epreqlink.click();
    }
/*

    public void AddMajorScope() throws Throwable{
        asdasdasdasd

    }
*/


    public void Addproject() throws Throwable{
        UtilityMethods.wait3Seconds();
        UtilityMethods.wait3Seconds();
        //UtilityMethods.scrollToElement(norecordfound);
        UtilityMethods.scrollToElement(Agency);
        System.out.println("After scroll to Addproject..");
        UtilityMethods.wait3Seconds();
        Addproject.click();
    }


    public void Scope() throws Throwable{

        UtilityMethods.waitForElementClickable(Scope);
        Scope.click();
    }


    public void DataInserter(String Addmajorscope, String department) throws Throwable{

        System.out.println("DX02");
        UtilityMethods.waitForPageLoadAndPageReady();
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].scrollIntoView(true);", AddMajorScope);
//      if (primaryMobileNo.getAttribute("value").isEmpty()) {
        UtilityMethods.wait1Seconds();
        System.out.println("DX03");
        UtilityMethods.evenctvalues2(AddMajorScope, Addmajorscope);

        UtilityMethods.wait1Seconds();
        System.out.println("DX03.5");
        UtilityMethods.evenctvalues2(Department, department);

/*        WebElement AddMajorScope = driver.switchTo().activeElement();
        AddMajorScope.sendKeys("N");

        UtilityMethods.wait3Seconds();
        AddMajorScope.sendKeys(Keys.TAB);
        Utility Methods.wait1Seconds();

        WebElement Department = driver.switchTo().activeElement();
        Department.sendKeys("R");*/
    }


    public void Add_button() throws Throwable {
        UtilityMethods.waitForElementClickable(Add_button);
        Add_button.click();
    }


    //Vector edit end

    public void NavigateToPreReq() throws Throwable {
        UtilityMethods.waitForPageLoadAndPageReady();
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()", PreReq);
        UtilityMethods.wait3Seconds();
    }

    public void NavigateToEPreHome() throws Throwable {
        UtilityMethods.waitForPageLoadAndPageReady();
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()", PreReq);
        UtilityMethods.wait3Seconds();
    }

    public void ProfileLoaded() {
        new WebDriverWait(driver, 20)
                .until(ExpectedConditions.visibilityOf(PageHeader));
        if (PageHeader.getText() == "Profile") {
            System.out.print(PageHeader.getText() + " Loaded");
        } else {
            new WebDriverWait(driver, 20)
                    .until(ExpectedConditions.visibilityOf(PageHeader));
        }
    }

    public void contact_Details(String primaryMobile, String secondaryMobile, String primary_Email, String secondary_Email) throws Throwable {
        UtilityMethods.waitForPageLoadAndPageReady();
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].scrollIntoView(true);", primaryMobileNo);
//        if (primaryMobileNo.getAttribute("value").isEmpty()) {
            UtilityMethods.wait1Seconds();
        UtilityMethods.evenctvalues(primaryMobileNo,primaryMobile);
//            primaryMobileNo.sendKeys(primaryMobile);
//        }
//        if (secondaryMobileNo.getAttribute("value").isEmpty()) {
            UtilityMethods.wait1Seconds();
        UtilityMethods.evenctvalues(secondaryMobileNo,secondaryMobile);
//            secondaryMobileNo.sendKeys(secondaryMobile);
//        }
//        if (primaryEmail.getAttribute("value").isEmpty()) {
            UtilityMethods.wait1Seconds();
        UtilityMethods.evenctvalues(primaryEmail,primary_Email);
//            primaryEmail.sendKeys(primary_Email);
//        }
//        if (secondaryEmail.getAttribute("value").isEmpty()) {
            UtilityMethods.wait1Seconds();
        UtilityMethods.evenctvalues(secondaryEmail,secondary_Email);
//            secondaryEmail.sendKeys(secondary_Email);
//        }
    }

    public void companyDetails(String Makani, String TRN) throws Throwable {
        UtilityMethods.waitForPageLoadAndPageReady();
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].scrollIntoView(true);", MakaniNumber);
        if (MakaniNumber.getAttribute("value").isEmpty()) {
            UtilityMethods.wait1Seconds();
            UtilityMethods.evenctvalues(MakaniNumber,Makani);
//            MakaniNumber.sendKeys(Makani);
        }
        if (TRNNumber.getAttribute("value").isEmpty()) {
            UtilityMethods.wait1Seconds();
            UtilityMethods.evenctvalues(TRNNumber,TRN);
//            TRNNumber.sendKeys(TRN);
        }
        String winHandleBefore = driver.getWindowHandle();
        executor.executeScript("arguments[0].click()", compnayUpload);
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        String UploadFile = new PropertyReader().readProperty("fileLocation");
        UtilityMethods.wait1Seconds();
        choseFile.sendKeys(UploadFile);
        UtilityMethods.wait1Seconds();
        Upload.click();
        driver.close();
        driver.switchTo().window(winHandleBefore);
    }

    public void tradeLicense(String Owner, String ownerShipType) throws Throwable {
        UtilityMethods.waitForPageLoadAndPageReady();
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].scrollIntoView(true);", tradeLicenseClassifications);
        Select driverCompanyOpiton = new Select(tradeLicenseClassifications);
        UtilityMethods.wait1Seconds();
        driverCompanyOpiton.selectByVisibleText("Commercial");
        String winHandleBefore = driver.getWindowHandle();
        executor.executeScript("arguments[0].click()", tradeUploadAttachment);
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        String UploadFile = new PropertyReader().readProperty("fileLocation");
        choseFile.sendKeys(UploadFile);
        UtilityMethods.wait1Seconds();
        Upload.click();
        driver.close();
        driver.switchTo().window(winHandleBefore);
        executor.executeScript("arguments[0].click()", MemorandamUpload);
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        String UploadFile1 = new PropertyReader().readProperty("fileLocation");
        choseFile.sendKeys(UploadFile);
        UtilityMethods.wait1Seconds();
        Upload.click();
        driver.close();
        driver.switchTo().window(winHandleBefore);
        UtilityMethods.wait2Seconds();
        executor.executeScript("arguments[0].click()", Owners);
        if (Owners.getAttribute("value").isEmpty()) {
            UtilityMethods.wait1Seconds();
            Owners.sendKeys(Owner);
        }

        UtilityMethods.wait1Seconds();
        Select OwnerShipType = new Select(OwnerType);
        UtilityMethods.wait1Seconds();
        OwnerShipType.selectByVisibleText(ownerShipType);
    }

    public void CompanyOwner(String PartenerName, String passport, String passportExpDate, String emirate_ID, String emirate_Exp_Date) throws Throwable {
        UtilityMethods.waitForPageLoadAndPageReady();
        JavascriptExecutor executor = (JavascriptExecutor) driver;
//        executor.executeScript("arguments[0].scrollIntoView(true);", EmiratiSponserPartenrName);
        if (EmiratiSponserPartenrName.getAttribute("value").isEmpty()) {
            EmiratiSponserPartenrName.sendKeys(PartenerName);
            UtilityMethods.wait1Seconds();
        }
        if (PassportNumber.getAttribute("value").isEmpty()) {
            PassportNumber.sendKeys(passport);
            UtilityMethods.wait1Seconds();
        }
        if (UtilityMethods.Calneder(PassportCalender, PassportCalenderNext, passportCalenderHeading, passportExpDate)) {
            UtilityMethods.wait2Seconds();
//            CalDate.click();
            executor.executeScript("arguments[0].click()", CalDate);
        }
        if (EmirateID.getAttribute("value").isEmpty()) {
            EmirateID.sendKeys(emirate_ID);
            UtilityMethods.wait1Seconds();
        }
        if (UtilityMethods.Calneder(Calender, CalenderNext, CalenderHeading, emirate_Exp_Date)) {
            UtilityMethods.wait2Seconds();
//            CalDate.click();
            executor.executeScript("arguments[0].click()", CalDate);
        }
        String winHandleBefore = driver.getWindowHandle();
        executor.executeScript("arguments[0].click()", CompanyUploadAttachment);
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        String UploadFile = new PropertyReader().readProperty("fileLocation");
        UtilityMethods.wait1Seconds();
        choseFile.sendKeys(UploadFile);
        UtilityMethods.wait2Seconds();
        Upload.click();
        driver.close();
        driver.switchTo().window(winHandleBefore);
    }

    public void LoadCompanyStructure() throws Throwable {
        UtilityMethods.waitForPageLoadAndPageReady();
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()", CompanyStructure);
        UtilityMethods.wait3Seconds();
        new WebDriverWait(driver, 20)
                .until(ExpectedConditions.visibilityOf(PageHeader));
        if (PageHeader.getText() == "Company Structure") {
            System.out.print(PageHeader.getText() + " Loaded");
        } else {
            new WebDriverWait(driver, 20)
                    .until(ExpectedConditions.visibilityOf(PageHeader));
        }
    }

    public void CompanyProfileAttachment(WebElement element) throws Throwable {
        UtilityMethods.waitForPageLoadAndPageReady();
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].scrollIntoView(true);", element);
        String winHandleBefore = driver.getWindowHandle();
        executor.executeScript("arguments[0].click()", element);
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        String UploadFile = new PropertyReader().readProperty("fileLocation");
        UtilityMethods.wait1Seconds();
        choseFile.sendKeys(UploadFile);
        UtilityMethods.wait1Seconds();
        Upload.click();
        driver.close();
        driver.switchTo().window(winHandleBefore);
    }

    public void LoadFinancialInformation() throws Throwable {
        UtilityMethods.waitForPageLoadAndPageReady();
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()", FinancialInfo);
        UtilityMethods.wait3Seconds();
        new WebDriverWait(driver, 20)
                .until(ExpectedConditions.visibilityOf(PageHeader));
        if (PageHeader.getText() == "Financial Information") {
            System.out.print(PageHeader.getText() + " Loaded");
        } else {
            new WebDriverWait(driver, 20)
                    .until(ExpectedConditions.visibilityOf(PageHeader));
        }
    }

    public void userEnterFinancialInformationandUploadedEtihadRiskBureau(String string) throws Throwable {
        UtilityMethods.evenctvalues(Financial_ContractSize, string);
        CompanyProfileAttachment(Financial_EtihadRiskUpload);
    }

    public void userUploadedBankStatement(String string) throws Throwable {
        UtilityMethods.evenctClick(Financial_InformationBank);
        UtilityMethods.evenctvalues(Financial_AvgBalance, string);
        CompanyProfileAttachment(Financial_BankStatementUpload);
    }

    public void AuditReport() throws Throwable {
        UtilityMethods.wait1Seconds();
        UtilityMethods.evenctClick(Financial_InformationAudit);
        UtilityMethods.wait1Seconds();
    }

    public void UploadAuditReport() throws Throwable {
        CompanyProfileAttachment(Financial_AuditRptUpload);
    }

    public void BankVendor(String Name, String Address, String City, String Country, String Email, String Contact) throws Throwable {
        UtilityMethods.waitForPageLoadAndPageReady();
        UtilityMethods.wait1Seconds();
        UtilityMethods.evenctClick(Financial_BankVandors);
        UtilityMethods.wait1Seconds();
        UtilityMethods.waitForElementDisplayed(VendorHeading, 10);
        UtilityMethods.evenctvalues(BankVandors_Name, Name);
        UtilityMethods.wait1Seconds();
        UtilityMethods.evenctvalues(BankVandors_AddressLine1, Address);
        UtilityMethods.wait1Seconds();
        UtilityMethods.evenctvalues(BankVandors_City, City);
        Select SelectCountry = new Select(BankVandors_Country);
        UtilityMethods.wait1Seconds();
        SelectCountry.selectByVisibleText(Country);
        UtilityMethods.wait1Seconds();
        UtilityMethods.evenctvalues(BankVandors_Email, Email);
        UtilityMethods.wait1Seconds();
        UtilityMethods.evenctvalues(BankVandors_ContactNumber, Contact);
        UtilityMethods.wait1Seconds();
        UtilityMethods.evenctClick(BankVandors_Submit);
        UtilityMethods.wait1Seconds();
    }

    public void Vendor_Banker_Verification(String Name, String Address) throws Throwable {
        UtilityMethods.waitForPageLoadAndPageReady();
        UtilityMethods.wait1Seconds();
        if (BankVandors_NameVerification.getText().equals(Name))
            System.out.println(Name + " Verified");
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].scrollIntoView(true);", Next);
        UtilityMethods.wait1Seconds();
        executor.executeScript("arguments[0].click()", Next);
//        if (BankVandors_AddressVerification.getText().equals(Address)) {
//            System.out.print(Address + " Verified");
//            UtilityMethods.evenctClick(Next);
//        }
    }

    public void LoadExperience() throws Throwable {
        UtilityMethods.waitForPageLoadAndPageReady();
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()", RelevantExperience);
        UtilityMethods.wait3Seconds();
        new WebDriverWait(driver, 20)
                .until(ExpectedConditions.visibilityOf(PageHeader));
        if (PageHeader.getText() == "Experience") {
            System.out.print(PageHeader.getText() + " Loaded");
        } else {
            new WebDriverWait(driver, 20)
                    .until(ExpectedConditions.visibilityOf(PageHeader));
        }
    }

    public void ExperienceInformation(String CountryExp, String GCCExp, String International) throws Throwable {
        UtilityMethods.waitForPageLoadAndPageReady();
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()", Internationally);
        UtilityMethods.wait1Seconds();
        UtilityMethods.evenctvalues(OwnCountry, CountryExp);
        UtilityMethods.wait1Seconds();
        UtilityMethods.evenctvalues(GCC, GCCExp);
        UtilityMethods.wait1Seconds();
        UtilityMethods.evenctvalues(Internationally, International);
        UtilityMethods.wait1Seconds();
    }

    public void Add_Relevant_Exp(String Exp_Name, String Location, String Project_Type, String Key_Contact, String Project_Description, String Contact_Price, String Status, String Document_Type) throws Throwable {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        UtilityMethods.waitForPageLoadAndPageReady();
        UtilityMethods.wait1Seconds();
        executor.executeScript("arguments[0].click()", AddrelevanatExp);
//        UtilityMethods.evenctClick(AddrelevanatExp);
        UtilityMethods.wait1Seconds();
        UtilityMethods.waitForElementDisplayed(RelevantProjectDetails, 10);
        UtilityMethods.wait1Seconds();
        UtilityMethods.evenctvalues(R_Exp_Name, Exp_Name);
        UtilityMethods.wait1Seconds();
        UtilityMethods.evenctvalues(R_Exp_Location, Location);
        UtilityMethods.wait1Seconds();
        UtilityMethods.evenctvalues(R_Exp_ProjectType, Project_Type);
        UtilityMethods.wait1Seconds();
        UtilityMethods.evenctvalues(R_Exp_Contact, Key_Contact);
        UtilityMethods.wait1Seconds();
        UtilityMethods.evenctvalues(R_Exp_ProjectText, Project_Description);
        UtilityMethods.wait1Seconds();
        UtilityMethods.evenctvalues(R_Exp_PriceText, Contact_Price);
        UtilityMethods.wait1Seconds();
        Select SelectStatus = new Select(R_Exp_ddStatus);
        UtilityMethods.wait1Seconds();
        SelectStatus.selectByVisibleText(Status);
        Select SelectDocType = new Select(R_Exp_ddDocType);
        UtilityMethods.wait1Seconds();
        SelectDocType.selectByVisibleText(Document_Type);
        CompanyProfileAttachment(Upload_RelevantExperience);
        UtilityMethods.evenctClick(R_Exp_Add);
        UtilityMethods.wait1Seconds();
    }

    public void Verify_Relevant_Exp(String Name) throws Throwable{
        if (R_Exp_Record.getText().equals(Name)) {
            System.out.println("Relevant Experience Record has been saved");
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].scrollIntoView(true);", Next);
            UtilityMethods.wait1Seconds();
            executor.executeScript("arguments[0].click()", Next);
        }
    }

    public void LoadPersonal() throws Throwable {
        UtilityMethods.waitForPageLoadAndPageReady();
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()", Personal);
        UtilityMethods.wait3Seconds();
        new WebDriverWait(driver, 20)
                .until(ExpectedConditions.visibilityOf(PageHeader));
        if (PageHeader.getText() == "Experience") {
            System.out.print(PageHeader.getText() + "Personnel");
        } else {
            new WebDriverWait(driver, 20)
                    .until(ExpectedConditions.visibilityOf(PageHeader));
        }
    }

    public void Staff_Summary(String Administrative, String Technical_Staff, String Staff_Released, String Staff_Acquired, String Additional) throws Throwable {
        UtilityMethods.waitForPageLoadAndPageReady();
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        UtilityMethods.wait1Seconds();
        UtilityMethods.evenctvalues(Personal_Administrative, Administrative);
        UtilityMethods.wait1Seconds();
        UtilityMethods.evenctvalues(Personal_Tech_Staff, Technical_Staff);
        UtilityMethods.wait1Seconds();
        UtilityMethods.evenctvalues(Personal_Rel_Staff, Staff_Released);
        executor.executeScript("arguments[0].scrollIntoView(true);", Personal_Acq_Staff);
        UtilityMethods.wait1Seconds();
        UtilityMethods.evenctvalues(Personal_Acq_Staff, Staff_Acquired);
        UtilityMethods.wait1Seconds();
        CompanyProfileAttachment(Personal_Lab_Statement);
        UtilityMethods.wait1Seconds();
        UtilityMethods.evenctvalues(Personal_Additional, Additional);
        UtilityMethods.wait1Seconds();
        executor.executeScript("arguments[0].click()", Personal_C_K_Add);
    }

    public void Contact_Key_Staff(String F_Name, String L_Name, String Nationality, String Position, String Yrs_Exp, String Yrs_Firm, String Contact_Type, String Email, String Mobile) throws Throwable {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        UtilityMethods.waitForPageLoadAndPageReady();
        new WebDriverWait(driver, 20)
                .until(ExpectedConditions.visibilityOf(Personal_C_K_Title));
        UtilityMethods.wait1Seconds();
        UtilityMethods.evenctvalues(Personal_C_K_First_Name, F_Name);
        UtilityMethods.wait1Seconds();
        UtilityMethods.evenctvalues(Personal_C_K_Last_Name, L_Name);
        UtilityMethods.wait1Seconds();
        Select SelectNationality = new Select(Personal_C_K_Nationality);
        UtilityMethods.wait1Seconds();
        SelectNationality.selectByVisibleText(Nationality);
        UtilityMethods.wait1Seconds();
        UtilityMethods.evenctvalues(Personal_C_K_Position, Position);
        UtilityMethods.wait1Seconds();
        UtilityMethods.evenctvalues(Personal_C_K_YrsExp, Yrs_Exp);
        UtilityMethods.wait1Seconds();
        UtilityMethods.evenctvalues(Personal_C_K_YrsFirm, Yrs_Firm);
        UtilityMethods.wait1Seconds();
        Select SelectContType = new Select(Personal_C_K_ContactType);
        SelectContType.selectByVisibleText("PQ Contact Person");
        UtilityMethods.wait1Seconds();
        UtilityMethods.evenctvalues(Personal_C_K_Email, Email);
        UtilityMethods.wait1Seconds();
        UtilityMethods.evenctvalues(Personal_C_K_Mobile, Mobile);
        UtilityMethods.wait1Seconds();
        UtilityMethods.evenctClick(Personal_CK_Add);
        UtilityMethods.wait1Seconds();
        executor.executeScript("arguments[0].click()", Personal_C_K_Add);
        UtilityMethods.wait1Seconds();
        UtilityMethods.waitForPageLoadAndPageReady();
        new WebDriverWait(driver, 20)
                .until(ExpectedConditions.visibilityOf(Personal_C_K_Title));
        UtilityMethods.wait1Seconds();
        UtilityMethods.evenctvalues(Personal_C_K_First_Name, F_Name);
        UtilityMethods.wait1Seconds();
        UtilityMethods.evenctvalues(Personal_C_K_Last_Name, L_Name);
        UtilityMethods.wait1Seconds();
//        Select SelectNationality = new Select(Personal_C_K_Nationality);
        UtilityMethods.wait1Seconds();
        SelectNationality.selectByVisibleText(Nationality);
        UtilityMethods.wait1Seconds();
        UtilityMethods.evenctvalues(Personal_C_K_Position, Position);
        UtilityMethods.wait1Seconds();
        UtilityMethods.evenctvalues(Personal_C_K_YrsExp, Yrs_Exp);
        UtilityMethods.wait1Seconds();
        UtilityMethods.evenctvalues(Personal_C_K_YrsFirm, Yrs_Firm);
        UtilityMethods.wait1Seconds();
//        Select SelectContType = new Select(Personal_C_K_ContactType);
        SelectContType.selectByVisibleText(Contact_Type);
        UtilityMethods.wait1Seconds();
        UtilityMethods.evenctvalues(Personal_C_K_Email, Email);
        UtilityMethods.wait1Seconds();
        UtilityMethods.evenctvalues(Personal_C_K_Mobile, Mobile);
        UtilityMethods.wait1Seconds();
        UtilityMethods.evenctClick(Personal_CK_Add);
    }

    public void Verify_Contact_Key_Staff(String Name) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].scrollIntoView(true);", C_K_Record);
        if (C_K_Record.getText().equals(Name)) {
            System.out.println("Contact & Key Staff Record has been saved");
            Next.click();
        }
    }

    public void CV_Info(String F_Name, String L_Name, String Nationality, String Position,String ProPosition, String Yrs_Exp, String Yrs_Firm, String Type, String English, String Arabic, String Other) throws Throwable {
        UtilityMethods.waitForPageLoadAndPageReady();
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()", Personal_CVAdd);
        UtilityMethods.wait1Seconds();
        new WebDriverWait(driver, 20)
                .until(ExpectedConditions.visibilityOf(Personal_CV_Popup_Title));
        UtilityMethods.wait1Seconds();
        UtilityMethods.evenctvalues(Personal_CV_First_Name, F_Name);
        UtilityMethods.wait1Seconds();
        UtilityMethods.evenctvalues(Personal_CV_Last_Name, L_Name);
        UtilityMethods.wait1Seconds();
        Select SelectNationality = new Select(Personal_CV_Nationality);
        UtilityMethods.wait1Seconds();
        SelectNationality.selectByVisibleText(Nationality);
        UtilityMethods.wait1Seconds();
        UtilityMethods.evenctvalues(Personal_CV_Position, Position);
        UtilityMethods.wait1Seconds();
        UtilityMethods.evenctvalues(Personal_CV_Pro_Position, ProPosition);
        UtilityMethods.wait1Seconds();
        UtilityMethods.evenctvalues(Personal_CV_YrsExp, Yrs_Exp);
        UtilityMethods.wait1Seconds();
        UtilityMethods.evenctvalues(Personal_CV_YrsFirmExp, Yrs_Firm);
        UtilityMethods.wait1Seconds();
        UtilityMethods.evenctvalues(Personal_CV_Type, Type);
        UtilityMethods.wait1Seconds();
        Select DDLEnglish = new Select(Personal_CV_English);
        DDLEnglish.selectByVisibleText(English);
        UtilityMethods.wait1Seconds();
        Select DDLArabic = new Select(Personal_CV_Arabic);
        DDLArabic.selectByVisibleText(Arabic);
        UtilityMethods.wait1Seconds();
        UtilityMethods.evenctvalues(Personal_CV_Other, Other);
        UtilityMethods.wait1Seconds();
        CompanyProfileAttachment(Personal_CV);
        UtilityMethods.wait1Seconds();
        UtilityMethods.evenctClick(Personal_CV_Add);
    }

    public void Verify_CV(String Name) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].scrollIntoView(true);", CV_Record);
        if (CV_Record.isDisplayed()) {
            System.out.println("CV has been Uploaded and saved");
//            Next.click();
            executor.executeScript("arguments[0].click();", Next);
        }
    }

    public void LoadHSE() throws Throwable {
        UtilityMethods.waitForPageLoadAndPageReady();
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()", HSE);
        UtilityMethods.wait3Seconds();
        new WebDriverWait(driver, 20)
                .until(ExpectedConditions.visibilityOf(PageHeader));
        if (PageHeader.getText() == "HSE") {
            System.out.print(PageHeader.getText() + "HSE");
        } else {
            new WebDriverWait(driver, 20)
                    .until(ExpectedConditions.visibilityOf(PageHeader));
        }
    }

    public void HSE_Policy_Attachment(String Ans1, String Ans2, String Ans3) throws Throwable{
        UtilityMethods.waitForPageLoadAndPageReady();
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        UtilityMethods.wait1Seconds();
        Select HSEQ1 = new Select(HSE_Q1_S1);
        HSEQ1.selectByVisibleText(Ans1);
        CompanyProfileAttachment(HSE_Q1_A1);
        UtilityMethods.wait1Seconds();
        Select HSEQ2 = new Select(HSE_Q1_S2);
        HSEQ2.selectByVisibleText(Ans2);
        CompanyProfileAttachment(HSE_Q1_A2);
        UtilityMethods.wait1Seconds();
        Select HSEQ3 = new Select(HSE_Q1_S3);
        HSEQ3.selectByVisibleText(Ans3);
        CompanyProfileAttachment(HSE_Q1_A3);
        UtilityMethods.wait1Seconds();
        Select HSEQ4 = new Select(HSE_Q1_S4);
        HSEQ4.selectByVisibleText(Ans1);
        CompanyProfileAttachment(HSE_Q1_A4);
        UtilityMethods.wait1Seconds();
        UtilityMethods.wait1Seconds();
        Select HSEQ5 = new Select(HSE_Q1_S5);
        HSEQ5.selectByVisibleText(Ans2);
        CompanyProfileAttachment(HSE_Q1_A5);
        UtilityMethods.wait1Seconds();
        Select HSEQ6 = new Select(HSE_Q1_S6);
        HSEQ6.selectByVisibleText(Ans3);
        CompanyProfileAttachment(HSE_Q1_A6);
        UtilityMethods.wait1Seconds();
        Select HSEQ7 = new Select(HSE_Q1_S7);
        HSEQ7.selectByVisibleText(Ans1);
        CompanyProfileAttachment(HSE_Q1_A7);
        UtilityMethods.wait1Seconds();
        UtilityMethods.wait1Seconds();
        Select HSEQ8 = new Select(HSE_Q1_S8);
        HSEQ8.selectByVisibleText(Ans2);
        CompanyProfileAttachment(HSE_Q1_A8);
        UtilityMethods.wait1Seconds();
        Select HSEQ9 = new Select(HSE_Q1_S9);
        HSEQ9.selectByVisibleText(Ans3);
        CompanyProfileAttachment(HSE_Q1_A9);
        UtilityMethods.wait1Seconds();
        Select HSEQ10 = new Select(HSE_Q1_S10);
        HSEQ10.selectByVisibleText(Ans1);
        CompanyProfileAttachment(HSE_Q1_A10);
        UtilityMethods.evenctClick(Next);
    }

    public void LoadGreenEconomy() throws Throwable {
        UtilityMethods.waitForPageLoadAndPageReady();
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()", GreenEconomy);
        UtilityMethods.wait3Seconds();
        new WebDriverWait(driver, 20)
                .until(ExpectedConditions.visibilityOf(PageHeader));
        if (PageHeader.getText() == "Green Economy") {
            System.out.print(PageHeader.getText() + "Green Economy");
        } else {
            new WebDriverWait(driver, 20)
                    .until(ExpectedConditions.visibilityOf(PageHeader));
        }
    }

    public void GreenEconomy_Attachment(String Ans1, String Ans2, String Ans3) throws Throwable{
        UtilityMethods.waitForPageLoadAndPageReady();
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        UtilityMethods.wait1Seconds();
        Select HSEQ1 = new Select(HSE_Q1_S1);
        HSEQ1.selectByVisibleText(Ans1);
        CompanyProfileAttachment(HSE_Q1_A1);
        UtilityMethods.wait1Seconds();
        Select HSEQ2 = new Select(HSE_Q1_S2);
        HSEQ2.selectByVisibleText(Ans2);
        CompanyProfileAttachment(HSE_Q1_A2);
        UtilityMethods.wait1Seconds();
        Select HSEQ3 = new Select(HSE_Q1_S3);
        HSEQ3.selectByVisibleText(Ans3);
        CompanyProfileAttachment(HSE_Q1_A3);
        UtilityMethods.wait1Seconds();
        Select HSEQ4 = new Select(HSE_Q1_S4);
        HSEQ4.selectByVisibleText(Ans1);
        CompanyProfileAttachment(HSE_Q1_A4);
        UtilityMethods.wait1Seconds();
        UtilityMethods.wait1Seconds();
        Select HSEQ5 = new Select(HSE_Q1_S5);
        HSEQ5.selectByVisibleText(Ans2);
        CompanyProfileAttachment(HSE_Q1_A5);
        UtilityMethods.wait1Seconds();
        Select HSEQ6 = new Select(HSE_Q1_S6);
        HSEQ6.selectByVisibleText(Ans3);
        CompanyProfileAttachment(HSE_Q1_A6);
        UtilityMethods.wait1Seconds();
        Select HSEQ7 = new Select(HSE_Q1_S7);
        HSEQ7.selectByVisibleText(Ans1);
        CompanyProfileAttachment(HSE_Q1_A7);
        UtilityMethods.wait1Seconds();
        UtilityMethods.wait1Seconds();
        Select HSEQ8 = new Select(HSE_Q1_S8);
        HSEQ8.selectByVisibleText(Ans2);
        CompanyProfileAttachment(HSE_Q1_A8);
        UtilityMethods.wait1Seconds();
        Select HSEQ9 = new Select(HSE_Q1_S9);
        HSEQ9.selectByVisibleText(Ans3);
        CompanyProfileAttachment(HSE_Q1_A9);
        UtilityMethods.wait1Seconds();
//        UtilityMethods.evenctClick(Next);
        executor.executeScript("arguments[0].click();", Next);
    }

    public void LoadOtherResources() throws Throwable {
        UtilityMethods.waitForPageLoadAndPageReady();
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()", OtherResources);
        UtilityMethods.wait3Seconds();
        new WebDriverWait(driver, 20)
                .until(ExpectedConditions.visibilityOf(PageHeader));
        if (PageHeader.getText() == "Other Resources") {
            System.out.print(PageHeader.getText() + "Other Resources");
        } else {
            new WebDriverWait(driver, 20)
                    .until(ExpectedConditions.visibilityOf(PageHeader));
        }
    }

    public void Contract_Equipment_Details(String Equipment, String OwnerShipStatus, String Age,String Quantity, String OperatingCondition, String CurrentLocation) throws Throwable{
        UtilityMethods.waitForPageLoadAndPageReady();
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        CompanyProfileAttachment(Resources_Reg_Copy);
        UtilityMethods.evenctClick(AddContractEquipment);
        new WebDriverWait(driver, 20)
                .until(ExpectedConditions.visibilityOf(TitleContractEquipment));
        UtilityMethods.evenctvalues(CED_Equipment,Equipment);
        UtilityMethods.wait1Seconds();
        Select DdlOwnership = new Select(CED_OwnerShipStatus);
        DdlOwnership.selectByVisibleText(OwnerShipStatus);
        UtilityMethods.wait1Seconds();
        UtilityMethods.evenctvalues(CED_Age,Age);
        UtilityMethods.wait1Seconds();
        UtilityMethods.evenctvalues(CED_Quantity,Quantity);
        UtilityMethods.wait1Seconds();
        UtilityMethods.evenctvalues(CED_OperatingCondition,OperatingCondition);
        Select DDLCurrentLocation = new Select(CED_CurrentLocation);
        DDLCurrentLocation.selectByVisibleText(CurrentLocation);
        UtilityMethods.wait1Seconds();
        UtilityMethods.evenctClick(CED_Add);
    }

    public void Verify_CED() {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].scrollIntoView(true);", CED_Grid_Edit);
        if (CED_Grid_Edit.isDisplayed()) {
            System.out.println("CED Verified");
        }
    }

    public void Fabrication_Facilities(String Name, String Description,String Location, String Country, String Capacity, String AnnualProduction) throws Throwable{
        UtilityMethods.waitForPageLoadAndPageReady();
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        UtilityMethods.wait1Seconds();
        CompanyProfileAttachment(Resources_Rental_Contract);
        UtilityMethods.evenctClick(AddFabrication);
        new WebDriverWait(driver, 20)
                .until(ExpectedConditions.visibilityOf(TitleFabrication));
        UtilityMethods.evenctvalues(Fabrication_Name,Name);
        UtilityMethods.wait1Seconds();
        UtilityMethods.evenctvalues(Fabrication_Description,Description);
        UtilityMethods.wait1Seconds();
        UtilityMethods.evenctvalues(Fabrication_Location,Location);
        UtilityMethods.wait1Seconds();
        Select DDLCurrentLocation = new Select(Fabrication_Country);
        DDLCurrentLocation.selectByVisibleText(Country);
        UtilityMethods.wait1Seconds();
        UtilityMethods.evenctvalues(Fabrication_Capacity,Capacity);
        UtilityMethods.evenctvalues(Fabrication_AnnualProduction,AnnualProduction);
        UtilityMethods.evenctClick(Fabrication_Add);
    }

    public void Verify_Fabrication() {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].scrollIntoView(true);", Fab_Grid_Edit);
        if (Fab_Grid_Edit.isDisplayed()) {
            System.out.println("Fabrication Details");
//            Next.click();
            executor.executeScript("arguments[0].click();", Next);
        }
    }

    public void LoadVendorUnderTaken() throws Throwable{
        UtilityMethods.waitForPageLoadAndPageReady();
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].scrollIntoView(true);", VendorUnderTaken);
        UtilityMethods.wait1Seconds();
        executor.executeScript("arguments[0].click()", VendorUnderTaken);
        UtilityMethods.wait3Seconds();
        new WebDriverWait(driver, 20)
                .until(ExpectedConditions.visibilityOf(PageHeader));
        if (PageHeader.getText() == "Vendor Undertaken") {
            System.out.print(PageHeader.getText() + "Vendor Undertaken");
        } else {
            new WebDriverWait(driver, 20)
                    .until(ExpectedConditions.visibilityOf(PageHeader));
        }
    }

    public void UnderTaken(String AdditionalNote) throws Throwable{
        UtilityMethods.waitForPageLoadAndPageReady();
        UtilityMethods.waitForPageLoadAndPageReady();
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].scrollIntoView(true);", VendorTaken_Attachment);
        String winHandleBefore = driver.getWindowHandle();
        executor.executeScript("arguments[0].click()", VendorTaken_Attachment);
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        String UploadFile = new PropertyReader().readProperty("fileLocation");
        UtilityMethods.wait1Seconds();
        multifile.sendKeys(UploadFile);
        UtilityMethods.wait1Seconds();
        Upload.click();
        driver.close();
        driver.switchTo().window(winHandleBefore);
        UtilityMethods.wait1Seconds();
        UtilityMethods.evenctvalues(Vendor_Note,AdditionalNote);
    }

    public void SavePreQualification() throws Throwable{
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].scrollIntoView(true);", SaveUnderTaken);
        UtilityMethods.wait1Seconds();
        executor.executeScript("arguments[0].click()", SaveUnderTaken);
        UtilityMethods.wait2Seconds();
    }

    public void SubmitPreQualification() throws Throwable{
        UtilityMethods.waitForPageLoadAndPageReady();
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].scrollIntoView(true);", Submit);
        UtilityMethods.wait2Seconds();
        executor.executeScript("arguments[0].click()", Submit);
//        UtilityMethods.evenctClick(Submit);
        UtilityMethods.wait2Seconds();
        System.out.println("==Pre-Qualification Completed==");
//        if(Submit.isDisplayed()!=true){
//            System.out.print(PageHeader.getText() + "==Pre-Qualification Completed==");
//        } else {
//            new WebDriverWait(driver, 20)
//                    .until(ExpectedConditions.visibilityOf(PageHeader));
//        }
    }
}
