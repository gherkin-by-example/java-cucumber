@system
Feature: Bee1017 CLI

  Narrative:

  In order to avoid running out of fuel
  As a driver
  I want to be told the how much fuel I will need for a trip

  Scenario: Run program with input

    Given input is
"""
10
85
"""
    When program runs
    Then output should be
"""
FUEL = 70.833

"""

  Scenario: Run program with input

    Given input is
"""
2
92
"""
    When program runs
    Then output should be
"""
FUEL = 15.333

"""

  Scenario: Run program with input

    Given input is
"""
22
67
"""
    When program runs
    Then output should be
"""
FUEL = 122.833

"""