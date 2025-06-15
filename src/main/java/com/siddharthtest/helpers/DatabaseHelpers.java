/*
 * Copyright (c) 2025 Siddharth Tester
 * Automation Framework Selenium
 */

package com.siddharthtest.helpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseHelpers {

    public DatabaseHelpers() {
        super();
    }

    public static Connection getMySQLConnection(String hostName, String dbName, String userName, String password) throws SQLException {

        // jdbc:mysql://localhost:3306/saleserp
        String connectionURL = "jdbc:mysql://" + hostName + ":3306/" + dbName;

        Connection conn = DriverManager.getConnection(connectionURL, userName, password);

        return conn;
    }

}
