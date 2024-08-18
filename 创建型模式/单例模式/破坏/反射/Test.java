package 创建型模式.单例模式.破坏.反射;


import 创建型模式.单例模式.饿汉式.Singleton;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        // 获取 Singleton 类的 Class 对象
        Class<Singleton> singletonClass = Singleton.class;

        // 获取 Singleton 类的无参数构造函数
        Constructor<Singleton> constructor = singletonClass.getDeclaredConstructor();

        // 设置构造函数的可访问性，以允许访问私有构造函数
        constructor.setAccessible(true);

        // 通过构造函数创建第一个 Singleton 对象，并打印它
        System.out.println(constructor.newInstance());

        // 通过构造函数再次创建第二个 Singleton 对象，并打印它
        System.out.println(constructor.newInstance());

    }
}
