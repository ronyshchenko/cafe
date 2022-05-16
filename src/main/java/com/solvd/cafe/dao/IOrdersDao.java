package com.solvd.cafe.dao;

import com.solvd.cafe.models.OrdersModel;

import java.util.List;

public interface IOrdersDao {

    void createOrders(OrdersModel ordersModel);


    void updateOrders(int id, int quantity);

    void deleteOrdersById(int id);

    List<OrdersModel> getOrdersById(int id);
}
