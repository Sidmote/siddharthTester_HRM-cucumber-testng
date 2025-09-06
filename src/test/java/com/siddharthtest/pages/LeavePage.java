package com.siddharthtest.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.siddharthtest.utilities.GWD;

public class LeavePage {
    public LeavePage() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath="//a[@href='/web/index.php/leave/viewLeaveModule']")
    public WebElement leaveMenu;

    @FindBy(xpath="//h6")
    public WebElement pageTitle;  // This captures the heading/title on Leave page
}