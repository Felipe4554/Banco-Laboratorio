package Person;

/**
 *
 * @author rsand
 */
public class User extends Person{
    private String username;
    private int password;

<<<<<<< HEAD
    public User(String id, String name, String username, String password) {
=======
    public User(String username, int password, String id, String name) {
>>>>>>> a4a333f671d5a681a16e98a805ec5d6dfaf5f92e
        super(id, name);
        this.username = username;
        this.password = encrypt(password);
    }

    public String getUsername() {
        return username;
    }
    
    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
    
    private int encrypt(String password) {
        return password.hashCode();
    }
}


