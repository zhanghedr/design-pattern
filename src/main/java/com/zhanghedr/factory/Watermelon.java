package com.zhanghedr.factory;

class Watermelon extends Fruit {

    Watermelon(FruitSize fruitSize) {
        super(fruitSize);
    }

    @Override
    public void printFruitDetail() {
        System.out.println("Watermelon is " + fruitSize.toString());
    }

}
