@system
Feature: Bee1014 CLI

Narrative:

In order to avoid run out of gas
As a begginer truck driver
I want to be told the consumption of my truck based on the kilometers<km> it run nd the litters<l> I filled it

Scenario: Run program with input 500 and 35 (km,l)

Given input is
"""
500
35
"""
When program runs
Then output should be
"""
X = 14.286
"""

Scenario: Run program with input 4554 and 464.4 (km,l)

Given input is
"""
4554
464.6
"""
When program runs
Then output should be
"""
X = 9.802
"""

Scenario: Run program with input 500 and 45 (km,l)

Given input is
"""
500
45
"""
When program runs
Then output should be
"""
X = 11.111
"""