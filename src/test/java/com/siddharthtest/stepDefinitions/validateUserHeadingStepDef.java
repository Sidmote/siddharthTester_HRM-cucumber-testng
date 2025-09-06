package com.siddharthtest.stepDefinitions;

import io.cucumber.java.en.Then;
import com.siddharthtest.pages.ValidateUserHeading;

public class validateUserHeadingStepDef {

	ValidateUserHeading e11 = new ValidateUserHeading();

    @Then("Verify that Add User heading is displayed")
    public void verifyThatAddUserHeadingIsDisplayed() {
        e11.verifyContainsTextFunction(e11.addUserText, "Add User");
    }
}
