package Test.Automation;

import Test.Automation.Utils.DriverFactory;
import TestSuite.AfterSuite;
import TestSuite.BeforeSuite;
import TestSuite.ExtendedCucumberRunner;
import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;

import javax.mail.MessagingException;
import java.io.IOException;

//@Epic("Regression Test")
@RunWith(ExtendedCucumberRunner.class)
@CucumberOptions(


        //Execution//

//	tags = {"@TCID141," + //Case Type Complaint End to End Flow
//            "@TCID142," + //Case Type Suggestion End to End Flow
//            "@TCID143," + //Case Type Request End to End Flow
//            "@TCID144," + //Case Type Compliment End to End Flow
//            "@TCID146," + //Case Type Complex Enquiry End to End Flow
//            "@TCID148," + //Case Type MBR Idea End to End Flow
//            "@TCID149," + //Case Type MBR Comment End to End Flow
//            "@TCID152," + //Case Type Emergency End to End Flow
////            "@TCID170," + //Customer Portal Case Type Suggestion End to End Flow
//            "@TCID171," + //Customer Portal Case Type Compliment End to End Flow
////            "@TCID172," + //Customer Portal Case Type Request End to End Flow
////            "@TCID173," + //Customer Portal Case Type Rpeort Notification End to End Flow
////            "@TCID174," + //Customer Portal Case Type Complain End to End Flow
////            "@TCID175," + //Customer Portal Case Type Lost Item End to End Flow
////            "@TCID175" }, //Customer Portal Case Type Fine Objection End to End Flow
////    },
//        tags = {"@TCID270," +
//                "@TCID271," +
//                "@TCID272," +
//                "@TCID273," +
//                "@TCID274," +
//                "@TCID275," +
//                "@TCID276," +
//                "@TCID277," +
//                "@TCID278," +
//                "@TCID279," +
//                "@TCID280," +
//                "@TCID281," +
//                "@TCID282"},
//        tags = {"@CompletePrequalificationRequirements"}, //EPQ Vendor Portal Complete Flow
        //tags = {"@TCID00EPQP2,"+"@TCID02EPQP2"},
//
//
//
//
//          tags = {"@TCID01EPQP2"},

        //tags = {"@TCID270"},

        //tags = {"@SubmitVendorPrequalification"},

        //tags = {"@SubmitVendorPrequalificationRecord"},

        //tags = {"@TCID411"},

        // appeal review process
       //tags = {"@AppealProcessCRM"},
    // tags = {"@TCID00EPQP2"},
       //tags = {"@TCID01EPQP2"},

       // tags = {"@SubmitSubContractorPrequalification"},
        tags = {"@TCID01EPQP2"},
         //tags = {"@SubmitVendorPrequalificationRecord"},




        //tags = {"@UnitTesting"},


        features = {"src/test/resources/features/"},
        plugin = {"pretty", "html:target/cucumber-html-report-Sanity",
                "json:target/cucumber-json-report-Sanity.json",
                "rerun:target/rerun-Sanity.txt",
                "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html",},
        monochrome = true)

public class RunAll_Sanity extends DriverFactory {

    @BeforeSuite
    public static void setUp() {
    }

    @AfterSuite
    public static void tearDown() throws MessagingException, IOException {

        System.out.println("Test Suit Execution Completed.");
        System.out.println("Test Suit Execution Completed.");
/*        Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
        Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
        Reporter.setSystemInfo("Machine", System.getProperty("os.name"));
        Reporter.setSystemInfo("Selenium", "3.7.0");
        Reporter.setSystemInfo("Maven", "3.5.2");
        Reporter.setSystemInfo("Java Version", System.getProperty("java.version"));*/
//		SendEmail.sendEmailBody(TestData.Email.EMAIL_RESULT_SUBJECT, "cucumber-json-report-Sanity");
        //quitDriver();
    }
}


