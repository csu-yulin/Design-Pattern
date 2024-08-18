package 行为型模式.命令模式;

//具体命令类,持有请求接受者的引用
public class MinimizeCommand extends Command {
    private final WindowHandler windowHandler;

    public MinimizeCommand() {
        this.windowHandler = new WindowHandler();
    }

    @Override
    void execute() {
        windowHandler.minimize();
    }
}
