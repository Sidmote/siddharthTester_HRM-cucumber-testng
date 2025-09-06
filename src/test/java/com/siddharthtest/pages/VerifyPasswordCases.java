package com.siddharthtest.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.siddharthtest.driver.DriverManager;
import com.siddharthtest.utilities.GWD;


public class VerifyPasswordCases extends Parent {

    public VerifyPasswordCases() {PageFactory.initElements(GWD.getDriver(), this);}

    @FindBy(css = "input[placeholder='Username']")
    public static WebElement username;

    @FindBy(css="input[placeholder='Password']")
    public static WebElement loginPassword;

    @FindBy(css="button[type='submit']")
    public static WebElement loginButton;

    @FindBy(xpath="//span[text()='User Management ']")
    public static WebElement UserManagment;

    @FindBy(xpath="//button[text()=' Add ']")
    public static WebElement addButton;

    @FindBy(xpath="(//input[@autocomplete='off'])[1]")
    public static WebElement userNameInput;

    @FindBy(xpath="//span[text()='Already exists']")
    public WebElement alreadyExistMessage;

    @FindBy(xpath ="//input[@type='password'][1]")
    public static WebElement userPassword;

    @FindBy(xpath="//span[text()='Your password must contain minimum 1 lower-case letter']")
    public WebElement lowerCaseMessage;

    ////span[ contains(text(),'must contain a lower-case letter')]

    public WebElement getWebElement(String strButton) {
        switch (strButton) {
            case "UserManagment": return UserManagment;
            case "addButton": return addButton;
            case "userNameInput": return userNameInput;
            case "userPassword": return userPassword;
        }
        return null;
    }
 }
