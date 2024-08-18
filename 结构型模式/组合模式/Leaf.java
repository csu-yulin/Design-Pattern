package 结构型模式.组合模式;

public class Leaf extends Component {
    private final int ID;

    public Leaf(int ID) {
        this.ID = ID;
    }

    @Override
    public void add(Component c) {
        throw new UnsupportedOperationException("非法调用");
    }

    @Override
    public void remove(Component c) {
        throw new UnsupportedOperationException("非法调用");
    }

    @Override
    public Component getChild(int i) {
        throw new UnsupportedOperationException("非法调用");
    }

    @Override
    public void operation() {
        System.out.println("叶子构件" + ID + "完成业务操作");
    }
}
