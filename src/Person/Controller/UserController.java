/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Person.Controller;

import Controller.Controller;
import Dao.Dao;
import Person.Dtos.UserDto;
import Person.User;
import Views.View;
import java.util.List;

public class UserController implements Controller<User>{
    private View view;
    private Dao dao;

    public UserController(View view, Dao dao) {
        this.view = view;
        this.dao = dao;
    }

    @Override
    public boolean create(User user) {
        if (dao.read(user.getId())!=null){
            view.displayMessage("Id de usuario duplicado");
            return false;
        }else{
            UserDto userDto = new UserDto(user.getId(),user.getName(),user.getUsername(), user.getPassword());
            if (dao.create(userDto)){
                view.displayMessage("Usuario agregado correctamente");
                return true;
            }else{
                view.displayMessage("Error al agregar usuario");
                return false;
            }
        }
    }

    @Override
    public User read(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<User> readAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean update(User obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(User obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
