Feature:

  Background:
    Given User should login on Parabank home page

  Scenario: Money transfer test between my accounts
    And the user selects a sender account and receiver account.
    And the user enters a amount of transfer.
    And user click on the "transfer" button.
   Then confirms that the user has successfully completed the transfer process.



