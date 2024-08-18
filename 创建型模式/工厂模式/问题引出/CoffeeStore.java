package 创建型模式.工厂模式.问题引出;

public class CoffeeStore {
    public static void orderCoffee(String type) {
        Coffee coffee = switch (type) {
            case "Americano" -> new Americano();
            case "Cappuccino" -> new Cappuccino();
            default -> throw new IllegalArgumentException("没有此类型的咖啡");
        };

        coffee.addSugar();
        coffee.addMilk();
        coffee.getName();
    }
}
