/*
 * Copyright (c) 2025 Siddharth Tester
 * Automation Framework Selenium
 */

package com.siddharthtest.utils;

import org.testng.Reporter;

import com.siddharthtest.constants.FrameworkConstants;

public final class BrowserInfoUtils {

    private BrowserInfoUtils() {
        super();
    }

    private static final String OS = System.getProperty("os.name").toLowerCase();

    public static String getBrowserInfo() {
        String browser = "";
        if (Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("BROWSER") == null) {
            browser = FrameworkConstants.BROWSER.toUpperCase();
        } else {
            browser = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("BROWSER").trim().toUpperCase();
        }
        return browser;
    }

    public static String getOSInfo() {
        return System.getProperty("os.name");
    }

    public static boolean isWindows() {
        return (OS.contains("win"));
    }

    public static boolean isMac() {
        return (OS.contains("mac"));
    }

    public static boolean isUnix() {
        return (OS.contains("nix") || OS.contains("nux") || OS.contains("aix"));
    }

    public static boolean isSolaris() {
        return (OS.contains("sunos"));
    }

}
