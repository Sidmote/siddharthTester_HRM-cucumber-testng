package com.siddharthtest.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.siddharthtest.driver.DriverManager;
import com.siddharthtest.utilities.GWD;


public class Usernotification extends Parent {

    public Usernotification() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath="//span[text()='Admin']")
    public WebElement Admin;

    public WebElement getWebElement(String strButton){
        switch (strButton)
        {
            case "Admin" : return Admin;
        }
        return null;
    }
}
