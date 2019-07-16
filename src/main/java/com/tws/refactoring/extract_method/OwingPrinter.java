package com.tws.refactoring.extract_method;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class OwingPrinter {
    void printOwing(String name, List<Order> orders) {
        double outstanding = getOutstanding(orders);
        print(name, outstanding);

    }

    private void print(String name, double outstanding) {
        // print banner
        System.out.println ("*****************************");
        System.out.println ("****** Customer totals ******");
        System.out.println ("*****************************");
        // print details
        System.out.println("name: " + name);
        System.out.println("amount: " + outstanding);
    }

    private double getOutstanding(List<Order> orders) {
        return orders.stream().mapToDouble(Order::getAmount).sum();
    }
}

class Order {
    private final double amount;

    public Order(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
