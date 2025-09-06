package com.siddharthtest.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.siddharthtest.driver.DriverManager;
import com.siddharthtest.pages.Parent;
import com.siddharthtest.utilities.GWD;

// POM : Page Object Model
public class VerifyPassword extends Parent {

    public VerifyPassword() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath="(//input[@class='oxd-input oxd-input--active' and @autocomplete='off'])[1]")
    public WebElement adminUsername;

    @FindBy(xpath="//span[text()='Should be at least 5 characters']")
    public WebElement shouldBe5Chracters;
}
