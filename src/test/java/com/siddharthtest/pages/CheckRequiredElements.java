package com.siddharthtest.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.siddharthtest.driver.DriverManager;
import com.siddharthtest.utilities.GWD;

// POM : Page Object Model
public class CheckRequiredElements extends Parent {

    public CheckRequiredElements() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

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
