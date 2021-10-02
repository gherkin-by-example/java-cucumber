Feature: URI1001 CLI

Narrative:

In order to avoid silly mistakes
As a math novice
I want to be told the sum of two numbers

Scenario Outline: Run program

Given the input is
"""
10
9
"""
When the program runs
Then the output should be
"""
X = 19

"""
