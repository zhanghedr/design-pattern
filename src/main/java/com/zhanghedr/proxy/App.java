package com.zhanghedr.proxy;

/**
 * Created by zhanghedr on 1/2/17.
 */
public class App {

    public static void main(String[] args) {
        User user = new ProxyUser(new RealUser());
        user.play("jump");
        user.play("fly");
        user.play("race");
    }

}
