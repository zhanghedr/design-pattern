package com.zhanghedr.strategy;

/**
 * Created by zhanghedr on 1/2/17.
 */
public class App {

    public static void main(String[] args) {
        float a = 10.2f, b = 15.8f;

        StrategySelector strategySelector = new StrategySelector(new MaxStrategy());
        System.out.println(strategySelector.execute(a, b));

        strategySelector.setStrategy(new MinStrategy());
        System.out.println(strategySelector.execute(a, b));

        strategySelector.setStrategy(new SumStrategy());
        System.out.println(strategySelector.execute(a, b));

        strategySelector.setStrategy(new AvgStrategy());
        System.out.println(strategySelector.execute(a, b));
    }

}
