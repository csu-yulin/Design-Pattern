package 结构型模式.组合模式;

public class Test {
    public static void main(String[] args) {
        //首先定义一些叶子节点
        //为了避免调错方法,需要对叶子构件不透明编程,否则不安全
        Leaf leaf = new Leaf(0);
        Leaf leaf1 = new Leaf(1);
        Leaf leaf2 = new Leaf(2);
        Leaf leaf3 = new Leaf(3);
        Leaf leaf4 = new Leaf(4);
        Leaf leaf5 = new Leaf(5);

        //定义一些容器构架
        Component composite1 = new Composite();
        Component composite2 = new Composite();
        Component composite3 = new Composite();
        Component root = new Composite();

        root.add(composite1);
        root.add(composite2);
        composite2.add(composite3);

        composite1.add(leaf);
        composite1.add(leaf4);

        composite2.add(leaf5);
        composite2.add(leaf3);

        composite3.add(leaf1);
        composite3.add(leaf2);

        root.operation();
    }
}
