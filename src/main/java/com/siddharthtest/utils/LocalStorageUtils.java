/*
 * Copyright (c) 2025 Siddharth Tester
 * Automation Framework Selenium
 */

package com.siddharthtest.utils;

import org.openqa.selenium.html5.LocalStorage;
import org.openqa.selenium.html5.WebStorage;

import com.siddharthtest.driver.DriverManager;

public class LocalStorageUtils {

    private LocalStorageUtils() {
        super();
    }

    public static String getItem(String key) {
        LocalStorage localStorage = ((WebStorage) DriverManager.getDriver()).getLocalStorage();
        return localStorage.getItem(key);
    }

    public static void setItem(String key, String value) {
        LocalStorage localStorage = ((WebStorage) DriverManager.getDriver()).getLocalStorage();
        localStorage.setItem(key, value);
    }

    public static void removeItem(String key) {
        LocalStorage localStorage = ((WebStorage) DriverManager.getDriver()).getLocalStorage();
        localStorage.removeItem(key);
    }

    public static void clear() {
        LocalStorage localStorage = ((WebStorage) DriverManager.getDriver()).getLocalStorage();
        localStorage.clear();
    }

    public static int size() {
        LocalStorage localStorage = ((WebStorage) DriverManager.getDriver()).getLocalStorage();
        return localStorage.size();
    }

}
