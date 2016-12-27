package com.zhanghedr.factory;

class Blueberry extends Fruit {

    Blueberry(FruitSize fruitSize) {
        super(fruitSize);
    }

    @Override
    public void printFruitDetail() {
        System.out.println("Blueberry is " + fruitSize.toString());
    }

}
