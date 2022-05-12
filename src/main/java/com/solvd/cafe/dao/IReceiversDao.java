package com.solvd.cafe.dao;

import com.solvd.cafe.models.ReceiversModel;

public interface IReceiversDao {

    void createReceivers(int id, String address, String email, String name, String phone);

    void updateReceivers(int id, String address, String email, String name, String phone);

    void deleteReceiversById(int id);

    ReceiversModel getReceiversById(int id);
}
