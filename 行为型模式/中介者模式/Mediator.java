package 行为型模式.中介者模式;

public abstract class Mediator {
//    //用于存储同事对象
//    protected List<Component> components;
//
//    //注册方法，用于增加同事对象
//    public void register(Component c) {
//        components.add(c);
//    }

    //声明抽象的业务方法
    public abstract void componentChanged(Component c);
}
