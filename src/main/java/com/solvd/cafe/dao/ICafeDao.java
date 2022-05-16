package com.solvd.cafe.dao;

import com.solvd.cafe.models.CafeModel;

import java.util.List;

public interface ICafeDao {

    void createCafe(CafeModel cafeModel);

    void updateCafe(int id, String name);

    void deleteCafeById(int id);

    List<CafeModel> getCafeById(int id);

}
