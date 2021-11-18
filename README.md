# Gherkin By Example (java-cucumber)
[![Github Actions](https://github.com/gherkin-by-example/java-jbehave/actions/workflows/maven.yml/badge.svg)](https://github.com/gherkin-by-example/java-cucumber/actions/workflows/maven.yml)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=gherkin-by-example_java-cucumber&metric=alert_status)](https://sonarcloud.io/dashboard?id=gherkin-by-example_java-cucumber)

This is a solution to BeeCrowd Bee 1000 and Bee 1001 problems: greetings and add two numbers. 
* The problem statement can be found here: https://www.beecrowd.com.br/judge/en/problems/view/1000 and https://www.beecrowd.com.br/judge/en/problems/view/1001.
* Bee 1001 example solutions in Java and other programming languages can be found here: https://www.beecrowd.com.br/judge/pt/faqs/about/examples.

The solution process presented here adopts a behaviour-driven development style. The original problem statement is first modelled using Gherkin language. 
The code also adopts a domain-driven style using Java language. 
* A domain-oriented solution is presented here: https://github.com/gherkin-by-example/java-cucumber/blob/main/src/main/java/br/masmangan/uri/uri1001/cucumber/Main.java

Two levels of modelling are adopted: system level and domain level, each level has its Gherkin specification.

At the system level the behaviour is described as a text-oriented input and output. This behaviour verifies that the solution can be accepted by URI Online Judge.
* The system level specification is presented here: https://github.com/gherkin-by-example/java-cucumber/blob/main/src/test/resources/br/masmangan/uri/uri1001/cucumber/uri1001.feature

At the domain level the behaviour description adopts a more conceptual style, independent of a system interface. This second level adds a separation of concerns between boundary and model.
* The domain level specification is presented here: https://github.com/gherkin-by-example/java-cucumber/blob/main/src/test/resources/br/masmangan/uri/uri1001/cucumber/calculator.feature

Gherkin specification and solution are a port from Specflow guide.
* Specflow getting started guide can be found here: https://docs.specflow.org/projects/getting-started/en/latest/index.html

## Testing code against both specifications

```
git clone https://github.com/gherkin-by-example/java-cucumber.git
cd java-cucumber
mvn test
```
