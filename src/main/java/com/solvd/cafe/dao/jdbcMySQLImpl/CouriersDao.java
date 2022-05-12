package com.solvd.cafe.dao.jdbcMySQLImpl;

import com.solvd.cafe.dao.ICouriersDao;
import com.solvd.cafe.models.CouriersModel;
import com.solvd.cafe.models.CurrenciesModel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CouriersDao implements ICouriersDao {


    @Override
    public void createCouriers(int id, int companyId, String name, String phone, String surname) {

    }

    @Override
    public void updateCouriers(int id, int companyId, String name, String phone, String surname) {

    }

    @Override
    public void deleteCouriersById(int id) {

    }

    @Override
    public CouriersModel getCouriersById(int id) {
        return null;
    }

    @Override
    public void createCurrencies(int id, String name) {

    }
}
