#Author: Muhammad Waqar Tufail
Feature: EPQPortal

  Background:
    Given I am on the EPQ Portal home page

  @TCID270 @TCIDEPQPortal @UserProfile @PrequalificationRequirements
  Scenario: Update User Profile

    When Navigate to Prequalification Requirements
    And User Profile Loaded
    And User Enter Contact Details
    And User Enter Company Information and Upload the File
    And User Enter Trade License Information and Upload the File
    And User Enter Company Owner Information and Upload the File
    And Click on Next Button
    Then Verify Profile has been Updated

    @TCID271 @TCIDEPQPortal @CompanyStructure @PrequalificationRequirements
   Scenario: Update Company Structure
#      if Cases Execution Continue boht below steps not need to Execute
      When Navigate to Prequalification Requirements
      And User Profile Loaded
      And Navigate to Company Structur
      And User Uploaded Company Profile Attachment
      And User Uploaded Organization Chart Attachment
      And Click on Next Button

    @TCID272 @TCIDEPQPortal @Finance-Bank @PrequalificationRequirements
   Scenario: Update Financial Information with Bank
#      if Cases Execution Continue boht below steps not need to Execute
      When Navigate to Prequalification Requirements
      And User Profile Loaded
      And Navigate to Financial Information
      And User Enter Financial Information and Uploaded Etihad Risk Bureau
      And User Uploaded Bank Statement
      Then Verify Vendor Bankers Information

    @TCID272-A @TCIDEPQPortal @Finance-Audit @PrequalificationRequirements
   Scenario: Update Financial Information with Audit
#      if Cases Execution Continue boht below steps not need to Execute
      When Navigate to Prequalification Requirements
      And User Profile Loaded
      And Navigate to Financial Information
      And User Enter Financial Information and Uploaded Etihad Risk Bureau
      And User Select Audit Report
      And User Uploaded Audit Report

    @TCID273 @TCIDEPQPortal @Experience @PrequalificationRequirements
   Scenario: Update Experience Information
#      if Cases Execution Continue boht below steps not need to Execute
      When Navigate to Prequalification Requirements
      And User Profile Loaded
      And Navigate to Experience
      And User Enter Experience Information
      And User Enter Relevant Experience Information
      Then User Verify the entered information

     @TCID274 @TCIDEPQPortal @Personal @PrequalificationRequirements
   Scenario: Update Personal Information
#      if Cases Execution Continue boht below steps not need to Execute
      When Navigate to Prequalification Requirements
      And User Profile Loaded
      And Navigate to Personal
      And User Enter Personal Information
      And User Enter Contacts & Key Staff
      Then Verify the Contacts & Key Staff
      And User Enter CV Details
      Then User Verify the CV Details

    @TCID275 @TCIDEPQPortal @HSE @PrequalificationRequirements
    Scenario: Update HSE Information
      When Navigate to Prequalification Requirements
      And User Profile Loaded
      And Navigate to HSE
      And User Select Answers for HSE Policy & Upload Attachments

  @TCID276 @TCIDEPQPortal @GreenEconomy @PrequalificationRequirements
  Scenario: Update Green Economy Information
    When Navigate to Prequalification Requirements
    And User Profile Loaded
    And Navigate to Green Economy
    And User Select Answers for Green Economy & Upload Attachments

  @TCID277 @TCIDEPQPortal @OtherResources @PrequalificationRequirements
  Scenario: Update Green Economy Information
    When Navigate to Prequalification Requirements
    And User Profile Loaded
    And Navigate to Other Resources
    And User Enter Contractor's Equipment Information
    Then User Verify the Data Saved
    And User Enter Fabrication Facilities
    Then Verify the record has been Saved

  @TCID278 @TCIDEPQPortal @VendorUnderTaken @PrequalificationRequirements
  Scenario: Update Vendor Under Taken
    When Navigate to Prequalification Requirements
    And User Profile Loaded
    And Navigate to Vendor Under Taken
    And User Upload Under Taken with Additional Note
    And User Saved Vendor Under Taken
    Then Click on Proceed

  @TCID279 @TCIDEPQPortal @AddScope @Manage/SubmitPrequalificationRequirements
  Scenario: Add Scope Project
    When Navigate to Manage/ Submit Prequalification
    And Click on Add Scope Project
    And Enter Scope Project Information
    Then Verify the Scope has been added

  @TCID281 @TCIDEPQPortal @Manage/SubmitPrequalificationRequirements
  Scenario: Open Submitted Project

    When Navigate to Manage/ Submit Prequalification
    And User Open the Submitted Project
    Then User redirected to Manage PreQualification Page

  @TCID282 @TCIDEPQPortal @Manage/SubmitPrequalificationRequirements
  Scenario: Open Submitted Project

    When Navigate to Manage/ Submit Prequalification
    And User Open the Submitted Project
    Then User redirected to Manage PreQualification Page
    And User Select the Relevant Experience
    And User Select the C.V.s
    And User Submit the PreQualification Request Form

  @TCID409 @CompletePrequalificationRequirements
  Scenario: Pre Qualification Requirement

    When Navigate to Prequalification Requirements
    And User Profile Loaded
    And User Enter Contact Details
    And User Enter Company Information and Upload the File
    And User Enter Trade License Information and Upload the File
    And User Enter Company Owner Information and Upload the File
    And Click on Next Button
    Then Verify Profile has been Updated
    And Navigate to Company Structur
    And User Uploaded Company Profile Attachment
    And User Uploaded Organization Chart Attachment
    And Click on Next Button
    And User Enter Financial Information and Uploaded Etihad Risk Bureau
    And User Uploaded Bank Statement
    Then Verify Vendor Bankers Information
    And User Enter Experience Information
    And User Enter Relevant Experience Information
    Then User Verify the entered information
    And User Enter Personal Information
    And User Enter Contacts & Key Staff
    Then Verify the Contacts & Key Staff
    And User Enter CV Details
    Then User Verify the CV Details
    And User Select Answers for HSE Policy & Upload Attachments
    And User Select Answers for Green Economy & Upload Attachments
    And User Enter Contractor's Equipment Information
    Then User Verify the Data Saved
    And User Enter Fabrication Facilities
    Then Verify the record has been Saved
    And User Upload Under Taken with Additional Note
    And User Saved Vendor Under Taken
    Then Click on Proceed
    And Click on Add Scope Project
    And Enter Scope Project Information
    Then Verify the Scope has been added
    And User Open the Submitted Project
    Then User redirected to Manage PreQualification Page
    And User Select the Relevant Experience
    And User Select the C.V.s
    And User Submit the PreQualification Request Form