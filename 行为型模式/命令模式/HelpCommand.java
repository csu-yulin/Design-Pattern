package 行为型模式.命令模式;

//具体命令类,持有请求接受者的引用
public class HelpCommand extends Command {
    private final HelpHandler helpHandler;

    public HelpCommand() {
        this.helpHandler = new HelpHandler();
    }

    @Override
    void execute() {
        helpHandler.display();
    }
}
