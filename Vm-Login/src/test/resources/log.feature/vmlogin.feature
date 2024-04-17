Feature: Verify the login functionality of VM Maps Account

  Scenario: Login User with valid details
    Given User is on VM Maps acoount Sign In page
    When User Enters valid Email Address and Password
    And Click Login button
    Then user is on Dashboard page

  Scenario: Login User with invalid details
    Given User is on VM Maps acoount Sign In page
    When User Enters valid Email Address and invalid Password
    And Click Login button
    Then User Should see the Invalid parameter message

  Scenario: Login User with invalid details
    Given User is on VM Maps acoount Sign In page
    When User Enters invalid Email Address and valid Password
    And Click Login button
    Then User Should see the Invalid Email message

  Scenario: Login User with invalid details
    Given User is on VM Maps acoount Sign In page
    When User does not Enters Email Address and Password click login button straight
    Then User Should see the Please fill out this feild message