package ua.com.okten.service;

import ua.com.okten.entity.Product;


import java.util.List;

public interface ProductService {
    void save(String productName);
    void save(Product product);
    Product findOne(int id);
    List<Product> findAll();
}
