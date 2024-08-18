package 行为型模式.备忘录模式;

public class MementoCaretaker {
    //可以将备忘录设置为列表,记录多次原发器状态
    private ChessmanMemento memento;

    public ChessmanMemento getMemento() {
        return memento;
    }

    public void setMemento(ChessmanMemento memento) {
        this.memento = memento;
    }
}
