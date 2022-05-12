package com.solvd.cafe.dao;

import com.solvd.cafe.models.CouriersModel;

public interface ICouriersDao {

    void createCouriers(int id,int companyId,String name, String phone, String surname);

    void updateCouriers(int id,int companyId,String name, String phone, String surname);

    void deleteCouriersById(int id);

    CouriersModel getCouriersById(int id);

    void createCurrencies(int id, String name);
}
