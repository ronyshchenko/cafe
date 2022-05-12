package com.solvd.cafe.dao.jdbcMySQLImpl;

import com.solvd.cafe.dao.IProductsDao;
import com.solvd.cafe.models.ProductsModel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.*;
import java.util.ResourceBundle;

public class ProductsDao implements IProductsDao {

    private static final Logger LOGGER = LogManager.getLogger(ProductsDao.class);

    @Override
    public void createProducts(int id, int categoryId, String description, String name, int price, int reciprId, int vendId) {

    }

    @Override
    public void updateProducts(int id, int categoryId, String description, String name, int price, int reciprId, int vendId) {

    }

    @Override
    public void deleteProductsById(int id) {

    }

    @Override
    public ProductsModel getProductsByid(int id) {
        return null;
    }
}
