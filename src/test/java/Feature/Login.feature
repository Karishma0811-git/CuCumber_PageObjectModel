Feature: Test Login Functionality

  Scenario Outline: Check login is successful with valid credentials
    Given Browser is open
    And User is on login page
    When User enters <username> and <password>
    And User click on login button
    Then User is navigate to the homepage

    Examples:
      | username                | password     |
      | standard_user           | secret_sauce |
      | performance_glitch_user | secret_sauce |