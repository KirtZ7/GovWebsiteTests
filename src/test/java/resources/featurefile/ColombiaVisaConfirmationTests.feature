@regression
Feature: UK Visa Check Tests
  As a user of the website i want to be able to check if i need a Visa to visit the UK

@smoke
Scenario: a Columbian National Coming To The UK To Join A Partner For A Long Stay They Do Have An Article 10Or20 Card
Given I am on the start page
When I click on the accept cookies button
And I press on the start now button
And I choose Colombia as my country
And I press on the continue button
And I choose reason for my visit as join partner
And I press on the continue button
Then i confirm the results of my choices as an colombian