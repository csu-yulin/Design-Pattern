package 行为型模式.访问者模式;

//抽象元素类
public interface Employee {
    void accept(Department handler);
}
