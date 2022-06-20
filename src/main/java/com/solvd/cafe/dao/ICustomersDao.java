package com.solvd.cafe.dao;

import com.solvd.cafe.models.CustomersModel;

import java.util.List;

public interface ICustomersDao {

    void createCustomers(CustomersModel customersModel);

    void updateCustomers(int id, String name);

    void deleteCustomersById(int id);

    List<CustomersModel> getCustomersById(int id);

}
