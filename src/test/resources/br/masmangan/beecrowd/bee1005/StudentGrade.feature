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
Feature: Calculator

Narrative:

In order to avoid silly mistakes
As a math novice
I want to be told the average of two numbers

Scenario Outline: calculate average of two numbers

Given first number is <a>
And second number is <b>
When average is calculated
Then result should be <aaverage>

Examples:
|  a |  b |  aaverage |
| 5.0 |  7.1 | 6.43182 |
|-0.0 |  7.1 | 4.84091 |
| 10.0 | 10.0 |  10.00000 |
