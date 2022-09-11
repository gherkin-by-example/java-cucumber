Feature: Bee1060
    Scenario: Program Runs
        Given The input is
        """
        1
        2
        3
        4
        5
        6
        """
        When Program Runs
        Then The output should be
        """
        The list have 6 positive numbers.

        """
       