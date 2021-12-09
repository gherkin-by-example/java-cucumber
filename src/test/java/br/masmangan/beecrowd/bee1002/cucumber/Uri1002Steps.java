package br.masmangan.beecrowd.uri1002.cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.*;
import java.nio.charset.Charset;

import static org.junit.Assert.assertEquals;

public class Uri1002Steps {

    private String input;
    private String actual;

    @Given("input is")
    public void input_is(String input) {
        this.input = input;
    }

    @When("program runs")
    public void program_runs() throws IOException  {
        InputStream inputStream = new ByteArrayInputStream(input.getBytes(Charset.forName("UTF-8")));

        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        PrintStream outputStream = new PrintStream(baos);

        PrintStream previousOut = System.out;
        InputStream previousIn = System.in;

        System.setIn(inputStream);
        System.setOut(outputStream);

        Main.main(null);

        actual = baos.toString();

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
