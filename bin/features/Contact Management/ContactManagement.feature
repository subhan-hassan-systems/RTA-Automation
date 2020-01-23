Feature: ConatctManagement 

Background: 
	Given I am on the RTA home page
	
@TCID105 @TCIDSanity @TCIDConatctManagement
Scenario: Create customer with profile type external

	When Close Initial Popups
	And Navigate to Contact Activities
	And Navigate to new Customer Page
	Then Create customer with profile type external and verify
	
@TCID106 @TCIDSanity @TCIDConatctManagement
Scenario: Create customer with profile type Internal RTA staff

	When Close Initial Popups
	And Navigate to Contact Activities
	And Navigate to new Customer Page
	Then Create customer with profile type Internal RTA staff and verify
	
@TCID107 @TCIDSanity @TCIDConatctManagement
Scenario: Create customer with profile type Dubai Taxi Staff

	When Close Initial Popups
	And Navigate to Contact Activities
	And Navigate to new Customer Page
	Then Create customer with profile type Dubai Taxi Staff and verify	
	
@TCID108 @TCIDSanity @TCIDConatctManagement
Scenario: Create customer with profile type Drivers

	When Close Initial Popups
	And Navigate to Contact Activities
	And Navigate to new Customer Page
	Then Create customer with profile type Drivers	
	
@TCID109 @TCIDSanity @TCIDConatctManagement
Scenario: Create customer with profile type RTA patnership

	When Close Initial Popups
	And Navigate to Contact Activities
	And Navigate to new Customer Page
	Then Create customer with profile type RTA patnership
	
@TCID110 @TCIDSanity @TCIDConatctManagement
Scenario: Create customer with profile type RTA Vendor Staff

	When Close Initial Popups
	And Navigate to Contact Activities
	And Navigate to new Customer Page
	Then Create customer with profile type RTA Vendor Staff
	
@TCID111 @TCIDSanity @TCIDConatctManagement
Scenario: Update customer with profile type any

	When Close Initial Popups
	And Navigate to Contact Activities
	Then Update customer with profile type any		
	
@TCID112 @TCIDSanity @TCIDConatctManagement @TCIDConatctManagement12
Scenario: Update customer with profile type External Customer

	When Close Initial Popups
	And Navigate to Contact Activities
	And Navigate to new Customer Page
	And Create customer with profile type external and verify
	Then Update customer with profile type External Customer	
	
@TCID113 @TCIDSanity @TCIDConatctManagement @TCIDConatctManagement12
Scenario: Update customer with profile type RTA Patnership

	When Close Initial Popups
	And Navigate to Contact Activities
	And Navigate to new Customer Page
	And Create customer with profile type RTA patnership
	Then Update customer with profile type RTA Patnership	
	
@TCID114 @TCIDSanity @TCIDConatctManagement @TCIDConatctManagement12
Scenario: Update customer with profile type RTA Vendor Staff

	When Close Initial Popups
	And Navigate to Contact Activities
	And Navigate to new Customer Page
	And Create customer with profile type RTA Vendor Staff
	Then Update customer with profile type RTA Vendor Staff
	
@TCID115 @TCIDSanity @TCIDConatctManagement @TCIDConatctManagement12
Scenario: Update customer with profile type Internal RTA Staff

	When Close Initial Popups
	And Navigate to Contact Activities
	And Navigate to new Customer Page
	And Create customer with profile type Internal RTA staff and verify
	Then Update customer with profile type Internal RTA Staff	
	
@TCID116 @TCIDSanity @TCIDConatctManagement @TCIDConatctManagement12
Scenario: Update customer with profile type Drivers

	When Close Initial Popups
	And Navigate to Contact Activities
	And Navigate to new Customer Page
	And Create customer with profile type Drivers
	Then Update customer with profile type Drivers	
	
@TCID161 @TCIDSanity @TCIDConatctManagement @TCIDConatctManagement12
Scenario: Update customer with profile type Dubai Taxi

	When Close Initial Popups
	And Navigate to Contact Activities
	And Navigate to new Customer Page
	And Create customer with profile type Dubai Taxi Staff and verify
	Then Update customer with profile type Dubai Taxi	
	
	
	
	

	
	
	
	
	
	
	
	