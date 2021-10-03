# Gherkin By Example (java-cucumber)
[![Github Actions](https://github.com/gherkin-by-example/java-jbehave/actions/workflows/maven.yml/badge.svg)](https://github.com/gherkin-by-example/java-cucumber/actions/workflows/maven.yml)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=gherkin-by-example_java-cucumber&metric=alert_status)](https://sonarcloud.io/dashboard?id=gherkin-by-example_java-cucumber)

This is a solution to URI Online Judge 1001 problem: add two numbers. 
* The problem statement can be found here: https://www.urionlinejudge.com.br/judge/en/problems/view/1001.
* An example solution in Java and other programming languages can be found here: https://www.urionlinejudge.com.br/judge/pt/faqs/about/examples.

The solution process presented here adopts a behaviour-driven development style. The original problem statement is first modelled using Gherkin language. 

The code also adopts a domain-driven style using Java language. Two levels of modelling are adopted: system level and domain level, each level has its Gherkin specification.

At the system level the behaviour is described as a text-oriented input and output. This behaviour verifies that the solution can be accepted by URI Online Judge.

At the domain level the behaviour description adopts a more conceptual style, independent of a system interface. This second level adds a separation of concerns between boundary and model.

* The system level specification is presented here: https://github.com/gherkin-by-example/java-cucumber/blob/main/src/test/resources/br/masmangan/uri/uri1001/cucumber/uri1001.feature
* The domain level specification is presented here: https://github.com/gherkin-by-example/java-cucumber/blob/main/src/test/resources/br/masmangan/uri/uri1001/cucumber/calculator.feature
* A solution using these styles is presented here: https://github.com/gherkin-by-example/java-cucumber/blob/main/src/main/java/br/masmangan/uri/uri1001/cucumber/Main.java

## Testing

```
git clone https://github.com/gherkin-by-example/java-cucumber.git
cd java-cucumber
mvn test
```
