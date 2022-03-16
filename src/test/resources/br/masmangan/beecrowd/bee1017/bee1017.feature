Feature: How many fuel

    I need to know how many fuel is left

    Scenario Outline: Guess how many fuel given speed and time
        Given I'll travel in "<time>" hours at "<speed>" km/h
        When I go to the gas station
        Then I'll need "<liters>" liters of gas 

    Examples:
        | time | speed | liters  |
        | 10   | 85    | 70,833  |
        | 2    | 92    | 15,333  |
        | 22   | 67    | 122,833 |
