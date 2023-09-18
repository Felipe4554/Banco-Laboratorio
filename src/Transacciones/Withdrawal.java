/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transacciones;

import java.util.Date;

/**
 *
 * @author rsand
 */
public class Withdrawal extends Transaction {
    
    public Withdrawal(double amount, Object source, Date date) {
        super(amount, source, date);
    }
    public boolean execute(){
        return true;
    }
}
