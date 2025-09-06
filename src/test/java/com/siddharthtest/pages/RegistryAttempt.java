package com.siddharthtest.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.siddharthtest.driver.DriverManager;
import com.siddharthtest.utilities.GWD;

import java.util.List;

// POM : Page Object Model
public class RegistryAttempt extends Parent {

    public RegistryAttempt() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(css = "[name='username']")
    public WebElement username4;

    @FindBy(css = "[name='password']")
    public WebElement password4;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton4;

    @FindBy(linkText = "Admin")
    public WebElement adminLink4;

    @FindBy(xpath = " //button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
    public WebElement addButton4;

    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
    public WebElement saveButton4;

    @FindBy(xpath = "//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']")
    public List<WebElement> errorMessages4;

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
