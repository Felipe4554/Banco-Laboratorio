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
public class Deposit extends Transaction {

    public Deposit(double amount, Account source) {
        super(amount, source);
    }

    @Override
    public boolean execute(){
        return true;
    }
}
