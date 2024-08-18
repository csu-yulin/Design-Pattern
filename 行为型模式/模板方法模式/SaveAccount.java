package 行为型模式.模板方法模式;

public class SaveAccount extends Account {
    @Override
    public void calculateInterest() {
        System.out.println("按照定期账户的利息计算");
    }
}
