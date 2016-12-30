package com.zhanghedr.decorator;

public class UserDecorator implements User {

    protected User user;

    public UserDecorator(User user) {
        this.user = user;
    }

    @Override
    public String getDetail() {
        return user.getDetail();
    }

}
