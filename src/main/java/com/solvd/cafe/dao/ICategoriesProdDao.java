package com.solvd.cafe.dao;

import com.solvd.cafe.models.CategoriesProdModel;
import com.solvd.cafe.models.CurrenciesModel;

import java.util.List;

public interface ICategoriesProdDao {


    void createCategoriesProd(CategoriesProdModel categoriesProdModel);

    void updateCategoriesProd(int id, String name);

    void deleteCategoriesProdById(int id);

    List<CategoriesProdModel> getCategoriesProdId(int id);

}
