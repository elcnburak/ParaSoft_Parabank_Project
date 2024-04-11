Feature: New Account Functionality

  Scenario: Create  the Open New Account
    Given Navigate to ParaBank
    When Enter username and password and click login button
    Then  User should login successfully
    And Click on the Element in LeftNav
      |OpenNewAccount|
    And Select the Element in the dropdown menu:
      |accountTypes|
      |accountNumbers|

    And Click on the Element in Dialog

    Then Success message should be displayed