/*
 * Copyright (c) 2025.
 * Automation Framework Selenium - Siddharth Tester
 */

package com.siddharthtest.mail;

import com.siddharthtest.constants.FrameworkConstants;

/**
 * Data for Sending email after execution
 */
public class EmailConfig {

    //Remember to create an app password (App Password) for Gmail to be able to send.
    //If you use Hosting mail, it's normal.
    //Enable Override Report and Send mail in config file => src/test/resources/config/config.properties
    //OVERRIDE_REPORTS=yes
    //send_email_to_users=yes

    public static final String SERVER = "smtp.gmail.com";
    public static final String PORT = "587";

    public static final String FROM = "siddharthmote123@gmail.com";
    public static final String PASSWORD = "nbxq zgec wjzk hnqg";

    public static final String[] TO = {"siddharthmote123@gmail.com","malusarenikita17@gmail.com"};
    public static final String SUBJECT = FrameworkConstants.REPORT_TITLE;
    
//    ,"malusarenikita17@gmail.com" //add email i row 27
}