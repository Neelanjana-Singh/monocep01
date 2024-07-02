package com.techlabs.Interface;

import com.techlabs.model.Supplier;

import java.util.List;

public interface ISupplier {
    void addSupplier(Supplier supplier);
    void updateSupplier(Supplier supplier);
    void deleteSupplier(String supplierId);
    Supplier getSupplier(String supplierId);
    List<Supplier> getAllSuppliers();
}
