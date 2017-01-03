package com.zhanghedr.mvc;

/**
 * Created by zhanghedr on 1/2/17.
 */
public class UserController {

    private User user;
    private UserView userView;

    public UserController(User user, UserView userView) {
        this.user = user;
        this.userView = userView;
    }

    public void display() {
        userView.display(user);
    }

    public String getName() {
        return user.getName();
    }

    public void setName(String name) {
        user.setName(name);
    }

    public String getEmail() {
        return user.getEmail();
    }

    public void setEmail(String email) {
        user.setEmail(email);
    }

}
