/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Person.Daos;

import Person.Dtos.CustomerDto;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author rsand
 */
public class CustomerDaoList implements Dao<CustomerDto>{
     private HashMap<String,CustomerDto> customerList;

    public CustomerDaoList() {
        customerList = new HashMap();
    }
     
    @Override
    public boolean create(CustomerDto customer) {
        if(customer==null) return false;
        customerList.put(customer.getId(), customer);
        return true;
    }

    @Override
    public CustomerDto read(String id) {
        return customerList.get(id);
    }

    @Override
    public List<CustomerDto> readAll() {
        return new ArrayList<>(customerList.values());
    }
    

    @Override
    public boolean update(CustomerDto customer) {
        return this.create(customer);
    }

    @Override
    public boolean delete(CustomerDto customer) {
        return customerList.remove(customer.getId())!=null;
    }
    
}
