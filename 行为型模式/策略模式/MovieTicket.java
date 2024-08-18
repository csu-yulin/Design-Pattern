package 行为型模式.策略模式;

//环境类,持有抽象策略类的引用
public class MovieTicket {
    private final double price;
    private Discount discount;

    public MovieTicket(double price) {
        this.price = price;
    }

    public double getPrice() {
        return discount.calculate(price);
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

}
