package abstractfactory;

public class Kitchen1Factory extends AbstractFactory {

    @Override
    public Fruit getFruit() {
        return new Blueberry();
    }

    @Override
    public Food getFood() {
        return new Pizza();
    }

}
