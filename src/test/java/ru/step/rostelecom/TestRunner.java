package ru.step.rostelecom;

import com.codeborne.selenide.Configuration;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.aeonbits.owner.ConfigFactory;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.remote.DesiredCapabilities;
import ru.step.rostelecom.util.TestConfig;
import static com.codeborne.selenide.Selenide.closeWebDriver;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", glue="ru.step.rostelecom.steps")
public class TestRunner {

    @BeforeClass
    public static void setUp(){

        TestConfig cfg = ConfigFactory.create(TestConfig.class);

//        Configuration.remote = String.format("http://%s:%d%s", cfg.selenoidHost(), cfg.selenoidPort(), cfg.selenoidPath());
//       // System.out.println(Configuration.remote);
//        Configuration.browser = cfg.selenoidBrowser();
//        Configuration.browserVersion = cfg.selenoidBrowserVersion();
//        Configuration.browserSize = cfg.selenoidBrowserSize();
//        DesiredCapabilities capabilities = new DesiredCapabilities();
//        capabilities.setCapability("enableVNC", true);
//        capabilities.setCapability("enableVideo", false);
//        Configuration.browserCapabilities = capabilities;
    }

    @AfterClass
    public static void tearDown(){
        closeWebDriver();

    }

}
