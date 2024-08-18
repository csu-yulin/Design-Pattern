package 创建型模式.工厂模式.简单工厂_配置文件;

import temp.Coffee;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class SimpleCoffeeFactory {
    private static final Map<String, Coffee> map = new HashMap<>();

    static {
//        Properties p = new Properties();
//        InputStream in = SimpleCoffeeFactory.class.getClassLoader().getResourceAsStream("resources/bean.properties");
//        try {
//            p.load(in);
//            Set<Object> keySet = p.keySet();
//
//            for (Object key : keySet) {
//                String className = p.getProperty((String) key);
//                Class<?> clazz = Class.forName(className);
//                Coffee coffee = (Coffee) clazz.getDeclaredConstructor().newInstance();
//                map.put((String) key, coffee);
//            }
//
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
        Properties p = new Properties();
        try {
            p.load(new FileInputStream("src/main/resources/bean.properties"));
            for (Map.Entry<Object, Object> entry : p.entrySet()) {
                Class<?> clazz = Class.forName((String) entry.getValue());
                map.put((String) entry.getKey(), (Coffee) clazz.getDeclaredConstructor().newInstance());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Coffee getCoffee(String type) {
        return map.get(type);
    }
}

class Test {
    public static void main(String[] args) {
        Coffee coffee = SimpleCoffeeFactory.getCoffee("Americano");
        coffee.getName();
    }
}
