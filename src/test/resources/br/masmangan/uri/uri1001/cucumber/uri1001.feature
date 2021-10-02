@system
Feature: URI1001 CLI

Narrative:

In order to avoid silly mistakes
As a math novice
I want to be told the sum of two numbers

Scenario: Run program with 10 and 9 (pos,pos)

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

Scenario: Run program with -10 and 4 (neg,pos)

Given the input is
"""
-10
4
"""
When the program runs
Then the output should be
"""
X = -6

"""

Scenario: Run program with 15 and -7 (pos,neg)

Given the input is
"""
15
-7
"""
When the program runs
Then the output should be
"""
X = 8

"""