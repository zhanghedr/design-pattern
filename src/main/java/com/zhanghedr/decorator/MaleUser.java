package com.zhanghedr.decorator;

public class MaleUser extends UserDecorator {

    public MaleUser(User user) {
        super(user);
    }

    @Override
    public String getDetail() {
        return super.getDetail() + " is male";
    }

}
