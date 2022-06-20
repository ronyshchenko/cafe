package com.solvd.cafe.dao;
import com.solvd.cafe.models.PaimentsModel;

import java.util.List;

public interface IPaimentsDao {

    void createPaiments(PaimentsModel paimentsModel);

    void updatePaiments(int id, int volumefact);

    void deletePaimentsById(int id);

    List<PaimentsModel> getPaimentsById(int id);
}
