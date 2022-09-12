#
# Copyright (C) 2021, Gherkin By Example and/or its contributors. All rights reserved.
# DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
#
# This software is free software: you can redistribute it and/or modify
# it under the terms of the GNU General Public License as published by
# the Free Software Foundation, either version 3 of the License, or
# (at your option) any later version.
#
# This code is distributed in the hope that it will be useful,
# but WITHOUT ANY WARRANTY; without even the implied warranty of
# MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
# GNU General Public License for more details.
#
# You should have received a copy of the GNU General Public License
# along with this code.  If not, see <https://www.gnu.org/licenses/>.
#
# Please visit Gherkin By Example at https://github.com/gherkin-by-example
# if you need additional information or have any questions.
@system
Feature: Bee1065 CLI

  Narrative:

  In order to solve the BeeCrowd problem
  As a student
  I want to enter five values and know how many of these values are even.

  Scenario: Run program with input

    Given input is
"""
13
14
15
16
17
"""
    When program runs
    Then output should be
"""
2 valores pares

"""

  Scenario: Run program with input

    Given input is
"""
0
0
7
8
4
"""
    When program runs
    Then output should be
"""
4 valores pares

"""

  Scenario: Run program with input

    Given input is
"""
4
6
8
10
12
"""
    When program runs
    Then output should be
"""
5 valores pares

"""