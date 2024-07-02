package com.techlabs.model;

import com.techlabs.Interface.ISupplier;
import com.techlabs.exception.DuplicateSupplierException;
import com.techlabs.exception.InvalidSupplierIdException;

import java.util.*;

public class SupplierManager implements ISupplier{
    Map<String, Supplier> supplierMap = new HashMap<>();
    @Override
    public void addSupplier(Supplier supplier) {
        if(supplierMap.containsKey(supplier.getSupplierId())){
            throw new DuplicateSupplierException("Supplier ID already exists");
        }
        supplierMap.put(supplier.getSupplierId(),supplier);
    }

    @Override
    public void updateSupplier(Supplier supplier) {
        if(!supplierMap.containsKey(supplier.getSupplierId())){
            throw new InvalidSupplierIdException("Supplier ID not found");
        }
        supplierMap.put(supplier.getSupplierId(), supplier);
    }

    @Override
    public void deleteSupplier(String supplierId) {
        if(!supplierMap.containsKey(supplierId)){
            throw new InvalidSupplierIdException("Supplier ID not found");
        }
        supplierMap.remove(supplierId);

    }

    @Override
    public Supplier getSupplier(String supplierId) {
        return supplierMap.get(supplierId);
    }

    @Override
    public List<Supplier> getAllSuppliers() {
        return new ArrayList<>(supplierMap.values());
    }
}