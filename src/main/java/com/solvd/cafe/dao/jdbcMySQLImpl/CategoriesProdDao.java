package com.solvd.cafe.dao.jdbcMySQLImpl;

import com.solvd.cafe.dao.ICategoriesProdDao;
import com.solvd.cafe.models.CategoriesProdModel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.*;
import java.util.ResourceBundle;

public class CategoriesProdDao implements ICategoriesProdDao {


    @Override
    public void createCategoriesProd(int id, String description, String name) {

    }

    @Override
    public void updateCategoriesProd(int id, String description, String name) {

    }

    @Override
    public void deleteCategoriesProdById(int id) {

    }

    @Override
    public CategoriesProdModel getCategoriesProdId(int id) {
        return null;
    }
}
