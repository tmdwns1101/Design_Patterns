package com.lsj.templateMethod;

import java.util.List;

public class SimpleReportGenerator extends ReportGenerator {

    @Override
    protected boolean verifyCustomerState(Customer customer) {
        return true;
    }

    @Override
    protected String makeBody(List<Customer> customers) {
        StringBuilder sb = new StringBuilder();

        int number = 1;
        for (Customer customer : customers) {

            int point = customer.getPoint();
            String name = customer.getName();

            String record = String.format("고객%d %d: 고객%d %s\n", number, point, number, name);
            sb.append(record);

            number++;
        }

        return sb.toString();
    }

    @Override
    protected String makeFooter(List<Customer> customers) {
        return "";
    }
}
