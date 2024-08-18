package 行为型模式.中介者模式;

public class ConcreteMediator extends Mediator {
    private Button button;
    private List list;
    private ComboBox comboBox;
    private TextBox textBox;

    public void setButton(Button button) {
        this.button = button;
    }

    public void setList(List list) {
        this.list = list;
    }

    public void setComboBox(ComboBox comboBox) {
        this.comboBox = comboBox;
    }

    public void setTextBox(TextBox textBox) {
        this.textBox = textBox;
    }

    @Override
    public void componentChanged(Component c) {
        if (c == button) {//用户在文本框输入了客户姓名,点击了增加按钮
            System.out.println("点击了增加按钮");
            list.update();
            comboBox.update();
            textBox.update();
        } else if (c == list) {
            System.out.println("从列表框中选择了客户");
            comboBox.select();
            textBox.setText();
        } else if (c == comboBox) {
            comboBox.select();
            textBox.setText();
        }
    }
}
