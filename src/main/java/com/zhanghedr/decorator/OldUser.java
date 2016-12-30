package com.zhanghedr.decorator;

public class OldUser extends UserDecorator {

    public OldUser(User user) {
        super(user);
    }

    @Override
    public String getDetail() {
        return super.getDetail() + " is old";
    }

}
