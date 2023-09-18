/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usuarios.Dao;

import Dao.Dao;
import Usuarios.Dtos.UserDto;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author ´Felipe Chacón
 */
public class UserDaoList implements Dao<UserDto>{

    private HashMap<String, UserDto> userList;

    public UserDaoList() {
        userList = new HashMap();
    }
    
    
    @Override
    public boolean create(UserDto user) {
        if (user == null) return false;
       userList.put(user.getId(), user);
    }

    @Override
    public List<UserDto> readAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean update(UserDto obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(UserDto obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
