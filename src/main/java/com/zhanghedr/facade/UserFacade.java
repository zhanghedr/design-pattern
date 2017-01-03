package com.zhanghedr.facade;

/**
 * Created by zhanghedr on 1/2/17.
 */
public class UserFacade {

    private User chineseUser;
    private User americanUser;
    private User japaneseUser;

    public UserFacade() {
        chineseUser = new ChineseUser();
        americanUser = new AmericanUser();
        japaneseUser = new JapaneseUser();
    }

    public void printChineseUserDetail() {
        chineseUser.printDetail();
    }

    public void printAmericanUserDetail() {
        americanUser.printDetail();
    }

    public void printJapaneseUserDetail() {
        japaneseUser.printDetail();
    }

}
