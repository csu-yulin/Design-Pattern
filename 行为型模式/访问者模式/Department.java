package 行为型模式.访问者模式;

public abstract class Department {
    abstract void visit(FulltimeEmployee employee);

    abstract void visit(ParttimeEmployee employee);
}
