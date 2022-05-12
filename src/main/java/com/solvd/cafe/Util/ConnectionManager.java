package com.solvd.cafe.Util;
import com.solvd.cafe.Util.PropertiesUtil;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class ConnectionManager {
    private static final String PASSWORD_KEY = "db.password";
    private static final String USERNAME_KEY = "db.username";
    private static final String URL_KEY = "db.url";

    private ConnectionManager() {

    }

    public static Connection open() {
        try {
            return DriverManager.getConnection(
                    PropertiesUtil.get(URL_KEY),
                    PropertiesUtil.get(USERNAME_KEY),
                    PropertiesUtil.get(PASSWORD_KEY)
            );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}

