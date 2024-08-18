package 创建型模式.建造者模式.demo1;

public class Test {
    public static void main(String[] args) {
        Director director = new Director(new HighQualityBuilder());
        Bike bike = director.construct();
        System.out.println(bike.getBikeFrame());
        System.out.println(bike.getBikeSeat());
    }
}
