package com.techlabs.Interface;

import java.util.List;

import com.techlabs.model.Transaction;

public interface ITransaction {
    List<Transaction> getTransactionHistory(String productId);
    List<Transaction> getAllTransactions();
}