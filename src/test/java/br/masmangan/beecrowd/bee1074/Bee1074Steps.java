package br.masmangan.beecrowd.bee1074;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class Bee1074Steps {
    private String actual;

    @When("Program Runs")
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

    @Then("The output should be")
    public void output_should_be(String expected) {
        assertEquals(expected, actual);
    }
}