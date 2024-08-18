package 行为型模式.命令模式;

//请求调用者
public class CustomizeButtons {
    private String name;
    private Command command;

    public CustomizeButtons(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void onClick() {
        command.execute();
    }
}
