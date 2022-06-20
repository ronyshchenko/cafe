package com.solvd.cafe.dao;

import com.solvd.cafe.models.CouriersModel;

import java.util.List;

public interface ICouriersDao {

    void createCouriers(CouriersModel couriersModel);

    void updateCouriers(int id, String name);

    void deleteCouriersById(int id);

    List<CouriersModel> getCouriersById(int id);
}
