package com.siddharthtest.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import com.siddharthtest.utilities.GWD;
import com.siddharthtest.pages.CreateUserbyMandatoryfields;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateUserbyMandatoryfields_StepDefinitions {

    CreateUserbyMandatoryfields ag = new CreateUserbyMandatoryfields();

    @Given("Navigate to OrangeHRM website")
    public void navigateToOrangeHRMWebsite() {
        GWD.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @When("Enter username and password and click login")
    public void enterUsernameAndPasswordAndClickLogin() {
        ag.sendKeysFunction(ag.username, "Admin");
        ag.sendKeysFunction(ag.password, "admin123");
        ag.clickFunction(ag.loginButton);
        // driver.switchTo().alert().accept();
    }

    @And("Click to Admin Button and click to Add Button")
    public void clickToAdminButtonAndClickToAddButton() {
        ag.clickFunction(ag.admin);
        ag.clickFunction(ag.addButton);
    }

    @And("Enter only mandatory fields and click save button")
    public void enterOnlyMandatoryFieldsAndClickSaveButton() throws InterruptedException {

        ag.sendKeysFunction(ag.employeeName, "P");
        ag.clickFunction(ag.peterMacAnderson);
        ag.sendKeysFunction(ag.userUserName, "OrangeAyse" + (int) (Math.random() * 1000));
        ag.sendKeysFunction(ag.userPassword, "OranGe12_34");
        ag.sendKeysFunction(ag.userComPassword, "OranGe12_34");

        Actions aksiyonlar = new Actions(GWD.getDriver());
        Action aksiyon = aksiyonlar.click(ag.selectRole).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).build();
        aksiyon.perform();

        Thread.sleep(3000);
        ag.clickFunction(ag.saveButton);
    }

    @Then("User should add successfully")
    public void userShouldAddSuccessfully() {
        ag.verifyContainsTextFunction(ag.successMessage, "Success");
    }

    @Then("I verify that all the required elements are displayed")
    public void iVerifyThatAllTheRequiredElementsAreDisplayed() {

        List<String> tabMenuList = new ArrayList<>(Arrays.asList("User Role", "Employee Name", "Status", "Username", "Password", "Confirm Password", "Cancel", "Save"));

        List<WebElement> tabMenu = GWD.getDriver().findElements(By.xpath("//label[@class='oxd-label oxd-input-field-required']"));
        List<WebElement> tabMenu1 = GWD.getDriver().findElements(By.xpath("//div[@class='oxd-form-actions']//button"));

        for (int i = 0; i < tabMenu.size(); i++) {
            Assert.assertTrue(tabMenu.get(i).getText().contains(tabMenuList.get(i)));
        }
        for (int i = 0; i < tabMenu1.size(); i++) {
            Assert.assertTrue(tabMenu1.get(i).getText().contains(tabMenuList.get(i)));
        }
    }
}
