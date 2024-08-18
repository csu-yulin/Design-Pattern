package 行为型模式.迭代器模式;

public class Client {
    public static void main(String[] args) {
        AbstractObjectList productList = new ProductList();
        productList.add("可乐");
        productList.add("辣条");
        productList.add("黄焖鸡米饭");
        productList.add("香蕉");

        AbstractIterator iterator = productList.createIterator();

        System.out.println("正向遍历:");
        while (!iterator.isLast()) {
            System.out.println(iterator.getNextItem());
            iterator.next();
        }
        System.out.println("=======================================");
        System.out.println("逆向遍历:");
        while (!iterator.isFirst()) {
            System.out.println(iterator.getPreviousItem());
            iterator.previous();
        }
    }
}
