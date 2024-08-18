package 结构型模式.装饰器模式;

public abstract class AbstractDecorator extends AbstractComponent {
    private final AbstractComponent component;

    public AbstractDecorator(AbstractComponent component) {
        this.component = component;
    }

    //不必实现行为,提供构件类的get方法
    public AbstractComponent getComponent() {
        return component;
    }

    //也可以实现
    @Override
    public void f() {
        component.f();
    }
}
