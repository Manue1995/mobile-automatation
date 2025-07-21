package com.mobile_automation.stepDefinitions;


import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

import static com.mobile_automation.utils.Constant.Manuel;


public class Hook  {

    private AndroidDriver  driver;

   @Before
    public void setUp() throws MalformedURLException {

        System.out.println("✅ AppiumDriver inicializado");

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("deviceName", "emulator-5554");
        caps.setCapability("ignoreHiddenApiPolicyError" , true);
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("uiautomator2ServerLaunchTimeout", 30000); // 30 segundos
        caps.setCapability("adbExecTimeout", 20000);

       // Ruta absoluta hacia el APK
       String apkPath = System.getProperty("user.dir") + "/src/test/resources/apps/mda-2.2.0-25.apk";
       caps.setCapability("app", apkPath);

       driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), caps);

       // Iniciar Screenplay
       OnStage.setTheStage(new OnlineCast());
       OnStage.theActorCalled(String.valueOf(Manuel)).can(BrowseTheWeb.with(driver));

    }

    @After
    public void tearDown() {
        System.out.println("🛑 Cerrando App...");
        //if (driver != null) {
            driver.quit();
       //}
    }
}
