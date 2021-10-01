package com.company;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Branch> branches;

    public Bank(ArrayList<Branch> branches) {
        this.branches = branches;
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }

    public void addBranch (String branchName) {
        Branch newBranch = new Branch(branchName);
        branches.add(newBranch);
    }

    public void addNewCustomer (String branchName, String customerName, double initialTransaction) {
        int branchPosition = findPosition(branchName);
        if (branchPosition >= 0) {
            branches.get(branchPosition).newCustomer(customerName, initialTransaction);

        } else {
            System.out.println("cannot find name of the branch.");
        }
    }

    public ArrayList<Customer> findCustomerListForBranch (String branchName) {
        int branchPosition = findPosition(branchName);
        if (branchPosition >0) {
            return branches.get(branchPosition).getCustomers();
        } else {
            System.out.println("cannot fine name of the branch");
            return null;
        }
    }

    public ArrayList<Double> findTransactionsForCustomer (String branchName, String customerName) {
        int branchPosition = findPosition(branchName);
        if (branchPosition >0) {
            return branches.get(branchPosition).getCustomer(customerName).getTransactions();
        } else {
            System.out.println("cannot fine name of the branch");
            return null;
        }
    }

    private int findPosition(String name) {
        for (int i = 0; i < branches.size(); i++) {
            if (branches.get(i).getName() == name) {
                return i;
            }
        }
        return -1;
    }
}
