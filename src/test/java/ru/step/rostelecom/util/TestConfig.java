package ru.step.rostelecom.util;

import org.aeonbits.owner.Config;

public interface TestConfig extends Config {

    @Key("selenoid.host")
    @DefaultValue("localhost")
    String selenoidHost();

    @Key("selenoid.port")
    @DefaultValue("4444")
    int selenoidPort();

    @Key("selenoid.path")
    @DefaultValue("/wd/hub")
    String selenoidPath();

    @Key("selenoid.browser")
    @DefaultValue("chrome")
    String selenoidBrowser();

    @Key("selenoid.browser.version")
    String selenoidBrowserVersion();

    @Key("selenoid.browser.size")
    @DefaultValue("1920x1080")
    String selenoidBrowserSize();

}