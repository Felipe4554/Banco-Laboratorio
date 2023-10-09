/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Account;

public class AccountSinpe {

    private Account account;

    public AccountSinpe(Account account) {
        this.account = account;
    }

    public boolean hacerPago(double monto) {
        if (monto > 0 && account.getBalance() >= monto) {
            return account.withdraw(monto);
        } else {
            return false;
        }
    }

    public boolean recibirPago(double monto) {
        if (monto > 0) {
            return account.deposit(monto);
        } else {
            return false;
        }
    }
}