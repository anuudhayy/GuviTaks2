package com.tak2;


public class Account {
    private double balance;

    // No-argument constructor
    public Account() {
        this.balance = 0.0; 
    }

    // Constructor with initial balance
    public Account(double initialBalance) {
        if (initialBalance >= 0.0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Initial balance cannot be negative. Setting balance to 0.0");
            this.balance = 0.0;
        }
    }

    // Method to deposit amount
    public void deposit(double amount) {
        if (amount > 0.0) {
            this.balance += amount;
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw amount
    public void withdraw(double amount) {
        if (amount > 0.0 && amount <= balance) {
            this.balance -= amount;
        } else if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    // Method to display balance
    public void displayBalance() {
        System.out.println("Current balance: $" + balance);
    }
    public static void main(String[] args) {
		Account ac=new Account();
		ac.deposit(8000);
		ac.withdraw(5000);
		ac.displayBalance();
	}
}