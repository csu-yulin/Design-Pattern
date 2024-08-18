package 结构型模式.适配器模式;

//Target
public abstract class RoundHole {
    private double radius;


    public RoundHole(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public abstract boolean fits();
}
