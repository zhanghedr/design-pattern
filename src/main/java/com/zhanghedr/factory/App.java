package com.zhanghedr.factory;

public class App {

    public static void main(String[] args) {
        Fruit fruit1 = FruitFactory.getFruit("blueberry");
        fruit1.printFruitDetail();

        Fruit fruit2 = FruitFactory.getFruit("apple");
        fruit2.printFruitDetail();

        Fruit fruit3 = FruitFactory.getFruit("watermelon");
        fruit3.printFruitDetail();
    }

}
