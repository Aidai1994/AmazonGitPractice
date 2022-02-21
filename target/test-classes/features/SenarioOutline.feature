Feature: Scenario: outline demo


  Scenario Outline:
    Given user is on Facebook
    When user enters "<email>"
    And user enter "<password>"
    And user click on login button
    Then user should see "<message>"
    Examples:
      |  email        |  password  |  message  |
      | nurs@gmail.com| qwerty123  | Successful|
      | adik@mail.com | Hello312   | Successful|
