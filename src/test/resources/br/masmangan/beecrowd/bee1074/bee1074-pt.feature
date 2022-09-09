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
Feature: Bee1074 CLI

  Narrative:

  I don't know why
  But numbers keep appearing
  Everywhere i go

  Scenario: Run program with input

    Given input is
"""
4
-5
0
3
-4
"""
    When program runs
    Then output should be
"""
ODD NEGATIVE
NULL
ODD POSITIVE
EVEN NEGATIVE

"""

  Scenario: Run program with input

    Given input is
"""
4
0
0
7
8
"""
    When program runs
    Then output should be
"""
NULL
NULL
ODD POSITIVE
EVEN POSITIVE

"""

  Scenario: Run program with input

    Given input is
"""
4
5
6
-7
8
"""
    When program runs
    Then output should be
"""
ODD POSITIVE
EVEN POSITIVE
ODD NEGATIVE
EVEN POSITIVE

"""