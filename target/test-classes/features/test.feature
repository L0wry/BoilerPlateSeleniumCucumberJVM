Feature: Page Navigation
      In order use the internet
      As a user
      I want to be able to navigate around a site

  Scenario: Verify a user is able to navigate to the about page
    Given I am on the homepage
    When I click on 'about'
    Then I am taken to the about page