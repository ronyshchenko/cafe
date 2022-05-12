package com.solvd.cafe.dao;

import com.solvd.cafe.models.WorkersModel;

public interface IVendorsDao {

    void createVendors(int id, String address, String email, String name);

    void updateVendors(int id, String address, String email, String name);

    void deleteVendorsById(int id);

    WorkersModel getVendorsById(int id);
}
