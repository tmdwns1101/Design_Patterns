package com.lsj.templateMethod;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();

        customers.add(new Customer("Tom", 150));
        customers.add(new Customer("Alice", 350));
        customers.add(new Customer("Sunny", 50));
        customers.add(new Customer("Tonny", 450));
        customers.add(new Customer("Bob", 350));

        String simpleReport = getReport(new SimpleReportGenerator(), customers);
        System.out.println(simpleReport);
        System.out.println("=========================");
        String complexReport = getReport(new ComplexReportGenerator(), customers);
        System.out.println(complexReport);
    }

    public static String getReport(ReportGenerator reportGenerator, List<Customer> customers) {
        return reportGenerator.generate(customers);
    }
}
