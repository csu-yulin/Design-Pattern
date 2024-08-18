package 行为型模式.备忘录模式.内部类版;

//原发器
public class Originator {
    private String state;

    public Originator(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public MementoIF createMemento() {
        return new Memento(state);
    }

    public void restoreMemento(MementoIF memento) {
        setState(((Memento) memento).getState());
    }

    private class Memento implements MementoIF {
        private String state;

        /**
         * 构造方法
         */
        private Memento(String state) {
            this.state = state;
        }

        private String getState() {
            return state;
        }

        private void setState(String state) {
            this.state = state;
        }
    }
}
