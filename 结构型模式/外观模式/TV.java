package 结构型模式.外观模式;

public class TV {
    private static final TV tv = new TV();

    public static TV getInstance() {
        return tv;
    }

    public void on() {
        System.out.println("打开了电视");
    }

    public void off() {
        System.out.println("关闭了电视");
    }
}
