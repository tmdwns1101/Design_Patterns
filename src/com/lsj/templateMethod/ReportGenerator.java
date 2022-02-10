package com.lsj.templateMethod;

import java.util.List;
import java.util.stream.Collectors;

public abstract class ReportGenerator {

    public final String generate(List<Customer> customers) {
        StringBuilder sb = new StringBuilder();

        List<Customer> filteredCustomers = customers.stream()
                .filter(this::verifyCustomerState)
                .collect(Collectors.toList());

        String header = makeHeader(filteredCustomers);
        String body = makeBody(filteredCustomers);
        String footer = makeFooter(filteredCustomers);

        return sb.append(header)
                .append(body)
                .append(footer).toString();

    }

    protected String makeHeader(List<Customer> customers) {
        return "고객 수 : " + customers.size() + "명입니다.\n";
    }

    protected abstract boolean verifyCustomerState(Customer customer);
    protected abstract String makeBody(List<Customer> customers);
    protected abstract String makeFooter(List<Customer> customers);

}
