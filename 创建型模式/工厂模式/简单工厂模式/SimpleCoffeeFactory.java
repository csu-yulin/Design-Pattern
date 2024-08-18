package 创建型模式.工厂模式.简单工厂模式;

public class SimpleCoffeeFactory {
    //解除了CoffeeStore与具体咖啡类的耦合
    //但是增加了工厂类和具体咖啡类的耦合以及工厂类和CoffeeStore的耦合
    //违反了开闭原则
    public static Coffee createCoffee(String type) {
        return switch (type) {
            case "Americano" -> new Americano();
            case "Cappuccino" -> new Cappuccino();
            default -> throw new IllegalArgumentException("没有此类型的咖啡");
        };
    }
}
