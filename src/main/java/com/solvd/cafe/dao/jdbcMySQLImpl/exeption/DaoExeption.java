package com.solvd.cafe.dao.jdbcMySQLImpl.exeption;

public class DaoExeption extends RuntimeException {
    public DaoExeption(Throwable throwable) {
        super(throwable);
    }
}
