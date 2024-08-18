package 行为型模式.状态模式;

public class OverdraftState extends AccountState {
    //因为这里环境类的状态由状态类改变的,所以状态类必须要持有一个环境类的引用
    public OverdraftState(Account account) {
        this.account = account;
    }

    @Override
    public void deposit(double amount) {
        account.setBalance(account.getBalance() + amount);
        account.changeState();
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 2000) {
            account.setBalance(account.getBalance() - amount);
            account.changeState();
            return;
        }
        System.out.println("单次取款不得超过2000元!");
    }

    @Override
    public void computeInterest() {
        System.out.println("计算利息");
        System.out.println("=================================================");

    }
}
