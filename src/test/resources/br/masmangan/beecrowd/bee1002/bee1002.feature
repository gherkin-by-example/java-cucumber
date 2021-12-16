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
Feature: Bee1002 CLI

Narrative:

In order to avoid silly mistakes
As a math novice
I want to be told the area of a circle

Scenario: Run program with input 2.00

Given input is
"""
2.00
"""
When program runs
Then output should be
"""
A=12.5664

"""

Scenario: Run program with input 100.64

Given input is
"""
100.64
"""
When program runs
Then output should be
"""
A=31819.3103

"""

Scenario: Run program with input 150.00

Given input is
"""
150.00
"""
When program runs
Then output should be
"""
A=70685.7750

"""