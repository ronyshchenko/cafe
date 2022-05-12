package com.solvd.cafe.dao.jdbcMySQLImpl;

import com.solvd.cafe.dao.IReceiversDao;
import com.solvd.cafe.models.ReceiversModel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.*;
import java.util.ResourceBundle;

public class ReceiversDao implements IReceiversDao {
    @Override
    public void createReceivers(int id, String address, String email, String name, String phone) {

    }

    @Override
    public void updateReceivers(int id, String address, String email, String name, String phone) {

    }

    @Override
    public void deleteReceiversById(int id) {

    }

    @Override
    public ReceiversModel getReceiversById(int id) {
        return null;
    }
}
