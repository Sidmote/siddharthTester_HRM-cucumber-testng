/*
 * Copyright (c) 2025 Siddharth Tester
 * Automation Framework Selenium
 */

package com.siddharthtest.utils;

import com.siddharthtest.constants.FrameworkConstants;
import com.siddharthtest.enums.Browser;

public final class IconUtils {

    private IconUtils() {
        super();
    }

    public static String getBrowserIcon() {
        if (BrowserInfoUtils.getBrowserInfo().contains(Browser.CHROME.toString())) {
            return FrameworkConstants.ICON_BROWSER_CHROME;
        } else if (BrowserInfoUtils.getBrowserInfo().contains(Browser.EDGE.toString())) {
            return FrameworkConstants.ICON_BROWSER_EDGE;
        } else if (BrowserInfoUtils.getBrowserInfo().contains(Browser.FIREFOX.toString())) {
            return FrameworkConstants.ICON_BROWSER_FIREFOX;
        } else {
            return BrowserInfoUtils.getBrowserInfo();
        }
    }

    public static String getOSIcon() {

        String operationSystem = BrowserInfoUtils.getOSInfo().toLowerCase();
        if (operationSystem.contains("win")) {
            return FrameworkConstants.ICON_OS_WINDOWS;
        } else if (operationSystem.contains("nix") || operationSystem.contains("nux") || operationSystem.contains("aix")) {
            return FrameworkConstants.ICON_OS_LINUX;
        } else if (operationSystem.contains("mac")) {
            return FrameworkConstants.ICON_OS_MAC;
        }
        return operationSystem;
    }
}
