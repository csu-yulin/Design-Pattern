package 结构型模式.组合模式;

public abstract class Component {
    public abstract void add(Component c);

    public abstract void remove(Component c);

    public abstract Component getChild(int i);

    //业务方法
    public abstract void operation();
}
