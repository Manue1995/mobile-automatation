package com.mobile_automation.utils;

import io.appium.java_client.AppiumDriver;
import net.serenitybdd.screenplay.Ability;
import net.serenitybdd.screenplay.Actor;

public class BrowseTheMobileDevice implements Ability   {

    private final AppiumDriver driver;

    public BrowseTheMobileDevice(AppiumDriver driver) {
        this.driver = driver;
    }

    public static BrowseTheMobileDevice with(AppiumDriver driver) {
        return new BrowseTheMobileDevice(driver);
    }

    public static BrowseTheMobileDevice as(Actor Manuel) {
        return Manuel.abilityTo(BrowseTheMobileDevice.class);
    }

    public AppiumDriver getDriver() {
        return driver;
    }

}
