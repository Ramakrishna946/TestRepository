Feature: Search feature

  Scenario: Search for a product
    Given User is on the Home Page
    When User searches for "laptop"
    Then Product results for "laptop" are shown
