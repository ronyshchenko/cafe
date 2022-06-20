package com.solvd.cafe.dao;

import com.solvd.cafe.models.InvoicesModel;

import java.util.List;

public interface IInvoicesDao {

    void createInvoices(InvoicesModel invoicesModel);

    void updateInvoices(int id, int volume);

    void deleteInvoicesId(int id);

    List<InvoicesModel> getInvoicesById(int id);
}
