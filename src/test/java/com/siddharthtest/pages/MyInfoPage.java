package com.siddharthtest.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.siddharthtest.utilities.GWD;

public class MyInfoPage {
    public MyInfoPage() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath="//a[@href='/web/index.php/pim/viewMyDetails']")
    public WebElement myInfoMenu;

    @FindBy(xpath="//h6")
    public WebElement pageTitle;   // heading on My Info page
}