package 行为型模式.中介者模式;

public class List extends Component {
    public List(Mediator m) {
        mediator = m;
    }

    @Override
    public void update() {
        System.out.println("列表框新增加一项");
    }

    public void select() {
        System.out.println("某一项被选中");
    }
}
