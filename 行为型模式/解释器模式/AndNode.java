package 行为型模式.解释器模式;

public class AndNode extends AbstractNode {
    private final AbstractNode left;
    private final AbstractNode right;

    public AndNode(AbstractNode left, AbstractNode right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String interpret() {
        return left.interpret() + "再" + right.interpret();
    }
}
