@VerifyPasswordCases
Feature:  Login Functionality

  Background:
    Given Navigate to the Website
    Then Enter username and password and click login button
    And Click on the element in LeftNav
      | Admin |
    Then Click on the element in Dialog
      | UserManagment |
      | addButton     |

@Regression @Smoke
  Scenario Outline: As an Admin user I should be able to see notification messages displayed, when I enter a value in to the Password field
  which doesn’t have lower case character.
    When User sending the keys in Dialog Content
      | userPassword | <password> |
    Then Notification messages “... password must contain minimum 1 lower-case letter ... ” should be displayed.
    Examples:
      | password     |
      | <DEMOCODE*9> |