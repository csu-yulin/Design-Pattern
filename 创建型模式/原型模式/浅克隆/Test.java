package 创建型模式.原型模式.浅克隆;

public class Test {
    public static void main(String[] args) {
        Citation c1 = new Citation();
        c1.setName("小明");
        c1.setObject(new Object());
        Citation c2 = c1.clone();
        System.out.println(c1 == c2);
        System.out.println(c1.getName() == c2.getName());
        System.out.println(c1.getObject() == c2.getObject());
    }
}
