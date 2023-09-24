/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transacciones.Dtos;

import Transacciones.*;
import Account.Account;
import java.util.Date;

/**
 *
 * @author rsand
 */
public class TransferDto extends Transaction {
    private Account destination;

    public TransferDto(Account destination, double amount, Account source) {
        super(amount, source);
        this.destination = destination;
    }
    
    public Account getDestination() {
        return destination;
    }
    
    @Override
    public boolean execute(){
        return true;
    }
}
