package com.siddharthtest.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//@Test
@CucumberOptions(
        features = "src/test/resources/featureFiles",
        glue = {
                "com.siddharthtest.stepDefinitions",
                "com.siddharthtest.hooks"
        },
        plugin = {
                "com.siddharthtest.hooks.CucumberListener",
                "pretty",
                "html:target/cucumber-reports/cucumber-reports.html",
                "json:target/cucumber-reports/cucumber-reports.json",
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        },
        monochrome = true,
        tags ="@Regression or @Smoke"
//        "@Regression or @Smoke"
)

public class TestRunnerAllFeatureByTag extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
