package abstractfactory;

class Watermelon extends Fruit {

    Watermelon() {
        super(FruitSize.BIG);
    }

    @Override
    public void printFruitDetail() {
        System.out.println("Watermelon is " + fruitSize.toString());
    }

}
