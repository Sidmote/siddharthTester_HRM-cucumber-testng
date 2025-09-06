package com.siddharthtest.utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.siddharthtest.constants.FrameworkConstants;
import com.siddharthtest.driver.DriverManager;
import com.siddharthtest.helpers.SystemHelpers;
import com.siddharthtest.utils.LogUtils;

import io.cucumber.java.Scenario;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.imageio.ImageIO;

public class GWD {

    private static final ThreadLocal<WebDriver> threadDriver = new ThreadLocal<>();
    private static final ThreadLocal<String> threadBrowserName = new ThreadLocal<>();

    public static WebDriver getDriver() {

        Locale.setDefault(new Locale("EN"));
        System.setProperty("user.language", "EN");

        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.SEVERE);
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");

        if (threadBrowserName.get() == null) threadBrowserName.set("chrome");

        if (threadDriver.get() == null) {

            switch (threadBrowserName.get()) {

                case "edge":
                    threadDriver.set(new EdgeDriver());
                    break;
                case "firefox":
                    threadDriver.set(new FirefoxDriver());
                    break;
                case "safari":
                    threadDriver.set(new SafariDriver());
                    break;
                default:
                    threadDriver.set(new ChromeDriver());
                    break;
            }
        }
        threadDriver.get().manage().window().maximize();
        return threadDriver.get();
    }

    public static void quitDriver() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        if (threadDriver.get() != null) {
            threadDriver.get().quit();
            WebDriver driver = threadDriver.get();
            driver = null;
            threadDriver.set(driver);
        }
    }
    
    /**
     * Wait for a page to load with the default time from the config
     */
    public static void waitForPageLoaded() {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(FrameworkConstants.WAIT_PAGE_LOADED));
        JavascriptExecutor js = (JavascriptExecutor) getDriver();

        // wait for Javascript to loaded
        ExpectedCondition<Boolean> jsLoad = driver -> ((JavascriptExecutor) driver).executeScript("return document.readyState").toString().equals("complete");

        //Get JS is Ready
        boolean jsReady = js.executeScript("return document.readyState").toString().equals("complete");

        //Wait Javascript until it is Ready!
        if (!jsReady) {
            //LogUtils.info("Javascript in NOT Ready!");
            //Wait for Javascript to load
            try {
                wait.until(jsLoad);
            } catch (Throwable error) {
                LogUtils.error("Timeout waiting for page load. (" + FrameworkConstants.WAIT_PAGE_LOADED + "s)");
                Assert.fail("Timeout waiting for page load. (" + FrameworkConstants.WAIT_PAGE_LOADED + "s)");
            }
        }
    }

    /**
     * Wait for a page to load within the given time (in seconds)
     */
    public static void waitForPageLoaded(int timeOut) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(timeOut));
        JavascriptExecutor js = (JavascriptExecutor) getDriver();

        // wait for Javascript to loaded
        ExpectedCondition<Boolean> jsLoad = driver -> ((JavascriptExecutor) driver).executeScript("return document.readyState").toString().equals("complete");

        //Get JS is Ready
        boolean jsReady = js.executeScript("return document.readyState").toString().equals("complete");

        //Wait Javascript until it is Ready!
        if (!jsReady) {
            LogUtils.info("Javascript in NOT Ready!");
            //Wait for Javascript to load
            try {
                wait.until(jsLoad);
            } catch (Throwable error) {
                LogUtils.error("Timeout waiting for page load. (" + FrameworkConstants.WAIT_PAGE_LOADED + "s)");
                Assert.fail("Timeout waiting for page load. (" + FrameworkConstants.WAIT_PAGE_LOADED + "s)");
            }
        }
    }
    
    private static SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH-mm-ss");
    
    public static void captureScreenshot(WebDriver driver, String screenName) {
        try {
            String path = SystemHelpers.getCurrentDir() + FrameworkConstants.EXPORT_CAPTURE_PATH;
            File file = new File(path);
            if (!file.exists()) {
                LogUtils.info("No Folder: " + path);
                file.mkdir();
                LogUtils.info("Folder created: " + file);
            }

            LogUtils.info("Driver for Screenshot: " + driver);
            // Create reference of TakesScreenshot
            TakesScreenshot ts = (TakesScreenshot) driver;
            // Call the capture screenshot function - getScreenshotAs
            File source = ts.getScreenshotAs(OutputType.FILE);
            // result.getName() Get the name of the test case and assign it to the screenshot file name
            FileUtils.copyFile(source, new File(path + File.separator + screenName + "_" + dateFormat.format(new Date()) + ".png"));
            LogUtils.info("Screenshot taken: " + screenName);
            LogUtils.info("Screenshot taken current URL: " + driver.getCurrentUrl());
        } catch (Exception e) {
            LogUtils.info("Exception while taking screenshot: " + e.getMessage());
        }
    }

    public static File getScreenshot(String screenshotName) {
        Rectangle allScreenBounds = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        String dateName = new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss.SSS").format(new Date());
        BufferedImage image = null;
        try {
            image = new Robot().createScreenCapture(allScreenBounds);
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }

        String path = SystemHelpers.getCurrentDir() + FrameworkConstants.EXTENT_REPORT_FOLDER + File.separator + "images";
        File folder = new File(path);
        if (!folder.exists()) {
            folder.mkdir();
            LogUtils.info("Folder created: " + folder);
        }

        String filePath = path + File.separator + screenshotName + dateName + ".png";
        File file = new File(filePath);
        try {
            ImageIO.write(image, "PNG", file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return file;
    }

    public static void takeScreenshotScenario(Scenario scenario, String screenshotName) {
        try {
            TakesScreenshot ts = (TakesScreenshot) GWD.getDriver();
            byte[] src = ts.getScreenshotAs(OutputType.BYTES);
            scenario.attach(src, "image/png", screenshotName);
        } catch (Exception e) {
            LogUtils.error("Unable to take screenshot");
            LogUtils.error(e);
        }
    }

    public static void threadBrowserSet(String browser) {
        threadBrowserName.set(browser);
    }
    
    public static void quit() {
        if (DriverManager.getDriver() != null){
            DriverManager.getDriver().quit();
        }
    }
}
