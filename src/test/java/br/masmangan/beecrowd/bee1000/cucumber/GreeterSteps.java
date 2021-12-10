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
package br.masmangan.beecrowd.bee1000.cucumber;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GreeterSteps {
	private Greeter g = new Greeter();
	private String actual;

	@When("greeting is done")
	public void greeting_is_done() {
		actual = g.sayHello();
	}

	@Then("greeting should be {string}")
	public void greeting_should_be(String expected) {
		assertEquals(expected, actual);
	}
}
