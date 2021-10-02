package br.masmangan.uri.uri1001.cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

public class CalculatorSteps {
	private Calculator calc = new Calculator();
	private int actual;

	@Given("the first number is {int}")
	public void givenTheFirstNumberIs(int a) {
		calc.setA(a);
	}

	@Given("the second number is {int}")
	public void givenTheSecondNumberIs(int b) {
		calc.setB(b);
	}

	@When("the two numbers are added")
	public void whenTheTwoNumbersAreAdded() {
		actual = calc.getSum();
	}

	@Then("the result should be {int}")
	public void thenTheResultShouldBe(int x) {
		assertEquals(x, actual);
	}}
