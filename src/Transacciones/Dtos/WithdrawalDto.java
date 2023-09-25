/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transacciones.Dtos;

import Account.Account;
import java.util.Date;

/**
 *
 * @author rsand
 */
public class WithdrawalDto {
    private double amount;
    private Account source;
    private Date date;

    public WithdrawalDto(double amount, Account source, Date date) {
        this.amount = amount;
        this.source = source;
        this.date = date;
    }

}