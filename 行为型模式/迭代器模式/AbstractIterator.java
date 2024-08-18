package 行为型模式.迭代器模式;

public interface AbstractIterator {
    void next();

    boolean isLast();

    void previous();

    boolean isFirst();

    Object getNextItem();

    Object getPreviousItem();
}
