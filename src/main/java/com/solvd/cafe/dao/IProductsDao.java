package com.solvd.cafe.dao;

import com.solvd.cafe.models.ProductsModel;

import java.util.List;

public interface IProductsDao {

    void createProducts(ProductsModel productsModel);

    void updateProducts(int id, String name);

    void deleteProductsById(int id);

    List<ProductsModel> getProductsByid(int id);

}
