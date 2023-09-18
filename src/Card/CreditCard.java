/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Card;

/**
 *
 * @author ´Felipe Chacón
 */
public class CreditCard {
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

    public CreditCard(double balance, double creditLimit) {
        this.balance = balance;
        this.creditLimit = creditLimit;
        //Hay que añadir la tasa de interes
    }
    
    public boolean MakePurchase(double amount){
        
        return true;  
    }
    
    public boolean MakePayment(double amount){
        
        return true;  
    }
}
