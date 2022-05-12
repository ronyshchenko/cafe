package com.solvd.cafe.dao;

import com.solvd.cafe.models.CategoriesProdModel;

public interface ICategoriesProdDao {

    void createCategoriesProd(int id,String description,String name);

    void updateCategoriesProd(int id,String description,String name);

    void deleteCategoriesProdById(int id);

    CategoriesProdModel getCategoriesProdId(int id);
}
