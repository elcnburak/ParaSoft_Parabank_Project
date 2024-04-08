Feature: Loan Application
  Scenario: Request credit
    Given User should login on Parabank home page
    Then user click on "Request Loan" link
    And user enters "2000" dollars in the "loan amount" field
    And user enters "400" dollars in "Down Payment" field
    And user selects an account number in the "from account #"
    And user clicks on the "Apply now" button

    And user confirms the following information:


    When User clicks on the link of the newly created credit account number
    And the user confirms the following infomation:


    Then user "No Transaction Found" confirms the message
