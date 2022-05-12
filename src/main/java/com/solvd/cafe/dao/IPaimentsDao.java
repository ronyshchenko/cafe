package com.solvd.cafe.dao;
import com.solvd.cafe.models.PaimentsModel;

public interface IPaimentsDao {

    void createPaiments(int id, int accountantid, int currencyid, int debt, int invoiceid, int volumefact);

    void updatePaiments(int id, int accountantid, int currencyid, int debt, int invoiceid, int volumefact);

    void deletePaimentsById(int id);

    PaimentsModel getPaimentsById(int id);
}
