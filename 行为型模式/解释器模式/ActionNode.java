package 行为型模式.解释器模式;

public class ActionNode extends AbstractNode {
    private final String action;

    public ActionNode(String action) {
        this.action = action;
    }

    @Override
    public String interpret() {
        switch (action) {
            case "move" -> {
                return "移动";
            }
            case "run" -> {
                return "快速移动";
            }
            default -> {
                return "无效指令";
            }
        }
    }
}
