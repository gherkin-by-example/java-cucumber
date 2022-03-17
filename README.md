# Gherkin By Example (java-cucumber)
[![Github Actions](https://github.com/gherkin-by-example/java-jbehave/actions/workflows/maven.yml/badge.svg)](https://github.com/gherkin-by-example/java-cucumber/actions/workflows/maven.yml)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=gherkin-by-example_java-cucumber&metric=alert_status)](https://sonarcloud.io/dashboard?id=gherkin-by-example_java-cucumber)

This is a solution to some BeeCrowd problems using Gherkin specifications.

## Problem Statements

Solved problem statements can be found at: 
* https://www.beecrowd.com.br/judge/en/problems/view/1000
* https://www.beecrowd.com.br/judge/en/problems/view/1001
* https://www.beecrowd.com.br/judge/en/problems/view/1002
* https://www.beecrowd.com.br/judge/en/problems/view/1003
* https://www.beecrowd.com.br/judge/en/problems/view/1004
* https://www.beecrowd.com.br/judge/en/problems/view/1005
* https://www.beecrowd.com.br/judge/en/problems/view/1006
* https://www.beecrowd.com.br/judge/en/problems/view/1007

## Solutions

Bee 1001 example solutions written in Java and other programming languages can be found here: https://www.beecrowd.com.br/judge/pt/faqs/about/examples.

If you are learning about computer programming, read solutions only after you have written your own solution.

If you are learning about program specification, first read problem statements and then read features files.

If you are learning about program testing, first read feature files and then read Java code with testing steps.

The solution process presented here adopts a behaviour-driven development style. The code also adopts a domain-driven style using Java language.
The original problem statement is first modelled using Gherkin language. 

Two levels of modelling are adopted: system level and domain level, each level has its own Gherkin specification.

For instance, a domain-oriented solution is presented here: 
https://github.com/gherkin-by-example/java-cucumber/blob/main/src/main/java/br/masmangan/beecrowd/bee1001
This solution adopts one boundary class (Main.java) and an auxiliary class (Greeting.java).

At the system level the behaviour is described as a text-oriented input and output. 
This behaviour verifies that the solution can be accepted by BeeCrowd Online Judge.
* The system level specification is presented here: 
* https://github.com/gherkin-by-example/java-cucumber/blob/main/src/test/resources/br/masmangan/beecrowd/bee1001/bee1001.feature

At the domain level the behaviour description adopts a more conceptual style, independent of a system interface. This second level adds a separation of concerns between boundary and model.
* The domain level specification is presented here: 
* https://github.com/gherkin-by-example/java-cucumber/blob/main/src/test/resources/br/masmangan/beecrowd/bee1001/calculator.feature

Gherkin specification and solution are a port from Specflow guide.
* Specflow getting started guide can be found here: https://docs.specflow.org/projects/getting-started/en/latest/index.html

## Testing code against specifications

```
git clone https://github.com/gherkin-by-example/java-cucumber.git
cd java-cucumber
mvn test
```
