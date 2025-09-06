package com.siddharthtest.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.siddharthtest.utilities.GWD;

public class RecruitmentPage {
    public RecruitmentPage() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath="//a[@href='/web/index.php/recruitment/viewRecruitmentModule']")
    public WebElement recruitmentMenu;

    @FindBy(xpath="//h6")
    public WebElement pageTitle;  // heading on Recruitment page
}
