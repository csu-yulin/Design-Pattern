package 行为型模式.解释器模式;

public class DistanceNode extends AbstractNode {
    private final String distance;

    public DistanceNode(String distance) {
        this.distance = distance;
    }

    @Override
    public String interpret() {
        return distance;
    }
}
