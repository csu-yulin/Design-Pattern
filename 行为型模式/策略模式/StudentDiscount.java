package 行为型模式.策略模式;

public class StudentDiscount implements Discount {
    @Override
    public double calculate(double price) {
        System.out.println("学生票");
        return price * 0.8;
    }
}
