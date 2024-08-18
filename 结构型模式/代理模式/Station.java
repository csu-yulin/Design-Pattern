package 结构型模式.代理模式;

public class Station implements SellTickets {
    @Override
    public void sell() {
        System.out.println("出售火车票");
    }
}
