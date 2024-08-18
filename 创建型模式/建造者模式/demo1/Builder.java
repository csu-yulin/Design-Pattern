package 创建型模式.建造者模式.demo1;

public abstract class Builder {
    protected Bike bike = new Bike();

    public abstract void buildFrame();

    public abstract void buildSeat();

    public abstract Bike createBike();

    //可以将指挥者的指挥创建产品的指责分配给部件的建造者,这样来可以简化系统结构,但是
    //会加重建造者的职责,不符合单一职责原则:即一个类应该只有一个引起它变化的原因
//    public Bike construct() {
//        buildFrame();
//        buildSeat();
//        return createBike();
//    }
}
