package com.techlabs.model;

import com.techlabs.Interface.IProduct;
import com.techlabs.exception.DuplicateProductException;
import com.techlabs.exception.InvalidProductIdException;

import java.util.*;

public  class ProductManager implements IProduct{
    private Map<String, Product> productMap = new HashMap<>();
    @Override
    public void addProduct(Product product){
        if(productMap.containsKey(product.getProductId())){
            throw new DuplicateProductException("Product ID already exists");
        }
        productMap.put(product.getProductId(), product);
    }

    @Override
    public void updateProduct(Product product) {
        if(!productMap.containsKey(product.getProductId())){
            throw new InvalidProductIdException("Product ID not found");
        }
        productMap.put(product.getProductId(), product);
    }

    @Override
    public void deleteProduct(String productId) {
        if(!productMap.containsKey(productId)){
            throw new InvalidProductIdException("Product ID not found");
        }
        productMap.remove(productId);
    }

    @Override
    public Product getProduct(String productId) {
        if(!productMap.containsKey(productId)){
            throw new InvalidProductIdException("Product ID not found");
        }
        return productMap.get(productId);
    }

    @Override
    public List<Product> getAllProducts() {
        return new ArrayList<>(productMap.values());
    }
}