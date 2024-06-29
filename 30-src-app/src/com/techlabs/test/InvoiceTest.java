package com.techlabs.test;

import java.util.Scanner;
import com.techlabs.model.Invoice;
import com.techlabs.model.TaxCalculator;
import com.techlabs.model.InvoicePrinter;

public class InvoiceTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter Invoice ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();  

        System.out.print("Enter Description: ");
        String description = scanner.nextLine();

        System.out.print("Enter Amount: ");
        double amount = scanner.nextDouble();

        System.out.print("Enter Tax Rate percentage: ");
        double taxRate = scanner.nextDouble();

        
        Invoice invoice = new Invoice(id, description, amount);

        
        TaxCalculator taxCalculator = new TaxCalculator(taxRate);
        taxCalculator.calculateTax(invoice);

        
        InvoicePrinter invoicePrinter = new InvoicePrinter();
        invoicePrinter.printInvoice(invoice);

        scanner.close();
    }
}
