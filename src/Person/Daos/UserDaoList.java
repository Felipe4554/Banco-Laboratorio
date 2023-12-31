package Person.Daos;

import Dao.Dao;
import Person.Dtos.UserDto;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UserDaoList implements Dao<UserDto> {

    private HashMap<String, UserDto> userList;
    private static UserDaoList instance;

    private UserDaoList() {
        userList = new HashMap();
    }

    public static UserDaoList getInstance() {
        if (instance == null) {
            instance = new UserDaoList();
        }
        return instance;
    }

    @Override
    public boolean create(UserDto user) {
        if (user == null) {
            return false;
        }
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
        return userList.remove(user.getId()) != null;
    }

}
