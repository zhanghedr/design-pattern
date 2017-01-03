package com.zhanghedr.template;

/**
 * Created by zhanghedr on 1/2/17.
 */
public class SumStrategy extends Strategy {

    @Override
    void init() {
        System.out.println("SumStrategy Initialized");
    }

    @Override
    void calculate() {
        System.out.println("SumStrategy calculated");
    }

    @Override
    void finish() {
        System.out.println("SumStrategy finished");
    }

}
