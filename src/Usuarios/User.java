package Usuarios;

/**
 *
 * @author rsand
 */
public class User extends Person{
    private String username;
    private String password;

    public User(String username, String password, String id, String name) {
        super(id, name);
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    private int encrypt(String password) {
        return password.length();
    }
}


