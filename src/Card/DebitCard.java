/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Card;

import Account.Account;

/**
 *
 * @author ´Felipe Chacón
 */
public class DebitCard {
    private Account account;

    public Account getAccount() {
        return account;
    }

    public DebitCard(Account account) {
        this.account = account;
        // debe heredar el numero de tarjeta number = numer;
    }
    
    
    public boolean MakePurchase(double amount){
        
        return true;  
    }
}
