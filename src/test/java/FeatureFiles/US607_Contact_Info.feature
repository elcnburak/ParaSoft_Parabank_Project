Feature: Verification of Money Transfer Between My Accounts and Detailed Search
  Background:
    Given User should login on Parabank home page

  Scenario Outline: I want to update my contact information as a user
    And user update Contact Info link and referred to the profile page
  | Name | Surname | Address | City | State | Postal Code | Phone Number |
  | <Name> | <Surname> | <Address> | <City> | <State> | <Postal Code> | <Phone Number> |
  And Click the "Update Profile" button for the user update process
  And Their confirms that the updated contact information is displayed correctly when the user signs.
    Examples:
      | Name | Surname | Address | City | State | Postal Code | Phone Number |
      | John | Doe | 123 Main St | New York | NY | 10001 | 5551234567 |
