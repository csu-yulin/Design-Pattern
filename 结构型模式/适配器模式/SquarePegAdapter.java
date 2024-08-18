package 结构型模式.适配器模式;

public class SquarePegAdapter extends RoundHole {
    private final SquarePeg squarePeg;

    public SquarePegAdapter(double radius, SquarePeg squarePeg) {
        super(radius);
        this.squarePeg = squarePeg;
    }

    @Override
    public boolean fits() {
        return getRadius() >= squarePeg.getWidth() * Math.sqrt(2) / 2;
    }
}
