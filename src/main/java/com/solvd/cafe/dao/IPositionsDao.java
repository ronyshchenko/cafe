package com.solvd.cafe.dao;

import com.solvd.cafe.models.CafeModel;
import com.solvd.cafe.models.PositionsModel;

import java.util.List;

public interface IPositionsDao {

    void createPositions(PositionsModel positionsModel);

    void updatePositions(int id, int salary);

    void deletePositionsById(int id);

    List<PositionsModel> getPositionsById(int id);

}
