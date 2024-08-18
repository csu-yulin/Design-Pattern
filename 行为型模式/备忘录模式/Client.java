package 行为型模式.备忘录模式;

public class Client {
    public static void main(String[] args) {
        MementoCaretaker mc = new MementoCaretaker();
        Chessman chessman = new Chessman("炮", 4, 1);
        display(chessman);
        mc.setMemento(chessman.save());

        chessman.setY(10);
        display(chessman);

        System.out.println("悔棋");
        chessman.restore(mc.getMemento());
        display(chessman);

    }

    public static void display(Chessman chessman) {
        System.out.println("棋子:" + chessman.getLabel() + ",当前位置:(" + chessman.getX() + "," + chessman.getY()
                + ")");
    }
}
