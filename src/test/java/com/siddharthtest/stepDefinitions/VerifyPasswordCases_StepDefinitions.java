package com.siddharthtest.stepDefinitions;

import io.cucumber.java.en.Then;
import com.siddharthtest.pages.VerifyPasswordCases;
import com.siddharthtest.pages.Usernotification;

public class VerifyPasswordCases_StepDefinitions {

    VerifyPasswordCases dc = new VerifyPasswordCases();
    Usernotification ln = new Usernotification();

    @Then("Notification messages “... password must contain minimum 1 lower-case letter ... ” should be displayed.")
    public void notificationMessagesPasswordMustContainMinimum1LowerCaseLetterShouldBeDisplayed() {
        dc.verifyContainsTextFunction(dc.lowerCaseMessage, "Your password must contain minimum 1 lower-case letter");
    }
}
