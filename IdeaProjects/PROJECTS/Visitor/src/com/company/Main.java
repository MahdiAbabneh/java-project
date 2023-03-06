package com.company;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Client> clients = List.of(
                new Bank("bank_name", "bank_address", "bank_number", 10),
                new Company("company_name", "company_address", "company_number", 1000),
                new Restaurant("Restaurant_name", "Restaurant_address", "Restaurant_number", true)
        );

        InsuranceMessagingVisitor visitor = new InsuranceMessagingVisitor();
        visitor.sendInsuranceMails(clients);

    }
}
