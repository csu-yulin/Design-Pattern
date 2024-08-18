package 行为型模式.备忘录模式.内部类版;

public class Caretaker {
    private MementoIF memento;

    public MementoIF retrieveMemento() {
        return memento;
    }

    public void saveMemento(MementoIF memento) {
        this.memento = memento;
    }
}
