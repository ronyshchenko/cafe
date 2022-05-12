package com.solvd.cafe.dao;

import com.solvd.cafe.models.ProductsModel;

public interface IProductsDao {

    void createProducts(int id, int categoryId, String description, String name, int price, int reciprId, int vendId);

    void updateProducts(int id, int categoryId, String description, String name, int price, int reciprId, int vendId);

    void deleteProductsById(int id);

    ProductsModel getProductsByid(int id);
}
