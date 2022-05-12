package com.solvd.cafe.dao;

import com.solvd.cafe.models.CafeModel;

public interface ICafeDao {

    void create(int id,String address,String email,String name, String site);

    void update(String appointmentDate,int id);

    int delete(int id);

    CafeModel getCafeByName(String name);
}
