package com.solvd.cafe.dao;

import com.solvd.cafe.models.InvoicesModel;

public interface IInvoicesDao {

    void createInvoices(int id, String date, String description, int receiverid, int volume);

    void updateInvoices(int id, String date, String description, int receiverid, int volume);

    void deleteInvoicesId(int id);

    InvoicesModel getInvoicesById(int id);
}
