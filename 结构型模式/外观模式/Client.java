package 结构型模式.外观模式;

public class Client {
    public static void main(String[] args) {
        SmartApplicationFacade facade = new SmartApplicationFacade();
        facade.say("打开");
        System.out.println("=====================================");
        facade.say("关闭");
    }
}
