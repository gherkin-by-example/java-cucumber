/*
 * Copyright (C) 2021, Gherkin By Example and/or its contributors. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 * 
 * This software is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This code is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this code.  If not, see <https://www.gnu.org/licenses/>.
 *	
 * Please visit Gherkin By Example at https://github.com/gherkin-by-example 
 * if you need additional information or have any questions.
 */
package br.masmangan.beecrowd.bee1004;

import br.masmangan.beecrowd.bee1001.Calculator;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class CalculatorSteps {

	private final Calculator calc = new Calculator();
	private int actual;

	@Given("first number is {int}")
	public void givenTheFirstNumberIs(int a) {
		calc.setA(a);
	}

	@Given("second number is {int}")
	public void givenTheSecondNumberIs(int b) {
		calc.setB(b);
	}

	@When("two numbers are multiplied")
	public void whenTheTwoNumbersAreAdded() {
		actual = calc.getProduct();
	}

	@Then("result should be {int}")
	public void thenTheResultShouldBe(int expected) {
		assertEquals(expected, actual);
	}}
