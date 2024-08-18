package 行为型模式.中介者模式;

public class ComboBox extends Component {
    public ComboBox(Mediator m) {
        mediator = m;
    }

    @Override
    public void update() {
        System.out.println("组合框新增加一项");
    }

    public void select() {
        System.out.println("组合框选中一项");
    }
}
