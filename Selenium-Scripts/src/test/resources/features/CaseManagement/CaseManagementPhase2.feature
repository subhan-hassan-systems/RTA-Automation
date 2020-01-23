Feature: CaseManagement

  Background:
    Given I am on the RTA home page

@TCID1001
Scenario: Create new case with type suggestion and End Service Touch Point and Reason

  When Close Initial Popups
  And Navigate to Service> Cases
  And Open a new case record
  Then Create new case with case type suggestion and End Service Touch Point and Reason

@TCID1002
Scenario: Resolve case with case type suggestion in phase two
  When Close Initial Popups
  And Navigate to Service> Cases
  And Open a new case record
  And Create new case with case type suggestion and End Service Touch Point and Reason
  And  Click on assign to department button
#  And  Navigate to Service> Cases
#  And  Navigate To CaseForm
  And  Fill up values for department
  And  Assign to follow up
  And  Navigate to closure to finish
  And  Resolve case for suggestion case
  Then Verify resolve case

@TCID1003
Scenario: Create case with case type complaint in phase two

  When Close Initial Popups
  And  Navigate to Service> Cases
  And  Open a new case record
  And  Create new case with case type complaint and End Service Touch Point and Reason

@TCID1004
Scenario: Resolve case with case type complaint in phase two

  When Close Initial Popups
  And  Navigate to Service> Cases
  And  Open a new case record
  And  Create new case with case type complaint and End Service Touch Point and Reason
  And  Click on assign to department button
#  And  Navigate to Service> Cases
#  And  Navigate To CaseForm
  And  Fill up values for department
  And  Assign to follow up
  And  Navigate to closure to finish
  And  Resolve case for complaint cases
  Then Verify resolve case

@TCID1005
Scenario: Create case with case type Fine Objection in phase two

  When Close Initial Popups
  And Navigate to Service> Cases
  And Open a new case record
  And Create new case with case type Fine Objection and End Service Touch Point and Reason

@TCID1006
Scenario: Resolve case with case type Fine Objection in phase two

  When Close Initial Popups
  And Navigate to Service> Cases
  And Open a new case record
  And Create new case with case type Fine Objection and End Service Touch Point and Reason
#	And  Click on assign to department button
#	And  Navigate to Service> Cases
#	And  Navigate To CaseForm
#	And  Fill up values for department
#	And  Assign to follow up
  And Navigate to closure to finish
  And Resolve case for Fine Objection case
  Then Verify resolve case


@TCID1007
Scenario: Create case with case type Compliment in phase two
  When Close Initial Popups
  And  Navigate to Service> Cases
  And  Open a new case record
  And  Create new case with case type compliment and End Service Touch Point and Reason

@TCID1008
Scenario: Resolve case with case type Compliment in phase two
  When Close Initial Popups
  And  Navigate to Service> Cases
  And  Open a new case record
  And  Create new case with case type compliment and End Service Touch Point and Reason
  And  Click on assign to department button
#  And  Navigate to Service> Cases
#  And  Navigate To CaseForm
  And  Fill up values for department
  And  Assign to follow up
  And  Navigate to closure to finish
  And  Assign to concerned Parties
  And  Resolve case for compliment case
  Then Verify resolve case

@TCID1009
Scenario: Create new case with case type complex Enquiry in phase two

  When Close Initial Popups
  And Navigate to Service> Cases
  And Open a new case record
  Then Create new case with case type complex Enquiry and End Service Touch Point and Reason

@TCID1010
Scenario: Resolve case with case type Complex Enquiry in phase two

  When Close Initial Popups
  And Navigate to Service> Cases
  And Open a new case record
  And Create new case with case type complex Enquiry and End Service Touch Point and Reason
  And Navigate to closure to finish
  Then Resolve case for complex enquiry case
  Then Verify resolve case

@TCID1011
Scenario: Create new case with case type emergency in phase two
  When Close Initial Popups
  And Navigate to Service> Cases
  And Open a new case record
  Then Create new case with case type emergency in phase two


@TCID1012
Scenario: Create new case with case type emergency in phase two
  When Close Initial Popups
  And Navigate to Service> Cases
  And Open a new case record
  And Create new case with case type emergency in phase two
  And  Click on assign to department button
#  And  Navigate to Service> Cases
#  And  Navigate To CaseForm
  And  Fill up values for department
  And  Assign to follow up
  And Navigate to closure to finish
  And Resolve case for Emergency case
  Then Verify resolve case

@TCID1013
Scenario: Create case with case type Lost Item in phase two

  When Close Initial Popups
  And Navigate to Service> Cases
  And Open a new case record
  And Create new case with case type lost item in phase two

@TCID1014
Scenario: Resolve case with case type Lost Item in phase two

  When Close Initial Popups
  And Navigate to Service> Cases
  And Open a new case record
  And Create new case with case type lost item in phase two
  And  Click on assign to department button
#  And  Navigate to Service> Cases
#  And  Navigate To CaseForm
  And  Fill up values for department
  And  Assign to follow up
  And  Navigate to closure to finish
  And  Resolve case for lost item in phase two
  Then Verify resolve case

@TCID1015
Scenario: Create case with case type notification in phase two

  When Close Initial Popups
  And Navigate to Service> Cases

  And Open a new case record
  And Create new case with case type notification in phase two

@TCID1016
Scenario: Resolve case with case type notification in phase two

  When Close Initial Popups
  And Navigate to Service> Cases
  And Open a new case record
  And Create new case with case type notification in phase two
  And  Click on assign to department button
#  And  Navigate to Service> Cases
#  And  Navigate To CaseForm
  And  Fill up values for department
  And  Assign to follow up
  And  Navigate to closure to finish
  And  Resolve case for Notification case
  Then Verify resolve case

@TCID1017
Scenario: Create case with case type request in phase two

  When Close Initial Popups
  And Navigate to Service> Cases
  And Open a new case record
  And Create new case with case type request in phase two

@TCID1018
Scenario: Resolve case with case type request in phase two

  When Close Initial Popups
  And Navigate to Service> Cases
  And Open a new case record
  And Create new case with case type request in phase two
  And  Navigate to closure to finish
  And  Resolve case for request case
  Then Verify resolve case



