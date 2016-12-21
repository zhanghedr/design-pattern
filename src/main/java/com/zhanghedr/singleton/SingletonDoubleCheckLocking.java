package com.zhanghedr.singleton;

/**
 * Lazy initialization, thread-safe, high performance with non-blocking
 * synchronized. But broken in certain environments with limitations
 * 
 * @author hezha_000
 *
 */
public class SingletonDoubleCheckLocking {

    private static SingletonDoubleCheckLocking instance;

    private SingletonDoubleCheckLocking() {
        System.out.println("SingletonDoubleCheckLocking instance created");
    }

    public static SingletonDoubleCheckLocking getInstance() {
        // check if already initialized. non-blocking for future threads
        if (instance == null) {
            // early multi-thread process one at a time
            synchronized (SingletonDoubleCheckLocking.class) {
                // check if initialized by other thread
                if (instance == null)
                    instance = new SingletonDoubleCheckLocking();
            }
        }
        return instance;
    }

}
