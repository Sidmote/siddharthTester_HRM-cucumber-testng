@SavingMandatoryFieldsWithoutFilling
Feature:Mandatory Fields Functionality

@Regression @Smoke
  Scenario: Saving mandatory fields without filling them in
    Given Navigate to OrangeHRM
    When Enter username and password and click login button
    And Click to admin and click to add button
    And Click save button
    Then Notification messages should be displayed red color