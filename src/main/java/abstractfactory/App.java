package abstractfactory;

public class App {

    public static void main(String[] args) {
        AbstractFactory kitchen1Factory = new Kitchen1Factory();
        kitchen1Factory.getFruit().printFruitDetail();
        kitchen1Factory.getFood().printFoodDetail();

        System.out.println("---------------");

        AbstractFactory kitchen2Factory = new Kitchen2Factory();
        kitchen2Factory.getFruit().printFruitDetail();
        kitchen2Factory.getFood().printFoodDetail();
    }

}
