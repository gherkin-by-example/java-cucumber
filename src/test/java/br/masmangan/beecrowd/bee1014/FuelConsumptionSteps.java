package br.masmangan.beecrowd.bee1014;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class FuelConsumptionSteps {

    private final FuelConsumption product = new FuelConsumption();
    private double consumption;

    @Given("Distance is {double}")
    public void first_number_is(double a) {
        product.setDistance(a);
    }
    @Given("Fuel size is {double}")
    public void second_number_is(double b) {
        product.setFuel(b);
    }

    }
    @When("difference is calculated")
    public void different_is_calculated() {
        consumption = product.getConsumption();
    }
    @Then("result should be {int}")
    public void result_should_be(int expected) {
        assertEquals(expected, consumption);
    }
}
