@regression
  Feature: UK Visa Check Tests
    As a user of the website i want to be able to check if i need a Visa to visit the UK

  @smoke
  Scenario: an Australian Coming To UK For Tourism
    Given I am on the start page
    When I click on the accept cookies button
    And I press on the start now button
    And I choose Australia as my country
    And I press on the continue button
    And I choose the reason for my visit as tourism
    And I press on the continue button
    Then I confirm the results of my choices as an australian

