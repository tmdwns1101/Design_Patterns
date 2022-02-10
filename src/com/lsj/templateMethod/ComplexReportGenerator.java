package com.lsj.templateMethod;

import java.util.List;

public class ComplexReportGenerator extends ReportGenerator {

    @Override
    protected boolean verifyCustomerState(Customer customer) {
        return customer.getPoint() >= 100;
    }

    @Override
    protected String makeBody(List<Customer> customers) {
        StringBuilder sb = new StringBuilder();

        int number = 1;
        for (Customer customer : customers) {

            int point = customer.getPoint();
            String name = customer.getName();

            String record = String.format("VIP 고객%d %d: VIP 고객%d %s\n", number, point, number, name);
            sb.append(record);

            number++;
        }

        return sb.toString();
    }

    @Override
    protected String makeFooter(List<Customer> customers) {

        int totalPoints = customers.stream()
                .mapToInt(Customer::getPoint)
                .sum();
        return String.format("점수 합계 : %d", totalPoints);
    }
}
