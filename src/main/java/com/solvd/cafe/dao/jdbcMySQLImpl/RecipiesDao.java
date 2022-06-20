package com.solvd.cafe.dao.jdbcMySQLImpl;

import com.solvd.cafe.dao.IRecipiesDao;
import com.solvd.cafe.models.RecipiesModel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RecipiesDao implements IRecipiesDao {

    private static final Logger LOGGER = LogManager.getLogger(RecipiesDao.class);

    @Override
    public void createRecipies(int id, String description, String name) {

    }

    @Override
    public void updateRecipies(int id, String description, String name) {

    }

    @Override
    public void deleteRecipiesById(int id) {

    }

    @Override
    public RecipiesModel getRecipiesById(int id) {
        return null;
    }
}
