/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transacciones.Daos;

import Person.Daos.*;
import Person.Dtos.UserDto;
import Transacciones.Dtos.WithdrawalDto;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author rsand
 */
public class WithdrawalDaoList implements Dao<WithdrawalDto>{
     private HashMap<String,UserDto> withdrawalList;

    public WithdrawalDaoList() {
        withdrawalList = new HashMap();
    }

    @Override
    public boolean create(WithdrawalDto obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public WithdrawalDto read(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<WithdrawalDto> readAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean update(WithdrawalDto obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(WithdrawalDto obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}