package com.siddharthtest.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.siddharthtest.utilities.GWD;

public class PerformancePage {
    public PerformancePage() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath="//a[@href='/web/index.php/performance/viewPerformanceModule']")
    public WebElement performanceMenu;

    @FindBy(xpath="//h6")
    public WebElement pageTitle;  // heading on Performance page
}
