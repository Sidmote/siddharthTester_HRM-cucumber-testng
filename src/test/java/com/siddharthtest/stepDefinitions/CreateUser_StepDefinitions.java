package com.siddharthtest.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import com.siddharthtest.pages.CreateUser;
import com.siddharthtest.utilities.GWD;

public class CreateUser_StepDefinitions {

    CreateUser loc = new CreateUser();
    String username = "MahoAga"+(int)(Math.random()*1000);

    @Given("Navigate to the Website")
    public void navigateToTheWebsite() {
        GWD.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        GWD.getDriver().manage().window().maximize();
    }

    @And("Login as an Admin")
    public void loginAsAnAdmin() {
        loc.sendKeysFunction(loc.username, "Admin");
        loc.sendKeysFunction(loc.password, "admin123");
        loc.clickFunction(loc.loginButton);
    }

    @And("Click on Admin link")
    public void clickOnAdminLink() {
        loc.clickFunction(loc.adminLink);
    }

    @And("Click on add the button")
    public void clickOnAddTheButton() {
        loc.clickFunction(loc.addButton);
    }
    @And("Create an ESS User")
    public void createAnESSUser() throws InterruptedException {

        loc.sendKeysFunction(loc.employeeName, "P");
        loc.clickFunction(loc.peterMacAnderson);
        loc.sendKeysFunction(loc.usernameEss, username);
        loc.sendKeysFunction(loc.passwordEss, "OranGe12_34");
        loc.sendKeysFunction(loc.confirmPasswordEss, "OranGe12_34");

        Actions aksiyonlar = new Actions(GWD.getDriver());
        Action aksiyon = aksiyonlar.click(loc.userRole).
                sendKeys(Keys.DOWN).
                sendKeys(Keys.DOWN).
                sendKeys(Keys.ENTER).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.DOWN).
                sendKeys(Keys.DOWN).
                sendKeys(Keys.ENTER).
                build();
        aksiyon.perform();

        Thread.sleep(3000);
        loc.clickFunction(loc.saveButton);
    }

    @Then("ESS User should successfully added to the list")
    public void essUserShouldSuccessfullyAddedToTheList() {
        loc.verifyContainsTextFunction(loc.successMessage,"Success");
    }
}