package ru.step.rostelecom;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", glue="ru.step.rostelecom.steps")
public class TestRunner {

}
