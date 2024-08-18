package 创建型模式.单例模式.懒汉式.双重检查锁;

//单例模式:懒汉式
public class Singleton {
    //创建私有本类对象,但并不赋值
    //要解决双重检查锁模式带来空指针异常(原因:原因是JVM在实例化对象的时候会进行优化和指令重排序操作)的问题，
    // 只需要使用 `volatile` 关键字, `volatile` 关键字可以保证可见性和有序性
    private static volatile Singleton instance;

    //私有化构造器
    private Singleton() {
    }

    //公开获取实例方法
    //可以添加synchronized关键字使此方法变得变得线程安全,但执行效率会降低
    //当线程A,B同时访问getInstance方法时,同时将instance判空,那么只有一个线程会获得同步锁
    //假使A获得锁,B将阻塞,A再次将instance判空,故执行instance = new Singleton()
    //A释放锁之后,B进入临界区,此时instance不为空,所以不再创建实例
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}