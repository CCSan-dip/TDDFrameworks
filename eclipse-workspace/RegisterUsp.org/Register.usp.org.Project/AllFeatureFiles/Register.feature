@EndtoEnd
Feature: Register.usp.org Application

  @Regression @Smoke
  Scenario: Test create account basic details functionality
    Given user is on create account page
    When user enter "Sandip", "Chole" and select "Male"
    When user enter "<email>", "<password>" and ,"<confirm password>"

  @Smoke @Integration
  Scenario: Test company information functionality
    When user enter company "<name>", "<job title>", "<street address>", "<city>", "<state>"
    When user select country from "INDIA" dropdown
    And user enter "<postal zipcode>" and "<phone number>"

  @System @Smoke @Sanity
  Scenario: Test company information role and industry functionality
    And user select "<role>" from dropdown
    And user select "<industry>" from dropdown
    And user enter "<subscription key>"
