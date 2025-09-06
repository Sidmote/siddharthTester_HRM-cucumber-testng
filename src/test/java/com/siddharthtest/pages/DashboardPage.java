package com.siddharthtest.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.siddharthtest.utilities.GWD;

public class DashboardPage {
    public DashboardPage() { PageFactory.initElements(GWD.getDriver(), this); }

    @FindBy(xpath="//h6[text()='Dashboard']")
    public WebElement dashboardLabel;
}
