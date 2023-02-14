@regression
Feature: UK Visa Check Tests
  As a user of the website i want to be able to check if i need a Visa to visit the UK

  @smoke
  Scenario: a Chilean Coming To The UK For Work And Plans On Staying For Longer Than Six Months
    Given I am on the start page
    When I click on the accept cookies button
    And I press on the start now button
    And I choose Chile as my country
    And I press on the continue button
    And I choose the reason for my visit as Work
    And I press on the continue button
    And I select to stay for six months or more
    And I press on the continue button
    And I select my job type as health care
    And I press on the continue button
    Then I confirm the results of my choices as a chiliean