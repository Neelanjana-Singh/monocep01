package com.techlabs.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.techlabs.Interface.ITransaction;

public class TransactionManager implements ITransaction{
    private List<Transaction> transactions = new ArrayList<>();

    public synchronized void recordTransaction(Transaction transaction){
        transactions.add(transaction);
    }

    @Override
    public List<Transaction> getTransactionHistory(String productId) {
        return transactions.stream().filter(transaction -> transaction.getProductId().equals(productId)).collect(Collectors.toList());
    }

    @Override
    public List<Transaction> getAllTransactions() {
        return new ArrayList<>(transactions);
    }
}