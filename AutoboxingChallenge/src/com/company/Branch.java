package com.company;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name){
        this(name, new ArrayList<>());
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Branch(String name, ArrayList<Customer> customers) {
        this.customers = customers;
        this.name = name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public Customer getCustomer (String customerName) {
        int position = findPosition(customerName);
        if (position >= 0) {
            return customers.get(position);
        } else {
            System.out.println("cannot find customer name.");
            return null;
        }
    }

    public void newCustomer(String name, double initialTransaction) {
        customers.add(new Customer(name, initialTransaction));
    }

    public void addNewTransaction(String customerName, double transaction) {
        int position = findPosition(customerName);
        if (position >= 0) {
            customers.get(position).addTransaction(transaction);
        } else {
            System.out.println("cannot find customer name.");
        }
    }

    private int findPosition(String name) {
        for(int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }
}
