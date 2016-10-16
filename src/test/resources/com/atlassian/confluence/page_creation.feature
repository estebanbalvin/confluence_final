@confluence
Feature: Create a new confluence page
  As a Atlassian user
  I want to be able to create new confluence pages
  So that my information is published in my space

  Background: A confluence user is logged in
    Given I am logged in Atlassian cloud

  Scenario: New confluence page
    When I click on the button create page
    And I set a unique page title
    And I type some text on the body
    And I click on the button publish
    Then The page is created sucessfully

 