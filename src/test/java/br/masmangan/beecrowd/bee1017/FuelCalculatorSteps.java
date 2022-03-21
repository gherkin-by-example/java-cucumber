package br.masmangan.beecrowd.bee1017;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class FuelCalculatorSteps {
    private final FuelCalculator fuelCalculator = new FuelCalculator();
    private double actual;

    @Given("the spent time in the trip {int}")
    public void the_spent_time_in_the_trip(int a) {
        fuelCalculator.setA(a);
    }
    @Given("the average speed during the trip {int}")
    public void the_average_speed_during_the_trip(int b) {
        fuelCalculator.setB(b);
    }
    @Given("the car comsumption is {double}")
    public void the_car_comsumption_is(double consumption) {
        assertEquals(consumption, fuelCalculator.getConsumption(), 0.1);
    }
    @When("fuel needed is calculated")
    public void fuel_needed_is_calculated() {
        actual = fuelCalculator.calculateFuelNeeded();
    }
    @Then("result should be {double}")
    public void result_should_be(double expected) {
        assertEquals(expected, actual, 0.001);
    }

}
