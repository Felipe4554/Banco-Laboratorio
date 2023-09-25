/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Person.Daos;

import Person.Dtos.UserDto;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/**
 *
 * @author rsand
 */
public class UserDaoList implements Dao<UserDto>{
     private HashMap<String,UserDto> userList;

    public UserDaoList() {
        userList = new HashMap();
    }

    @Override
    public boolean create(UserDto user) {
        if(user==null) return false;
        userList.put(user.getId(), user);
        return true;
    }

    @Override
    public UserDto read(String id) {
        return userList.get(id);
    }

    @Override
    public List<UserDto> readAll() {
        return new ArrayList<>(userList.values());
    }

    @Override
    public boolean update(UserDto user) {
        return this.create(user);
    }

    @Override
    public boolean delete(UserDto user) {
        return userList.remove(user.getId())!=null;
    }
    
    }
