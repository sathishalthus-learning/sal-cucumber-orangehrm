
@login
Feature: Title of your feature
  I want to use this template for my feature file

  @validLogin
  Scenario: Login with valid credentials
    Given navigated to login page
    When provides valid credentials "Admin" and "admin123"
    Then verify "Dashboard" is displayed

