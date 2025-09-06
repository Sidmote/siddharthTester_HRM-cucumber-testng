package com.siddharthtest.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.siddharthtest.driver.DriverManager;
import com.siddharthtest.utilities.GWD;

// POM : Page Object Model
public class VarifyPassword extends Parent {

    public VarifyPassword() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//input[@name='username']")
    public WebElement username;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginBtn;

    @FindBy(xpath = "(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[1]")
    public WebElement AdminBtn;

    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
    public WebElement AddBtn;

    @FindBy(xpath = "//*[text()=' Save ']")
    public WebElement SaveBtn;

    @FindBy(xpath = "(//input[@type='password'])[1]")
    public WebElement pass;

    @FindBy(xpath = "//span[text()='Should have at least 7 characters']")
    public WebElement message;

    @FindBy(xpath = "//span[text()='Required']")
    public WebElement required;
}
