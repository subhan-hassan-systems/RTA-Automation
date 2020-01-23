package Test.Automation.Stepdefinitions;
import Test.Automation.Pages.CustomerPortal;
import Test.Automation.Utils.DriverFactory;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en_scouse.An;

public class CustomerPortalStepsDefs extends DriverFactory {

	private CustomerPortal customerPortalPage;

	@Before
	public void setUp() throws Exception {
		customerPortalPage = new CustomerPortal(driver);

	}
	
	@When("^Change language to English$")
	public void change_language_to_english() throws Throwable{
		
		customerPortalPage.changeLanguageToEnglish();
		
	}
	
	@And("^Navigate to case type suggestion$")
	public void navigate_to_case_type_suggestion() throws Throwable{
		
		customerPortalPage.navigateToCaseTypeSuggestion();
		
	}
	
	@And("^Navigate to case type provide a compliment$")
	public void navigate_to_case_type_provide_a_compliment() throws Throwable{
		
		customerPortalPage.navigateToCaseTypeProvideACompliment();
		
	}
	
	@And("^Navigate to case type request$")
	public void navigate_to_case_type_request() throws Throwable{
		
		customerPortalPage.navigateToCaseTypeRequest();
		
	}
	
	@And("^Navigate to case type Report a notification$")
	public void navigate_case_type_notification() throws Throwable{
		
		customerPortalPage.navigateToCaseTypeNotification();
		
	}
	
	@And("^Navigate to case type make a complaint$")
	public void navigate_to_case_type_make_a_complaint() throws Throwable{
		
		customerPortalPage.navigateToCaseTypeMakeAComplaint();
		
	}
	
	@And("^Navigate to case type report lost item$")
	public void navigate_to_case_type_report_lost_item() throws Throwable{
		
		customerPortalPage.navigateToCaseTypeReportLostItem();
		
	}
	
	@And("^Navigate to case type submit fine objection$")
	public void navigate_to_case_type_submit_fine_objection() throws Throwable{
		
		customerPortalPage.naviagetToCaseTypeFineObjection();
		
	}
	
	
	@And("^Create case type suggestion$")
	public void create_case_type_suggestion() throws Throwable{
		
		customerPortalPage.createCaseTypeSuggestion();
		
	}
	
	@And("^Create case type provide a compliment$")
	public void create_case_type_provide_a_compliment() throws Throwable{
		
		customerPortalPage.createCaseTypeProvideACompliment();
		
	}
	
	@And("^Create case type request$")
	public void create_case_type_request() throws Throwable{
		
		customerPortalPage.createCaseTypeRequest();
		
	}
	
	@And("^Create case type Report a notification$")
	public void create_case_type_report_a_notificaiton() throws Throwable{
		
		customerPortalPage.createCaseTypeReportANotification();
		
	}
	
	@And("^Create a new case with case type make a complaint$")
	public void create_a_new_case_with_case_type_make_a_complaint() throws Throwable{
		
		customerPortalPage.createCaseTypeMakeAComplaint();
		
	}
	
	@And("^Create a new case with case type report lost item$")
	public void create_a_new_case_with_case_type_report_lost_item() throws Throwable{
		
		customerPortalPage.createCaseTypeReportLostItem();
		
	}
	
	@And("^Create a new case with case type submit fine objection$")
	public void create_a_new_case_with_case_type_submit_fine_objection() throws Throwable{
		
		customerPortalPage.createANewCaseWithCaseTypeSubmitFineObjection();
		
	}
	
	
	@Then("^Verify case creation$")
	public void verify_case_creation() throws Throwable{
		
		customerPortalPage.verifyCaseCreation();
		
	}
	////////////////////////////////////////////////////////////////////////////////////
	@And("^Create case type suggestion in phase two$")
	public void create_suggestion_case_type() throws Throwable{
		customerPortalPage.createSuggestionCaseTypePhaseTwo();
	}

	@And("^Create case type complaint in phase two$")
	public void create_complaint_case_type () throws Throwable{
		customerPortalPage.createComplaintCaseTypePhaseTwo();
	}

	@And("^Create case type provide a compliment in phase two$")
	public void create_compliment_case_type() throws Throwable {
		customerPortalPage.createComplimentCaseTypePhaseTwo();
	}

	@And("^Create case with type request in phase two$")
	public void create_request_case_type() throws Throwable {
		customerPortalPage.createRequestCaseTypePhaseTwo();
	}

	@And("^Create case type Report a notification in phase two$")
	public void create_notification_case_type() throws Throwable{
		customerPortalPage.createNotificationCaseTypePhaseTwo();
	}

	@And("^Create case with type submit fine objection in phase two$")
	public void create_fine_objection_case_type() throws Throwable{
		customerPortalPage.createFineObjectionCaseTypePhaseTwo();
	}

	@And("^Create a new case with case type report lost item in phase two$")
	public void create_lost_item_case_type() throws Throwable{
		customerPortalPage.createLostItemCaseTypePhaseTwo();
	}


	
	
}	