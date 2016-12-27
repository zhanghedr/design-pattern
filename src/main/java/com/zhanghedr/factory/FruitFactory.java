package com.zhanghedr.factory;

public class FruitFactory {

    public static Fruit getFruit(FruitSize fruitSize) {
        switch (fruitSize) {
        case SMALL:
            return new Blueberry(fruitSize);
        case MEDIUM:
            return new Apple(fruitSize);
        case BIG:
            return new Watermelon(fruitSize);
        default:
            throw new IllegalArgumentException(fruitSize.toString()
                    + " is not found");
        }
    }

}
