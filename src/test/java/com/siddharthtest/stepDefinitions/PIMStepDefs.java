package com.siddharthtest.stepDefinitions;

import io.cucumber.java.en.*;
import com.siddharthtest.pages.PIMPage;
import com.siddharthtest.utilities.GWD;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

import static org.testng.Assert.assertEquals;

public class PIMStepDefs {

    PIMPage pimPage = new PIMPage();

    @When("User navigates to PIM module")
    public void user_navigates_to_pim() {
    	WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(pimPage.pageTitle));
        pimPage.pimMenu.click();
    }

    @Then("PIM page should be displayed with correct title {string}")
    public void pim_page_should_be_displayed_with_correct_title(String expectedTitle) {
        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(pimPage.pageTitle));
        String actualTitle = pimPage.pageTitle.getText();
        assertEquals(actualTitle, expectedTitle, "PIM page title does not match!");
    }
}
