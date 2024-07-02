package com.techlabs.model;

import com.techlabs.Interface.DataPersistance;
import com.techlabs.exception.DataPersistenceException;

import java.io.*;
import java.util.List;

public class DataManager implements DataPersistance {
    private static final String PRODUCT_PATH = "E:\\Java Training\\investory-management-app\\src\\com\\techlabs\\model\\Product";
    private static final String SUPPLIER_PATH = "E:\\Java Training\\investory-management-app\\src\\com\\techlabs\\model\\Suppliers";
    private static final String TRANSACTION_PATH = "E:\\Java Training\\investory-management-app\\src\\com\\techlabs\\model\\Transactions";

    @Override
    public void saveProducts(List<Product> products) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(PRODUCT_PATH))) {
            objectOutputStream.writeObject(products);
        } catch (IOException e) {
            throw new DataPersistenceException("Error saving products", e);
        }
    }

    @Override
    public List<Product> loadProducts() {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(PRODUCT_PATH))) {
            return (List<Product>) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new DataPersistenceException("Error loading products", e);
        }
    }

    @Override
    public void saveSuppliers(List<Supplier> suppliers) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(SUPPLIER_PATH))) {
            objectOutputStream.writeObject(suppliers);
        } catch (IOException e) {
            throw new DataPersistenceException("Error saving suppliers", e);
        }
    }

    @Override
    public List<Supplier> loadSuppliers() {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(SUPPLIER_PATH))) {
            return (List<Supplier>) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new DataPersistenceException("Error loading suppliers", e);
        }
    }

    @Override
    public void saveTransactions(List<Transaction> transactions) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(TRANSACTION_PATH))) {
            objectOutputStream.writeObject(transactions);
        } catch (IOException e) {
            throw new DataPersistenceException("Error saving transactions", e);
        }
    }

    @Override
    public List<Transaction> loadTransactions() {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(TRANSACTION_PATH))) {
            return (List<Transaction>) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new DataPersistenceException("Error loading transactions", e);
        }
    }
}
