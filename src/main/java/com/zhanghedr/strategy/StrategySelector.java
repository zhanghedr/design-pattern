package com.zhanghedr.strategy;

/**
 * Created by zhanghedr on 1/2/17.
 */
public class StrategySelector {

    private Strategy strategy;

    public StrategySelector(Strategy strategy) {
        this.strategy = strategy;
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public float execute(float a, float b) {
        return strategy.execute(a, b);
    }

}
