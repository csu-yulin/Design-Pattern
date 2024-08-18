package 行为型模式.中介者模式;

public class TextBox extends Component {
    public TextBox(Mediator m) {
        mediator = m;
    }

    @Override
    public void update() {
        System.out.println("客户信息增加过后文本框被清除");
    }

    public void setText() {
        System.out.println("文本框显示信息");
    }
}
