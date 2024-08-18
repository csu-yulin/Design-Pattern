package 创建型模式.工厂模式.问题引出;

public abstract class Coffee {
    abstract void getName();

    public void addSugar() {
        System.out.println("加糖");
    }

    public void addMilk() {
        System.out.println("加奶");
    }
}
