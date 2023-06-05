package com.example.cs11_mvc.service;

import com.example.cs11_mvc.bean.Product;
import com.example.cs11_mvc.repository.ProductRepository;
import com.example.cs11_mvc.repository.ProductRepositoryImpl;

import java.util.List;

public class ProductServiceImpl implements ProductService {
    private ProductRepository repository = new ProductRepositoryImpl();

    @Override
    public boolean save(Product product) {
        return repository.save(product);
    }

    @Override
    public boolean update(Product product) {
        return repository.update(product);
    }

    @Override
    public Product findById(int id) {
        return repository.findById(id);
    }

    @Override
    public List<Product> findAll() {
        return repository.findAll();
    }

    @Override
    public boolean delete(int id) {
        return repository.delete(id);
    }
}
