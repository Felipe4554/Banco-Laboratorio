package Account;

import Person.Customer;

public abstract class Account {
    private String number;
    private double balance;
    private Customer customer;
    private boolean active;

    public String getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public boolean isActive() {
        return active;
    }

    public Account(String number, double balance, Customer customer) {
        this.number = number;
        this.balance = balance;
        this.customer = customer;
        this.active = true;
    }

    public Account(String number, Customer customer) {
        this.number = number;
        this.balance = 0;
        this.customer = customer;
        this.active = true;
    }
    
    public boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        } else {
            return false;
        }
    }
    
    public boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }
    
      public boolean transfer(Account destination, double amount) {
        if (amount > 0 && balance >= amount) {
            if (withdraw(amount)) {
                destination.deposit(amount);
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
