package com.zhanghedr.strategy;

/**
 * Created by zhanghedr on 1/2/17.
 */
public class MinStrategy implements Strategy {

    @Override
    public float execute(float a, float b) {
        return a < b ? a : b;
    }

}
