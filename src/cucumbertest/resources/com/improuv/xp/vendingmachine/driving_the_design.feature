Feature: Driving the Design of our Vending Machine
  As a super excited software developer
  I want to drive my design through acceptance tests
  So that I push domain concepts into the code and therefore get a good API

  Scenario: Filled machine delivers can
    Given a filled vending machine
    When I press the "Coke" button
    Then a can appears in the compartment

  Scenario: Empty machine delivers nothing
    Given an empty vending machine
    When I press the "Coke" button
    Then no can appears in the compartment