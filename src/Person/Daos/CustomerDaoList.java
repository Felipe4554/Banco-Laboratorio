package Person.Daos;

import Dao.Dao;
import Person.Dtos.CustomerDto;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CustomerDaoList implements Dao<CustomerDto> {

    private HashMap<String, CustomerDto> customerList;
    private static CustomerDaoList instance;
    
    public CustomerDaoList() {
        customerList = new HashMap();
    }
    public static CustomerDaoList getInstance(){
        if(instance == null){
            instance = new CustomerDaoList();
        }
        return instance;
    }
    @Override
    public boolean create(CustomerDto customer) {
        if (customer == null) {
            return false;
        }
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
        return customerList.remove(customer.getId()) != null;
    }

}
