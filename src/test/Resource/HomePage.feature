Feature: Homepage features

  @smoke
  Scenario: Search for products
    Given user is on the home page to search for the product
    When user type 'nike' to search for product
    Then user should able to see all the nike products