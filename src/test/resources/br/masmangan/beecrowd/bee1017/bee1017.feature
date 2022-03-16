@system
Feature: Bee1017 CLI

  Narrative:

  I want to know how many liters I need based on travel time and average velocity

  Scenario: Run program with input

    Given input is
"""
10
85
"""
    When program runs
    Then output should be
"""
70,833

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
15,333

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
122,833

"""