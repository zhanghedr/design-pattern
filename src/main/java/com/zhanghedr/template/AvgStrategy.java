package com.zhanghedr.template;

/**
 * Created by zhanghedr on 1/2/17.
 */
public class AvgStrategy extends Strategy {

    @Override
    void init() {
        System.out.println("AvgStrategy Initialized");
    }

    @Override
    void calculate() {
        System.out.println("AvgStrategy calculated");
    }

    @Override
    void finish() {
        System.out.println("AvgStrategy finished");
    }

}
