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
Feature: Bee1060 CLI

  Narrative:

    In order to verify the amount of positive numbers
    inserted at the beginning of the program, we create this program
    to check how many positive numbers there are in the inserted list.

  Scenario: Run program with input 6, 1, -1, 19, 9, 5 (pos, pos)

    Given The input is
"""
7
-5
6
-3.4
4.6
12
"""
    When Program runs
    Then The output should be
"""
4 valores positivos

"""