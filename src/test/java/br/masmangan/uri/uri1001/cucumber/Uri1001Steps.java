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
