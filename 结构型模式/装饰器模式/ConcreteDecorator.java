package 结构型模式.装饰器模式;

public class ConcreteDecorator extends AbstractDecorator {

    public ConcreteDecorator(AbstractComponent component) {
        super(component);
    }

    @Override
    public void f() {
        //添加额外职责
        System.out.println("优化part");
        super.f();
        //添加额外职责
        System.out.println("优化part");
    }
}
