Feature: Test Goibibo Search Flight

  Scenario: Validate Search Flight Functionality
    Given user should be on the HomePage
    When user click on one way Radio button
    Then user select city From Dropdown
    And user select city To Dropdown
    Then user select the date from Calender
    And user click on Search Flights button
