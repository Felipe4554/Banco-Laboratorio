package Person.Views;

import Person.User;
import Views.View;

public class UserConsoleView implements View<User>{

    @Override
    public void display(User user) {
        System.out.println(user);
    }

    @Override
    public void displayMessage(User msg) {
        System.out.println(msg);
    }
}
