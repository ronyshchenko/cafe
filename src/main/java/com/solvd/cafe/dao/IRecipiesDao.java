package com.solvd.cafe.dao;

import com.solvd.cafe.models.RecipiesModel;

public interface IRecipiesDao {

    void createRecipies(int id, String description, String name);

    void updateRecipies(int id, String description, String name);

    void deleteRecipiesById(int id);

    RecipiesModel getRecipiesById(int id);
}
