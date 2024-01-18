Feature: NSE Registration Application

  Scenario: Test NSE Registration Functionality
    Given user is on nse register page
    When user enter "title", "firstname" and "lastname"
    When user enter "<email>", "<mobilenumber>" and "<userid>"

  Scenario: test hint question functionality
    And user enter hint question and hint answer
      | xyz | pqr |
    * user enter password and confirm password
      | pass | confirm psw |
