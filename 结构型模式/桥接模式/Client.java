package 结构型模式.桥接模式;

public class Client {
    public static void main(String[] args) {
        Pen pen = new BigPen(new Black());
        pen.draw("圣诞树");
    }
}
