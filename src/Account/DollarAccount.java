package Account;

import Usuarios.Customer;

public class DollarAccount extends Account {
    
    public DollarAccount(String number, double balance, Customer customer, boolean active) {
        super(number, balance, customer, active);
    }
    
    public static double exchangeRate() {   
        return 530;
    }
    
    public boolean transfer(Account destination, double amount) {
        if (destination instanceof ColonAccount) {
            double conversionRate = DollarAccount.exchangeRate();
            double amountInColones = amount * conversionRate;
            if (super.withdraw(amount)) {
                destination.deposit(amountInColones);
                return true;
            } else {
                return false;
            }
        } else {
            return super.transfer(destination, amount);
        }
    }
}
