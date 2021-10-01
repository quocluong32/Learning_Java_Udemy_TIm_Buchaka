package com.company;

import java.util.ArrayList;

public class Customer {
    private final String name;
    private ArrayList <Double> transactions;

    public Customer(String name, double initialTransaction) {
        this(name, new ArrayList<>());
        this.addTransaction(initialTransaction);
    }

    public Customer(String name, ArrayList<Double> transactions) {
        this.name = name;
        this.transactions = transactions;
    }

    public void addTransaction(Double transaction) {
        transactions.add(transaction);
    }

    public void addTransaction(double transaction) {
        transactions.add(transaction);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}
