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
package br.masmangan.beecrowd.bee1001;

import br.masmangan.beecrowd.bee1001.Main;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class Bee1001Steps {

	private String input;
	private String actual;

	@Given("input is")
	public void input_is(String input) {
		this.input = input;
	}

	@When("program runs")
	public void program_runs() throws IOException {

		InputStream inputStream = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));

		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		PrintStream outputStream = new PrintStream(byteArrayOutputStream);

		PrintStream previousOut = System.out;
		InputStream previousIn = System.in;

		System.setIn(inputStream);
		System.setOut(outputStream);

		Main.main(null);

		actual = byteArrayOutputStream.toString();

		inputStream.close();
		outputStream.close();

		System.setOut(previousOut);
		System.setIn(previousIn);
	}

	@Then("output should be")
	public void output_should_be(String expected) {
		assertEquals(expected, actual);
	}

}
