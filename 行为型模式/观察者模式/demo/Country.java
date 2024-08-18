package 行为型模式.观察者模式.demo;

import java.util.Observable;
import java.util.Observer;

public class Country implements Observer {
    private final String name;

    public Country(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        String name = (String) arg;
        if (!name.equals(this.name)) {
            System.out.println(this.name + "加入支援!!");
        }
    }

    public void attached(AlliedCommandCenter acc) {
        System.out.println(name + "正在被同盟国攻击!请求协助");
        //不规范,这里必须要调用被观察者的setChange方法,但是非子类并不能使用,
        acc.receiveTelegraph(name);
    }
}
