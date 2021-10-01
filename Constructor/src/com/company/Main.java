package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code hereBank
        BankAccount Account = new BankAccount("12345", 0.00, "Quoc Luong", "Quocluong@gmail.com", "714");
        BankAccount EmptyAccount = new BankAccount();
        System.out.println(Account.getCustomerName());
        Account.withdrawal(500);
        Account.setBalance(50000);
        Account.deposit(2000);
        Account.withdrawal(5000);
    }
}
