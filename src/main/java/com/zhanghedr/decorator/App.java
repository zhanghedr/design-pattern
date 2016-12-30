package com.zhanghedr.decorator;

public class App {

    public static void main(String[] args) {
        User user1 = new MaleUser(new ChineseUser());
        System.out.println(user1.getDetail());

        User user2 = new OldUser(new ChineseUser());
        System.out.println(user2.getDetail());

        User user3 = new OldUser(new MaleUser(new ChineseUser()));
        System.out.println(user3.getDetail());

        User user4 = new MaleUser(new OldUser(new ChineseUser()));
        System.out.println(user4.getDetail());
    }
}
