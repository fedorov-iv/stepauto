package ru.step.rostelecom.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import static com.codeborne.selenide.Selenide.open;

public class Basic {

    @When("I run test step from {string} file")
    public void testStep(String filename) {
        //System.out.println("I am a test step!");

        System.out.format("Thread ID - %2d - from %s feature file.\n",
                Thread.currentThread().getId(), filename);

    }

    @Given("I open yandex.ru")
    public void openYandex(){
        //open("https://yandex.ru");

    }

    @And("I wait for {int} seconds")
    public void wait(int seconds) throws InterruptedException{
        Thread.sleep(seconds * 1000L);
    }


}
