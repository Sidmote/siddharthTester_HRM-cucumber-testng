package com.siddharthtest.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.siddharthtest.driver.DriverManager;
import com.siddharthtest.utilities.GWD;



public class CreateUser extends Parent {

    public CreateUser() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(css="[name='username']")
    public WebElement username;

    @FindBy(css="[name='password']")
    public WebElement password;

    @FindBy(css="[type='submit']")
    public WebElement loginButton;

    @FindBy(xpath="//span[text()='Admin']")
    public WebElement adminLink;

    @FindBy(xpath="(//div[@class='orangehrm-paper-container'] // button) [1]")
    public WebElement addButton;

    @FindBy(xpath="(//div[@class='oxd-select-text-input'])[1]")
    public WebElement userRole;

    @FindBy(xpath="(//div[@class='oxd-select-text-input'])[2]")
    public WebElement status;

    @FindBy(css="[placeholder='Type for hints...']")
    public WebElement employeeName;

    @FindBy(xpath="//*[text()='Peter Mac Anderson']")
    public WebElement peterMacAnderson;

    @FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[2]")
    public WebElement usernameEss;

    @FindBy(xpath="(//*[@type='password'])[1]")
    public WebElement passwordEss;

    @FindBy(xpath="(//*[@type='password'])[2]")
    public WebElement confirmPasswordEss;

    @FindBy(xpath = "(//div[@class='oxd-form-actions']//button)[2]")
    public WebElement saveButton;

    @FindBy(xpath="//*[text()='Success']")
    public WebElement successMessage;
}
