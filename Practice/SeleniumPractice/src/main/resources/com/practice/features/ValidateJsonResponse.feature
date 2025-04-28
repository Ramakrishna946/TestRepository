Feature: Validate JSON Response from API

  Scenario: Validate successful API response and specific JSON fields
    Given the API endpoint "https://jsonplaceholder.typicode.com/users/1" is available
    When I send a GET request to the API
    Then the response status code should be 200
    And the "name" field should be "Leanne Graham"
    And the "email" field should be "Sincere@april.biz"