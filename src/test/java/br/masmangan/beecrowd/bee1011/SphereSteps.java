package br.masmangan.beecrowd.bee1011;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class SphereSteps {

    private final Sphere sphere = new Sphere();
    private Double actual;

    @Given("radius is {double}")
    public void radius_value_is(Double a) {
        sphere.setRadius(a);
    }
    @When("volume is calculated")
    public void volume_is_calculated() {
        actual = sphere.calculate();
    }
    @Then("result should be {double}")
    public void result_should_be(Double expected) {
        assertEquals(expected, actual);
    }
}
