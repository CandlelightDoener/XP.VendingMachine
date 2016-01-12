Feature: Driving the Design of our Vending Machine
  As a super excited software developer
  I want to drive my design through acceptance tests
  So that I push domain concepts into the code and therefore get a good API

  Scenario: Filled machine delivers can
    Given a filled vending machine
    When I press the "Coke" button
    Then a "Coke" is in the compartment

  Scenario: Empty machine delivers nothing
    Given an empty vending machine
    When I press the "Coke" button
    Then no can is in the compartment

  Scenario: Clearing the compartment
    Given a filled vending machine
    When I press the "Coke" button
    And I clear the compartment
    Then no can is in the compartment

  Scenario: Compartment can hold more cans
    Given a filled vending machine
    When I press the "Coke" button
    And I press the "Fanta" button
    Then a "Coke" is in the compartment
    And a "Fanta" is in the compartment

  Scenario: Cans in machine get reduced
    Given an empty vending machine
    And 2 cans of "Coke"
    # the following line might hurt us later when it's about paying...but we'll see later
    When I press the "Coke" button
    Then there is 1 cans of "Coke" left