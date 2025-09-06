package com.siddharthtest.stepDefinitions;

import com.siddharthtest.utilities.GWD;
import io.cucumber.java.*;
import org.openqa.selenium.*;

public class Hooks {
    @After
    public void after(Scenario scenerio){
        System.out.println("The scenerio has finished");

        if (scenerio.isFailed()){
            TakesScreenshot ts=(TakesScreenshot) GWD.getDriver();
            byte[] ScreenshotOutput=ts.getScreenshotAs(OutputType.BYTES);
            scenerio.attach(ScreenshotOutput, "image/png","screen shot");
        }
        GWD.quitDriver();
    }
}
