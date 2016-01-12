Feature: Driving the Design of our Vending Machine
  As a super excited software developer
  I want to drive my design through acceptance tests
  So that I push domain concepts into the code and therefore get a good API

  Scenario: Filled machine delivers can
    Given a filled vending machine
    When I press the "Coke" button
    Then a "Coke" can appears in the compartment

  Scenario: Empty machine delivers nothing
    Given an empty vending machine
    When I press the "Coke" button
    Then no can appears in the compartment

  Scenario: Machine delivers nothing when drawer empty
    Given a filled vending machine
    And it ran out of "Coke"
    When I press the "Coke" button
    Then no can appears in the compartment

  Scenario: Clearing the compartment
    Given a filled vending machine
    When I press the "Coke" button
    And I clear the compartment
    Then no can appears in the compartment