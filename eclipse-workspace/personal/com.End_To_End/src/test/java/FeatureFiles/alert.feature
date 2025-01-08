Feature: Handle Alert Pop-Up

  Scenario: Validate Alert Pop-Up Functionality
    Given user should be on Homepage and validate Title
    When user click on Alert button
    Then Alert Pop-up should be display and user click on Ok button
    And user click on Confirm button
    Then Alert Pop-up should be display and user copy the Text
    And click on cancel button
    And user enter Text in TextBox as "Sagar Patil" and click on confirm button
    Then user copy the Physical Text and click on ok button
