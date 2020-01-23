Feature: CaseManagement 

Background: 
	Given I am on the RTA home page 
	
@TCID01 @TCIDSanity @TCIDCaseManagement @TCIDPhoneActivity
Scenario: Create phone call activity 

	When Close Initial Popups 
	And  Navigate to Phone call Activity 
	And  Create phone call activity 
	Then Verify phone call activity 
	
@TCID200 @TCIDSanity @TCIDCaseManagement @TCIDPhoneActivity
Scenario: Create phone call activity with outgoing direction 

	When Close Initial Popups 
	And  Navigate to Phone call Activity 
	And  Create phone call activity with outgoing direction
	Then Verify phone call activity 
	
@TCID02 @TCIDSanity @TCIDCaseManagement @TCIDPhoneActivity
Scenario: Convert activity to case  

	When Close Initial Popups 
	And  Navigate to Phone call Activity 
	And  Create phone call activity 
	And  Edit phone call activity
	And  Click on convert to case button
	And  Enter values in all required fields and hit Save
	Then Verify converted activity to case

@TCID03 @TCIDSanity @TCIDCaseManagement @TCIDPhoneActivity
Scenario: Assign to department  

	When Close Initial Popups 
	And  Navigate to Phone call Activity 
	And  Create phone call activity 
	And  Edit phone call activity
	And  Click on convert to case button
	And  Enter values in all required fields and hit Save
	And  Click on assign to department button
	Then Verify assign to department

@TCID04 @TCIDSanity @TCIDCaseManagement @TCIDPhoneActivity
Scenario: Case Resolution  

	When Close Initial Popups 
	And  Navigate to Phone call Activity 
	And  Create phone call activity 
	And  Edit phone call activity
	And  Click on convert to case button
	And  Enter values in all required fields and hit Save
	And  Click on assign to department button
	And  Navigate to Service> Cases
	And  Navigate To CaseForm
	And  Fill up values for department
	And  Assign to follow up
	And  Navigate to closure to finish
	And  Resolve case for phone call activity
	Then Verify resolve case	
	
@TCID65 @TCIDSanity @TCIDCaseManagement @TCIDFieldsVV
Scenario: Verify fields under Administration section on case form

	When Close Initial Popups 
	And  Navigate to Service> Cases 
	And  Open a new case record
	Then Verify fields under Administration section
	
@TCID84 @TCIDSanity @TCIDCaseManagement @TCIDFieldsVV
Scenario: Verify fields and sections under addiontional tab on case form on selecting grievience as case type

	When Close Initial Popups
	And Navigate to Service> Cases
	And Open a new case record
	Then Verify fields and sections under addiontional tab on case form on selecting grievience as case type
	
@TCID85 @TCIDSanity @TCIDCaseManagement @TCIDFieldsVV
Scenario: Verify fields and sections under addiontional tab on case form on selecting complex enquiry as case type

	When Close Initial Popups
	And Navigate to Service> Cases
	And Open a new case record
	Then Verify fields and sections under addiontional tab on case form on selecting complex enquiry as case type
	
@TCID90 @TCIDSanity @TCIDCaseManagement @TCIDFieldsVV
Scenario: Verify the visibility of Internal Suggestion Details section when Type of Suggestion is Internal Team or Committee Suggestion
	
	When Close Initial Popups
	And Navigate to Service> Cases
	And Open a new case record
	Then Verify the visibility of Internal Suggestion Details section when Type of Suggestion is Internal Team or Committee Suggestion 
	
@TCID91 @TCIDSanity @TCIDCaseManagement @TCIDFieldsVV
Scenario: Verify the visibility of Internal Suggestion Details section when Type of Suggestion is External Individual Suggestion
	
	When Close Initial Popups
	And Navigate to Service> Cases
	And Open a new case record
	Then Verify the visibility of Internal Suggestion Details section when Type of Suggestion is External Group Suggestion

@TCID92 @TCIDSanity @TCIDCaseManagement @TCIDFieldsVV
Scenario: Verify the visibility of Internal Suggestion Details section when Type of Suggestion is External Individual Suggestion
	
	When Close Initial Popups
	And Navigate to Service> Cases
	And Open a new case record
	Then Verify the visibility of Internal Suggestion Details section when Type of Suggestion is External Individual Suggestion
	
	
@TCID93 @TCIDSanity @TCIDCaseManagement @TCIDFieldsVV
Scenario: Verify fields And sections under additional data tab on case form on selecting Notification as case type
	
	When Close Initial Popups
	And Navigate to Service> Cases
	And Open a new case record	
	Then Verify fields And sections under additional data tab on case form on selecting Notification as case type	

@TCID94 @TCIDSanity @TCIDCaseManagement @TCIDFieldsVV
Scenario: Verify values of Defect Reason option set on case form on selecting Notifcation as case type
	
	When Close Initial Popups
	And Navigate to Service> Cases
	And Open a new case record	
	Then Verify values of Defect Reason option set on case form on selecting Notifcation as case type
	
@TCID95 @TCIDSanity @TCIDCaseManagement @TCIDFieldsVV
Scenario: Verify fields and sections under additional data tab on case form on selecting Complaint as case type
	
	When Close Initial Popups
	And Navigate to Service> Cases
	And Open a new case record	
	Then Verify fields and sections under additional data tab on case form on selecting Complaint as case type	
	
@TCID96 @TCIDSanity @TCIDCaseManagement @TCIDFieldsVV
Scenario: Verify the values of Complaint Reason option set When selecting case type as Complaint
	
	When Close Initial Popups
	And Navigate to Service> Cases
	And Open a new case record
	Then Verify the values of Complaint Reason option set When selecting case type as Complaint		

@TCID97 @TCIDSanity @TCIDCaseManagement @TCIDFieldsVV
Scenario: Verify fields & sections under additional data tab on case form on selecting Lost Item as case type
	
	When Close Initial Popups
	And Navigate to Service> Cases
	And Open a new case record
    Then Verify fields and sections under additional data tab on case form on selecting Lost Item as case type

@TCID98 @TCIDSanity @TCIDCaseManagement @TCIDFieldsVV
Scenario: Verify values of Item Category option set on selecting Case Type as Lost Item
	
	When Close Initial Popups
	And Navigate to Service> Cases
	And Open a new case record
	Then Verify values of Item Category option set on selecting Case Type as Lost Item

@TCID99 @TCIDSanity @TCIDCaseManagement @TCIDFieldsVV
Scenario: Verify values of Item Color option set on selecting Case Type as Lost Item
	
	When Close Initial Popups
	And Navigate to Service> Cases
	And Open a new case record
	Then Verify values of Item Color option set on selecting Case Type as Lost Item

@TCID100 @TCIDSanity @TCIDCaseManagement @TCIDFieldsVV
Scenario: Verify fields & sections under additional data tab on case form on selecting Request as case type
	
	When Close Initial Popups
	And Navigate to Service> Cases
	And Open a new case record
	Then Verify fields and sections under additional data tab on case form on selecting Request as case type
 	
@TCID101 @TCIDSanity @TCIDCaseManagement 
Scenario: Verify values of Request Reason option set on selecting Request as case Type
	
	When Close Initial Popups
	And Navigate to Service> Cases
	And Open a new case record	
	Then Verify values of Request Reason option set on selecting Request as case Type
	
	
@TCID102 @TCIDSanity @TCIDCaseManagement @TCIDChat
Scenario: Create Chat activity

	When Close Initial Popups
	And Navigate to Activities	
	And Navigate to create chat activity
	Then Verify chat activity

@TCID103 @TCIDSanity @TCIDCaseManagement @TCIDChat
Scenario: Create Chat activity using contacts path

	When Close Initial Popups
	And Navigate to Contact Activities	
	And Navigate to contact chat activity	
	
@TCID104 @TCIDSanity @TCIDCaseManagement @TCIDChat
Scenario: Update Chat activity 

	When Close Initial Popups
	And Navigate to Activities
	And Select chat activity	
	Then Update chat activity		
	
@TCID153 @TCIDSanity @TCIDCaseManagement @TCIDChat
Scenario: Update chat activity to close using mark complete option

	When Close Initial Popups
	And Navigate to Activities
	And Navigate to create chat activity
	And Select chat activity
	And Select mark complete
	Then Verify the updated chat activity
	
@TCID154 @TCIDSanity @TCIDCaseManagement @TCIDChat
Scenario: Update chat activity to close using close chat option

	When Close Initial Popups
	And Navigate to Activities
	And Navigate to create chat activity
	And Select chat activity
	Then Select close chat
	
@TCID155 @TCIDSanity @TCIDCaseManagement @TCIDChat
Scenario: Convert chat activity to case

	When Close Initial Popups
	And Navigate to Activities
	And Navigate to create chat activity
	And Select chat activity
	Then Convert chat activity to case and verify		

@TCID117 @TCIDSanity @TCIDCaseManagement @TCIDCases
Scenario: Create new case with case type complaint
	
	When Close Initial Popups
	And Navigate to Service> Cases
	And Open a new case record
	Then Create new case with case type complaint
	
@TCID118 @TCIDSanity @TCIDCaseManagement @TCIDCases
Scenario: Create new case with case type suggestion

	When Close Initial Popups
	And Navigate to Service> Cases
	And Open a new case record
	Then Create new case with case type suggestion	
	
@TCID119 @TCIDSanity @TCIDCaseManagement @TCIDCases
Scenario: Create new case with case type request
	
	When Close Initial Popups
	And Navigate to Service> Cases
	And Open a new case record
	Then Create new case with case type request		
	
@TCID120 @TCIDSanity @TCIDCaseManagement @TCIDCases
Scenario: Create new case with case type compliment
	
	When Close Initial Popups
	And Navigate to Service> Cases
	And Open a new case record
	Then Create new case with case type compliment	
	
@TCID121 @TCIDSanity @TCIDCaseManagement @TCIDCases
Scenario: Create new case with case type emergency
	
	When Close Initial Popups
	And Navigate to Service> Cases
	And Open a new case record
	Then Create new case with case type emergency
	
@TCID122 @TCIDSanity @TCIDCaseManagement @TCIDCases
Scenario: Create new case with case type lost item
	
	When Close Initial Popups
	And Navigate to Service> Cases
	And Open a new case record
	Then Create new case with case type lost item	
	
@TCID123 @TCIDSanity @TCIDCaseManagement @TCIDCases
Scenario: Create new case with case type complex Enquiry
	
	When Close Initial Popups
	And Navigate to Service> Cases
	And Open a new case record
	Then Create new case with case type complex Enquiry
	
@TCID124 @TCIDSanity @TCIDCaseManagement @TCIDCases
Scenario: Create new case with case type notification
	
	When Close Initial Popups
	And Navigate to Service> Cases
	And Open a new case record
	Then Create new case with case type notification
	
@TCID125 @TCIDSanity @TCIDCaseManagement @TCIDCases
Scenario: Create new case with case type MBR idea
	
	When Close Initial Popups
	And Navigate to Service> Cases
	And Open a new case record
	Then Create new case with case type MBR idea
	
@TCID126 @TCIDSanity @TCIDCaseManagement @TCIDCases
Scenario: Create new case with case type MBR Comment
	
	When Close Initial Popups
	And Navigate to Service> Cases
	And Open a new case record
	Then Create new case with case type MBR Comment	
	
@TCID127 @TCIDSanity @TCIDCaseManagement @TCIDCases
Scenario: Create new case with case type Grievance
	
	When Close Initial Popups
	And Navigate to Service> Cases
	And Open a new case record
	Then Create new case with case type Grievance	
	
@TCID128 @TCIDSanity @TCIDCaseManagement @TCIDCases
Scenario: Create new case with case type Fine Objection
	
	When Close Initial Popups
	And Navigate to Service> Cases
	And Open a new case record
	Then Create new case with case type Fine Objection		
	
@TCID129 @TCIDSanity @TCIDCaseManagement @TCIDCases
Scenario: Update case with case type complaint

	When Close Initial Popups
	And Navigate to Service> Cases
	Then Update case with case type complaint	
	
@TCID130 @TCIDSanity @TCIDCaseManagement @TCIDCases
Scenario: Update case with case type suggestion

	When Close Initial Popups
	And Navigate to Service> Cases
	Then Update case with case type suggestion	
	
@TCID131 @TCIDSanity @TCIDCaseManagement @TCIDCases
Scenario: Update case with case type request
	
	When Close Initial Popups
	And Navigate to Service> Cases
	Then Update case with case type request		
	
@TCID132 @TCIDSanity @TCIDCaseManagement @TCIDCases
Scenario: Update case with case type Emergency
	
	When Close Initial Popups
	And Navigate to Service> Cases
	Then Update case with case type Emergency	
	
@TCID133 @TCIDSanity @TCIDCaseManagement @TCIDCases
Scenario: Update case with case type lost Item
	
	When Close Initial Popups
	And Navigate to Service> Cases
	Then Update case with case type lost Item
	
@TCID134 @TCIDSanity @TCIDCaseManagement @TCIDCases
Scenario: Update case with case type Fine Objection
	
	When Close Initial Popups
	And Navigate to Service> Cases
	Then Update case with case type Fine Objection
	
@TCID135 @TCIDSanity @TCIDCaseManagement 
Scenario: Update case with case type Grievance
	
	When Close Initial Popups
	And Navigate to Service> Cases
	Then Update case with case type Grievance	
	
@TCID136 @TCIDSanity @TCIDCaseManagement @TCIDCases
Scenario: Update case with case type MBR idea
	
	When Close Initial Popups
	And Navigate to Service> Cases
	Then Update case with case type MBR idea
	
@TCID137 @TCIDSanity @TCIDCaseManagement @TCIDCases
Scenario: Update case with case type MBR Comment
	
	When Close Initial Popups
	And Navigate to Service> Cases
	Then Update case with case type MBR Comment

@TCID138 @TCIDSanity @TCIDCaseManagement @TCIDCases
Scenario: Update case with case type Notification
	
	When Close Initial Popups
	And Navigate to Service> Cases
	Then Update case with case type Notification
	
@TCID139 @TCIDSanity @TCIDCaseManagement @TCIDCases
Scenario: Update case with case type Complex Enquiry
	
	When Close Initial Popups
	And Navigate to Service> Cases
	Then Update case with case type Complex Enquiry
	
@TCID140 @TCIDSanity @TCIDCaseManagement @TCIDCases
Scenario: Update case with case type Compliment
	
	When Close Initial Popups
	And Navigate to Service> Cases
	Then Update case with case type Compliment
		
@TCID141 @TCIDSanity @TCIDCaseManagement @TCIDRESOLVECASES @CaseTypeComplaint
Scenario: Resolve case with case type complaint

	When Close Initial Popups
	And  Navigate to Service> Cases
	And  Open a new case record
	And  Create new case with case type complaint
	And  Click on assign to department button
	And  Navigate to Service> Cases
	And  Navigate To CaseForm
	And  Fill up values for department
	And  Assign to follow up
	And  Navigate to closure to finish
	And  Resolve case for complaint cases
	Then Verify resolve case

	
@TCID142 @TCIDSanity @TCIDCaseManagement @TCIDRESOLVECASES @CaseTypeSuggestion
Scenario: Resolve case with case type suggestion

	When Close Initial Popups
	And Navigate to Service> Cases
	And Open a new case record
	And Create new case with case type suggestion
#	And  Click on assign to department button
#	And  Navigate to Service> Cases
#	And  Navigate To CaseForm
#	And  Fill up values for department
#	And  Assign to follow up
	And  Navigate to closure to finish
	And  Resolve case for suggestion case
	Then Verify resolve case	

@TCID143 @TCIDSanity @TCIDCaseManagement @TCIDRESOLVECASES @CaseTypeRequest
Scenario: Resolve case with case type request

	When Close Initial Popups
	And Navigate to Service> Cases
	And Open a new case record
	And Create new case with case type request	
#	And  Click on assign to department button
#	And  Navigate to Service> Cases
#	And  Navigate To CaseForm
#	And  Fill up values for department
#	And  Assign to follow up
	And  Navigate to closure to finish
	And  Resolve case for request case
	Then Verify resolve case	


@TCID144 @TCIDSanity @TCIDCaseManagement @TCIDRESOLVECASES @CaseTypeCompliment
Scenario: Resolve case with case type compliment

	When Close Initial Popups
	And Navigate to Service> Cases
	And Open a new case record
	And Create new case with case type compliment	
#	And  Click on assign to department button
#	And  Navigate to Service> Cases
#	And  Navigate To CaseForm
#	And  Fill up values for department
#	And  Assign to follow up
	And  Navigate to closure to finish
	And  Assign to concerned Parties
	And  Resolve case for compliment case
	Then Verify resolve case
	
#little problem
@TCID145 @TCIDSanity @TCIDCaseManagement  @CaseTypeLostItem
Scenario: Resolve case with case type Lost Item

	When Close Initial Popups
	And Navigate to Service> Cases
	And Open a new case record
	And Create new case with case type lost item	
	And  Click on assign to department button
	And  Navigate to Service> Cases
	And  Navigate To CaseForm
	And  Fill up values for department
	And  Assign to follow up
	And  Navigate to closure to finish
	And  Resolve case for compliment case
	Then Verify resolve case	

@TCID146 @TCIDSanity @TCIDCaseManagement  @TCIDRESOLVECASES @CaseTypeComplexEnquiry
Scenario: Resolve case with case type complex Enquiry 

	When Close Initial Popups
	And Navigate to Service> Cases
	And Open a new case record
	And Create new case with case type complex Enquiry	
	And Navigate to closure to finish
	Then Resolve case for complex enquiry case
	Then Verify resolve case	


@TCID147 @TCIDSanity @TCIDCaseManagement @TCIDRESOLVECASES @CaseTypeNotification
Scenario: Resolve case with case type Notification 

	When Close Initial Popups
	And  Navigate to Service> Cases
	And  Open a new case record
	And  Create new case with case type notification	
	And  Click on assign to department button
	And  Navigate to Service> Cases
	And  Navigate To CaseForm
	And  Fill up values for department
	And  Assign to follow up
	And  Navigate to closure to finish
	And  Resolve case for Notification case
	Then Verify resolve case


@TCID148 @TCIDSanity @TCIDCaseManagement @TCIDRESOLVECASES @CaseTypeMBRIdea
Scenario: Resolve case with case type MBR Idea

	When Close Initial Popups
	And Navigate to Service> Cases
	And Open a new case record
	And Create new case with case type MBR idea	
	And  Click on assign to department button
	And  Navigate to Service> Cases
	And  Navigate To CaseForm
	And  Fill up values for department
	And  Assign to follow up
	And Navigate to closure to finish
	Then Resolve case for MBR Idea case
	Then Verify resolve case

@TCID149 @TCIDSanity @TCIDCaseManagement @TCIDRESOLVECASES @CaseTypeMBRComment
Scenario: Resolve case with case type MBR Comment

	When Close Initial Popups
	And Navigate to Service> Cases
	And Open a new case record
	And Create new case with case type MBR Comment
	And  Click on assign to department button
	And  Navigate to Service> Cases
	And  Navigate To CaseForm
	And  Fill up values for department
	And  Assign to follow up
	And Navigate to closure to finish
	Then Resolve case for Notification case
	Then Verify resolve case	

#Problem
@TCID150 @TCIDSanity @TCIDCaseManagement @CaseTypeGrievance
Scenario: Resolve case with case type Grievance

	When Close Initial Popups
	And Navigate to Service> Cases
	And Select a resolved case with case type complaint
#	And  Click on assign to department button
#	And  Navigate to Service> Cases
#	And  Navigate To CaseForm
#	And  Fill up values for department
#	And  Assign to follow up
	And Navigate to closure to finish
	Then Resolve case for Notification case
	Then Verify resolve case


@TCID151 @TCIDSanity @TCIDCaseManagement @TCIDRESOLVECASES @CaseTypeFineObjection
Scenario: Resolve case with case type Fine Objection

	When Close Initial Popups
	And Navigate to Service> Cases
	And Open a new case record
	And Create new case with case type Fine Objection
#	And  Click on assign to department button
#	And  Navigate to Service> Cases
#	And  Navigate To CaseForm
#	And  Fill up values for department
#	And  Assign to follow up
	And Navigate to closure to finish
	And Resolve case for Fine Objection case
	Then Verify resolve case
	
@TCID152 @TCIDSanity @TCIDCaseManagement @TCIDRESOLVECASES @CaseTypeEmergency
Scenario: Resolve case with case type emergency
	
	When Close Initial Popups
	And Navigate to Service> Cases
	And Open a new case record
	And Create new case with case type emergency	
	And Navigate to closure to finish
	Then Resolve case for Emergency case
	Then Verify resolve case

@TCID156 @TCIDSanity @TCIDCaseManagement @TCIDSuggestion
Scenario: Create new case with case type suggestion and suggestion type internal individual suggestion

	When Close Initial Popups
	And Navigate to Service> Cases
	And Open a new case record
	Then Create new case with case type suggestion and suggestion type internal individual suggestion
	
@TCID157 @TCIDSanity @TCIDCaseManagement @TCIDSuggestion
Scenario: Create new case with case type suggestion and suggestion type internal group suggestion

	When Close Initial Popups
	And Navigate to Service> Cases
	And Open a new case record
	Then Create new case with case type suggestion and suggestion type internal group suggestion
	
@TCID158 @TCIDSanity @TCIDCaseManagement @TCIDSuggestion
Scenario: Create new case with case type suggestion and suggestion type Internal Team or Committee Suggestion

	When Close Initial Popups
	And Navigate to Service> Cases
	And Open a new case record
	Then Create new case with case type suggestion and suggestion type Internal Team or Committee Suggestion
	
@TCID159 @TCIDSanity @TCIDCaseManagement @TCIDSuggestion
Scenario: Create new case with case type suggestion and suggestion type External Individual Suggestion

	When Close Initial Popups
	And Navigate to Service> Cases
	And Open a new case record
	Then Create new case with case type suggestion and suggestion type External Individual Suggestion	
	
@TCID160 @TCIDSanity @TCIDCaseManagement @TCIDSuggestion
Scenario: Create new case with case type suggestion and suggestion type External Group Suggestion

	When Close Initial Popups
	And Navigate to Service> Cases
	And Open a new case record
	Then Create new case with case type suggestion and suggestion type External Group Suggestion	
		