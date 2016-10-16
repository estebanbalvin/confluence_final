@confluence
Feature: Set  Restrictions on an existing confluence page.
  As a Atlassian user
  I want to be able to manage restrictions per user.
  So that I have control of what is published in my space.

  Background: A confluence user is logged in
    Given I am logged in Atlassian cloud

  Scenario: Set restriction to "only edit"
    Given a page exists
    When I open the options for the page
    And I set the restriction to only edit
    Then The restriction is applied to the page



  Scenario Outline: Set restriction "Viewing and editing restricted" to certain users
    Given a page exists
    When I open the options for the page
    And I set the restriction to Viewing and editing restricted
    And I type the user "<user>"
    And I select the permission to "<permission>"
    Then The restriction is applied to the page
   
    Examples: 
      | user  | permission |          
      | Aleja | view       | 
      | Blair | edit       |

