package com.techlabs.strategyPattern.test;

import com.techlabs.strategyPattern.model.AddOperation;
import com.techlabs.strategyPattern.model.MultiplyOperation;
import com.techlabs.strategyPattern.model.OperationStrategy;

public class StrategyTest {
    public static void main(String[] args) {
        
        OperationStrategy op = new OperationStrategy(new AddOperation());
        System.out.println("Addition: " + op.doOperation(20, 30)); 

        op.setOperation(new MultiplyOperation());
        System.out.println("Multiplication: " + op.doOperation(12, 10)); 
    }
}
