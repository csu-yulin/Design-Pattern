package 行为型模式.观察者模式.demo;

public class Client {
    public static void main(String[] args) {
        AlliedCommandCenter center = new AlliedCommandCenter();
        Country country = new Country("美国");
        center.addObserver(country);
        center.addObserver(new Country("日本"));
        center.addObserver(new Country("法国"));
        center.addObserver(new Country("英国"));

        country.attached(center);
    }
}
