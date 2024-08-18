package 创建型模式.工厂模式.工厂方法模式;

public class CappuccinoFactory implements CoffeeFactory {
    //这里的创建方法可以使用配置文件的方法进一步解耦
    @Override
    public Coffee createCoffee() {
        return new Cappuccino();
    }
}
