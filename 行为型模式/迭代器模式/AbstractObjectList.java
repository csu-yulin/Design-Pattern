package 行为型模式.迭代器模式;

import java.util.ArrayList;
import java.util.List;

//抽象聚合角色
public abstract class AbstractObjectList {
    protected final List<Object> objects = new ArrayList<>();

    public void add(Object o) {
        objects.add(o);
    }

    public void remove(Object o) {
        objects.remove(o);
    }

    public Object get(int i) {
        return objects.get(i);
    }

    public List<Object> getObjects() {
        return objects;
    }

    public abstract AbstractIterator createIterator();
}
