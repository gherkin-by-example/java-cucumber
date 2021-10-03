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
package br.masmangan.uri.uri1000.cucumber;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Uri1000Steps {

	private String actual;

	@When("the program runs")
	public void the_program_runs() throws IOException {

		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream outputStream = new PrintStream(baos);

		PrintStream previousOut = System.out;

		System.setOut(outputStream);

		Main.main(null);

		actual = baos.toString();

		outputStream.close();

		System.setOut(previousOut);
	}

	@Then("the output should be")
	public void the_output_should_be(String expected) {
		assertEquals(expected, actual);
	}

}
