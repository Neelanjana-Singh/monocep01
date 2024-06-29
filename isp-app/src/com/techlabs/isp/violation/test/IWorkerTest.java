package com.techlabs.isp.violation.test;

import com.techlabs.isp.violation.model.IWorker;
import com.techlabs.isp.violation.model.Labour;
import com.techlabs.isp.violation.model.Robot;

public class IWorkerTest {
    public static void main(String[] args) {
        
        IWorker labour = new Labour();
        System.out.println("Labour:");
        labour.startWork();
        labour.eat();
        labour.drink();
        labour.stopWork();

        System.out.println();

        
        IWorker robot = new Robot();
        System.out.println("Robot:");
        robot.startWork();
        robot.eat();
        robot.drink();
        robot.stopWork();
    }
}
