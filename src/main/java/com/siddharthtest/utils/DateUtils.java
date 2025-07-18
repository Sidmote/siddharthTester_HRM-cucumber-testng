/*
 * Copyright (c) 2025 Siddharth Tester
 * Automation Framework Selenium
 */

package com.siddharthtest.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

//final -> We do not want any class to extend this class
public final class DateUtils {

    private DateUtils() {
        super();
    }

    /**
     * @return Get the current date of the machine in default format
     */
    public static String getCurrentDate() {
        Date date = new Date();
        return date.toString().replace(":", "_").replace(" ", "_");
    }

    /**
     * @return Get the current date, month, year, hour, minute, second of the device according to the structure dd/MM/yyyy HH:mm:ss
     */
    public static String getCurrentDateTime() {
        Date now = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        return formatter.format(now);
    }

    public static String getCurrentDateTimeCustom(String separator_Character) {
        Date now = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String timeStamp = formatter.format(now).replace("/", separator_Character);
        timeStamp = timeStamp.replace(" ", separator_Character);
        timeStamp = timeStamp.replace(":", separator_Character);
        return timeStamp;
    }

}
