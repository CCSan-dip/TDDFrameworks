Feature: test Sauce Demo application

  Scenario: Validate Login Functionality
    Given user is on login page
    When user enter valid credentails
    Then user is on home page and validate home page title
    And validate home page URl

  Scenario: Validate Add to cart functionality
    When user click on Sauce Labs Backpack add to cart
    And user click on Sauce Labs Bolt T-Shirt add to cart
    And user click on cart button
    And user click on checkout button

  Scenario: validate user personal information
    When user is on your information page and user enter firstname, lastname and pincode and click on continue button

  Scenario: validate checkout complete functionality
    When user is on overview page and user click on finish button
    Then user validate complete order by using URL
    And user validate Thank you for your order! message.
