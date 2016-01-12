Feature: Driving the Design of our Vending Machine
  As a super excited software developer
  I want to drive my design through acceptance tests
  So that I push domain concepts into the code and therefore get a good API

  Scenario: Throw out can when some button pressed
    Given a filled vending machine
    When I press some button
    Then a can is thrown out