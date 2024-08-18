package 结构型模式.桥接模式;

public abstract class Pen {
    protected final Color color;

    public Pen(Color color) {
        this.color = color;
    }

    public abstract void draw(String name);
}
