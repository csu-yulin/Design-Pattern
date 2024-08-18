package 行为型模式.观察者模式;

public class WeChatPublicAccount extends Subject {
    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}
