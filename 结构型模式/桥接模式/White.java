package 结构型模式.桥接模式;

public class White implements Color {

    @Override
    public void paint(String penType, String name) {
        System.out.println("用" + penType + "画了一个白色的" + name);
    }
}