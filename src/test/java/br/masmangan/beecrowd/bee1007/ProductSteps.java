package br.masmangan.beecrowd.bee1007;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class ProductSteps {

    private final Product product = new Product();
    private int actual;

    @Given("first number is {int}")
    public void first_number_is(int a) {
        product.setA(a);
    }
    @Given("second number is {int}")
    public void second_number_is(int b) {
        product.setB(b);
    }
    @Given("third number is {int}")
    public void third_number_is(int c) {
        product.setC(c);
    }
    @Given("fourth number is {int}")
    public void fourth_number_is(int c) {
        product.setD(c);
    }
    @When("difference is calculated")
    public void different_is_calculated() {
        actual = product.getDifference();
    }
    @Then("result should be {int}")
    public void result_should_be(int expected) {
        assertEquals(expected, actual);
    }
}
