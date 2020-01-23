Feature: PortalCaseManagement

  Background:
    Given I am on the EPQ Portal home page

  @TCID170P2 @TCIDSanity @TCIDPortalCaseManagement
  Scenario: Create a new case with case type suggestion

    When Change language to English
    And Navigate to case type suggestion
    And Create case type suggestion in phase two
    Then Verify case creation
    And I am on the RTA home page
    When Close Initial Popups
    And Navigate to Service> Cases
    And Search Created Case
    And  Click on assign to department button for portal cases
    And  Fill up values for department
    And  Assign to follow up
    And  Navigate to closure to finish
    And  Resolve case for suggestion case
    Then Verify resolve case


  @TCID171P2 @TCIDSanity @TCIDPortalCaseManagement
  Scenario: Create a new case with case type complaint

    When Change language to English
    And Navigate to case type make a complaint
    And Create case type complaint in phase two
    Then Verify case creation
    And I am on the RTA home page
    When Close Initial Popups
    And Navigate to Service> Cases
    And Search Created Case
    And  Click on assign to department button for portal cases
    And  Fill up values for department
    And  Assign to follow up
    And  Navigate to closure to finish
    And  Resolve case for complaint cases
    Then Verify resolve case


  @TCID172P2 @TCIDSanity @TCIDPortalCaseManagement
  Scenario: Create a new case with case type provide a compliment

    When Change language to English
    And Navigate to case type provide a compliment
    And Create case type provide a compliment in phase two
    Then Verify case creation
    And I am on the RTA home page
    When Close Initial Popups
    And Navigate to Service> Cases
    And Search Created Case
    And  Click on assign to department button for portal cases
#  And  Navigate to Service> Cases
#  And  Navigate To CaseForm
    And  Fill up values for department
    And  Assign to follow up
    And  Navigate to closure to finish
    And  Assign to concerned Parties
    And  Resolve case for compliment case
    Then Verify resolve case


  @TCID173P2 @TCIDSanity @TCIDPortalCaseManagement
  Scenario: Create a new case with case type provide a request
    When Change language to English
    And Navigate to case type request
    And Create case with type request in phase two
    Then Verify case creation
    And I am on the RTA home page
    When Close Initial Popups
    And Navigate to Service> Cases
    And Search Created Case
    And  Click on assign to department button for portal cases
#  And  Navigate to Service> Cases
#  And  Navigate To CaseForm
    And  Fill up values for department
    And  Assign to follow up
    And  Navigate to closure to finish
    And  Resolve case for request case
    Then Verify resolve case


  @TCID174P2 @TCIDSanity @TCIDPortalCaseManagement
  Scenario: Create a new case with case type Report a notification

    When Change language to English
    And Navigate to case type Report a notification
    And Create case type Report a notification in phase two
    Then Verify case creation
    And I am on the RTA home page
    When Close Initial Popups
    And Navigate to Service> Cases
    And Search Created Case
    And  Click on assign to department button for portal cases
#  And  Navigate to Service> Cases
#  And  Navigate To CaseForm
    And  Fill up values for department
    And  Assign to follow up
    And  Navigate to closure to finish
    And  Resolve case for Notification case
    Then Verify resolve case


  @TCID176P2 @TCIDSanity @TCIDPortalCaseManagement
  Scenario: Create a new case with case type submit fine objection

    When Change language to English
    And Navigate to case type submit fine objection
    And Create case with type submit fine objection in phase two
    Then Verify case creation
    And I am on the RTA home page
    When Close Initial Popups
    And Navigate to Service> Cases
    And Search Created Case
    And  Click on assign to department button for portal cases
#  And  Navigate to Service> Cases
#  And  Navigate To CaseForm
    And  Fill up values for department
    And  Assign to follow up
    And Navigate to closure to finish
    And Resolve case for Fine Objection case
    Then Verify resolve case

  @TCID175P2 @TCIDSanity @TCIDPortalCaseManagement
  Scenario: Create a new case with case type report lost item

    When Change language to English
    And Navigate to case type report lost item
    And Create a new case with case type report lost item in phase two
    Then Verify case creation
    And I am on the RTA home page
    When Close Initial Popups
    And Navigate to Service> Cases
    And Search Created Case
    And  Click on assign to department button for portal cases
#  And  Navigate to Service> Cases
#  And  Navigate To CaseForm
    And  Fill up values for department
    And  Assign to follow up
    And  Navigate to closure to finish
    And  Resolve case for lost item in phase two
    Then Verify resolve case