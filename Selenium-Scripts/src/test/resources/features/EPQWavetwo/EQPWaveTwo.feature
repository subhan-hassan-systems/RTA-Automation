#Author: Aamir Khan
Feature: EPQWavetwo

#  Background:
#    Given I am on the EPQ Portal home page

  @SubmitVendorPrequalification
  Scenario: Submit vendor prequalification
    When I am on the EPQ Portal home page
    And Navigate to Prequalification Requirements
    And User Profile Loaded
    And User click on Prequalifications link
    And User click on add project and insert data
    And User Enter Contact Details
    #And User Enter Company Information and Upload the File
    #And User Enter Trade License Information and Upload the File
    #And User Enter Company Owner Information and Upload the File
    #And Click on Next Button
    #Then Verify Profile has been Updated


  @SubmitVendorPrequalificationRecord
  Scenario: Submit vendor prequalification record
    #When Navigate to Prequalification Requirements
    Given I am on the EPQ Portal home page
    #When Navigate to ePrequalification Home
    #And User Profile Loaded
    And User click on ePrequalifications home
    And User click on submit appeal
    #And User click on add project and insert data
    #And User Enter Contact Details

  # pre req: vendor need to have a submit appeal record at PORTAl to complete below test
  @AppealProcessCRM
  Scenario: Appeal Process End to End Flow CRM
    Given I am on the EPQ Portal home page
    And User click on ePrequalifications home
    And User click on submit appeal
    #-----#
    When I am on the RTA home page
    And Close Initial Popups
    And Navigate to Reviews
    And Complete Completeness Review
    And User perform Review switch
    And Complete Technical Review department coordinator
    And User perform Review switch
    And Complete Chairman Appeal Review
    And User perform Review switch
    And Complete PQ Committee Appeal Review
    And User perform Review switch
    And Complete CP Director Appeal Review
    #And PQ committee head
    #Then Complete CP director


  @UnitTesting
  Scenario: User press Review button to navigate
    When I am on the RTA home page
    And Close Initial Popups
    #And User perform switch
    And  Navigate to Reviews
    And User perform Review switch
