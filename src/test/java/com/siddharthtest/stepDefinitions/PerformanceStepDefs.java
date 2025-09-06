package com.siddharthtest.stepDefinitions;

import io.cucumber.java.en.*;
import com.siddharthtest.pages.PerformancePage;
import com.siddharthtest.utilities.GWD;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

import static org.testng.Assert.assertEquals;

public class PerformanceStepDefs {

    PerformancePage performancePage = new PerformancePage();

    @When("User navigates to Performance module")
    public void user_navigates_to_performance() {
    	WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(performancePage.pageTitle));
        performancePage.performanceMenu.click();
    }

    @Then("Performance page should be displayed with correct title {string}")
    public void performance_page_should_be_displayed_with_correct_title(String expectedTitle) {
        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(performancePage.pageTitle));
        String actualTitle = performancePage.pageTitle.getText();
        assertEquals(actualTitle, expectedTitle, "Performance page title does not match!");
    }
}
