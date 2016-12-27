package com.zhanghedr.factory;

public class App {

    public static void main(String[] args) {
        Fruit fruit1 = FruitFactory.getFruit(FruitSize.SMALL);
        fruit1.printFruitDetail();

        Fruit fruit2 = FruitFactory.getFruit(FruitSize.MEDIUM);
        fruit2.printFruitDetail();

        Fruit fruit3 = FruitFactory.getFruit(FruitSize.BIG);
        fruit3.printFruitDetail();
    }

}
