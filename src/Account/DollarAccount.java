package Account;

import Usuarios.Customer;

public class DollarAccount extends Account {
    
    public DollarAccount(String number, double balance, Customer customer, boolean active) {
        super(number, balance, customer, active);
    }
    
    public static double exchangeRate() {
        
        return 0;
        
    }
    
    public boolean transfer(Account destination, double amount) {
        
        return false;
        
    }
}
