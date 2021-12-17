package br.masmangan.beecrowd.bee1006;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class StudentGradeSteps {
    public static final double DELTA = 0.0001;

    private final StudentGrade equation = new StudentGrade();
    private double actual;

    @Given("first number is {double}")
    public void first_number_is(Double a) {
        equation.setA(a);
    }
    @Given("second number is {double}")
    public void second_number_is(Double b) {
        equation.setB(b);
    }
    @Given("third number is {double}")
    public void third_number_is(Double c) {
        equation.setC(c);
    }
    @When("average is calculated")
    public void average_is_calculated() {
        actual = equation.getAverage();
    }
    @Then("result should be {double}")
    public void result_should_be(Double expected) {
        assertEquals(expected, actual, DELTA);
    }
}
