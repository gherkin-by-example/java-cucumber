package br.masmangan.beecrowd.bee1002.cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class CircleSteps {

    private Circle c = new Circle();
    private double actual;

    @Given("pi is {double}")
    public void pi_is(double pi) {
        assertEquals(pi, c.PI, 0.0001);
    }
    @Given("radius is {double}")
    public void radius_is(double radius) {
        c.setRadius(radius);
    }
    @When("area is calculated")
    public void area_is_calculated() {
        actual = c.getArea();
    }
    @Then("result should be A={double}")
    public void result_should_be_a(double a) {
        assertEquals(a, actual, 0.0001);
    }

}
