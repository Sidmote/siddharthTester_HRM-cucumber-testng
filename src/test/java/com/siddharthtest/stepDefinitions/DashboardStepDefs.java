package com.siddharthtest.stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.siddharthtest.pages.DashboardPage;
import com.siddharthtest.utilities.GWD;
import java.time.Duration;
import static org.testng.Assert.assertTrue;


public class DashboardStepDefs {
    DashboardPage dashboardPage = new DashboardPage();

    @Given("User is logged in")
    public void user_is_logged_in() {
        // Assuming login already done
    }

    @Then("Dashboard should be displayed")
    public void dashboard_should_be_displayed() {
        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(dashboardPage.dashboardLabel));
        assertTrue(dashboardPage.dashboardLabel.isDisplayed());
    }
}
