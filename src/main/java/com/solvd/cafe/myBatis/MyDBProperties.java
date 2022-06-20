package com.solvd.cafe.myBatis;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class MyDBProperties {
    public static String url;
    public static String username;
    public static String password;
    public static String driver;

    static {
        try {
            FileReader reader = new FileReader("src/main/resources/db.properties");

            Properties p = new Properties();
            p.load(reader);

            url = p.getProperty("db.url");
            username = p.getProperty("db.username");
            password = p.getProperty("db.password");
            driver = p.getProperty("db.driver");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
