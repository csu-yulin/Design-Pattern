package 结构型模式.装饰器模式;

public class ConcreteComponent extends AbstractComponent {
    @Override
    public void f() {
        System.out.println("未经优化的行为");
    }
}
