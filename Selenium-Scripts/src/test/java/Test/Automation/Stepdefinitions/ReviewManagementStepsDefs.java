package Test.Automation.Stepdefinitions;

import static Test.Automation.Utils.DataPool.readExcelData;

import Test.Automation.Pages.ReviewManagementPage;
import Test.Automation.Utils.DriverFactory;
import cucumber.api.java.Before;
import cucumber.api.java.cs.A;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class ReviewManagementStepsDefs extends DriverFactory{
	
	private ReviewManagementPage reviewManagementPage;

	@Before
	public void setUp() throws Exception {
		reviewManagementPage = new ReviewManagementPage(driver);

	}
	
	@And("^Navigate to Reviews$")
	public void navigate_to_review() throws Throwable{
		
		reviewManagementPage.NavigateToReview();
		
	}
	
	@And("^Navigate to PQ Engineer$")
	
	public void navigate_to_PQEngineer() throws Throwable{
		
		reviewManagementPage.NavigateToPQEngineer();
		
	}
	
	@And("^Click A Record$")
	
	public void click_a_record() throws Throwable{
		
		reviewManagementPage.ClickARecord(
				readExcelData("Testdata","EPQPortalCRM","DepartmentRecommendationValue").get("Value").toString()
		);
		
	}
	
	@And("^Complete PQEnigeer Review$")
	public void complete_PQEngineer_review() throws Throwable{
		
		reviewManagementPage.CompletePQEnigeerReview(
				readExcelData("Testdata","EPQPortalCRM","QuestionarieAnswer").get("Value").toString(),
				readExcelData("Testdata","EPQPortalCRM","RecommentationValue").get("Value").toString()
				
				);
		
	}

	@And("^Complete PQEnigeer Review Reject$")
	public void complete_PQEngineer_review_Reject() throws Throwable{

		reviewManagementPage.CompletePQEnigeerReview(
				readExcelData("Testdata","EPQPortalCRM","QuestionarieAnswer").get("Value").toString(),
				readExcelData("Testdata","EPQPortalCRM","RecommentationValueRejection").get("Value").toString()

		);
	}
	
	@And("^Navigate to Department Coordinator$")
	
	public void navigate_to_department_coordinator() throws Throwable{
		
		reviewManagementPage.NavigateToDepartmentCoordinator();
		
	}
	
	@And("^Click A Department Review$")
	
	public void click_a_department_coordinator_review() throws Throwable{
		
		reviewManagementPage.ClickADepartmentCoordinatorReview(
				readExcelData("Testdata","AppLogin","EPQUsername").get("Value").toString()
		);
		
	}
	
	@And("^Complete Department Review$")
	public void complete_department_review() throws Throwable{
		
		reviewManagementPage.CompleteDepartmentReview(
				readExcelData("Testdata","EPQPortalCRM","QuestionarieAnswer").get("Value").toString(),
				readExcelData("Testdata","EPQPortalCRM","DepartmentRecommendationValue").get("Value").toString()
				);
		
	}
	
	@And("^Navigate to Department Director$")
	
	public void navigate_to_department_director() throws Throwable{
		
		reviewManagementPage.NavigateToDepartmentDirector();
		
	}
	
	@And("^Navigate to Legal Review$")
	
	public void navigate_to_legal_review() throws Throwable{
		
		reviewManagementPage.NavigateToLegalReview();
		
	}
	
	@And("^Complete Legal Review$")
	public void complete_review() throws Throwable{
		
		reviewManagementPage.CompleteLegalReview(
				readExcelData("Testdata","EPQPortalCRM","DepartmentRecommendationValue").get("Value").toString()
				);
		
	}
	
	@And("^Navigate to Financial Review$")
	
	public void navigate_to_financial_review() throws Throwable{
		
		reviewManagementPage.NavigateToFinancialReview();
		
	}
	
	@And("^Navigate to HSE Coordinator Review$")
	
	public void navigate_to_hse_director_review() throws Throwable{
		
		reviewManagementPage.NavigateToHSECoordinatorReview();
		
	}
	
	@And("^Complete HSE Coodinator Review$")
	public void complete_HSE_coordinator_review() throws Throwable{
		
		reviewManagementPage.CompleteHSECoordinatorReview(
				readExcelData("Testdata","EPQPortalCRM","HSEQuestionarieAnswer").get("Value").toString(),
				readExcelData("Testdata","EPQPortalCRM","HSERecommendationValue").get("Value").toString()
				);
		
	}
	
	@And("^Navigate to Green Procurement Review$")
	
	public void navigate_to_green_procurement_review() throws Throwable{
		
		reviewManagementPage.NavigateToGreenProcurementReview();
		
	}

	@And("^Complete Green Procurement Review$")
	public void complete_green_procurement_review() throws Throwable{

		reviewManagementPage.CompleteGreenProcurementReview(
				readExcelData("Testdata","EPQPortalCRM","HSEQuestionarieAnswer").get("Value").toString(),
				readExcelData("Testdata","EPQPortalCRM","HSERecommendationValue").get("Value").toString()
				);

	}
	@And("^Navigate to PQ Committee Review$")
	public void navigate_to_PQ_committee_review() throws Throwable {

		reviewManagementPage.NavigateToPQcommitteeReviews();
	}
	@And("^Click A PQ committee prequalification review$")

	public void click_a_PQcommittee_prequalification_review() throws Throwable{

		reviewManagementPage.ClickAPQcommitteePrequalificationReview(
				readExcelData("Testdata","AppLogin","EPQUsername").get("Value").toString()
		);

	}
	@And("^Complete PQ committee prequalification review$")
	public void complete_PQcommittee_prequalification_review() throws Throwable{

		reviewManagementPage.CompletePQcommitteePrequalificationReview(
				readExcelData("Testdata","EPQPortalCRM","PQCommitteeHeadRecommendationValue").get("Value").toString(),
				readExcelData("Testdata","EPQPortalCRM","FinalRejectionReason").get("Value").toString());

	}
	
	@And("^Click A PQ Engineer Review$")

	public void click_a_PQEngineer_Reveiw() throws Throwable{

		reviewManagementPage.ClickAPQEngineerReview(
				readExcelData("Testdata","AppLogin","EPQUsername").get("Value").toString());

	}

	@And("^Navigate to Procurement Director Review$")
	public void navigate_to_procurement_director_review() throws Throwable {

		reviewManagementPage.NavigatetoProcurementDirectorReview();
	}

	@And("^Click CP Director Prequalification Review$")
	public void click_CP_director_prequalification_review() throws Throwable{

		reviewManagementPage.ClickCPDirectorPrequalificationReview(
				readExcelData("Testdata","AppLogin","EPQUsername").get("Value").toString());

	}

	@Then("^Complete CP Director Prequalification Review$")
	public void complete_CP_director_prequalification_review() throws Throwable{

		reviewManagementPage.CompleteCPDirectorPrequalificationReview();
	}
	
	@Then("^Open New Tab$")
	public void open_new_tab() throws Throwable{
		
		reviewManagementPage.OpenNewTab();
		
	}
	
	@And("^Complete Financial Review$")
	public void complete_financial_review() throws Throwable{
		
		reviewManagementPage.CompleteFinancialReview(
				readExcelData("Testdata","EPQPortalCRM","DepartmentRecommendationValue").get("Value").toString()
				);
		
	}
	@And("^Close Review$")
	public void close_review() throws Throwable{
		reviewManagementPage.CloseReview();
	}

	/////////////--------------Sub Contractor-------------

	@And("^Click A Sub Contractor PQ Engineer Review$")

	public void click_a_SubContractor_PQEngineer_Reveiw() throws Throwable{

		reviewManagementPage.ClickAPQEngineerReview(
				readExcelData("Testdata","AppLogin","EPQUsername").get("Value").toString());

	}

	@And("^Navigate to Sub Contractor PQ Engineer$")

	public void navigate_to_SubContractor_PQEngineer() throws Throwable{
		reviewManagementPage.NavigateToSubContractorPQEngineer();
	}
	@And("^Complete Sub Contractor PQEnigeer Review$")

	public void complete_sub_contractor_pq_review() throws Throwable{
		reviewManagementPage.CompleteROWPQEngineerReview(
				readExcelData("Testdata","EPQPortalCRM","QuestionarieAnswer").get("Value").toString(),
				readExcelData("Testdata","EPQPortalCRM","RecommentationValue").get("Value").toString()

		);
	}


	@And("^Navigate to Sub Contractor Department Coordinator$")

	public void navigate_to_sub_contractor_department_coordinator() throws Throwable{

		//reviewManagementPage.ClickAPQEngineerReview("Test Vendor Account 10");

		reviewManagementPage.NavigateToSubContractorDepartmentCoordinator();


	}
	@And("^Click A Sub Contractor Department Review$")

	public void click_a_Sub_Contractor_department_coordinator_review() throws Throwable{

		reviewManagementPage.ClickASubContractorDepartmentCoordinatorReview(
				readExcelData("Testdata","AppLogin","EPQUsername").get("Value").toString()
		);

	}
	@And("^Click A Sub Contractor Green Procurement Review$")

	public void click_a_sub_contractor_green_procurement_review() throws Throwable{

		reviewManagementPage.ClickASubContractorGreenProcurementReview(
				readExcelData("Testdata","AppLogin","EPQUsername").get("Value").toString()
		);

	}

	@And("^Click A Sub-Contractor PQ Committee Review$")

	public void click_a_sub_contractor_pq_committee_review() throws Throwable{

		reviewManagementPage.ClickASubContractorPQCommitteReview(
				readExcelData("Testdata","AppLogin","EPQUsername").get("Value").toString()
		);

	}


	@And ("^Complete Technical Review Sub Contractor$")

	public void complete_technical_review_subcontractor() throws Throwable{

		reviewManagementPage.CompleteTechnicalReviewSubcontractor(
				readExcelData("Testdata","EPQPortalCRM","Questionarie").get("Value").toString(),
				readExcelData("Testdata","EPQPortalCRM","DepartmentRecommendationValue").get("Value").toString()
		);

	}
	@And ("^Complete Green Procurement Review Sub Contractor$")

	public void complete_green_procurement_review_subcontractor() throws Throwable{

		reviewManagementPage.CompleteGreenProcurementReviewSubcontractor(
				readExcelData("Testdata","EPQPortalCRM","QuestionarieGP").get("Value").toString(),
				readExcelData("Testdata","EPQPortalCRM","DepartmentRecommendationValueGP").get("Value").toString()
		);

	}



	@And ("^Complete PQ Committee Review Sub Contractor$")

	public void complete_pq_committee_review_subcontractor() throws Throwable{

		reviewManagementPage.CompletePQCommitteReviewSubcontractor(
				readExcelData("Testdata","EPQPortalCRM","QuestionarieGP").get("Value").toString(),
				readExcelData("Testdata","EPQPortalCRM","DepartmentRecommendationValueGP").get("Value").toString()
		);

	}


	///////////////////////////////////////////////////////////////////////////////////////

	@And("^Click A ROW PQ Engineer Review$")

	public void click_a_ROWPQEngineer_Reveiw() throws Throwable{

		reviewManagementPage.ClickAPQEngineerReview(
				readExcelData("Testdata","AppLogin","EPQUsername").get("Value").toString());

	}

	@And("^Navigate to ROW PQ Engineer$")

	public void navigate_to_ROW_PQEngineer() throws Throwable{
		reviewManagementPage.NavigateToROWPQEngineer();
	}
	@And("^Complete ROWPQEnigeer Review$")

	public void complete_row_pq_review() throws Throwable{
		reviewManagementPage.CompleteROWPQEngineerReview(
				readExcelData("Testdata","EPQPortalCRM","QuestionarieAnswer").get("Value").toString(),
				readExcelData("Testdata","EPQPortalCRM","RecommentationValue").get("Value").toString()

		);
	}

	@And("^Navigate to ROW Department Coordinator$")

	public void navigate_to_row_department_coordinator() throws Throwable{

		reviewManagementPage.NavigateToROWDepartmentCoordinator();

	}

	@And("^Click A ROW Department Review$")

	public void click_a_ROW_department_coordinator_review() throws Throwable{

		reviewManagementPage.ClickAROWDepartmentCoordinatorReview(
				readExcelData("Testdata","AppLogin","EPQUsername").get("Value").toString()
		);

	}

	@And ("^Complete ROW Department Review$")

	public void complete_row_department_review() throws Throwable{

		reviewManagementPage.CompleteROWDepartmentReview(
				readExcelData("Testdata","EPQPortalCRM","QuestionarieAnswer").get("Value").toString(),
				readExcelData("Testdata","EPQPortalCRM","DepartmentRecommendationValue").get("Value").toString()
		);

	}
	
}
