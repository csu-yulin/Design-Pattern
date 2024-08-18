package 结构型模式.桥接模式;

public class MiddlePen extends Pen {
    public MiddlePen(Color color) {
        super(color);
    }

    @Override
    public void draw(String name) {
        color.paint("中号毛笔", name);
    }
}