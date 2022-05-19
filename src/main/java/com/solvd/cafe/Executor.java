package com.solvd.cafe;

import com.solvd.cafe.dao.jdbcMySQLImpl.*;
import com.solvd.cafe.models.*;
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
        //CategoriesProdDao categoriesProdDao = new CategoriesProdDao();
        //categoriesProdDao.createCategoriesProd(categoriesProdModel);
        //categoriesProdDao.updateCategoriesProd(1006,"Tea");
        //categoriesProdDao.getCategoriesProdId(1007);
        //categoriesProdDao.deleteCategoriesProdById(1007);

        //Working with CourierCompaniesDao
        //CourierCompaniesModel courierCompaniesModel = new CourierCompaniesModel(1007, "MyCourier", "test", "test", "test");
        //CourierCompaniesDao courierCompaniesDao = new CourierCompaniesDao();
        //courierCompaniesDao.createCourierCompanies(courierCompaniesModel);
        //courierCompaniesDao.updateCourierCompanies(1007,"Tea");
        //courierCompaniesDao.getCourierCompaniesById(1007);
        //courierCompaniesDao.deleteCourierCompaniesById(1007);

        //Working with CourierDao
        //CouriersModel couriersModel = new CouriersModel(1006, "MyCourier", "test", "test", 1006);
        //CouriersDao couriersDao = new CouriersDao();
        //couriersDao.createCouriers(couriersModel);
        //couriersDao.updateCouriers(1006,"Tea");
        //couriersDao.getCouriersById(1006);
        //couriersDao.deleteCouriersById(1006);

        //Working with CustomersDao
        //CustomersModel customersModel = new CustomersModel(1000000007, "test", "test", "test", "test");
        //CustomersDao customersDao = new CustomersDao();
        //customersDao.createCustomers(customersModel);
        //customersDao.updateCustomers(1000000007,"Tea");
        //customersDao.getCustomersById(1000000007);
        //customersDao.deleteCustomersById(1000000007);

        //Working with InvoicesDao
        //InvoicesModel invoicesModel = new InvoicesModel(6, "test", 1006, "test", 3000);
        //InvoicesDao invoicesDao = new InvoicesDao();
        //invoicesDao.createInvoices(invoicesModel);
        //invoicesDao.updateInvoices(6,2708);
        //invoicesDao.getInvoicesById(6);
        //invoicesDao.deleteInvoicesId(6);


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

        //Working with PaimentsModel
        //PaimentsModel paimentsModel = new PaimentsModel(2, 2, 2, 1011, 1000, 400);
        //PaimentsDao paimentsDao = new PaimentsDao();
        //paimentsDao.createPaiments(paimentsModel);
        //paimentsDao.updatePaiments(2,777);
        //paimentsDao.getPaimentsById(2);
        //paimentsDao.deletePaimentsById(2);

        //Working with PositionsModel
        //PositionsModel positionsModel = new PositionsModel(108, "test", "test", 20002, 1);
        //PositionsDao positionsDao = new PositionsDao();
        //positionsDao.createPositions(positionsModel);
        //positionsDao.updatePositions(108,777);
        //positionsDao.getPositionsById(108);
        //positionsDao.deletePositionsById(108);

        //Working with ProductsModel
//        ProductsModel productsModel = new ProductsModel(107, 1006, "test", 202, "test", 15, 1005);
//        ProductsDao productsDao = new ProductsDao();
//        productsDao.createProducts(productsModel);
        //positionsDao.updatePositions(108,777);
        //positionsDao.getPositionsById(108);
        //positionsDao.deletePositionsById(108);

    }
}
