package 行为型模式.状态模式;

public class RestrictedState extends AccountState {
    //因为这里环境类的状态由状态类改变的,所以状态类必须要持有一个环境类的引用
    public RestrictedState(Account account) {
        this.account = account;
    }

    @Override
    public void deposit(double amount) {
        account.setBalance(account.getBalance() + amount);
        account.changeState();
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("账号受限,取款失败!!");
    }

    @Override
    public void computeInterest() {
        System.out.println("利息加倍!!");
        System.out.println("=================================================");

    }
}
