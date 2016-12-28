package com.zhanghedr.factory;

class Blueberry extends Fruit {

    Blueberry() {
        super(FruitSize.SMALL);
    }

    @Override
    public void printFruitDetail() {
        System.out.println("Blueberry is " + fruitSize.toString());
    }

}
