package com.zhanghedr.facade;

/**
 * Created by zhanghedr on 1/2/17.
 */
public class App {

    public static void main(String[] args) {
        UserFacade userFacade = new UserFacade();
        userFacade.printChineseUserDetail();
        userFacade.printAmericanUserDetail();
        userFacade.printJapaneseUserDetail();
    }

}
