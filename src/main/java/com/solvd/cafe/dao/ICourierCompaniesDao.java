package com.solvd.cafe.dao;

import com.solvd.cafe.models.CouriersModel;

public interface ICourierCompaniesDao {
    void createCourierCompanies(int id,String address,String name, String email, String site);

    void updateCourierCompanies(int id,String address,String name, String email, String site);

    void deleteCourierCompaniesById(int id);

    CouriersModel getCourierCompaniesById(int id);
}
