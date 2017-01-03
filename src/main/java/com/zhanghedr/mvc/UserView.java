package com.zhanghedr.mvc;

/**
 * Created by zhanghedr on 1/2/17.
 */
public class UserView {

    public void display(User user) {
        System.out.println(String.format("name: %s, email: %s", user.getName(), user.getEmail()));
    }

}
