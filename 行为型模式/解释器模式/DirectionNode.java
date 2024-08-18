package 行为型模式.解释器模式;

public class DirectionNode extends AbstractNode {
    private final String direction;

    public DirectionNode(String direction) {
        this.direction = direction;
    }

    @Override
    public String interpret() {
        switch (direction) {
            case "up" -> {
                return "向上";
            }
            case "down" -> {
                return "向下";
            }
            case "left" -> {
                return "向左";
            }
            case "right" -> {
                return "向右";
            }
            default -> {
                return "无效指令";
            }
        }
    }
}
