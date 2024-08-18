package 结构型模式.享元模式;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

//这里可以设置为简单工厂和单例模式的结合
public class ChessmanFactory {
    private static final Map<String, Chessman> map = new ConcurrentHashMap<>();

    static {
        map.put("w", new WhiteChessman());
        map.put("b", new BlackChessman());
    }

    //如果需要的享元对象不存在,应该创建一个新的享元对象
    public static Chessman getChessman(String color) {
        return map.get(color);

//        if (map.get(color) != null) {
//            return map.get(color);
//        } else {
//            switch (color) {
//                case "b" -> {
//                    return new BlackChessman();
//                }
//                case "c" -> {
//                    return new WhiteChessman();
//                }
//            }
//        }
    }
}
