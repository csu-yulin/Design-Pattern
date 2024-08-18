package 结构型模式.代理模式;

import 结构型模式.代理模式.动态代理.JDK动态代理.ProxyFactory;
import 结构型模式.代理模式.静态代理.ProxySellPoint;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        System.setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        SellTickets proxyObj = new ProxyFactory(new Station()).getProxyObject();
        proxyObj.sell();
    }

    @org.junit.Test
    //静态代理模式中,代理类在编译阶段就生成了
    public void test静态代理() {
        ProxySellPoint proxy = new ProxySellPoint();
        proxy.sell();
    }

    @org.junit.Test
    //JDK动态代理
    public void testJDK动态代理() throws ClassNotFoundException {
        System.setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        SellTickets proxyObj = new ProxyFactory(new Station()).getProxyObject();
        proxyObj.sell();
    }

    @org.junit.Test
    //CGLIB动态代理
    public void testCGLIB动态代理() throws ClassNotFoundException {
        结构型模式.代理模式.动态代理.CGLIB动态代理.Station proxyObj = new 结构型模式.代理模式.动态代理.CGLIB动态代理.ProxyFactory(new 结构型模式.代理模式.动态代理.CGLIB动态代理.Station()).getProxyObject();
        proxyObj.sell();
        System.out.println(proxyObj.getClass());
        while (true) ;
    }
}
