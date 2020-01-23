#Author: Ibadullah Khan
Feature: EPQPortal

#  Background:
#    Given I am on the EPQ Portal home page

  @TCID00EPQP2
  Scenario: PreQualification End to End from Portal
    When I am on the EPQ Portal home page
    And User click on ePrequalifications home
    And User click on submit contractor ROW
        #---And Navigate to Manage/ Submit Prequalification
    And Click on Add Scope Project
    And Enter Scope Project Information
    Then Verify the Scope has been added
    #---And Navigate to Manage/ Submit Prequalification
    And User Open the Submitted Project
    And User redirected to Manage PreQualification Page
    And User Select the Relevant Experience
    And User Select the C.V.s
    And User Submit the PreQualification Request Form

    #Pre req : Required user of contractor and excel sheet contains
    @TCID01EPQP2
  Scenario: Complete flow of review on CRM ROW
#      When I am on the EPQ Portal home page
#      And User click on ePrequalifications home
#      And User click on submit contractor ROW
#        #---And Navigate to Manage/ Submit Prequalification
#      And Click on Add Scope Project
#      And Enter Scope Project Information
#      Then Verify the Scope has been added
#    #---And Navigate to Manage/ Submit Prequalification
#      And User Open the Submitted Project
#      And User redirected to Manage PreQualification Page
#      And User Select the Relevant Experience
#      And User Select the C.V.s
#      And User Submit the PreQualification Request Form
          #---
    When I am on the RTA home page
    And Close Initial Popups
    And  Navigate to Reviews
    And  Navigate to ROW PQ Engineer
    And  Click A ROW PQ Engineer Review
    And Complete ROWPQEnigeer Review
    And Close Review
#     #technical review starts
    And  Navigate to ROW Department Coordinator
    And  Click A ROW Department Review
    And Complete ROW Department Review
    #And Close Review

#    And  Navigate to Legal Review
#    And  Click A Record
#    And Complete Legal Review
#    And Close Review
#    And  Navigate to Financial Review
#    And  Click A Record
#    And Complete Financial Review
#    And Close Review
#    And  Navigate to HSE Coordinator Review
#    And  Click A Record
#    And Complete HSE Coodinator Review
#    And Close Review
#    And  Navigate to Green Procurement Review
#    And  Click A Record
#    And Complete Green Procurement Review
#    And Close Review
#    And  Navigate to PQ Committee Review
#    And  Click A PQ committee prequalification review
#    And Complete PQ committee prequalification review
#    And  Close Review
#    And  Navigate to Procurement Director Review
#    And  Click CP Director Prequalification Review
#    Then Complete CP Director Prequalification Review
#    And  Close Review

  @TCID02EPQP2
  Scenario: Complete Rejection flow of review on CRM ROW
    When I am on the RTA home page
    And Close Initial Popups
    And  Navigate to Reviews
    And  Navigate to ROW PQ Engineer
    And  Click A ROW PQ Engineer Review
    And Complete ROWPQEnigeer Review
    And Close Review