package 结构型模式.桥接模式;

public class BigPen extends Pen {
    public BigPen(Color color) {
        super(color);
    }

    @Override
    public void draw(String name) {
        color.paint("大号毛笔", name);
    }
}