package com.solvd.cafe.dao;

import com.solvd.cafe.models.CurrenciesModel;

import java.util.List;

public interface ICurrenciesDao {

    void createCurrencies(CurrenciesModel currenciesModel);

    void updateCurrencies(int id, String name);

    void deleteCurrenciesById(int id);

    List<CurrenciesModel> getCurrenciesById(int id);
}
