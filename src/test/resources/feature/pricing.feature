@sleek
Feature: Sleek Test Cases

  @sleek1
  Scenario: Clicking the Pricing link from the Header menu navigates user to the Pricing page
    Given I went to the Sleek SG "Home" page
    When I click on the "Pricing" link
    Then I should be navigated to the Sleek SG "Pricing" page


#  Scenario Outline: Correct corporate secretary details should display after updating accounting progress line
#    Given I am on the Sleek SG "Pricing" page
#  When
#  And
#    Then Verify corporate secretary details are correct: "<noShareholders>" "<pricePerYear>"
#
#    Examples:
#      | noShareholders     | pricePerYear |
#      | 2 Shareholders     | S$360/year   |
#      | 6 - 9 Shareholders | S$540/year   |
#      | > 30 Shareholders  | S$1,140/year |