#Author: Subhan
Feature: EPQWavethree

#  Background:
#    Given I am on the EPQ Portal home page
#Pre Req : Required user should be sub-contractor and excel sheet contains "Road Works (Including Asphalt)"
  @SubmitSubContractorPrequalification
  Scenario: Submit Sub Contractor Prequalification
    When I am on the EPQ Portal home page
    And User click on ePrequalifications home
    And User click on submit sub contractor
    And Click on Add Scope Project
    And Enter Scope Project Information
    Then Verify the Scope has been added
    And User Open the Submitted Project
    And User redirected to Manage PreQualification Page
    And User Select the Relevant Experience
    And User Select the C.V.s
    And User Submit the PreQualification Request Form
    #-------- RTA---------
    When I am on the RTA home page
    And Close Initial Popups
    And  Navigate to Reviews
    And  Navigate to Sub Contractor PQ Engineer
    And  Click A Sub Contractor PQ Engineer Review
    And Complete Sub Contractor PQEnigeer Review
    And Close Review
#      #technical review starts
    #----And Navigate to PQ Engineer
    And Navigate to Sub Contractor Department Coordinator
    And Click A Sub Contractor Department Review
    And Complete Technical Review Sub Contractor
    And Close Review
#       #Green Procurement Review
    And Navigate to Sub Contractor Department Coordinator
    And Click A Sub Contractor Green Procurement Review
    And Complete Green Procurement Review Sub Contractor
    And Close Review
        #PQ Committee Review
    And Navigate to Sub Contractor Department Coordinator
    And Click A Sub-Contractor PQ Committee Review
    And Complete PQ Committee Review Sub Contractor