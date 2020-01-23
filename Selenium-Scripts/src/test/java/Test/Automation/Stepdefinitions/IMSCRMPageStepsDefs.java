package Test.Automation.Stepdefinitions;

import Test.Automation.Pages.EPQPortal;
import Test.Automation.Pages.IMSCRMPage;
import Test.Automation.Pages.ManageSubmitPrequalifications;
import Test.Automation.Pages.ReviewManagementPage;
import Test.Automation.Utils.DriverFactory;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static Test.Automation.Utils.DataPool.readExcelData;

/**
 * Created by waqar.tufail on 6/20/2019.
 */
public class IMSCRMPageStepsDefs  extends DriverFactory{

    private IMSCRMPage IdeaManagementCRM;
    private ReviewManagementPage reviewManagementPage;


    @Before
    public void setUp() throws Exception {
        IdeaManagementCRM = new IMSCRMPage(driver);
        reviewManagementPage = new ReviewManagementPage(driver);
    }

    @When("^Navigate to Compaigns$")
    public void navigate_to_Compaigns() throws Throwable {
        IdeaManagementCRM.NewCompaign();
    }

    @When("^Create New Compaign$")
    public void create_New_Compaign() throws Throwable {
        IdeaManagementCRM.CreateCompaignEnglish(
                readExcelData("Testdata", "IMS", "TitleEnglish").get("Value").toString()+"-"+
                        readExcelData("Testdata", "IMS", "StartDate").get("Value").toString(),
                readExcelData("Testdata", "IMS", "CampaignAward").get("Value").toString(),
                readExcelData("Testdata", "IMS", "StartDate").get("Value").toString(),
                readExcelData("Testdata", "IMS", "CapmaignType").get("Value").toString(),
                readExcelData("Testdata", "IMS", "Description").get("Value").toString()
                );
        IdeaManagementCRM.CreateCompaignArabic(
                readExcelData("Testdata", "IMS", "TitleArabic").get("Value").toString(),
                readExcelData("Testdata", "IMS", "CampaignAwardArabic").get("Value").toString(),
                readExcelData("Testdata", "IMS", "DescriptionArabic").get("Value").toString()
        );
    }

    @Then("^Verify Campaign Created Successgully$")
    public void verify_Campaign_Created_Successgully() throws Throwable {
        IdeaManagementCRM.CustomFilter();
    }

    @When("^Publish the Campaign$")
    public void publish_the_Campaign() throws Throwable {
        IdeaManagementCRM.publishCampaign();
        reviewManagementPage.OpenNewTab();
    }

    @When("^Open Published Campaign$")
    public void open_Published_Campaign() throws Throwable {
        IdeaManagementCRM.openPublishedCampaign();
    }

    @When("^Submit Idea$")
    public void submit_Idea() throws Throwable {
        IdeaManagementCRM.submitIdea(
                readExcelData("Testdata", "IMS", "IdeaTitle").get("Value").toString(),
                readExcelData("Testdata", "IMS", "IdeaDesc").get("Value").toString(),
                readExcelData("Testdata", "IMS", "IdeaPrivacy").get("Value").toString(),
                readExcelData("Testdata", "IMS", "IdeaType").get("Value").toString(),
                readExcelData("Testdata", "IMS", "IdeaTag").get("Value").toString()
        );
    }

    @Then("^Verify the Idea Submitted Successfully$")
    public void verify_the_Idea_Submitted_Successfully() throws Throwable {
        IdeaManagementCRM.verifyideaSubmited();
    }

    @When("^Open the Submitted Compaigns$")
    public void open_the_Submitted_Compaigns() throws Throwable {
        IdeaManagementCRM.openSubmittedCampaign();
    }

    @When("^Open the Submitted Idea$")
    public void open_the_Submitted_Idea() throws Throwable {
        IdeaManagementCRM.openSubmittedIdea();
    }

    @Then("^Approve the Submitted Idea$")
    public void approve_the_Submitted_Idea() throws Throwable {
        IdeaManagementCRM.approveSubmittedIdea();
    }

    @When("^Convert To Case$")
    public void convert_To_Case() throws Throwable {
        IdeaManagementCRM.convertToCase();
    }
}
