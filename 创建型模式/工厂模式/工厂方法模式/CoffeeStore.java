package 创建型模式.工厂模式.工厂方法模式;

public class CoffeeStore {
    //如果再添加一种咖啡，只需要添加一个具体的咖啡工厂和具体的咖啡类即可
    //而且不是修改原来的代码,而是扩展代码
//    public static void orderCoffee(CoffeeFactory coffeeFactory) {
//        Coffee coffee = coffeeFactory.createCoffee();
//
//        coffee.addSugar();
//        coffee.addMilk();
//        coffee.getName();
//    }

    public static void orderCoffee(String type) {
        //创建工厂类的方法也可以使用配置文件
        CoffeeFactory coffeeFactory = switch (type) {
            case "Americano" -> new AmericanoFactory();
            case "Cappuccino" -> new CappuccinoFactory();
            default -> null;
        };
        assert coffeeFactory != null;
        Coffee coffee = coffeeFactory.createCoffee();

        coffee.addSugar();
        coffee.addMilk();
        coffee.getName();
    }
}
