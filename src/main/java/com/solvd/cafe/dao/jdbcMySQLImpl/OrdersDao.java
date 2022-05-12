package com.solvd.cafe.dao.jdbcMySQLImpl;

import com.solvd.cafe.dao.IOrdersDao;
import com.solvd.cafe.models.OrdersModel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.*;
import java.util.ResourceBundle;

public class OrdersDao implements IOrdersDao {

    private static final Logger LOGGER = LogManager.getLogger(OrdersDao.class);

    @Override
    public void createOrders(int id, int cashierid, int courierid, int custid, String date, int prodId, int cuantity) {

    }

    @Override
    public void updateOrders(int id, int cashierid, int courierid, int custid, String date, int prodId, int cuantity) {

    }

    @Override
    public void deleteOrdersById(int id) {

    }

    @Override
    public OrdersModel getOrdersById(int id) {
        return null;
    }
}
