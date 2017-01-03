package com.zhanghedr.template;

/**
 * Created by zhanghedr on 1/2/17.
 */
public class App {

    public static void main(String[] args) {
        Strategy strategy1 = new SumStrategy();
        strategy1.execute();

        System.out.println();

        Strategy strategy2 = new AvgStrategy();
        strategy2.execute();
    }

}
