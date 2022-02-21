Feature: Data Table practice

  Scenario: Order Kimchi from Arigato
    Given user is on NambaFood
    When user click on Foods
    Then user should see "250 best cafe"
    And user should find category
    When user click on Sushi
    Then user should see List of cafe
    And user should scroll dawn the page to Arigato cafe
    When useer click on Arigato
    Then user should see Arigato menu
    And user should see find Kimchi
    When user increase Kimchi amount to 3
    And user should click on Order button
    Then on the card User should see "450S"

    Scenario: Verify following tabs are displayed in Amazon
      Given user is on https://www.amazon.com/
      Then following menu bar should be displayed on Home page
      |  All  |  Today's Deal  |  Customer Service  |  Registry  |  Gift Cards  |  Sell  |


      Scenario: Cars model
        Given user is on car.kg
        Then following cars should be displayed
        |  BMW  |  Toyota  |  Lexus  |  Mers  |
        |  525  |  camry   |  ES     |  e500  |