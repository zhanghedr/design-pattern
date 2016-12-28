package abstractfactory;

class Apple extends Fruit {

    Apple() {
        super(FruitSize.MEDIUM);
    }

    @Override
    public void printFruitDetail() {
        System.out.println("Apple is " + fruitSize.toString());
    }

}
