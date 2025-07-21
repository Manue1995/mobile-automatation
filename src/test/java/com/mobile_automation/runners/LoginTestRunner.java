package com.mobile_automation.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/login.feature",
        tags = "@Test2",
        glue = "com.mobile_automation.stepDefinitions",
        plugin = {"pretty",
                "html:target/serenity-reports/cucumber-html-report.html",
                "json:target/serenity-reports/cucumber_report.json"
        },
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class LoginTestRunner {

}
