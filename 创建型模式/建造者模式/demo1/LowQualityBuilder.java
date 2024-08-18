package 创建型模式.建造者模式.demo1;

public class LowQualityBuilder extends Builder {
    @Override
    public void buildFrame() {
        bike.setBikeFrame("铜质车架");
    }

    @Override
    public void buildSeat() {
        bike.setBikeSeat("布料座椅");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
