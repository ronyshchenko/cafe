package com.solvd.cafe.dao;

import com.solvd.cafe.models.PositionsModel;

public interface IPositionsDao {

    void createPositions(int id,int cafeid, String nameDepart, int salary);

    void updatePositions(int id,int cafeid, String nameDepart, int salary);

    void deletePositionsById(int id);

    PositionsModel getPositionsById(int id);
}
