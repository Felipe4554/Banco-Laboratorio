/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Person.Views;

import Person.User;
import javax.swing.text.View;

/**
 *
 * @author rsand
 */
public class UserConsoleView implements View<User> {

    @Override
    public void display(User user) {
        System.out.println(user);
    }

    @Override
    public void displayMessage(String msg) {
        System.out.println(msg);
    }

}
