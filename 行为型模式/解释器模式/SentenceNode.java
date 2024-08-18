package 行为型模式.解释器模式;

public class SentenceNode extends AbstractNode {
    private final AbstractNode direction;
    private final AbstractNode action;
    private final AbstractNode distance;

    public SentenceNode(AbstractNode direction, AbstractNode action, AbstractNode distance) {
        this.direction = direction;
        this.action = action;
        this.distance = distance;
    }

    @Override
    public String interpret() {
        return direction.interpret() + action.interpret() + distance.interpret();
    }
}
