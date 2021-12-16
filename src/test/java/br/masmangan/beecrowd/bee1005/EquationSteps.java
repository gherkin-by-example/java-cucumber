package br.masmangan.beecrowd.bee1005;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class EquationSteps {
    public static final double DELTA = 0.0001;

    private final Equation equation = new Equation();
    private double actual;

    @Given("first number is {double}")
    public void first_number_is(Double a) {
        equation.setA(a);
    }
    @Given("second number is {double}")
    public void second_number_is(Double b) {
        equation.setB(b);
    }
    @When("mean is calculated")
    public void mean_is_calculated() {
        actual = equation.getAverage();
    }
    @Then("result should be {double}")
    public void result_should_be(Double expected) {
        assertEquals(expected, actual, DELTA);
    }
}
