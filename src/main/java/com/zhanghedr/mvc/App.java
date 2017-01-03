package com.zhanghedr.mvc;

/**
 * Created by zhanghedr on 1/2/17.
 */
public class App {

    public static void main(String[] args) {
        User user = new User("Howard", "howard@gmail.com");
        UserView userView = new UserView();
        UserController userController = new UserController(user, userView);

        userController.display();
        userController.setName("Travis");
        userController.setEmail("travis@gmail.com");
        userController.display();
    }

}
