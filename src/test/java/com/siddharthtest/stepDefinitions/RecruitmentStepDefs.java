package com.siddharthtest.stepDefinitions;

import io.cucumber.java.en.*;
import com.siddharthtest.pages.RecruitmentPage;
import com.siddharthtest.utilities.GWD;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

import static org.testng.Assert.assertEquals;

public class RecruitmentStepDefs {

    RecruitmentPage recruitmentPage = new RecruitmentPage();

    @When("User navigates to Recruitment module")
    public void user_navigates_to_recruitment() {
    	WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(recruitmentPage.pageTitle));
        recruitmentPage.recruitmentMenu.click();
    }

    @Then("Recruitment page should be displayed with correct title {string}")
    public void recruitment_page_should_be_displayed_with_correct_title(String expectedTitle) {
        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(recruitmentPage.pageTitle));
        String actualTitle = recruitmentPage.pageTitle.getText();
        assertEquals(actualTitle, expectedTitle, "Recruitment page title does not match!");
    }
}
