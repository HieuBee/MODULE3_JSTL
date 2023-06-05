package com.example.cs11_mvc.service;

import com.example.cs11_mvc.bean.Product;

import java.util.List;

public interface ProductService {
    boolean save(Product product);
    boolean update(Product product);
    Product findById(int id);
    List<Product> findAll();
    boolean delete(int id);
}
