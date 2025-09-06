@VarifyPassword
Feature: Verify Password functionality

@Regression @Smoke
  Scenario: Invalid password login
  Given Navigate to the Website
    When Enter username and password and click login
	And Click to admin and click to add button
	And Click save button
	Then Notification messages should be displayed red color
	And Enter less characters than necessary and click the save button
	Then The message should have at least seven characters should be displayed in red.