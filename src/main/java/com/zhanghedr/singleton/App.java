package com.zhanghedr.singleton;

public class App {

    public static void main(String[] args) {
        App app = new App();

        // thread unsafe test
        SingletonThreadUnsafeRun run1 = app.new SingletonThreadUnsafeRun();
        new Thread(run1).start();
        new Thread(run1).start();

        // thread safe test
        SingletonInitializationOnDemandHolderIdiomRun run2 = app.new SingletonInitializationOnDemandHolderIdiomRun();
        new Thread(run2).start();
        new Thread(run2).start();
    }

    private class SingletonThreadUnsafeRun implements Runnable {
        @Override
        public void run() {
            SingletonThreadUnsafe.getInstance();
        }
    }

    private class SingletonInitializationOnDemandHolderIdiomRun implements Runnable {
        @Override
        public void run() {
            SingletonInitializationOnDemandHolderIdiom.getInstance();
        }
    }

}
