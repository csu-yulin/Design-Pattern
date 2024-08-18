package 结构型模式.外观模式;

public class AirConditioning {
    private static final AirConditioning airConditioning = new AirConditioning();

    public static AirConditioning getInstance() {
        return airConditioning;
    }

    public void on() {
        System.out.println("打开了空调");
    }

    public void off() {
        System.out.println("关闭了空调");
    }
}