package com.solvd.cafe.exeption;

public class DaoExeption extends RuntimeException {
    public DaoExeption(Throwable throwable) {
        super(throwable);
    }
}
