/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Card.Daos;

import Card.Dtos.DebitCardDto;
import Dao.Dao;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author ´Felipe Chacón
 */
public class DebitCardDaoList implements Dao <DebitCardDto>{
    
    private HashMap <String, DebitCardDto> debitcardlist;
    private static DebitCardDaoList instance;

    public DebitCardDaoList() {
        this.debitcardlist = new HashMap();
    }
    
     public static DebitCardDaoList getInstance() {
        if (instance == null) {
            instance = new DebitCardDaoList();
        }
        return instance;
    }
    
    @Override
    public boolean create(DebitCardDto obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<DebitCardDto> readAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean update(DebitCardDto obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(DebitCardDto obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public DebitCardDto read(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}