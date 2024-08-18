package 行为型模式.迭代器模式;

public class ProductList extends AbstractObjectList {
    @Override
    public AbstractIterator createIterator() {
        return new ProductIterator(this);
    }
}
