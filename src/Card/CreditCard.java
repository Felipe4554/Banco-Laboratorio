/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Card;

/**
 *
 * @author ´Felipe Chacón
 */
<<<<<<< HEAD
public class CreditCard {
=======
public class CreditCard extends Card{
>>>>>>> a4a333f671d5a681a16e98a805ec5d6dfaf5f92e
    private double balance;
    private double creditLimit;
    private static double interestRate;

    public double getBalance() {
        return balance;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public static double getInterestRate() {
        return interestRate;
    }
<<<<<<< HEAD
    
    public boolean MakePurchase(double amount){
        
        return true;  
    }
    
    public boolean MakePayment(double amount){
        
        return true;  
=======

    public CreditCard(double balance, double creditLimit) {
        this.balance = balance;
        this.creditLimit = creditLimit;
        this.interestRate = getInterestRate();    
    }
    
    @Override
    public boolean MakePurchase(double amount){
        if (isActive() && amount > 0) {
            if (balance + amount <= creditLimit) {
                balance += amount; 
                return true; 
            }
        }
        return false; 
    }

    
    public boolean MakePayment(double amount){
        if (isActive() && amount > 0) {
            if (balance >= amount) {
                balance -= amount; 
                return true; 
            }
        }
        return false;  
>>>>>>> a4a333f671d5a681a16e98a805ec5d6dfaf5f92e
    }
}
