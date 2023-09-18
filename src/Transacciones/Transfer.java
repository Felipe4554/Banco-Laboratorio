/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transacciones;

import Account.Account;
import java.util.Date;

/**
 *
 * @author rsand
 */
public class Transfer extends Transaction {
    private Account destination;

    public Transfer(Account destination, double amount, Account source, Date date) {
        super(amount, source, date);
        this.destination = destination;
    }
    
    public Account getDestination() {
        return destination;
    }
    
    public boolean execute(){
        return true;
    }
}
