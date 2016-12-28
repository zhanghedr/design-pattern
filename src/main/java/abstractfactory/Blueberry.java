package abstractfactory;

class Blueberry extends Fruit {

    Blueberry() {
        super(FruitSize.SMALL);
    }

    @Override
    public void printFruitDetail() {
        System.out.println("Blueberry is " + fruitSize.toString());
    }

}
