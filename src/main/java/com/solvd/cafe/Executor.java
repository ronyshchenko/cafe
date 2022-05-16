package com.solvd.cafe;

import com.solvd.cafe.dao.jdbcMySQLImpl.CafeDao;
import com.solvd.cafe.dao.jdbcMySQLImpl.CategoriesProdDao;
import com.solvd.cafe.dao.jdbcMySQLImpl.CurrenciesDao;
import com.solvd.cafe.dao.jdbcMySQLImpl.OrdersDao;
import com.solvd.cafe.models.CafeModel;
import com.solvd.cafe.models.CategoriesProdModel;
import com.solvd.cafe.models.CurrenciesModel;
import com.solvd.cafe.models.OrdersModel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.sql.SQLException;

public class Executor {

    private static final Logger LOGGER = LogManager.getLogger(Executor.class);

    public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException {
        //Working with CafeModel
        //CafeModel cafeModel = new CafeModel(2, "Domashnya kuhnya", "Khreshyatik 22",  "dk.com", "ors@mail.ru");
        //CafeDao cafeDao = new CafeDao();
        //cafeDao.createCafe(cafeModel);
        //cafeDao.updateCafe(1,"Domashnyaya kuhnya");
        //cafeDao.getCafeById(1);
        //cafeDao.deleteCafeById(2);

        //Working with CategoriesProdDao
        //CategoriesProdModel categoriesProdModel = new CategoriesProdModel(1007, "Alkohol Drink", "alkohol");
        CategoriesProdDao categoriesProdDao = new CategoriesProdDao();
        //categoriesProdDao.createCategoriesProd(categoriesProdModel);
        //categoriesProdDao.updateCategoriesProd(1006,"Tea");
        //cafeDao.getCafeById(1);
        categoriesProdDao.deleteCategoriesProdById(1007);


        //Working with CurrenciesModel
        //CurrenciesModel currenciesModel = new CurrenciesModel(10, "tenge");
        //CurrenciesDao currenciesDao = new CurrenciesDao();
        //currenciesDao.createCurrencies(currenciesModel);
        //currenciesDao.getCurrenciesById(10);
        //currenciesDao.deleteCurrenciesById(10);
        //currenciesDao.updateCurrencies(10,"Lira");

        //Working with OrdersModel
        //OrdersModel ordersModel = new OrdersModel(6,"2022-01-22 18:40:10.000", 1000000006,
        //1011, 106,  10, 1006);
        //OrdersDao ordersDao = new OrdersDao();
        //ordersDao.createOrders(ordersModel);
        //ordersDao.getOrdersById(6);
        //ordersDao.updateOrders(6,300 );
        //ordersDao.deleteOrdersById(6);
    }
}
