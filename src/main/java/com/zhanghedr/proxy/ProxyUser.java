package com.zhanghedr.proxy;

/**
 * Created by zhanghedr on 1/2/17.
 */
public class ProxyUser implements User {

    private final RealUser realUser;

    private int numOfGames;

    private static final int MAX_GAME = 2;

    public ProxyUser(RealUser realUser) {
        this.realUser = realUser;
    }

    @Override
    public void play(String game) {
        if (numOfGames < MAX_GAME) {
            realUser.play(game);
            numOfGames++;
        } else {
            System.out.println(game + " is denied since user reaches the limit");
        }
    }

}
