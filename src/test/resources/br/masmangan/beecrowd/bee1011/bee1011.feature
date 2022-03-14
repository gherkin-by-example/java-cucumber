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
Feature: Bee1011 CLI

  Narrative
  
  In order to know the volume of a sphere
  As a math novice
  I want to be told the volume of a sphere giving only it's radius

  Scenario: Input 3
    Given input is
"""
3
"""
    When program runs
    Then output should be
"""
VOLUME = 113.097

"""

  Scenario: Input 15
    Given input is 
"""
15
"""
    When program runs
    Then output should be
"""
VOLUME = 14137.155

"""

  Scenario: Input 1523
    Given input is
"""
1523
"""
    When program runs
    Then output should be
"""
VOLUME = 14797486501.627

"""
