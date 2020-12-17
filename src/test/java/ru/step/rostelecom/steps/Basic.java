package ru.step.rostelecom.steps;

import io.cucumber.java.en.When;

public class Basic {

    @When("I run test step")
    public void testStep() {
        System.out.println("I am a test step!");
    }

}
