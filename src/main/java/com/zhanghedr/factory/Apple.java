package com.zhanghedr.factory;

class Apple extends Fruit {

    Apple(FruitSize fruitSize) {
        super(fruitSize);
    }

    @Override
    public void printFruitDetail() {
        System.out.println("Apple is " + fruitSize.toString());
    }

}
