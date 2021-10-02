Feature: Calculator

Narrative:

In order to avoid silly mistakes
As a math novice
I want to be told the sum of two numbers

Scenario Outline: Add two numbers

Given the first number is <a>
And the second number is <b>
When the two numbers are added
Then the result should be <x>

Examples:
|  a |  b |  x |
| 10 |  9 | 19 |
|-10 |  4 | -6 |
| 15 | -7 |  8 |
