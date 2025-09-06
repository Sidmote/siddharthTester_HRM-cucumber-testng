package com.siddharthtest.stepDefinitions;

import io.cucumber.java.en.Then;
import org.testng.Assert;
import com.siddharthtest.pages.VerifyingPresenceofaddbutton;

public class VerifyingPresenceofaddbutton_StepDefinitions {

    VerifyingPresenceofaddbutton loc9 = new VerifyingPresenceofaddbutton();

    @Then("Verify the visibility of addButton on the current page")
    public void verifyTheVisibilityOfAddButtonOnTheCurrentPage() {
        loc9.waitUntilVisible(loc9.addButton9);
        Assert.assertTrue(loc9.addButton9.isDisplayed());
    }
}
