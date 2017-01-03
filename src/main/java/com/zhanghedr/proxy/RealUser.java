package com.zhanghedr.proxy;

/**
 * Created by zhanghedr on 1/2/17.
 */
public class RealUser implements User {

    @Override
    public void play(String game) {
        System.out.println("User is playing " + game);
    }

}
