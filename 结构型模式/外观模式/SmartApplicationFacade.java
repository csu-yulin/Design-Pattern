package 结构型模式.外观模式;

public class SmartApplicationFacade {

    private final TV tv;
    private final AirConditioning airConditioning;
    private final Radio radio;

    public SmartApplicationFacade() {
        this.tv = TV.getInstance();
        this.airConditioning = AirConditioning.getInstance();
        this.radio = Radio.getInstance();
    }

    public void on() {
        tv.on();
        airConditioning.on();
        radio.on();
    }

    public void off() {
        tv.off();
        airConditioning.off();
        radio.off();
    }

    public void say(String message) {
        if ("打开".equals(message)) {
            on();
        } else if ("关闭".equals(message)) {
            off();
        } else {
            System.out.println("无法识别的操作");
        }
    }
}
