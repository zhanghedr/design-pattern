package com.zhanghedr.singleton;

/**
 * Lazy initialization, thread-safe, low performance due to synchronized
 * blocking
 * 
 * @author hezha_000
 *
 */
public class SingletonThreadSafe {

    private static SingletonThreadSafe instance;

    private SingletonThreadSafe() {
        System.out.println("SingletonThreadSafe instance created");
    }

    public static synchronized SingletonThreadSafe getInstance() {
        if (instance == null)
            instance = new SingletonThreadSafe();
        return instance;
    }

}
