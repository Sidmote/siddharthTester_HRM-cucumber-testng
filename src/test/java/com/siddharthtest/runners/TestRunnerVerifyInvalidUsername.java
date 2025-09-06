package com.siddharthtest.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//@Test
@CucumberOptions(
        features = "src/test/resources/featureFiles/VerifyInvalidUsername.feature",
        glue = {
                "com.siddharthtest.stepDefinitions",
                "com.siddharthtest.hooks"
        },
        plugin = {
                "com.siddharthtest.hooks.CucumberListener",
                "pretty",
                "html:target/cucumber-reports/TestRunnerVerifyInvalidUsername.html",
                "json:target/cucumber-reports/TestRunnerVerifyInvalidUsername.json",
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        },
        monochrome = true,
        tags = "@VerifyInvalidUsername"
)

public class TestRunnerVerifyInvalidUsername extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
