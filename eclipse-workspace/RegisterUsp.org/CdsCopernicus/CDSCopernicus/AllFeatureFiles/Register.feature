Feature: CDS Climate Copernicus Application

  Scenario: Test  cases for Create Registeration Functionality
    Given user is on the cds create account page
    When user enter "<email>", "<firstname>" and "<surname>"

  Scenario: Test case for Country Dropdown
    When user select "country" from drop down
    When user select sector from drop down
      | Sector7 |

  Scenario: Test cases for check boxes and organization
    And user click on organization check box
    When user enter "organization" name in text box
    And user click on data store and data protection check boxes
