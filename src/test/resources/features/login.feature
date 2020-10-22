 #bu hepsini calistiriyor
Feature: Users should be able to login

  Scenario: Login as a driver
    Given the user is on the login page
    When  the user enters the driver information
    Then the user should be able to login


    Scenario: Login as a sales maanger
      Given the user is on the login page
      When the user enters the sales manager information
      Then the user should be able to login

      Scenario: Login as a store manager
        Given the user is on the login page
        When the user enters the store manager information
        Then the user should be able to login

#bu usteki 3 seneryo yerine alttakini yazdik:
  @wip
  Scenario: Login as a user type
    Given the user is on the login page
    When the user login as "driver"
    Then the user should be able to login