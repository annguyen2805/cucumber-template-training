@login
Feature: Login Feature

  @login1
  Scenario: Login Successful
    Given I navigate to Login page
    When I input username with "annv" 123
    And I input password with "abc123"
    And I submit login
    Then I should be message login successfull
    And I should be homepage displayed

  @login2
  Scenario: Login unSuccessful
    Given I navigate to Login page
    When I input username with "annv" 123
    And I input password with "abc123"
    And I submit login
    Then I should be message login successfull
    And I should be homepage displayed


  @login3
  Scenario: Login unSuccessful with empty value
    Given I navigate to Login page
    When I input username with "annv" 123
    And I input password with "abc123"
    And I submit login
    Then I should be message login successfull
    And I should be homepage displayed