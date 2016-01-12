Feature: Selenium web browser tests

  Scenario: Looking for Nikon model
    Given I navigated to the "http://www.amazon.com" website
    When I search Nikon and click Go
    Then I sort the results from highest to lowest
    And select the second product and click for details
    Then check the product details contains Nikon D3X
    And Close the browser 