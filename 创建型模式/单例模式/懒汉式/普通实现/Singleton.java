package 创建型模式.单例模式.懒汉式.普通实现;

//单例模式:懒汉式
public class Singleton {
    //创建私有本类对象,但并不赋值
    private static Singleton instance;

    //私有化构造器
    private Singleton() {
    }

    //公开获取实例方法
    //可以添加synchronized关键字使此方法变得变得线程安全,但执行效率会降低
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}