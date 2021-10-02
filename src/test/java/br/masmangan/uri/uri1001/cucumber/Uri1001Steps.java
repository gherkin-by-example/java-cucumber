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
package br.masmangan.uri.uri1001.cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.charset.Charset;

public class Uri1001Steps {

	String input;
	private String actual;

	@Given("the input is")
	public void the_input_is(String input) {
		this.input = input;
	}

	@When("the program runs")
	public void the_program_runs() throws IOException {

		InputStream inputStream = new ByteArrayInputStream(input.getBytes(Charset.forName("UTF-8")));

		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream outputStream = new PrintStream(baos);

		PrintStream previousOut = System.out;
		InputStream previousIn = System.in;

		System.setIn(inputStream);
		System.setOut(outputStream);

		Main.main(null);

		actual = baos.toString();

		// assertEquals(expected, actual);

		inputStream.close();
		outputStream.close();

		System.setOut(previousOut);
		System.setIn(previousIn);
	}

	@Then("the output should be")
	public void the_output_should_be(String expected) {
		assertEquals(expected, actual);
	}

}
