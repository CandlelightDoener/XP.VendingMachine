Feature: Examples which show how to use Cucumber
  As a trainer
  I want to have a set of minimal features
  So that developers see how to write Acceptance Tests in Cucumber

  Scenario: Marked Dice always shows 6
    Given a marked dice
    When I roll it
    Then it shows 6 dots