/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Dao;

import java.util.List;

/**
 *
 * @author ´Felipe Chacón
 */
public interface Dao <Class>{
    //OPERACIONES CRUD
    public boolean create(Class obj);
    public List<Class> readAll();
    public boolean update (Class obj);
    public boolean delete(Class obj);
    
}
