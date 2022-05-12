package com.solvd.cafe.dao;

import com.solvd.cafe.models.CustomersModel;

public interface ICustomersDao {

    void createCustomers(int id,String address,String city, String email, String name);

    void updateCustomers(int id,String address,String city, String email, String name);

    void deleteCustomersById(int id);

    CustomersModel getCustomersById(int id);

}
