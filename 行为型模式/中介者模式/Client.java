package 行为型模式.中介者模式;

public class Client {
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();

        Button button = new Button(mediator);
        List list = new List(mediator);
        ComboBox comboBox = new ComboBox(mediator);
        TextBox textBox = new TextBox(mediator);

        mediator.setButton(button);
        mediator.setList(list);
        mediator.setComboBox(comboBox);
        mediator.setTextBox(textBox);

        button.changed();
        System.out.println("==================================");
        list.changed();
    }
}
