//Author Omer Aqeel
package Test.Automation.Stepdefinitions;

import static Test.Automation.Utils.DataPool.readExcelData;

import java.io.IOException;

import Test.Automation.Pages.IMSCRMPage;
import gherkin.lexer.Th;
import org.apache.poi.ss.usermodel.DataFormatter;

import Test.Automation.Pages.ChatPage;
import Test.Automation.Pages.CustomerPage;
import Test.Automation.Pages.NewPhoneCallPage;
import Test.Automation.Utils.DriverFactory;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ActivityStepsDefs extends DriverFactory {

	private NewPhoneCallPage newPhoneCallPage;
	private ChatPage newChatPage;
	private CustomerPage newCustomerPage;
	private IMSCRMPage newIMSCRMPage;

	public ActivityStepsDefs() throws IOException {
	}

	@Before
	public void setUp() throws Exception {
		newPhoneCallPage = new NewPhoneCallPage(driver);
		newChatPage = new ChatPage(driver);
		newCustomerPage = new CustomerPage(driver);
		newIMSCRMPage = new IMSCRMPage(driver);
	}

	@When("^Navigate to Phone call Activity$")
	public void navigate_to_Phone_call_Activity() throws Throwable {

		newPhoneCallPage.NewPhoneCall();

	}

	@When("^Navigate to Activities$")
	public void navigate_to_Activities() throws Throwable {

		newPhoneCallPage.NavigateToActivities();

	}

	@And("^Create phone call activity$")
	public void create_phone_call_activity() throws Throwable {

		newPhoneCallPage.CreatePhoneCallActivity(
				readExcelData("Testdata", "Activity", "CallFrom").get("Value").toString(),
				readExcelData("Testdata", "Activity", "CallTo").get("Value").toString(),
				readExcelData("Testdata", "Activity", "CallDescriptionTitle").get("Value").toString(),
				readExcelData("Testdata", "Activity", "CallType").get("Value").toString());

	}
	
	@And("^Create phone call activity with outgoing direction$")
	public void create_phone_call_activity_with_outgoing_direction() throws Throwable {
		
		newPhoneCallPage.CreatePhoneCallActivityWithOutgoingDirection(
				readExcelData("Testdata", "Activity", "CallDescriptionTitle").get("Value").toString());
		
	}

	@Then("^Verify phone call activity$")
	public void verify_phone_call_activity() throws Throwable {
		newPhoneCallPage.VerifyPhoneCallActivity(
				readExcelData("Testdata", "Activity", "CallDescriptionTitle").get("Value").toString());

	}

	@Then("^Edit phone call activity$")
	public void edit_phone_call_activity() throws Throwable {
		newPhoneCallPage.EditPhoneCallActivity(
				readExcelData("Testdata", "Activity", "CallDescriptionTitle").get("Value").toString());

	}

	@And("^Click on convert to case button$")
	public void click_on_convert_to_case_button() throws Throwable {
		newPhoneCallPage.ConvertToCase();
		//newIMSCRMPage.convertToCase();
	}

	@And("^Enter values in all required fields and hit Save$")
	public void enter_values_in_all_required_fields_and_hit_Save() throws Throwable {
		newPhoneCallPage.FillAndSaveConvertToCaseForm(

				readExcelData("Testdata", "Activity", "CallDescriptionTitle").get("Value").toString());
	}

	@And("^Verify converted activity to case$")
	public void verify_converted_activity_to_case() throws Throwable {
		newPhoneCallPage.VerifyConvertedActivityToCase();
	}

	@Then("^Click on assign to department button$")
	public void click_on_assign_to_department_button() throws Throwable {

		newPhoneCallPage.HitAssignToDepartmentButton();

	}

	@Then("^Click on assign to department button for portal cases$")
	public void click_on_assign_to_dept_button_for_portal () throws Throwable {
		 newPhoneCallPage.HitAssignToDeptForPortalCases();
	}
	
	@Then("^Verify assign to department$")
	public void verfiy_assign_to_department() throws Throwable{
		
		newPhoneCallPage.verifyAssignToDepartment();
		
	}
	
	@And("^Fill up values for department$")
	public void fill_up_values_for_department() throws Throwable{
		
		newPhoneCallPage.fillUpValuesForDepartment();
		
	}

	/*
	 * @Then("^Verify department assigned$") public void
	 * verify_department_assigned() throws Throwable {
	 * 
	 * newPhoneCallPage.VerifyDepartmentAssigned(); }
	 */

	@And("^Resolve case for phone call activity$")
	public void resolve_case_for_phone_call_activity() throws Throwable{
		
		newPhoneCallPage.resolveCaseForPhoneCallActivity();
		
	}
	
	@Then("^Navigate To CaseForm$")
	public void Navigate_To_CaseForm() throws Throwable {

		newPhoneCallPage.NavigateToCaseForm();
	}

	@Then("^Resolve case$")
	public void Click_resolve_case() throws Throwable {

		newPhoneCallPage
				.ResolveCase(readExcelData("Testdata", "Activity", "DiscriptionCaseResolve").get("Value").toString());
	}

	/*
	 * @Then("^Verify case resolution details$") public void
	 * Verify_case_resolution_details() throws Throwable {
	 * 
	 * newPhoneCallPage.VerifyCaseResolutionDetails(); }
	 */
	
	
	@And("^Navigate to create chat activity$")
	public void navigate_to_create_chat_activties() throws Throwable{
		
		newChatPage.addNewChat();
		
	}
	
	@Then("^Verify chat activity$")
	public void verify_chat_activity_created() throws Throwable{
		
		newChatPage.verifyChatActivity();
		
	}
	
	@And("^Navigate to Contact Activities$")
	public void navigate_to_contact_activities() throws Throwable{
		
		newChatPage.navigateToContactActivities();
		
	}
	
	@And("^Navigate to contact chat activity$")
	public void navigate_to_contact_chat_activity() throws Throwable{
		
		newChatPage.navigateToContactChatActivity();
		
	}
	
	@And("^Navigate to new Customer Page$")
	public void navigate_to_new_customer_page() throws Throwable{
		
		newCustomerPage.navigateToNewCustomerPage();
		
	}
	
	@And("^Select chat activity$")
	public void select_chat_activity() throws Throwable{
		
		newChatPage.selectChatActivity();
		
	}
	
	@Then("^Convert chat activity to case and verify$")
	public void convert_chat_activity_to_case_and_verify() throws Throwable{
		
		newChatPage.convertChatActivityToCaseAndVerify();
		
	}
	
	@Then("^Select mark complete$")
	public void update_activity_to_close_using_mark_complete() throws Throwable{
		
		newChatPage.updateActivityToCloseUsingMarkComplete();
		
	}
	
	@Then("^Select close chat$")
	public void select_close_chat() throws Throwable{
		
		newChatPage.selectCloseChat();
		
	}
	
	@Then("^Verify the updated chat activity$")
	public void verify_the_updated_chat_activity() throws Throwable{
		
		newChatPage.verifyTheUpdatedChatActivity();
		
	}
	
	@Then("^Update chat activity$")
	public void update_chat_activity() throws Throwable
	{
		
		newChatPage.updateChatActivity();
		
	}
	
	@Then("^Create customer with profile type external and verify$")
	public void create_customer_with_profile_type_external() throws Throwable{
		
		newCustomerPage.createCustomerWithProfileTypeExternalAndVerify(
				readExcelData("Testdata", "Activity", "Email").get("Value").toString());
		
	}

	
	@Then("^Create customer with profile type Internal RTA staff and verify$")
	public void create_customer_with_profile_type_Internal_RTA_staff() throws Throwable{
		
		newCustomerPage.createCustomerWithProfileTypeInternalRTAStaff();
		
	}
	
	@Then("^Create customer with profile type Dubai Taxi Staff and verify$")
	public void create_customer_with_profile_type_Dubai_Taxi_Staff() throws Throwable{
		
		newCustomerPage.createCustomerWithProfileTypeDubaiTaxiStaff();
		
	}
	
	@Then("^Create customer with profile type Drivers$")
	public void create_customer_with_profile_type_Drivers() throws Throwable{
		
		newCustomerPage.createCustomerWithProfileTypeDrivers();
		
	}
	
	@Then("^Create customer with profile type RTA patnership$")
	public void create_customer_with_profile_type_rta_patnership() throws Throwable{
		
		newCustomerPage.createCustomerWithProfileTypeRTAPatnership();
		
	}
	
	@Then("^Create customer with profile type RTA Vendor Staff$")
	public void create_customer_with_profile_type_RTA_vendor_staff() throws Throwable{
		
		newCustomerPage.createCustomerWithProfileTypeRTAVendorStaff();
		
	}
	
	@Then("^Update customer with profile type any$")
	public void update_customer_with_profile_type_any() throws Throwable{
		
		newCustomerPage.updateCustomerWithProfileTypeAny();
		
	}
	
	@Then("^Update customer with profile type External Customer$")
	public void update_customer_with_profile_type_external_customer() throws Throwable{
		
		newCustomerPage.updateCustomerWithProfileTypeExternalCustomer();
		
	}
	
	@Then("^Update customer with profile type RTA Patnership$")
	public void update_customer_with_profile_type_RTA_Patnership() throws Throwable{
		
		newCustomerPage.updateCustomerWithProfileTypeRTAPatnership();
		
	}
	
	@Then("^Update customer with profile type RTA Vendor Staff$")
	public void update_customer_with_profile_type_RTA_Vendor_Staff() throws Throwable{
		
		newCustomerPage.updateCustomerWithProfileTypeRTAVendorStaff();
		
	}
	
	@Then("^Update customer with profile type Internal RTA Staff$")
	public void update_customer_with_profile_type_Internal_RTA_Staff() throws Throwable{
		
		newCustomerPage.updateCustomerWithProfileTypeInternalRTAStaff();
		
	}
	
	@Then("^Update customer with profile type Drivers$")
	public void update_customer_with_profile_type_Drivers() throws Throwable{
		
		newCustomerPage.updateCustomerWithProfileTypeDrivers();
		
	}
	
	@Then("^Update customer with profile type Dubai Taxi$")
	public void update_customer_with_profile_type_dubai_taxi() throws Throwable{
		
		newCustomerPage.updateCustomerWithProfileTypeDubaiTaxi();
		
	}

}