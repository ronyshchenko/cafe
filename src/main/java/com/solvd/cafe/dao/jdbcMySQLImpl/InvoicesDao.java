package com.solvd.cafe.dao.jdbcMySQLImpl;

import com.solvd.cafe.dao.IInvoicesDao;
import com.solvd.cafe.models.InvoicesModel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.*;
import java.util.ResourceBundle;

public class InvoicesDao implements IInvoicesDao {

    private static final Logger LOGGER = LogManager.getLogger(InvoicesDao.class);

    @Override
    public void createInvoices(int id, String date, String description, int receiverid, int volume) {

    }

    @Override
    public void updateInvoices(int id, String date, String description, int receiverid, int volume) {

    }

    @Override
    public void deleteInvoicesId(int id) {

    }

    @Override
    public InvoicesModel getInvoicesById(int id) {
        return null;
    }
}
