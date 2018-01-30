package com.curso.springapp.repository;

import java.util.List;

import com.curso.springapp.domain.Product;

public interface ProductDao {

    public List<Product> getProductList();

    public void saveProduct(Product prod);

}