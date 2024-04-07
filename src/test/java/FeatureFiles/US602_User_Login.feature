Feature: Login
  Scenario: Login with valid user information
    Given Navigate to ParaBank
    And The user sees the "Customer Login" section on the home page.

    And write username and password as DataTable
      |Elcin   |
      |Elcin123|

    Then User should login successfully




