package 创建型模式.单例模式.懒汉式.静态内部类;

import java.io.Serial;
import java.io.Serializable;

//单例模式:懒汉式
public class Singleton implements Serializable {
    //私有化构造器
    private Singleton() {
    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    @Serial
    protected Object readResolve() {
        return getInstance(); // 返回现有的单例对象
    }

    //定义一个静态内部类
    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }
}