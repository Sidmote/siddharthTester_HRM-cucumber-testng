package com.siddharthtest.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.siddharthtest.driver.DriverManager;
import com.siddharthtest.utilities.GWD;

// POM : Page Object Model
public class ValidateUserHeading extends Parent {

    public ValidateUserHeading() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath="//*[text()='Add User']")
    public WebElement addUserText;
}
