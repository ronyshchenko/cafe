package com.solvd.cafe.dao;

import com.solvd.cafe.models.CurrenciesModel;

public interface CurrenciesDao {

    void createCurrencies(int id, String name);

    void updateCurrencies(int id, String name);

    void deleteCurrenciesById(int id);

    CurrenciesModel getCurrenciesName(String currenciesName);
}
