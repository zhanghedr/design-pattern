package com.zhanghedr.singleton;

/**
 * Lazy initialization, thread-safe and high performance for all Java versions
 * preferred
 *
 * @author hezha_000
 */
public class SingletonInitializationOnDemandHolderIdiom {

    private SingletonInitializationOnDemandHolderIdiom() {
        System.out
                .println("SingletonInitializationOnDemandHolderIdiom instance created");
    }

    public static SingletonInitializationOnDemandHolderIdiom getInstance() {
        return SingletonHelper.INSTANCE;
    }

    private static class SingletonHelper {
        private static final SingletonInitializationOnDemandHolderIdiom INSTANCE = new SingletonInitializationOnDemandHolderIdiom();
    }

}
