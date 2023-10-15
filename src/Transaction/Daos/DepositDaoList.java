package Transaction.Daos;

import InterfaceDaoListTransaction.DaoListTransaction;
import Transacciones.Dtos.DepositDto;
import java.util.HashMap;
import java.util.List;

public class DepositDaoList implements DaoListTransaction<DepositDto>{
     private HashMap<String,DepositDto> depositList;
     private static DepositDaoList instance;

    public DepositDaoList() {
        depositList = new HashMap();
    }
    
     public static DepositDaoList getInstance() {
        if (instance == null) {
            instance = new DepositDaoList();
        }
        return instance;
    }

     @Override
    public boolean create(DepositDto obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

     @Override
    public DepositDto read(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

     @Override
    public List<DepositDto> readAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}