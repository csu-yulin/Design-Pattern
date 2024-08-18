package 行为型模式.策略模式;

public class VIPDiscount implements Discount {
    @Override
    public double calculate(double price) {
        System.out.println("VIP票");
        return price * 0.6;
    }
}
