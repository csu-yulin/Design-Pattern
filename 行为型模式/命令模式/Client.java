package 行为型模式.命令模式;

public class Client {
    public static void main(String[] args) {
        //自定义一个按键
        CustomizeButtons buttons = new CustomizeButtons("最小化");
        buttons.setCommand(new MinimizeCommand());
        buttons.onClick();
    }
}
