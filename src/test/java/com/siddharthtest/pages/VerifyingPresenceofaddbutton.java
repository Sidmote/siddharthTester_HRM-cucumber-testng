package com.siddharthtest.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.siddharthtest.driver.DriverManager;
import com.siddharthtest.utilities.GWD;

// POM : Page Object Model
public class VerifyingPresenceofaddbutton extends Parent {

    public VerifyingPresenceofaddbutton() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
    public WebElement addButton9;

    @FindBy(xpath="(//mat-option//span)[2]")
    private WebElement gradeLevel2;

    public WebElement getWebElement(String strButton){
        switch (strButton)
        {
            case "gradeLevel2" : return gradeLevel2;
        }
        return null;
    }
}
