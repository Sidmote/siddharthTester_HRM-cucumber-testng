package com.siddharthtest.common;

import com.siddharthtest.driver.DriverManager;
import com.siddharthtest.driver.TargetFactory;
import com.siddharthtest.helpers.PropertiesHelpers;
import com.siddharthtest.listeners.TestListener;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ThreadGuard;
import org.testng.annotations.*;

import java.lang.reflect.Method;

@Listeners({TestListener.class})
public class BaseTest extends CommonPageCRM {

    @Parameters("BROWSER")
    @BeforeMethod(alwaysRun = true)
    public void createDriver(@Optional("chrome") String browser, Method method) {
        WebDriver driver = ThreadGuard.protect(new TargetFactory().createInstance(browser));
        driver.manage().window().maximize();
        DriverManager.setDriver(driver);
    }

    @AfterMethod(alwaysRun = true)
    public void closeDriver() {
        DriverManager.quit();
    }

    public WebDriver createBrowser(@Optional("chrome") String browser) {
        PropertiesHelpers.loadAllFiles();
        WebDriver driver = ThreadGuard.protect(new TargetFactory().createInstance(browser));
        DriverManager.setDriver(driver);
        return DriverManager.getDriver();
    }

}
