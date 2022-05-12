package com.solvd.cafe;

import com.mysql.jdbc.Driver;
import com.solvd.cafe.Util.ConnectionManager;
import com.solvd.cafe.dao.jdbcMySQLImpl.CafeDao;
import com.solvd.cafe.models.CafeModel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import java.sql.SQLException;

public class Executor {
    private static final Logger LOGGER = LogManager.getLogger(Executor.class);

    public static void main(String[] args) throws SQLException {
        Class<Driver> driverClass = Driver.class;
        String us = "use cafeshka;";
        String sql = """
                CREATE TABLE IF NOT EXISTS info (
                id SERIAL PRIMARY KEY,
                data TEXT NOT NULL);
                """;
        String sql1 = """
                INSERT INTO info (data)
                VALUES
                ('test1'),
                ('test2');
                """;
        try (var connection = ConnectionManager.open();
            var statement = connection.createStatement()) {
            System.out.println(connection.getSchema());
            System.out.println(connection.getTransactionIsolation());
            var executeResult1 = statement.execute(us);
            //var executeResult = statement.execute(sql);
            //var executeResult2 = statement.execute(sql1);
            //System.out.println(executeResult);
            CafeDao cafeDao = new CafeDao();
            cafeDao.create(2, "sadd", "dsaasda", "erwr", "ewrwr");
            //System.out.println(cafeDao.delete(1));


        }
    }
}
