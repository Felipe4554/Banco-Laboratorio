package Account;

import Person.Customer;

public class ColonAccount extends Account {
    
    public ColonAccount(String number, double balance, Customer customer ) {
        super(number, balance, customer);
    }
    public ColonAccount(String number, Customer customer ) {
        super(number, customer);
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
