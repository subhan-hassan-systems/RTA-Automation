#Author: Muhammad Waqar Tufail
Feature: IDEAManagementSystem

  @TCIDIMS01 @CreateCampaign @SubmitIDEA @ApproveIDEA @IDEAConvertToCase

  Scenario: Create Compaign

    When I am on the RTA home page
    When Close Initial Popups
    And  Navigate to Compaigns
    And  Create New Compaign
    Then Verify Campaign Created Successgully
    And Publish the Campaign
    And I am on the EPQ Portal home page
    And Open Published Campaign
    And Submit Idea
    Then Verify the Idea Submitted Successfully
    When I am on the RTA home page
    When Close Initial Popups
    And  Open the Submitted Compaigns
    And Open the Submitted Idea
    Then Approve the Submitted Idea
    And Convert To Case

  @TCIDSample
  Scenario: Verification of Reset button
    Given Open the Firefox and launch the application
    When Enter the Username and Password
    Then Reset the credential