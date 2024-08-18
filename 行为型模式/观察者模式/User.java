package 行为型模式.观察者模式;

public class User implements Observer {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("用户" + name + "接收到了消息:" + message);
    }
}
