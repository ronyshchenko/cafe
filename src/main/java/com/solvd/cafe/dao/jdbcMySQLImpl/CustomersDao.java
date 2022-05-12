package com.solvd.cafe.dao.jdbcMySQLImpl;

import com.solvd.cafe.dao.ICustomersDao;
import com.solvd.cafe.models.CustomersModel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.*;
import java.util.ResourceBundle;

public class CustomersDao implements ICustomersDao {
    @Override
    public void createCustomers(int id, String address, String city, String email, String name) {

    }

    @Override
    public void updateCustomers(int id, String address, String city, String email, String name) {

    }

    @Override
    public void deleteCustomersById(int id) {

    }

    @Override
    public CustomersModel getCustomersById(int id) {
        return null;
    }
}
