package 结构型模式.外观模式;

public class Radio {
    private static final Radio radio = new Radio();

    public static Radio getInstance() {
        return radio;
    }

    public void on() {
        System.out.println("打开了收音机");
    }

    public void off() {
        System.out.println("关闭了收音机");
    }
}