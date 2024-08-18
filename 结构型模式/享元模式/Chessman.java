package 结构型模式.享元模式;

//抽象享元类
public abstract class Chessman {
    //不会随环境改变的可共享内部状态,提供了存储空间
    public abstract String getColor();

    //通过这个方法,可以向外界提供享元对象的内部状态,也可以通过这个方法设置外部状态
    public void display(Coordinates c) {
        System.out.println("棋子颜色: " + this.getColor() + " ;其坐标是: ( " + c.getX() + " , " + c.getY() + " )");
    }
}
