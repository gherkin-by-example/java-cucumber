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
@domain
Feature: Consumption

Narrative:

In order to know the consumption of a car
As a math novice
I want to be told the consumption based on fuel size and the distance reached

Scenario Outline: calculate consumption based on fuel size and distance reached

Given fuel size is <fuel> 
And distance is <distance>
When Consumption is calculated
Then result should be <consumption>

Examples:
|  fuel | distance |   consumption |
| 35 |  500 | 14.286 |
| 464.6 | 4554 | 9.802 |
| 45 |  500 | 11.111 |