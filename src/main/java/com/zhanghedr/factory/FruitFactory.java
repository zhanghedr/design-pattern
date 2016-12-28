package com.zhanghedr.factory;

public class FruitFactory {

    public static Fruit getFruit(String fruitName) {
        switch (fruitName) {
        case "blueberry":
            return new Blueberry();
        case "apple":
            return new Apple();
        case "watermelon":
            return new Watermelon();
        default:
            throw new IllegalArgumentException(fruitName + " is not found");
        }
    }

}
