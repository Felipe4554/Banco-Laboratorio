package Transacciones.Daos;

import Dao.Dao;
import Transacciones.Dtos.DepositDto;
import java.util.HashMap;
import java.util.List;

public class DepositDaoList implements Dao<DepositDto>{
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

    public boolean create(DepositDto obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public DepositDto read(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public List<DepositDto> readAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public boolean update(DepositDto obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public boolean delete(DepositDto obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}