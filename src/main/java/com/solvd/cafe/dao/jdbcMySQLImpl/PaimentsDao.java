package com.solvd.cafe.dao.jdbcMySQLImpl;

import com.solvd.cafe.dao.IPaimentsDao;
import com.solvd.cafe.models.PaimentsModel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.*;
import java.util.ResourceBundle;

public class PaimentsDao implements IPaimentsDao {

    private static final Logger LOGGER = LogManager.getLogger(PaimentsDao.class);

    @Override
    public void createPaiments(int id, int accountantid, int currencyid, int debt, int invoiceid, int volumefact) {

    }

    @Override
    public void updatePaiments(int id, int accountantid, int currencyid, int debt, int invoiceid, int volumefact) {

    }

    @Override
    public void deletePaimentsById(int id) {

    }

    @Override
    public PaimentsModel getPaimentsById(int id) {
        return null;
    }
}
