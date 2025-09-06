package com.siddharthtest.stepDefinitions;

import io.cucumber.java.en.*;
import com.siddharthtest.pages.MyInfoPage;
import com.siddharthtest.utilities.GWD;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

import static org.testng.Assert.assertEquals;

public class MyInfoStepDefs {

    MyInfoPage myInfoPage = new MyInfoPage();

    @When("User navigates to My Info module")
    public void user_navigates_to_myinfo() {
        myInfoPage.myInfoMenu.click();
    }

    @Then("My Info page should be displayed with correct title {string}")
    public void my_info_page_should_be_displayed_with_correct_title(String expectedTitle) {
        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(myInfoPage.pageTitle));
        String actualTitle = myInfoPage.pageTitle.getText();
        assertEquals(actualTitle, expectedTitle, "My Info page title does not match!");
    }
}