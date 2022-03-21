@domain
Feature: FuelCalculator

Narrative:

  In order to avoid running out of fuel
  As a driver
  I want to be told the how much fuel I will need for a trip

Scenario Outline: calculate the fuel needed for a trip

  Given the spent time in the trip <a>
  And the average speed during the trip <b>
  And the car comsumption is 12.0
  When fuel needed is calculated
  Then result should be <fuelNeeded>

Examples:
|  a |  b | fuelNeeded |
| 10 | 85 | 70.833 |
| 2 | 92 | 15.333 |
| 22 | 67 | 122.833 |