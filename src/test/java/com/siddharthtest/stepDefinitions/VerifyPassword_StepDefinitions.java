package com.siddharthtest.stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.siddharthtest.pages.VerifyPassword;

import java.util.UUID;

public class VerifyPassword_StepDefinitions {

    VerifyPassword e7 = new VerifyPassword();
    @When("Enter a value in to the username field which is less than {int} characters")
    public void enterAValueInToTheUsernameFieldWhichIsLessThanCharacters(int sayi) {

            String  randomName = UUID.randomUUID().toString().substring(0, sayi-1);
            System.out.println("Random Name: " + randomName);

            e7.sendKeysFunction(e7.adminUsername,randomName);
            e7.verifyContainsTextFunction(e7.shouldBe5Chracters,"at least 5");


    }


    @Then("Verify that notification messages “Should be at least five characters” in red color displayed.")
    public void verifyThatNotificationMessagesShouldBeAtLeastFiveCharactersInRedColorDisplayed() {
    }

}
