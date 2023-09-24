package Transacciones.Dtos;

import Transacciones.*;
import Account.Account;
import java.util.Date;

/**
 *
 * @author rsand
 */
public class DepositDto extends Transaction {

    public DepositDto(double amount, Account source) {
        super(amount, source);
    }
    
    @Override
    public boolean execute(){    //ARREGLAR, AVERIGUAR Si se ELIMINA O NO
        return true;
    }
}
