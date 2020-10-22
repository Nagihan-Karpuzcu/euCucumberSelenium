
Feature: Users should be able to login
  @wip
  Scenario: Login as a different user type

    Given the user is on the login page
    When the user login as described "usertype"
    Then the user should be able to login
