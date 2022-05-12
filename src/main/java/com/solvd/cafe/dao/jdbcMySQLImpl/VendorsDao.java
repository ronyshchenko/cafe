package com.solvd.cafe.dao.jdbcMySQLImpl;

import com.solvd.cafe.dao.IVendorsDao;
import com.solvd.cafe.models.WorkersModel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.*;
import java.util.ResourceBundle;

public class VendorsDao implements IVendorsDao {

    private static final Logger LOGGER = LogManager.getLogger(VendorsDao.class);

    @Override
    public void createVendors(int id, String address, String email, String name) {

    }

    @Override
    public void updateVendors(int id, String address, String email, String name) {

    }

    @Override
    public void deleteVendorsById(int id) {

    }

    @Override
    public WorkersModel getVendorsById(int id) {
        return null;
    }
}
