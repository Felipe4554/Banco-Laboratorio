package Account;

import Usuarios.Customer;

public class ColonAccount extends Account {
    
    public ColonAccount(String number, double balance, Customer customer, boolean active) {
        super(number, balance, customer, active);
    }
    
    public boolean transfer(Account destination, double amount) {
        if (destination instanceof DollarAccount) {
            double conversionRate = DollarAccount.exchangeRate();
            double amountInDollars = amount / conversionRate;
            if (super.withdraw(amount)) {
                destination.deposit(amountInDollars);
                return true;
            } else {
                return false;
            }
        } else {
            return super.transfer(destination, amount);
        }
    }
}
