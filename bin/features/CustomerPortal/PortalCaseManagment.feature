Feature: PortalCaseManagement 

Background: 
	Given I am on the Customer Portal home page
	
@TCID170 @TCIDSanity @TCIDPortalCaseManagement 
Scenario: Create a new case with case type suggestion 

	When Change language to English
	And Navigate to case type suggestion
	And Create case type suggestion
	Then Verify case creation
	
@TCID171 @TCIDSanity @TCIDPortalCaseManagement 
Scenario: Create a new case with case type provide a compliment

	When Change language to English
	And Navigate to case type provide a compliment
	And Create case type provide a compliment
	Then Verify case creation	
	
@TCID172 @TCIDSanity @TCIDPortalCaseManagement 
Scenario: Create a new case with case type request

	When Change language to English
	And Navigate to case type request
	And Create case type request
	Then Verify case creation	
	
@TCID173 @TCIDSanity @TCIDPortalCaseManagement 
Scenario: Create a new case with case type Report a notification

	When Change language to English
	And Navigate to case type Report a notification
	And Create case type Report a notification
	Then Verify case creation	
	
@TCID174 @TCIDSanity @TCIDPortalCaseManagement 
Scenario: Create a new case with case type make a complaint

	When Change language to English
	And Navigate to case type make a complaint
	And Create a new case with case type make a complaint
	Then Verify case creation	
	
@TCID175 @TCIDSanity @TCIDPortalCaseManagement 
Scenario: Create a new case with case type report lost item

	When Change language to English
	And Navigate to case type report lost item
	And Create a new case with case type report lost item
	Then Verify case creation	
	
@TCID176 @TCIDSanity @TCIDPortalCaseManagement 
Scenario: Create a new case with case type submit fine objection

	When Change language to English
	And Navigate to case type submit fine objection
	And Create a new case with case type submit fine objection
	Then Verify case creation	