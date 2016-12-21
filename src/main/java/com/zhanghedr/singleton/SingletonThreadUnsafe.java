package com.zhanghedr.singleton;

/**
 * Lazy initialization, thread-unsafe.
 * 
 * @author hezha_000
 *
 */
public class SingletonThreadUnsafe {

    private static SingletonThreadUnsafe instance;

    private SingletonThreadUnsafe() {
        System.out.println("SingletonThreadUnsafe instance created");
    }

    public static SingletonThreadUnsafe getInstance() {
        if (instance == null)
            instance = new SingletonThreadUnsafe();
        return instance;
    }

}
