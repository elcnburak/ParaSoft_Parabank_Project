Feature: Login
  Scenario: Login with valid user information
    Given Navigate to ParaBank
    And The user sees the "Customer Login" section on the home page.

    And write username and password as DataTable
      |AHMET   |
      |Ahmet123|

    Then User should login successfully




