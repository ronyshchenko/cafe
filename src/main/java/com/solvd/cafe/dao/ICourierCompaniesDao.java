package com.solvd.cafe.dao;

import com.solvd.cafe.models.CourierCompaniesModel;
import com.solvd.cafe.models.CouriersModel;

import java.util.List;

public interface ICourierCompaniesDao {
    void createCourierCompanies(CourierCompaniesModel courierCompanies);

    void updateCourierCompanies(int id, String name);

    void deleteCourierCompaniesById(int id);

    List<CourierCompaniesModel> getCourierCompaniesById(int id);
}
