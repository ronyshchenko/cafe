package com.solvd.cafe.Util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.*;


public class DataBaseConnection {
    private static final Logger LOGGER = LogManager.getLogger(DataBaseConnection.class);
    private static final String DRIVER = "db.drv_path";
    private static final String DBURL = "db.url";
    private static final String USER = "db.username";
    private static final String PASS = "db.password";

    private static DataBaseConnection singleInstance = new DataBaseConnection();

    private DataBaseConnection() {
        try {
            Class.forName(PropertiesUtil.get(DRIVER));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private Connection createConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(
                    PropertiesUtil.get(DBURL),
                    PropertiesUtil.get(USER),
                    PropertiesUtil.get(PASS)
            );
        } catch (SQLException e) {
            LOGGER.info("An error occured while trying to connect to the database");
            e.printStackTrace();
        }
        return connection;
    }

    public static Connection getConnection() {
        return singleInstance.createConnection();
    }

    public static void close(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                LOGGER.info("An error occured while trying to close the connection");
            }
        }
    }

    public static void close(Statement statement) {
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException e) {
                LOGGER.info("An error occured while trying to close the statement");
            }
        }
    }

    public static void close(ResultSet resultSet) {
        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (SQLException e) {
                LOGGER.info("An error occured while trying to close the ResultSet");
            }
        }
    }


}
