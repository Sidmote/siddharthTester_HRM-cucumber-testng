package com.siddharthtest.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.siddharthtest.utilities.GWD;

public class PIMPage {
    public PIMPage() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath="//a[@href='/web/index.php/pim/viewPimModule']")
    public WebElement pimMenu;

    @FindBy(xpath="//h6")
    public WebElement pageTitle;  // heading on PIM page
}
