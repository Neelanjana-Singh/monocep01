package com.techlabs.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ExecutionException;

import com.techlabs.model.NewTask;

public class CallableTest {

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(5);

        try {
            Future<Integer> future = service.submit(new NewTask());
            System.out.println(future.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            service.shutdown();
        }
    }
}
