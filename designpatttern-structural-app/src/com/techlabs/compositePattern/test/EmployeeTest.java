package com.techlabs.compositePattern.test;

import com.techlabs.compositePattern.model.Developer;
import com.techlabs.compositePattern.model.EmployeeDirectory;
import com.techlabs.compositePattern.model.Manager;

public class EmployeeTest {

    public static void main(String[] args) {
        
        Developer dev1 = new Developer("Shivam", "Senior Developer");
        Developer dev2 = new Developer("Sneha", "Junior Developer");

        Manager manager1 = new Manager("Neel", "Project Manager1");
        Manager manager2 = new Manager("Muskan", "Project Manager2");

        EmployeeDirectory devDirectory = new EmployeeDirectory();
        devDirectory.addEmployee(dev1);
        devDirectory.addEmployee(dev2);

        EmployeeDirectory managerDirectory = new EmployeeDirectory();
        managerDirectory.addEmployee(manager1);
        managerDirectory.addEmployee(manager2);

        EmployeeDirectory companyDirectory = new EmployeeDirectory();
        companyDirectory.addEmployee(devDirectory);
        companyDirectory.addEmployee(managerDirectory);

        System.out.println("All employees:");
        companyDirectory.showEmployeeDetails();

         devDirectory.removeEmployee(dev2);
        managerDirectory.removeEmployee(manager2);

        System.out.println("\nAfter removal :");
        companyDirectory.showEmployeeDetails();
    }
}
