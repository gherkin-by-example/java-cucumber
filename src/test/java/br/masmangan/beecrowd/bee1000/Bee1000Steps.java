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
package br.masmangan.beecrowd.bee1000;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import br.masmangan.beecrowd.bee1000.Main;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Bee1000Steps {

	private String actual;

	@When("program runs")
	@When("o programa executar")
	public void program_runs() {

		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		PrintStream outputStream = new PrintStream(byteArrayOutputStream);

		PrintStream previousOut = System.out;

		System.setOut(outputStream);

		Main.main(null);

		actual = byteArrayOutputStream.toString();

		outputStream.close();

		System.setOut(previousOut);
	}

	@Then("output should be")
	@Then("a saída deve ser")
	public void output_should_be(String expected) {
		assertEquals(expected, actual);
	}

}
