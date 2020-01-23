/*Author: Omer Aqeel*/
package Test.Automation.Stepdefinitions;

import static Test.Automation.Utils.DataPool.readExcelData;

import Test.Automation.Pages.CasesPage;
import Test.Automation.Utils.DriverFactory;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class CasesStepsDefs extends DriverFactory {

	private CasesPage casesPage;

	@Before
	public void setUp() throws Exception {
		casesPage = new CasesPage(driver);

	}

	@And("^Navigate to Service> Cases$")
	public void navigate_to_Service_Cases() throws Throwable {
		casesPage.NavigateToCases();
	}

	@And("^Open a new case record$")
	public void open_a_new_case_record() throws Throwable {
		casesPage.NewCase();
	}

	@Then("^Verify the tabs on case form$")
	public void verify_the_tabs_on_case_form() throws Throwable {
		casesPage.VerifyTabsOnCaseForm();
	}

	@Then("^Verify sections on case form$")
	public void verify_sections_on_case_form() throws Throwable {
		casesPage.VerifySectionsOnCaseForm();
	}

	@Then("^Verify fields under Administration section$")
	public void verify_fields_under_administration_section() throws Throwable {
		casesPage.VerifyFieldsUnderAdministrationSection();
	}

	@Then("^Verify data types of the fields on case form$")
	public void verify_data_types_of_fields_on_case_form() throws Throwable {
		casesPage.VerifyDataTypesOfFieldsOnCaseForm();
	}

	@Then("^Verify fields and sections under addiontional tab on case form on selecting grievience as case type$")
	public void verify_fields_under_additional_tab_on_case_form_on_selecting_grievience_as_case_type()
			throws Throwable {
		casesPage.VerifyFieldsUnderAdditionalTabOnSelectingGrievienceAsCaseType();
	}

	@Then("^Verify fields and sections under addiontional tab on case form on selecting complex enquiry as case type$")
	public void verify_fields_and_sections_under_addiontional_tab_on_case_form_on_selecting_complex_enquiry_as_case_type()
			throws Throwable {
		casesPage.VerifyFieldsUnderAddiontionalTabOnCaseFormOnSelectingComplexEnquiryAsCaseType();
	}

	@Then("^Verify sections under additional data$")
	public void verify_sections_under_additional_data() throws Throwable {

		casesPage.VerifySectionsOnAdditionalDataTab();
	}

	@And("^Click save button$")
	public void click_save_button() throws Throwable {
		casesPage.ClickSaveButtonOnCaseForm();
	}

	@Then("^Verify mandatory field validation under General Section$")
	public void verify_mandatory_field_validation_under_General_Section() throws Throwable {

		casesPage.ValidationOnGeneralSection();

	}

	@Then("^Verify business required fields on case form$")
	public void verify_business_required_fields_on_case_form() throws Throwable {

		casesPage.VerifyBusinessRequiredFieldsOnCaseForm(

				readExcelData("Testdata", "Activity", "CaseDescriptionTitle").get("Value").toString());

	}

	@Then("^Verify optional fields on case form$")
	public void verify_optional_fields_on_case_form() throws Throwable {
		casesPage.VerifyOptionalFieldsOnCaseForm(

				readExcelData("Testdata", "Activity", "CaseDescriptionTitle").get("Value").toString());

	}

	@Then("^Verify locked fields on case form$")
	public void Verify_locked_fields_on_case_form() throws Throwable {
		casesPage.VerifyLockedFieldsOnCaseForm(

				readExcelData("Testdata", "Activity", "CaseDescriptionTitle").get("Value").toString());

	}

	@Then("^Verify values of case type on case form$")
	public void verify_values_of_case_type_on_case_form() throws Throwable {

		casesPage.verifyValuesOfCaseTypeOnCaseForm();

	}

	@Then("^Verify values of origin on case form$")
	public void verify_values_of_origin_on_case_form() throws Throwable {

		casesPage.verifyValuesOfOriginOnCaseForm();

	}

	@Then("^Verify values of priority on case form$")
	public void verify_values_of_priority_on_case_form() throws Throwable {

		casesPage.verifyValuesOfPriorityOnCaseForm();

	}

	@Then("^Verify values of Send Resolution SMS/Email on case form$")
	public void verify_values_of_Send_Resolution_SMS_Email_on_case_form() throws Throwable {

		casesPage.verifyValuesOfSendResolutionOnCaseForm();

	}

	@Then("^Verify case form header$")
	public void verify_case_form_header() throws Throwable {
		casesPage.verifyCaseFormHeader();

	}

	@Then("^Verify fields and sections under additional data tab on case form on selecting compliment as case type$")
	public void verify_fields_and_sections_under_additional_data_tab_on_case_form_on_selecting_compliment_as_case_type()
			throws Throwable {

		casesPage.verifyAdditionalDataTabAgainstComplimentCaseType();

	}

	@Then("^Verify values of Compliment Reason on case form$")
	public void verify_values_of_Compliment_Reason_on_case_form() throws Throwable {

		casesPage.verifyValuesOfComplimentReasonCaseForm();

	}
	
	@Then("^Verify the visibility of Internal Suggestion Details section when Type of Suggestion is Internal Team or Committee Suggestion$")
	public void verify_the_visibility_of_Internal_Suggestion_Details_section_when_type_of_Suggestion_is_Internal_Team_or_Committee_Suggestion() 
			throws Throwable{
		
		casesPage.verifyVisibilityOfInternalSuggestionDetailsSectionWhenTypeOfSuggestionIsInternalTeamOrCommitteeSuggestion();
		
	}
	
	@Then("^Verify the visibility of Internal Suggestion Details section when Type of Suggestion is External Individual Suggestion$")
	public void verify_the_visibility_of_Internal_Suggestion_Details_section_when_Type_of_Suggestion_is_External_Individual_Suggestion()
				throws Throwable {
		
		casesPage.verifyVisibilityOfInternalSuggestionDetailsSectionWhenTypeOfSuggestionIsExternalIndividualSuggestion(
				readExcelData("Testdata", "Activity", "ExternalCustomerProfileType").get("Value").toString());
		
	}
	
	@Then("^Verify the visibility of Internal Suggestion Details section when Type of Suggestion is External Group Suggestion$")
	public void verify_the_visibility_of_Internal_Suggestion_Details_section_when_Type_of_Suggestion_is_External_Group_Suggestion()
				throws Throwable {
		
		casesPage.verifyTheVisibilityOfInternalSuggestionDetailsSectionWhenTypeOfSuggestionIsExternalGroupSuggestion(
				readExcelData("Testdata", "Activity", "ExternalCustomerProfileType").get("Value").toString());
		
	}
	
	@Then("^Verify values of Item Category option set on selecting Case Type as Lost Item$")
	public void verify_values_of_Item_Category_option_set_on_selecting_Case_Type_as_Lost_Item() throws Throwable{
		
		casesPage.verifyValuesOfItemCategoryOptionSetOnSelectingCaseTypeAsLostItem();
		
	}
	
	@Then("^Verify fields and sections under additional data tab on case form on selecting Lost Item as case type$")
	public void verify_fields_and_sections_under_additional_data_tab_on_case_form_on_selecting_Lost_Item_as_case_type()throws Throwable{
		
		casesPage.verifyFieldsAndSectionsUnderAdditionalDataTabOnCaseFormOnSelectingLostItemAsCaseType();
		
	}
	
	@Then("^Verify the values of Complaint Reason option set When selecting case type as Complaint$")
	public void verify_the_values_of_Complaint_Reason_option_set_When_selecting_case_type_as_Complaint() throws Throwable{
		
		casesPage.verifyTheValuesOfComplaintReasonOptionSetWhenSelectingCaseTypeAsComplaint();
		
	}
	
	@Then("^Verify fields And sections under additional data tab on case form on selecting Notification as case type$")
	public void verify_fields_and_sections_under_additional_data_tab_on_case_form_on_selecting_Notification_as_case_type() throws Throwable{
		
		casesPage.verifyFieldsAndSectionsUnderAdditionalDataTabOnCaseFormOnSelectingNotificationAsCaseType();
		
	}
	
	@Then("^Verify values of Defect Reason option set on case form on selecting Notifcation as case type$")
	public void verify_values_of_Defect_Reason_option_set_on_case_form_on_selecting_Notifcation_as_case_type() throws Throwable{
		
		casesPage.verifyValuesOfDefectReasonOptionSetOnCaseFormOnSelectingNotifcationAsCaseType();
		
	}
	
	@Then("^Verify fields and sections under additional data tab on case form on selecting Complaint as case type$")
	public void verify_fields_and_sections_under_additional_data_tab_on_case_form_on_selecting_Complaint_as_case_type() throws Throwable{
		
		casesPage.verifyFieldsAndSectionsUnderAdditionalDataTabOnCaseFormOnSelectingComplaintAsCaseType();
		
	}
	
	@Then("^Verify values of Item Color option set on selecting Case Type as Lost Item$")
	public void verify_values_of_Item_Color_option_set_on_selecting_Case_Type_as_Lost_Item() throws Throwable{
		
		casesPage.verifyValuesOfItemColorOptionSetOnSelectingCaseTypeAsLostItem();
		
	}	
	
	@Then("^Verify fields and sections under additional data tab on case form on selecting Request as case type$")
	public void  verify_fields_and_sections_under_additional_data_tab_on_case_form_on_selecting_Request_as_case_type() throws Throwable{
		
		casesPage.verifyFieldsAndSectionsUnderAdditionalDataTabOnCaseFormOnSelectingRequestAsCaseType();
		
	}
	
	@Then("^Verify values of Request Reason option set on selecting Request as case Type$")
	public void verify_values_of_Request_Reason_option_set_on_selecting_Request_as_case_Type() throws Throwable{
		
		casesPage.verifyValuesOfRequestReasonOptionSetOnSelectingRequestAsCaseType();
		
	}
	
	@Then("^Create new case with case type complaint$")
	public void create_new_case_with_case_type_complaint() throws Throwable{
		
		casesPage.createNewCaseWithCaseTypeComplaint(
				readExcelData("Testdata", "Activity", "GeneralDescription").get("Value").toString(),
				readExcelData("Testdata", "Activity", "ExternalCustomerProfileType").get("Value").toString());
		
	}
	
	@Then("^Update case with case type complaint$")
	public void update_case_with_case_type_complaint() throws Throwable{
		
		casesPage.updateCaseWithCaseTypeComplaint();
		
	}
	
	@Then("^Create new case with case type suggestion$")
	public void create_new_case_with_case_type_suggestion() throws Throwable{
		
		casesPage.createNewCaseWithCaseTypeSuggestion(
				readExcelData("Testdata", "Activity", "GeneralDescription").get("Value").toString(),
				readExcelData("Testdata", "Activity", "ExternalCustomerProfileType").get("Value").toString());
		
	}
	
	@Then("^Update case with case type suggestion$")
	public void update_case_with_case_type_suggestion() throws Throwable{
		
		casesPage.updateCaseWithCaseTypeSuggestion();
		
	}
	
	@Then("^Create new case with case type request$")
	public void create_new_case_with_case_type_request() throws Throwable{
		
		casesPage.createNewCaseWithCaseTypeRequest(
				readExcelData("Testdata", "Activity", "GeneralDescription").get("Value").toString(),
				readExcelData("Testdata", "Activity", "ExternalCustomerProfileType").get("Value").toString());
		
	}
	
	@Then("^Update case with case type request$")
	public void update_case_with_case_type_request() throws Throwable{
		
		casesPage.updateCaseWithCaseTypeRequest();
		
	}
	
	@And("^Assign to department$")
	public void assign_to_department() throws Throwable{
		
		casesPage.assignToDepartment();
		
	}
	
	@And("^Assign to follow up$")
	public void assign_to_follow_up() throws Throwable{
		
		casesPage.assignToFollowUp();
		
	}
	
	@And("^Assign to concerned Parties$")
	public void assign_to_concerned_party() throws Throwable{
		
		casesPage.assigneToConcernedParty();
		
	}
	
	@And("^Navigate to closure to finish$")
	public void navigate_to_closure() throws Throwable{
		
		casesPage.navigateToClosure();
		
	}
	
	@And("^Resolve case for Notification case$")
	public void resolve_case_for_notification_case() throws Throwable{
		
		casesPage.resolveCaseForNotificationCase();
		
	}
	
	@And("^Resolve case for MBR Idea case$")
	public void resolve_case_for_MBRIdea_case() throws Throwable{
		
		casesPage.resolveCaseForMBRIdeaCase();
		
	}
	
	
	@And("^Resolve case for compliment case$")
	public void resolve_case_for_compliment_case() throws Throwable{
		
		casesPage.resolveCaseForComplimentCase();
		
	}
	
	@Then("^Resolve case for complaint cases$")
	public void resolve_case_for_cases() throws Throwable{
		
		casesPage.resolveCaseForComplaintCases();
		
	}
	
	@Then("^Verify resolve case$")
	public void verify_resolve_case() throws Throwable{
		
		casesPage.verifyResolveCase();
		
	}
	
	@Then("^Create new case with case type compliment$")
	public void create_new_case_with_case_type_compliment() throws Throwable{
		
		casesPage.createNewCaseWithCaseTypeCompliment(
				readExcelData("Testdata", "Activity", "ExternalCustomerProfileType").get("Value").toString());
		
	}
	
	@Then("^Create new case with case type emergency$")
	public void create_new_case_with_case_type_emergency() throws Throwable{
		
		casesPage.createNewCaseWithCaseTypeEmergency(
				readExcelData("Testdata", "Activity", "ExternalCustomerProfileType").get("Value").toString());
		
	}
	
	@Then("^Create new case with case type lost item$")
	public void create_new_case_with_case_type_lost_item() throws Throwable{
		
		casesPage.createNewCaseWithCaseTypeLostItem(
				readExcelData("Testdata", "Activity", "ExternalCustomerProfileType").get("Value").toString());
		
	}
	
	@Then("^Create new case with case type complex Enquiry$")
	public void create_new_case_with_type_lost_item() throws Throwable{
		
		casesPage.createNewCaseWithCaseTypeComplexEnquiry(
				readExcelData("Testdata", "Activity", "ExternalCustomerProfileType").get("Value").toString());
		
	}
	
	@Then("^Create new case with case type notification$")
	public void create_new_case_with_case_type_notification() throws Throwable{
		
		casesPage.createNewCaseWithCaseTypeNotification(
				readExcelData("Testdata", "Activity", "ExternalCustomerProfileType").get("Value").toString());
		
	}
	
	@Then("^Create new case with case type MBR idea$")
	public void create_new_case_with_case_type_MBR_idea() throws Throwable{
		
		casesPage.createNewCaseWithCaseTypeMBRIdea(
				readExcelData("Testdata", "Activity", "ExternalCustomerProfileType").get("Value").toString());
		
	}
	
	@Then("^Create new case with case type MBR Comment$")
	public void create_new_case_with_case_type_MBR_comment() throws Throwable{
		
		casesPage.createNewCaseWithCaseTypeMBRComment(
				readExcelData("Testdata", "Activity", "ExternalCustomerProfileType").get("Value").toString());
		
	}
	
	@Then("^Create new case with case type Grievance$")
	public void create_new_case_with_case_type_grievance() throws Throwable{
		
		casesPage.createNewCaseWithCaseTypeGrievance();
		
	}
	
	@Then("^Create new case with case type Fine Objection$")
	public void create_new_case_with_case_type_fine_objection() throws Throwable{
		
		casesPage.createNewCaseWithCaseTypeFineObjection(
				readExcelData("Testdata", "Activity", "ExternalCustomerProfileType").get("Value").toString());
		
	}
	
	@Then("^Update case with case type Emergency$")
	public void update_case_with_case_type_emergency() throws Throwable{
		
		casesPage.updateCaseWithCaseTypeEmergency();
		
	}
	
	@Then("^Update case with case type lost Item$")
	public void update_case_with_case_type_lost_item() throws Throwable{
		
		casesPage.updateCaseWithCaseTypeLostItem();
		
	}
	
	@Then("^Update case with case type Fine Objection$")
	public void update_case_with_case_type_fine_objection() throws Throwable{
		
		casesPage.updateCaseWithCaseTypeFineObjection();
		
	}
	
	@Then("^Update case with case type Grievance$")
	public void update_case_with_case_type_grievance() throws Throwable{
		
		casesPage.updateCaseWithCaseTypeGrievance();
		
	}
	
	@Then("^Update case with case type MBR idea$")
	public void update_case_with_case_type_MBR_idea() throws Throwable{
		
		casesPage.updateCaseWithCaseTypeMBRIdea();
		
	}
	
	@Then("^Update case with case type MBR Comment$")
	public void update_case_with_case_type_MBR_comment() throws Throwable{
		
		casesPage.updateCaseWithCaseTypeMBRComment();
		
	}
	
	@Then("^Update case with case type Notification$")
	public void udpate_case_with_case_type_notification() throws Throwable{
		
		casesPage.updateCaseWithCaseTypeNotification();
		
	}
	
	@Then("^Update case with case type Complex Enquiry$")
	public void update_case_with_case_type_complex_enquiry() throws Throwable{
		
		casesPage.updateCaseWithCaseTypeComplexEnquiry();
		
	}
	
	@Then("^Update case with case type Compliment$")
	public void update_case_with_case_type_compliment() throws Throwable{
		
		casesPage.updateCaseWithCaseTypeCompliment();
		
	}
	
	@Then("^Resolve case for suggestion case$")
	public void resolve_case_for_suggestion_case() throws Throwable{
		
		casesPage.resolveCaseForSuggestionCase();
		
	}
	
	@Then("^Resolve case for request case$")
	public void resolve_case_for_request_case() throws Throwable{
		
		casesPage.resloveCaseForRequestCase();
		
	}
	
	@Then("^Resolve case for complex enquiry case$")
	public void resolve_case_for_complex_enquiry_case() throws Throwable{
		
		casesPage.resolveCaseForComplexEnquiry();
		
	}
	
	@Then("^Resolve case for Fine Objection case$")
	public void resolve_case_for_Fine_Objection() throws Throwable{
		
		casesPage.resolveCaseForFineObjection();
		
	}
	
	@Then("^Resolve case for Emergency case$")
	public void resolve_case_for_emergency_case() throws Throwable{
		
		casesPage.resolveCaseForEmergencyCase();
		
	}
	
	@And("^Select a resolved case with case type complaint$")
	public void select_resolved_case_with_case_type_complaint() throws Throwable{
		
		casesPage.selectResolveCaseWithCaseTypeComplaint();
		
	}
	
	@Then("^Create new case with case type suggestion and suggestion type internal individual suggestion$")
	public void create_new_case_with_case_type_suggestion_and_suggestion_type_internal_individual_suggestion() throws Throwable{
		
		casesPage.createNewCaseWithCaseTypeSuggestionAndSuggestionTypeInternalIndividualSuggestion();
		
	}
	
	@Then("^Create new case with case type suggestion and suggestion type internal group suggestion$")
	public void create_new_case_with_case_type_suggestion_and_suggestion_type_internal_group_suggestion() throws Throwable{
		
		casesPage.createNewCaseWithCaseTypeSuggestionAndSuggestionTypeInternalGroupSuggestion();
		
	}
	
	@Then("^Create new case with case type suggestion and suggestion type Internal Team or Committee Suggestion$")
	public void create_new_case_with_case_type_suggestion_and_suggestion_type_Internal_Team_or_Committee_Suggestion() throws Throwable{
		
		casesPage.createNewCaseWithCaseTypeSuggestionAndSuggestionTypeInternalTeamOrCommitteeSuggestion();
		
	}
	
	@Then("^Create new case with case type suggestion and suggestion type External Individual Suggestion$")
	public void create_new_case_with_case_type_suggestion_and_suggestion_type_External_Individual_Suggestion() throws Throwable{
		
		casesPage.createNewCaseWithCaseTypeSuggestionAndSuggestionTypeExternalIndividualSuggestion();
		
	}
	
	@Then("^Create new case with case type suggestion and suggestion type External Group Suggestion$")
	public void create_new_case_with_case_type_suggestion_and_suggestion_type_External_Group_Suggestion() throws Throwable{
		
		casesPage.createNewCaseWithCaseTypeSuggestionAndSuggestionTypeExternalGroupSuggestion();
		
	}

	@Then("^Create new case with case type suggestion and End Service Touch Point and Reason$")
	public void create_new_case_with_type_suggestion_and_end_service_touch_point_and_reasons() throws Throwable {
		casesPage.createNewCaseTypeWithTypeSuggestionAndEndServiceTouchPointReason(
				readExcelData("Testdata", "Activity", "GeneralDescription").get("Value").toString(),
				readExcelData("Testdata", "Activity", "ExternalCustomerProfileType").get("Value").toString());
	}

	@Then("^Create new case with case type complaint and End Service Touch Point and Reason$")
	public void create_new_case_with_type_complaint_and_end_service_touch_point_and_reasons() throws Throwable {
		casesPage.createNewCaseWithTypeComplaintAndEndServiceTouchPointReason(
				readExcelData("Testdata", "Activity", "GeneralDescription").get("Value").toString(),
				readExcelData("Testdata", "Activity", "ExternalCustomerProfileType").get("Value").toString());
	}

	@Then("^Create new case with case type Fine Objection and End Service Touch Point and Reason$")
	public void create_new_case_with_type_fine_objection_and_end_service_touch_point_and_reason () throws Throwable {
		casesPage.createNewCaseWithCaseTypeFineObjectionAndEndServiceTouchPointReason(
				readExcelData("Testdata", "Activity", "ExternalCustomerProfileType").get("Value").toString()
		);
	}

	@Then("^Create new case with case type compliment and End Service Touch Point and Reason$")
	public void create_new_case_with_type_compliment_and_end_service_touch_point_and_reason() throws Throwable{
		casesPage.createNewCaseWithCaseTypeComplimentAndEndServiceTouchPointReason(
				readExcelData("Testdata", "Activity", "ExternalCustomerProfileType").get("Value").toString());

	}
	@Then("^Create new case with case type complex Enquiry and End Service Touch Point and Reason$")
	public void create_new_case_with_type_complex_enquiry_and_end_service_touch_point_and_reason() throws Throwable{
		casesPage.createNewCaseWithCaseTypeComplexEnquiryAndEndServiceTouchPointReason(
				readExcelData("Testdata", "Activity", "ExternalCustomerProfileType").get("Value").toString());

	}
	@Then("^Create new case with case type emergency in phase two$")
	public void create_new_case_with_type_emergency_and_end_service_touch_point_and_reason() throws Throwable{
		casesPage.createNewCaseWithCaseTypeEmergencyAndEndServiceTouchPointReason(
				readExcelData("Testdata", "Activity", "ExternalCustomerProfileType").get("Value").toString());

	}

	@Then("^Create new case with case type lost item in phase two$")
	public void create_new_case_with_type_lost_item_and_end_service_touch_point_and_reason () throws Throwable{
		casesPage.createNewCaseWithCaseTypeLostItemAndEndServiceTouchPointReason(readExcelData("Testdata", "Activity", "ExternalCustomerProfileType").get("Value").toString());
	}

	@Then("^Create new case with case type notification in phase two$")
	public void create_new_case_with_case_type_notification_and_end_service_touch_point_and_reason () throws Throwable{
		casesPage.createNewCaseWithCaseTypeNotificationAndEndServiceTouchPointReason(readExcelData("Testdata", "Activity", "ExternalCustomerProfileType").get("Value").toString());
	}

	@Then("^Create new case with case type request in phase two$")
	public void create_new_case_with_case_type_request_and_end_service_touch_point_and_reason() throws Throwable{
		casesPage.createNewCaseWithCaseTypeRequestAndEndServiceTouchPointReason(readExcelData("Testdata", "Activity", "ExternalCustomerProfileType").get("Value").toString());
	}

	@And("^Resolve case for lost item in phase two$")
	public void resolve_case_for_lost_item_in_phase_two() throws Throwable {
		casesPage.resolveCaseTypeLostItemInPhaseTwo();
	}
	@And("^Search Created Case$")
	public void search_created_cases () throws Throwable {
		casesPage.searchCreatedCase();
	}


}