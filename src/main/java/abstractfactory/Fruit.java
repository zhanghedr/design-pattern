package abstractfactory;

public abstract class Fruit {

    final FruitSize fruitSize;

    Fruit(FruitSize fruitSize) {
        this.fruitSize = fruitSize;
    }

    abstract void printFruitDetail();

    public FruitSize getFruitSize() {
        return fruitSize;
    }

}
