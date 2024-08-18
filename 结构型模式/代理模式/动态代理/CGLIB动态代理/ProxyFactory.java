package 结构型模式.代理模式.动态代理.CGLIB动态代理;


import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class ProxyFactory implements MethodInterceptor {
    private final Station station;

    public ProxyFactory(Station station) {
        this.station = station;
    }

    //此方法也可以放在Client里
    public Station getProxyObject() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Station.class);
        enhancer.setCallback(this);
        return (Station) enhancer.create();
    }


    /*
        intercept方法参数说明：
        o ： 代理对象
        method ： 真实对象中的方法的Method实例
        args ： 实际参数
        methodProxy ：代理对象中的方法的method实例
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("前置通知");
        Object object = methodProxy.invokeSuper(o, objects);
        System.out.println("后置通知");
        return object;
    }
}
