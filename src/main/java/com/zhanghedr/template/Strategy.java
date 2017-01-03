package com.zhanghedr.template;

/**
 * Created by zhanghedr on 1/2/17.
 */
public abstract class Strategy {

    abstract void init();
    abstract void calculate();
    abstract void finish();

    public void execute() {
        init();
        calculate();
        finish();
    }

}
