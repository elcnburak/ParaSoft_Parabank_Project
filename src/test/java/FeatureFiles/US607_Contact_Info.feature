Feature: Verification of Money Transfer Between My Accounts and Detailed Search

Background:
Given user visits the parabank website.
And the user has logged in.
And the user has at least two accounts.

Scenario: Verification of the transfer and detailed search
After the user transfer process is completed, the user records the transaction identity.
And user click on the "Find Transactions" link.
And the user enters the process identity recorded in the "Find by Transaction ID" field.
And click the "Find Transctions" button.
Then confirms that the user transfer is verified and the quantity is correct.