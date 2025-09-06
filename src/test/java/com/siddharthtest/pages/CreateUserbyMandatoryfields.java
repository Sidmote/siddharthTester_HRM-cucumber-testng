package com.siddharthtest.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.siddharthtest.driver.DriverManager;
import com.siddharthtest.utilities.GWD;

// POM : Page Object Model
public class CreateUserbyMandatoryfields extends Parent {

    public CreateUserbyMandatoryfields() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(css = "[name=username]")
    public WebElement username;

    @FindBy(css = "[name=password]")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;

    @FindBy(xpath = "(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[1]")
    public WebElement admin;

    @FindBy(xpath = "//button[text()=' Add ']")
    public WebElement addButton;

    @FindBy(xpath = "(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]")
    public WebElement selectRole;

    @FindBy(xpath = "(//div[text()='-- Select --'])[1]")
    public WebElement selectStatus;

    @FindBy(xpath = "(//*[@type='password'])[1]")
    public WebElement userPassword;

    @FindBy(xpath = "(//*[@type='password'])[2]")
    public WebElement userComPassword;

    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    public WebElement employeeName;

    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
    public WebElement userUserName;

    @FindBy(xpath = "//*[text()=' Save ']")
    public WebElement saveButton;

    @FindBy(xpath="//*[text()='Success']")
    public WebElement successMessage;

    @FindBy(xpath="//*[text()='Peter Mac Anderson']")
    public WebElement peterMacAnderson;
}

