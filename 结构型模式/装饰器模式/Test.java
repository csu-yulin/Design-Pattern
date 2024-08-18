package 结构型模式.装饰器模式;

public class Test {
    public static void main(String[] args) {
        AbstractComponent component1 = new ConcreteComponent();
        component1.f();
        System.out.println("================================================");
        AbstractComponent component2 = new ConcreteDecorator(new ConcreteComponent());
        component2.f();

        //可以通过堆叠装饰器,引入新功能
        AbstractComponent component3 = new ConcreteDecorator(new ConcreteDecorator(new ConcreteComponent()));
    }
}
