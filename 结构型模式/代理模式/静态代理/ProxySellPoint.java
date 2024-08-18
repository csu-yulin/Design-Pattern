package 结构型模式.代理模式.静态代理;

import 结构型模式.代理模式.SellTickets;
import 结构型模式.代理模式.Station;

public class ProxySellPoint implements SellTickets {
    private final Station station = new Station();


    @Override
    public void sell() {
        System.out.println("增加额外业务");
        station.sell();
    }
}
