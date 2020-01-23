#Author: Aamir Khan
Feature: Review Managment

  Background:
    Given I am on the RTA home page

  @TCID400 @TCIDReviewMangementCRM @Review
  Scenario: Review Management Pending PQ Engineer

    When Close Initial Popups
    And  Navigate to Reviews
    And  Navigate to PQ Engineer
    And  Click A PQ Engineer Review
    And Complete PQEnigeer Review
    Then Open New Tab

  @TCID411 @TCIDReviewMangementCRMRejection @Review
  Scenario: Review Management Pending PQ Engineer with Reject

    When Close Initial Popups
    And  Navigate to Reviews
    And  Navigate to PQ Engineer
    And  Click A PQ Engineer Review
    And Complete PQEnigeer Review Reject
    Then Open New Tab

  @TCID401 @TCIDReviewMangementCRM @Review
  Scenario: Review Management Pending Department Coordinator

    When Close Initial Popups
    And  Navigate to Reviews
    And  Navigate to Department Coordinator
    And  Click A Department Review
    And Complete Department Review
    And Close Review
#    Then Open New Tab

#  @TCID402 @TCIDReviewMangementCRM @Review
#  Scenario: Review Management Pending Department Director
#
#    When Close Initial Popups
#    And  Navigate to Reviews
#    And  Navigate to Department Director
#    And  Click A Department Review
#    And  Complete Department Review
#    Then Open New Tab

  @TCID403 @TCIDReviewMangementCRM @Review
  Scenario: Review Management Pending Legal Representative

    When Close Initial Popups
    And  Navigate to Reviews
    And  Navigate to Legal Review
    And  Click A Record
    And Complete Legal Review
    Then Open New Tab

  @TCID404 @TCIDReviewMangementCRM @Review
  Scenario: Review Management Pending Financial Representative

    When Close Initial Popups
    And  Navigate to Reviews
    And  Navigate to Financial Review
    And  Click A Record
    And Complete Financial Review
    Then Open New Tab

  @TCID405 @TCIDReviewMangementCRM @Review
  Scenario: Review Management Pending HSE Coordinator

    When Close Initial Popups
    And  Navigate to Reviews
    And  Navigate to HSE Coordinator Review
    And  Click A Record
    And Complete HSE Coodinator Review
    Then Open New Tab

  @TCID406 @TCIDReviewMangementCRM @Review
  Scenario: Review Management Pending Green Procurement

    When Close Initial Popups
    And  Navigate to Reviews
    And  Navigate to Green Procurement Review
    And  Click A Record
    And Complete Green Procurement Review
    Then Open New Tab

  @TCID407 @TCIDReviewMangementCRM @Review
  Scenario: Review Management Pending PQ Committee Head

    When Close Initial Popups
    And  Navigate to Reviews
    And  Navigate to PQ Committee Review
    And  Click A PQ committee prequalification review
    And Complete PQ committee prequalification review
    And  Close Review
    Then Open New Tab


  @TCID408 @TCIDReviewMangementCRM @Review
  Scenario: Review Management Pending Procurement Director Review
  #CP Director Review
    When Close Initial Popups
    And  Navigate to Reviews
    And  Navigate to Procurement Director Review
    And  Click CP Director Prequalification Review
    Then Complete CP Director Prequalification Review
    And  Close Review
    Then Open New Tab

  @TCID410 @EndToEndFlow-ReviewManagement
  Scenario: End-to-end flow of review management
    When Close Initial Popups
    And  Navigate to Reviews
    And  Navigate to PQ Engineer
    And  Click A PQ Engineer Review
    And Complete PQEnigeer Review
    And Close Review
    And  Navigate to Department Coordinator
    And  Click A Department Review
    And Complete Department Review
    And Close Review
    And  Navigate to Legal Review
    And  Click A Record
    And Complete Legal Review
    And Close Review
    And  Navigate to Financial Review
    And  Click A Record
    And Complete Financial Review
    And Close Review
    And  Navigate to HSE Coordinator Review
    And  Click A Record
    And Complete HSE Coodinator Review
    And Close Review
    And  Navigate to Green Procurement Review
    And  Click A Record
    And Complete Green Procurement Review
    And Close Review
    And  Navigate to PQ Committee Review
    And  Click A PQ committee prequalification review
    And Complete PQ committee prequalification review
    And  Close Review
    And  Navigate to Procurement Director Review
    And  Click CP Director Prequalification Review
    Then Complete CP Director Prequalification Review
    And  Close Review
