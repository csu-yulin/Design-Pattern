package 行为型模式.中介者模式;

public class Button extends Component {
    public Button(Mediator m) {
        mediator = m;
    }

    @Override
    public void update() {
        //按钮类不产生交互
    }
}
