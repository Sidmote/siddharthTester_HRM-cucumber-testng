package com.siddharthtest.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import com.siddharthtest.pages.RegistryAttempt;
import com.siddharthtest.utilities.GWD;

public class RegistryAttempt_StepDefinitions {

    RegistryAttempt locators4 = new RegistryAttempt();

    @Given("Go to  mainpage of the test object")
    public void goToMainpageOfTheTestObject() {
        GWD.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @When("Write your admin username and password respectively")
    public void writeYourAdminUsernameAndPasswordRespectively() {
        locators4.sendKeysFunction(locators4.username4, "Admin");
        locators4.sendKeysFunction(locators4.password4, "admin123");
        locators4.clickFunction(locators4.loginButton4);
    }

    @Then("Click on Admin, user management page on the website")
    public void clickOnAdminUserManagementPageOnTheWebsite() {
        locators4.clickFunction(locators4.adminLink4);
    }

    @And("Press on add button to click")
    public void pressOnAddButtonToClick() {
        locators4.clickFunction(locators4.addButton4);
    }

    @And("Click on saveButton without filling up any mandatory field")
    public void clickOnSaveButtonWithoutFillingUpAnyMandatoryField() {
        locators4.clickFunction(locators4.saveButton4);
    }

    @Then("The error message shall be visible under each of mandatory field")
    public void theErrorMessageShallBeVisibleUnderEachOfMandatoryField() {

        for (WebElement w : locators4.errorMessages4) {
            Assert.assertTrue(w.isEnabled());
        }
    }
}