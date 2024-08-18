package 结构型模式.代理模式.动态代理.JDK动态代理;

import 结构型模式.代理模式.SellTickets;
import 结构型模式.代理模式.Station;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {
    private final Station station;

    public ProxyFactory(Station station) {
        this.station = station;
    }

    public SellTickets getProxyObject() throws ClassNotFoundException {
        return (SellTickets) Proxy.newProxyInstance(

//                station.getClass().getClassLoader(),
//                station.getClass().getInterfaces(),

//                Class.forName("结构型模式.代理模式.Station").getClassLoader(),
//                Class.forName("结构型模式.代理模式.Station").getInterfaces(),

                Station.class.getClassLoader(),
                Station.class.getInterfaces(),

                new InvocationHandler() {
                    @Override
                    //最后生成的代理类中,有一个sell方法,sell方法会调用这个匿名内部类的invoke方法
                    public Object invoke(Object proxy1, Method method, Object[] args) throws Throwable {
                        System.out.println("前置通知");
                        method.invoke(station, args);
                        System.out.println("后置通知");
                        return null;
                    }
                }
        );
    }
}
