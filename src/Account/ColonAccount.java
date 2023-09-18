package Account;

import Usuarios.Customer;

public class ColonAccount extends Account {
    
    public ColonAccount(String number, double balance, Customer customer, boolean active) {
        super(number, balance, customer, active);
    }
    
    public boolean transfer(Account destination, double amount) {
        
        return false;
        
    }
}
