package com.solvd.cafe.dao;

import com.solvd.cafe.models.OrdersModel;

public interface IOrdersDao {

    void createOrders(int id,int cashierid, int courierid, int custid, String date, int prodId, int cuantity);

    void updateOrders(int id,int cashierid, int courierid, int custid, String date, int prodId, int cuantity);

    void deleteOrdersById(int id);

    OrdersModel getOrdersById(int id);
}
