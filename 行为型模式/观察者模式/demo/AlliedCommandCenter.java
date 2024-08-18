package 行为型模式.观察者模式.demo;

import java.util.Observable;

public class AlliedCommandCenter extends Observable {
    public void receiveTelegraph(String name) {
        setChanged();
        notifyObservers(name);
    }
}
