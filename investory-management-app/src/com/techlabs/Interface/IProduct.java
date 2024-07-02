package com.techlabs.Interface;

import java.util.List;

import com.techlabs.model.Product;

public interface IProduct {
    void addProduct(Product product);
    void updateProduct(Product product);
    void deleteProduct(String productId);
    Product getProduct(String productId);
    List<Product> getAllProducts();
}
