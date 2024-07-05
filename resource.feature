Feature: BookingTicket
  Scenario: contains each and every step for how to book a tickect

    Given I am on the spicejet homepage
    When I enter origin
    When I enter the destination
    When I select the depature date
    When I select the return date
    When I select the number of passengers
    When I select the currency
    Then I click on the search flight button