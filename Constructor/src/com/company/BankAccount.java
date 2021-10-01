package com.company;

public class BankAccount {
    private String  number;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount() {
        this(null, 0, null, null, null);

        System.out.println("Empty constructor called");

    }

    public BankAccount(String number, double balance, String customerName, String email, String phoneNumber) {
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.customerName = customerName;
    }

    public String  getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double depositAmount) {
        if (depositAmount > 0) {
            setBalance(this.balance + depositAmount);
            System.out.println("Success. Your balance is: " + this.getBalance());
        }
    }

    public void withdrawal (double withdrawalAmount) {
        if (withdrawalAmount < 0) {
            System.out.println("Amount of withdrawal must be positive number.");
        }else if (withdrawalAmount > this.getBalance()) {
            System.out.println("There is insufficient fund.");
        }else   {
            setBalance(this.balance - withdrawalAmount);
            System.out.println("Success. Your balance is: " + this.getBalance());
        }

    }
}
