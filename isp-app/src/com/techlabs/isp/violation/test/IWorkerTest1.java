package com.techlabs.isp.violation.test;

import com.techlabs.isp.violation.model.IWorkable;
import com.techlabs.isp.violation.model.IWorker1;
import com.techlabs.isp.violation.model.Robot1;
import com.techlabs.isp.violation.model.Labour1;

public class IWorkerTest1 {
    public static void main(String[] args) {
    	System.out.println("Robot:");
        IWorkable robot = new Robot1();
        robot.start();
        robot.stop();
        System.out.println();
        
        System.out.println("Labour:");
        IWorker1 labour = new Labour1();
        labour.start();
        labour.eat();
        labour.rest();
        labour.stop();
    }
}
