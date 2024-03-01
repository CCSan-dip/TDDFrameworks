Feature: Test Guru99 Application

  #Example:
  Scenario: Validate the Register Page Functionality
    Given user is on register page
    When user enter valid firstname, lastname, phone and email
    And user enter valid address, city, state,postol code and select country
    And user enter valid username, password, confirm password and click on submit button
    Then user is on register success page and validate success page url

	#Scenario
  Example: validate Login Page Functionality
    When user click on sign up link
    And user enter valid username , password and click on Submit button
    Then user is on login successfully page and validate url
    And user validate successfully keyword in login Success page
