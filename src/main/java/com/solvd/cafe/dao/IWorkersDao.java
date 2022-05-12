package com.solvd.cafe.dao;

import com.solvd.cafe.models.VendorsModel;

public interface IWorkersDao {

    void createWorkers(int id, String address, String email, String name, String phone, int positionsId, String surname);

    void updateWorkers(int id, String address, String email, String name, String phone, int positionsId, String surname);

    void deleteWorkersById(int id);

    VendorsModel getWorkersById(int id);
}
