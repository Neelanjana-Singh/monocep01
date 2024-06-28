package com.techlabs.isp.violation.model;


public class Robot implements IWorker {
 @Override
 public void startWork() {
     System.out.println("Robot starts working.");
 }

 @Override
 public void stopWork() {
     System.out.println("Robot stops working.");
 }

 @Override
 public void eat() {
     System.out.println("Robot does not eat.");
 }

 @Override
 public void drink() {
     System.out.println("Robot does not drink.");
 }
}
