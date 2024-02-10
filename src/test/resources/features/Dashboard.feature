@menu
Feature: Menu

  @menuTabs
  Scenario Outline: Verifying menu tabs
    Given logged into application "Admin" and "admin123"
    When select "<tabname>" from menu
    Then verify "<headername>" of app

    Examples: 
      | tabname   | headername |
      | Directory | Directory  |
      #| PIM       | PIM        |
