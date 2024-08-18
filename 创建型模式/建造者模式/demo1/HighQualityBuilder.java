package 创建型模式.建造者模式.demo1;

public class HighQualityBuilder extends Builder {
    @Override
    public void buildFrame() {
        bike.setBikeFrame("钛合金车架");
    }

    @Override
    public void buildSeat() {
        bike.setBikeSeat("真皮座椅");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
