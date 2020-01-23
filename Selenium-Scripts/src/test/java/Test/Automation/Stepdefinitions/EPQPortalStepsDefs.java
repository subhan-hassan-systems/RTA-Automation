package Test.Automation.Stepdefinitions;

import Test.Automation.Pages.EPQPortal;
import Test.Automation.Pages.ManageSubmitPrequalifications;
import Test.Automation.Utils.DriverFactory;
import Test.Automation.Utils.UtilityMethods;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.JavascriptExecutor;

import static Test.Automation.Utils.DataPool.readExcelData;

/**
 * Created by waqar.tufail on 4/5/2019.
 */
public class EPQPortalStepsDefs extends DriverFactory {
    private EPQPortal epqPortalPage;
    private ManageSubmitPrequalifications epqSubmitManagePrequalificationPage;

    @Before
    public void setUp() throws Exception {
        epqPortalPage = new EPQPortal(driver);
        epqSubmitManagePrequalificationPage = new ManageSubmitPrequalifications(driver);
    }

    @When("^Navigate to Prequalification Requirements$")
    public void navigate_to_Prequalification_Requirements() throws Throwable {
        System.out.println("===EPQ Vendor Portal Opened===");
        epqPortalPage.NavigateToPreReq();
        System.out.println("===Navigated to Pre Qualification===");
    }

    @When("^Navigate to ePrequalification Home$")
    public void navigate_to_ePrequalification_home() throws Throwable {
        System.out.println("===EPQ Vendor Portal Opened===");
        UtilityMethods.wait4Seconds();
        epqPortalPage.NavigateToEPreHome();
        System.out.println("===Navigated to ePre Home===");
    }
    @When("^User Profile Loaded$")
    public void user_Profile_Loaded() throws Throwable {
        System.out.println("===EPQ Vendor Portal Loaded===");
        epqPortalPage.ProfileLoaded();
        System.out.println("===EPQ Vendor Portal Loaded===");
    }

    @When("^User click on ePrequalifications home$")
    public void user_click_on_ePrequalifications_home() throws Throwable {
        //UtilityMethods.wait3Seconds();
        UtilityMethods.wait4Seconds();
        System.out.println("===EPQ Vendor Portal Prequalification Home===");

        epqPortalPage.epreqlink();
        System.out.println("===EPQ Vendor Portal Prequalification Home Clicked===");
    }

    @When("^User click on submit appeal$")
    public void user_click_on_submit_appeal() throws Throwable {

        UtilityMethods.wait4Seconds();
        System.out.println("===EPQ Vendor Portal Prequalification Home===");
        UtilityMethods.wait4Seconds();
        UtilityMethods.wait4Seconds();
        epqPortalPage.SubmitAppealButton();
        //System.out.println(getX());
    }
    @When("^User click on submit contractor ROW$")
    public void user_click_on_submit_contractor_ROW() throws Throwable {

        UtilityMethods.wait4Seconds();
        System.out.println("===EPQ Vendor Portal Prequalification Home===");
        UtilityMethods.wait4Seconds();
        UtilityMethods.wait4Seconds();
        epqPortalPage.SubmitContractButton();
        //System.out.println(getX());
    }
    @When("^User click on submit sub contractor$")
    public void user_click_on_submit_sub_contractor() throws Throwable {

        UtilityMethods.wait4Seconds();
        System.out.println("===EPQ Vendor Portal Prequalification Home===");
        UtilityMethods.wait4Seconds();
        UtilityMethods.wait4Seconds();
        epqPortalPage.SubmitSubContractButton();
        //System.out.println(getX());
    }

    private String getX() {
        return "===EPQ Vendor Portal Prequalification Home Clicked===";
    }

    @When("^User click on Prequalifications link$")
    public void user_click_on_Prequalifications_link() throws Throwable {
        UtilityMethods.wait3Seconds();
        System.out.println("===EPQ Vendor Portal Prequalification Link===");
        epqPortalPage.preqlink();
        System.out.println("===EPQ Vendor Portal Prequalification Link Clicked===");
    }

    @When("^User click on add project and insert data$")
    public void user_click_on_add_project_and_insert_data() throws Throwable {
        System.out.println("===EPQ Vendor Portal Add Project Link===");
        epqPortalPage.Addproject();
        System.out.println("DX01");

        epqPortalPage.DataInserter(
                readExcelData("Testdata", "Activity", "Addmajorscope").get("Value").toString(),
                readExcelData("Testdata", "Activity", "Department").get("Value").toString()
        );
        System.out.println("DX01.5");
        epqPortalPage.Scope();
        System.out.println("DX01.6");
        epqPortalPage.Add_button();
        System.out.println("DX01.7");
    }


    @When("^User Enter Contact Details$")
    public void user_Enter_Contact_Details() throws Throwable {
        System.out.println("===Contact Details Started===");
        epqPortalPage.contact_Details(
                readExcelData("Testdata", "Activity", "EPQPrimaryMobile").get("Value").toString(),
                readExcelData("Testdata", "Activity", "EPQSecondaryMobile").get("Value").toString(),
                readExcelData("Testdata", "Activity", "EPQPrimaryEmail").get("Value").toString(),
                readExcelData("Testdata", "Activity", "EPQSecondaryEmail").get("Value").toString());
        System.out.println("===Contact Details Completed===");
    }

    @When("^User Enter Company Information and Upload the File$")
    public void user_Enter_Company_Information_and_Upload_the_File() throws Throwable {
        System.out.println("===Company Information Started===");
        epqPortalPage.companyDetails(
                readExcelData("Testdata", "Activity", "Makani").get("Value").toString(),
                readExcelData("Testdata", "Activity", "TRN").get("Value").toString()
        );
        System.out.println("===Company Information Completed===");
    }

    @When("^User Enter Trade License Information and Upload the File$")
    public void user_Enter_Trade_License_Information_and_Upload_the_File() throws Throwable {
        System.out.println("===Trade License Information Started===");
        epqPortalPage.tradeLicense(
                readExcelData("Testdata", "Activity", "Owners").get("Value").toString(),
                readExcelData("Testdata", "Activity", "OwnershipType").get("Value").toString()
        );
        System.out.println("===Trade License Information Completed===");
    }

    @When("^User Enter Company Owner Information and Upload the File$")
    public void user_Enter_Company_Owner_Information_and_Upload_the_File() throws Throwable {
        System.out.println("===Company Owner Informatio Started===");
        epqPortalPage.CompanyOwner(
                readExcelData("Testdata", "Activity", "ParterName").get("Value").toString(),
                readExcelData("Testdata", "Activity", "Passport").get("Value").toString(),
                readExcelData("Testdata", "Activity", "PassportExpiry").get("Value").toString(),
                readExcelData("Testdata", "Activity", "EmiratesID").get("Value").toString(),
                readExcelData("Testdata", "Activity", "EmiratesExpiryDate").get("Value").toString()
        );
        System.out.println("===Company Owner Informatio Completed===");
    }

    @When("^Click on Next Button$")
    public void click_on_Next_Button() throws Throwable {
        System.out.println("===Proceed to Next Page===");
        UtilityMethods.wait1Seconds();
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()", epqPortalPage.Next);
//        epqPortalPage.Next.click();
        UtilityMethods.wait2Seconds();
        System.out.println("===Next Page Called===");
    }

    @Then("^Verify Profile has been Updated$")
    public void verify_Profile_has_been_Updated() throws Throwable {
        System.out.println("===Verify Profile Page Completed===");
        if(epqPortalPage.PageHeader.isDisplayed()== false);
        System.out.println("===Verified Profile Page Completed===");
    }

    @When("^Navigate to Company Structur$")
    public void navigate_to_Company_Structur() throws Throwable {
        System.out.println("===EPQ Vendor Portal Company Structure===");
        epqPortalPage.LoadCompanyStructure();
        System.out.println("===Navigated to Company Structure Loaded===");
    }

    @When("^User Uploaded Company Profile Attachment$")
    public void user_Uploaded_Company_Profile_Attachment() throws Throwable {
        System.out.println("===Company Profile Attachmwent===");
        epqPortalPage.CompanyProfileAttachment(epqPortalPage.CompanyProfileUploadAttachment);
        System.out.println("===Company Profile Attachmwent===");
    }

    @When("^User Uploaded Organization Chart Attachment$")
    public void user_Uploaded_Organization_Chart_Attachment() throws Throwable {
        System.out.println("===Organziation Chart Attachmwent===");
        epqPortalPage.CompanyProfileAttachment(epqPortalPage.OrganizationChartUploadAttachment);
        System.out.println("===Organziation Chart Attachmwent===");
    }

    @When("^Navigate to Financial Information$")
    public void navigate_to_Financial_Information() throws Throwable {
        System.out.println("===EPQ Vendor Portal Financial Information===");
        epqPortalPage.LoadFinancialInformation();
        System.out.println("===Navigated to Financial Information Loaded===");
    }

    @When("^User Enter Financial Information and Uploaded Etihad Risk Bureau$")
    public void user_Enter_Financial_Information_and_Uploaded_Etihad_Risk_Bureau() throws Throwable {
        System.out.println("===Financial Information with Etihad Risk Bureau===");
        epqPortalPage.userEnterFinancialInformationandUploadedEtihadRiskBureau(
                readExcelData("Testdata", "Activity", "ContractSize").get("Value").toString());
        System.out.println("===Financial Information with Etihad Risk Bureau===");
    }

    @When("^User Uploaded Bank Statement$")
    public void user_Uploaded_Bank_Statement() throws Throwable {
        System.out.println("===Financial Information with Bank Statement===");
        epqPortalPage.userUploadedBankStatement(
                readExcelData("Testdata", "Activity", "AvgBalance").get("Value").toString());
        epqPortalPage.BankVendor(
                readExcelData("Testdata", "EPQ", "VendorName").get("Value").toString(),
                readExcelData("Testdata", "EPQ", "VendorAddress").get("Value").toString(),
                readExcelData("Testdata", "EPQ", "VendorCity").get("Value").toString(),
                readExcelData("Testdata", "EPQ", "VendorCountry").get("Value").toString(),
                readExcelData("Testdata", "EPQ", "VendorEmail").get("Value").toString(),
                readExcelData("Testdata", "EPQ", "VendorContact").get("Value").toString()
        );
        System.out.println("===Financial Information with Bank Statement===");
    }

    @Then("^Verify Vendor Bankers Information$")
    public void verify_Vendor_Bankers_Information() throws Throwable {
        System.out.println("===Financial Vendor Bankers===");
        epqPortalPage.Vendor_Banker_Verification(
                readExcelData("Testdata", "EPQ", "VendorName").get("Value").toString(),
                readExcelData("Testdata", "EPQ", "VendorAddress").get("Value").toString() +
                        readExcelData("Testdata", "EPQ", "VendorCity").get("Value").toString() +
                        readExcelData("Testdata", "EPQ", "VendorCountry").get("Value").toString()
        );
        System.out.println("===Financial Vendor Bankers Completed===");
    }

    @When("^User Select Audit Report$")
    public void user_Select_Audit_Report() throws Throwable {
        System.out.println("===Financial Audit===");
        epqPortalPage.AuditReport();
        System.out.println("===Financial Audit Report===");
    }

    @When("^User Uploaded Audit Report$")
    public void user_Uploaded_Audit_Report() throws Throwable {
        System.out.println("===Upload Financial Audit===");
        epqPortalPage.UploadAuditReport();
        System.out.println("===Upload Financial Audit Report===");
    }

    @When("^Navigate to Experience$")
    public void navigate_to_Experience() throws Throwable {
        System.out.println("===Experience Started===");
        System.out.println("===Navigate to Experience Screen===");
        epqPortalPage.LoadExperience();
        System.out.println("===Navigated to Experience Screen===");
    }

    @When("^User Enter Experience Information$")
    public void user_Enter_Experience_Information() throws Throwable {
        System.out.println("===Enter Experience Inofrmation===");
        epqPortalPage.ExperienceInformation(
                readExcelData("Testdata", "EPQ", "In Own Country").get("Value").toString(),
                readExcelData("Testdata", "EPQ", "In Own Country").get("Value").toString(),
                readExcelData("Testdata", "EPQ", "Internationally").get("Value").toString()
        );
    }

    @When("^User Enter Relevant Experience Information$")
    public void user_Enter_Relevant_Experience_Information() throws Throwable {
        System.out.println("===Enter Relevant Experience Inofrmation===");
        epqPortalPage.Add_Relevant_Exp(
                readExcelData("Testdata", "EPQ", "Exp_Name").get("Value").toString(),
                readExcelData("Testdata", "EPQ", "Exp_Location").get("Value").toString(),
                readExcelData("Testdata", "EPQ", "Exp_ProjectType").get("Value").toString(),
                readExcelData("Testdata", "EPQ", "Exp_Key_Contact").get("Value").toString(),
                readExcelData("Testdata", "EPQ", "Exp_Project_Desc").get("Value").toString(),
                readExcelData("Testdata", "EPQ", "Exp_Contact_Price").get("Value").toString(),
                readExcelData("Testdata", "EPQ", "Exp_Status").get("Value").toString(),
                readExcelData("Testdata", "EPQ", "Exp_Doc_Type").get("Value").toString()
        );
        System.out.println("===Enter Relevant Experience Inofrmation Completed===");
    }

    @Then("^User Verify the entered information$")
    public void user_Verify_the_entered_information() throws Throwable {
        epqPortalPage.Verify_Relevant_Exp(
                readExcelData("Testdata", "EPQ", "Exp_Name").get("Value").toString());
        System.out.println("==Experience Completed===");
    }

    @When("^Navigate to Personal$")
    public void navigate_to_Personal() throws Throwable {
        System.out.println("===Navigate to Personal Screen===");
        epqPortalPage.LoadPersonal();
    }

    @When("^User Enter Personal Information$")
    public void user_Enter_Personal_Information() throws Throwable {
        System.out.println("===Staff Summary Information===");
        epqPortalPage.Staff_Summary(
                readExcelData("Testdata", "EPQ", "Administrative").get("Value").toString(),
                readExcelData("Testdata", "EPQ", "Technical").get("Value").toString(),
                readExcelData("Testdata", "EPQ", "Staff_Released").get("Value").toString(),
                readExcelData("Testdata", "EPQ", "Staff_Acquired").get("Value").toString(),
                readExcelData("Testdata", "EPQ", "Additional").get("Value").toString()
        );
    }

    @When("^User Enter Contacts & Key Staff$")
    public void user_Enter_Contacts_Key_Staff() throws Throwable {
        System.out.println("===Contacts & Key Staff Information===");
        epqPortalPage.Contact_Key_Staff(
                readExcelData("Testdata", "EPQ", "First_Name").get("Value").toString(),
                readExcelData("Testdata", "EPQ", "Last_Name").get("Value").toString(),
                readExcelData("Testdata", "EPQ", "Nationality").get("Value").toString(),
                readExcelData("Testdata", "EPQ", "Present_Position").get("Value").toString(),
                readExcelData("Testdata", "EPQ", "Yrs_Exp").get("Value").toString(),
                readExcelData("Testdata", "EPQ", "Yrs_Firm").get("Value").toString(),
                readExcelData("Testdata", "EPQ", "Cont_Type").get("Value").toString(),
                readExcelData("Testdata", "EPQ", "Email").get("Value").toString(),
                readExcelData("Testdata", "EPQ", "Mobile").get("Value").toString()
        );
    }

    @Then("^Verify the Contacts & Key Staff$")
    public void verify_the_Contacts_Key_Staff() throws Throwable {
        System.out.println("===Verifiy Contacts & Key Staff Information has been Added===");
        epqPortalPage.Verify_Contact_Key_Staff(
                readExcelData("Testdata", "EPQ", "First_Name").get("Value").toString()+
                        " "+
                        readExcelData("Testdata", "EPQ", "First_Name").get("Value").toString());
    }

    @When("^User Enter CV Details$")
    public void user_Enter_CV_Details() throws Throwable {
        System.out.println("===CV Information===");
        epqPortalPage.CV_Info(
                readExcelData("Testdata", "EPQ", "First_Name").get("Value").toString(),
                readExcelData("Testdata", "EPQ", "Last_Name").get("Value").toString(),
                readExcelData("Testdata", "EPQ", "Nationality").get("Value").toString(),
                readExcelData("Testdata", "EPQ", "Present_Position").get("Value").toString(),
                readExcelData("Testdata", "EPQ", "Proposed").get("Value").toString(),
                readExcelData("Testdata", "EPQ", "Yrs_Exp").get("Value").toString(),
                readExcelData("Testdata", "EPQ", "Yrs_Firm").get("Value").toString(),
                readExcelData("Testdata", "EPQ", "Proposed").get("Value").toString(),
                readExcelData("Testdata", "EPQ", "English").get("Value").toString(),
                readExcelData("Testdata", "EPQ", "Arabic").get("Value").toString(),
                readExcelData("Testdata", "EPQ", "Other").get("Value").toString()
        );
    }

    @Then("^User Verify the CV Details$")
    public void user_Verify_the_CV_Details() throws Throwable {
        System.out.println("===Verify CV Information has been Added===");
        epqPortalPage.Verify_CV(
                readExcelData("Testdata", "EPQ", "First_Name").get("Value").toString()+
                        " "+
                        readExcelData("Testdata", "EPQ", "First_Name").get("Value").toString());
    }

    @When("^Navigate to HSE$")
    public void navigate_to_HSE() throws Throwable {
        System.out.println("===Navigate to HSE===");
        epqPortalPage.LoadHSE();
    }

    @When("^User Select Answers for HSE Policy & Upload Attachments$")
    public void user_Select_Answers_for_HSE_Policy_Upload_Attachments() throws Throwable {
        System.out.println("===Start HSE Policy Attachment Questions Answers===");
        epqPortalPage.HSE_Policy_Attachment(
                readExcelData("Testdata", "EPQ", "HSEPlocy").get("Value").toString(),
                readExcelData("Testdata", "EPQ", "HSE_Policy").get("Value").toString(),
                readExcelData("Testdata", "EPQ", "HSEPolicy_Attachment").get("Value").toString()
        );
    }

    @When("^Navigate to Green Economy$")
    public void navigate_to_Green_Economy() throws Throwable {
        System.out.println("===Navigate to Green Economy===");
        epqPortalPage.LoadGreenEconomy();
    }

    @When("^User Select Answers for Green Economy & Upload Attachments$")
    public void user_Select_Answers_for_Green_Economy_Upload_Attachments() throws Throwable {
        System.out.println("===Start Green Economy Attachment Questions Answers===");
        epqPortalPage.GreenEconomy_Attachment(
                readExcelData("Testdata", "EPQ", "HSEPlocy").get("Value").toString(),
                readExcelData("Testdata", "EPQ", "HSE_Policy").get("Value").toString(),
                readExcelData("Testdata", "EPQ", "HSEPolicy_Attachment").get("Value").toString()
        );
    }

    @When("^Navigate to Other Resources$")
    public void navigate_to_Other_Resources() throws Throwable {
        System.out.println("===Navigate to Other Resources===");
        epqPortalPage.LoadOtherResources();
    }

    @When("^User Enter Contractor's Equipment Information$")
    public void user_Enter_Contractor_s_Equipment_Information() throws Throwable {
        System.out.println("===Start Contractor's Equipment Information===");
        epqPortalPage.Contract_Equipment_Details(
                readExcelData("Testdata", "EPQ", "Equipment").get("Value").toString(),
                readExcelData("Testdata", "EPQ", "Ownership_Status").get("Value").toString(),
                readExcelData("Testdata", "EPQ", "Age").get("Value").toString(),
                readExcelData("Testdata", "EPQ", "Quantity").get("Value").toString(),
                readExcelData("Testdata", "EPQ", "Quantity").get("Value").toString(),
                readExcelData("Testdata", "EPQ", "CurrentLocation").get("Value").toString()
        );
    }

    @Then("^User Verify the Data Saved$")
    public void user_Verify_the_Data_Saved() throws Throwable {
        System.out.println("===Verify Contractor's Equipment Information Stored===");
        epqPortalPage.Verify_CED();
    }

    @Then("^User Enter Fabrication Facilities$")
    public void user_Enter_Fabrication_Facilities() throws Throwable {
        System.out.println("===Start Fabrication Information===");
        epqPortalPage.Fabrication_Facilities(
                readExcelData("Testdata", "EPQ", "Quantity").get("Value").toString(),
                readExcelData("Testdata", "EPQ", "Description").get("Value").toString(),
                readExcelData("Testdata", "EPQ", "CurrentLocation").get("Value").toString(),
                readExcelData("Testdata", "EPQ", "Country").get("Value").toString(),
                readExcelData("Testdata", "EPQ", "Capacity").get("Value").toString(),
                readExcelData("Testdata", "EPQ", "Quantity").get("Value").toString()
        );
    }

    @Then("^Verify the record has been Saved$")
    public void verify_the_record_has_been_Saved() throws Throwable {
        System.out.println("===Verify Fabrication Facilities Information===");
        epqPortalPage.Verify_Fabrication();
    }

    @When("^Navigate to Vendor Under Taken$")
    public void navigate_to_Vendor_Under_Taken() throws Throwable {
        System.out.println("===Navigate to Vendor Under Taken===");
        epqPortalPage.LoadVendorUnderTaken();
    }

    @When("^User Upload Under Taken with Additional Note$")
    public void user_Upload_Under_Taken_with_Additional_Note() throws Throwable {
        System.out.println("===Vendor Under Taken Upload===");
        epqPortalPage.UnderTaken(
                readExcelData("Testdata", "EPQ", "Description").get("Value").toString()
        );
    }

    @When("^User Saved Vendor Under Taken$")
    public void user_Saved_Vendor_Under_Taken() throws Throwable {
        System.out.println("===Vendor Under Taken Save===");
        epqPortalPage.SavePreQualification();
    }

    @Then("^Click on Proceed$")
    public void click_on_Proceed() throws Throwable {
        System.out.println("===Pre Qualifiaction Requirement Submit===");
        epqPortalPage.SubmitPreQualification();
    }

    @When("^Navigate to Manage/ Submit Prequalification$")
    public void navigate_to_Manage_Submit_Prequalification() throws Throwable {
        System.out.println("===Navigate to Manage/ Submit Pre Qualifcation Page===");
        epqSubmitManagePrequalificationPage.NavigateToManageSubmitQualification();
    }

    @When("^User Open the Submitted Project$")
    public void user_Open_the_Submitted_Project() throws Throwable {
        System.out.println("===Open Submitted Prequalification Page===");
        epqSubmitManagePrequalificationPage.editSubmitQualifiation();
    }

    @Then("^User redirected to Manage PreQualification Page$")
    public void user_redirected_to_Manage_PreQualification_Page() throws Throwable {
        System.out.println("===Redirected to Manage Prequalification Page===");
        epqSubmitManagePrequalificationPage.PrequalificationPage();
    }

    @When("^Click on Add Scope Project$")
    public void click_on_Add_Scope_Project() throws Throwable {
        System.out.println("===Add Scopes/Projects===");
        epqSubmitManagePrequalificationPage.OpenScopeProjects();
    }

    @When("^Enter Scope Project Information$")
    public void enter_Scope_Project_Information() throws Throwable {
        System.out.println("===Enter Scopes/Projects Information===");
        epqSubmitManagePrequalificationPage.addScopeProject(
                readExcelData("Testdata", "EPQ", "AddMajorScope").get("Value").toString(),
                readExcelData("Testdata", "EPQ", "Department").get("Value").toString(),
                readExcelData("Testdata", "EPQ", "Scopes").get("Value").toString()
        );
    }

    @Then("^Verify the Scope has been added$")
    public void verify_the_Scope_has_been_added() throws Throwable {
        System.out.println("===Verify Information Added===");
        epqSubmitManagePrequalificationPage.ScopeProjectVerification();
    }

    @Then("^User Select the Relevant Experience$")
    public void user_Select_the_Relevant_Experience() throws Throwable {
        System.out.println("===Select Relevant Experience Record===");
        epqSubmitManagePrequalificationPage.SelectRelevantExperience();
    }

    @Then("^User Select the C\\.V\\.s$")
    public void user_Select_the_C_V_s() throws Throwable {
        System.out.println("===Select Relevant C.V.s Record===");
        epqSubmitManagePrequalificationPage.SelectCVs();
    }

    @Then("^User Submit the PreQualification Request Form$")
    public void user_Submit_the_PreQualification_Request_Form() throws Throwable {
        System.out.println("===Submit Pre Qualification Request Form===");
        epqSubmitManagePrequalificationPage.SubmitformPreQualificationRequest();
    }


}
