package abstractfactory;

public class Kitchen2Factory extends AbstractFactory {

    @Override
    public Fruit getFruit() {
        return new Apple();
    }

    @Override
    public Food getFood() {
        return new Noodle();
    }

}
