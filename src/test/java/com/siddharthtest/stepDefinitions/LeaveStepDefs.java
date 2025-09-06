package com.siddharthtest.stepDefinitions;

import io.cucumber.java.en.*;
import com.siddharthtest.pages.LeavePage;
import com.siddharthtest.utilities.GWD;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.testng.Assert.assertEquals;

public class LeaveStepDefs {

    LeavePage leavePage = new LeavePage();

    @When("User navigates to Leave module")
    public void user_navigates_to_leave() {
        leavePage.leaveMenu.click();
    }

    @Then("Leave page should be displayed with correct title {string}")
    public void leave_page_should_be_displayed_with_correct_title(String expectedTitle) {
        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(leavePage.pageTitle));
        String actualTitle = leavePage.pageTitle.getText();
        assertEquals(actualTitle, expectedTitle, "Leave page title does not match!");
    }
}
