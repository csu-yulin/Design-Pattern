package 结构型模式.享元模式;

public class Test {
    public static void main(String[] args) {
        Chessman b1 = ChessmanFactory.getChessman("b");
        Chessman b2 = ChessmanFactory.getChessman("b");
        System.out.println(b1 == b2);
        b1.display(new Coordinates(1, 2));
        b1.display(new Coordinates(2, 2));
    }
}
