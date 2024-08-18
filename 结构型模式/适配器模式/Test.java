package 结构型模式.适配器模式;

public class Test {
    @org.junit.Test
    public void f() {
        RoundHole roundHole1 = new SquarePegAdapter(10, new SquarePeg(10));
        System.out.println(roundHole1.fits());
    }
}
