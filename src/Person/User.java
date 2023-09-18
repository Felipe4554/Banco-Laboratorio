package Person;

/**
 *
 * @author rsand
 */
public class User extends Person{
    private String username;
    private int password;

    public User(String username, String password, String id, String name) {
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

