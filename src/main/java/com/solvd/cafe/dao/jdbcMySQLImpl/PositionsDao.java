package com.solvd.cafe.dao.jdbcMySQLImpl;

import com.solvd.cafe.dao.IPositionsDao;
import com.solvd.cafe.models.PositionsModel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.*;
import java.util.ResourceBundle;

public class PositionsDao implements IPositionsDao {

    private static final Logger LOGGER = LogManager.getLogger(PositionsDao.class);

    @Override
    public void createPositions(int id, int cafeid, String nameDepart, int salary) {

    }

    @Override
    public void updatePositions(int id, int cafeid, String nameDepart, int salary) {

    }

    @Override
    public void deletePositionsById(int id) {

    }

    @Override
    public PositionsModel getPositionsById(int id) {
        return null;
    }
}
