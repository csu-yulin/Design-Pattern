package 行为型模式.观察者模式;

public class Client {
    public static void main(String[] args) {
        Subject publicAccount = new WeChatPublicAccount();
        User user1 = new User("小明");
        User user2 = new User("小华");
        User user3 = new User("小龙");
        User user4 = new User("小晨");

        publicAccount.attach(user1);
        publicAccount.attach(user2);
        publicAccount.attach(user3);
        publicAccount.attach(user4);

        publicAccount.notifyObservers("订阅文章消息");
    }
}
