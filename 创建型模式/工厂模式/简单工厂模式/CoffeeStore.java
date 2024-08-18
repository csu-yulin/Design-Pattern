package 创建型模式.工厂模式.简单工厂模式;

public class CoffeeStore {
    public static void orderCoffee(String type) {
        Coffee coffee = SimpleCoffeeFactory.createCoffee(type);

        coffee.addSugar();
        coffee.addMilk();
        coffee.getName();
    }
}
