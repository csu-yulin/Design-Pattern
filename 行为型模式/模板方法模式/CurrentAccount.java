package 行为型模式.模板方法模式;

public class CurrentAccount extends Account {
    @Override
    public void calculateInterest() {
        System.out.println("按照活期账户的利息计算");
    }
}
