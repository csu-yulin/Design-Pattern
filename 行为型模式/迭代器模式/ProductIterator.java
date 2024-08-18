package 行为型模式.迭代器模式;

import java.util.List;

public class ProductIterator implements AbstractIterator {
    private final AbstractObjectList list;
    private final List<Object> products;
    private int cursor2;
    private int cursor1;


    public ProductIterator(AbstractObjectList productList) {
        this.list = productList;
        this.products = productList.getObjects();
        cursor1 = 0;
        cursor2 = products.size() - 1;
    }


    @Override
    public void next() {
        if (cursor1 < products.size()) {
            ++cursor1;
        }
    }

    @Override
    public void previous() {
        if (cursor2 > -1) {
            --cursor2;
        }
    }

    @Override
    public boolean isLast() {
        return cursor1 == products.size();
    }


    @Override
    public boolean isFirst() {
        return cursor2 == -1;
    }

    @Override
    public Object getNextItem() {
        return products.get(cursor1);
    }

    @Override
    public Object getPreviousItem() {
        return products.get(cursor2);
    }
}
