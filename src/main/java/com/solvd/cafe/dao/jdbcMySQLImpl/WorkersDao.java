package com.solvd.cafe.dao.jdbcMySQLImpl;

import com.solvd.cafe.dao.IWorkersDao;
import com.solvd.cafe.models.VendorsModel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.*;
import java.util.ResourceBundle;

public class WorkersDao implements IWorkersDao {

    private static final Logger LOGGER = LogManager.getLogger(WorkersDao.class);

    @Override
    public void createWorkers(int id, String address, String email, String name, String phone, int positionsId, String surname) {

    }

    @Override
    public void updateWorkers(int id, String address, String email, String name, String phone, int positionsId, String surname) {

    }

    @Override
    public void deleteWorkersById(int id) {

    }

    @Override
    public VendorsModel getWorkersById(int id) {
        return null;
    }
}
