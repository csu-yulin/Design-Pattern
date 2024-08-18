package 创建型模式.单例模式.饿汉式;

//单例模式:饿汉式
public class Singleton {
    //创建私有本类对象
    //因为外部类需要通过静态方法才能访问实例对象,所以这是没问题的
    //另外:这里也可以使用静态代码块来实现
    private static final Singleton instance = new Singleton();

    //私有化构造器
    private Singleton() {
        if (instance != null) {
            throw new RuntimeException();
        }
    }

    //公开获取实例方法
    public static Singleton getInstance() {
        return instance;
    }
}