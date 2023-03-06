package com.company;

public interface Visitor {

    void visit(Bank bank);
    void visit(Company company);
    void visit(Restaurant restaurant);
}
