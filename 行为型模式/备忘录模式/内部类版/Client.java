package 行为型模式.备忘录模式.内部类版;

public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator("On");
        Caretaker caretaker = new Caretaker();

        System.out.println("原发器状态:" + originator.getState());
        caretaker.saveMemento(originator.createMemento());

        System.out.println("改变状态");
        originator.setState("Off");
        System.out.println("原发器状态:" + originator.getState());

        System.out.println("恢复");
        originator.restoreMemento(caretaker.retrieveMemento());
        System.out.println("原发器状态:" + originator.getState());

    }
}
