package 结构型模式.桥接模式;

public class SmallPen extends Pen {
    public SmallPen(Color color) {
        super(color);
    }

    @Override
    public void draw(String name) {
        color.paint("小号毛笔", name);
    }
}
