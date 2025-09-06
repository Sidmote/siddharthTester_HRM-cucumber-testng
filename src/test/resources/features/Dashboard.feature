#Feature: HRM dashboard page
#
  #Background: User is logged to the HRM system
    #Given User logged in with email "admin_example" and password "123456"
#
  #@Regression @device_Window_11 @author_SidTester
  #Scenario Outline: Open menu
    #Given User navigate to dashboard
    #When User click "<menu>"
    #Then The user redirect to this page "<menu>"
    #Examples:
      #| menu     |
      #| Projects |
      #| Tasks    |
  
      
Feature: Dashboard

  Background:
    Given User is logged in

  @regression @dashboard
  Scenario: Verify dashboard widgets section is visible
    Then User should see "Dashboard" page
    