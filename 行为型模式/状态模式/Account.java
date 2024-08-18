package 行为型模式.状态模式;

//环境类,持有状态类的引用
public class Account {
    private final String owner;
    //需要持有一个状态类的引用,才能根据状态来进行相应的操作,本来状态就是从环境类抽离出去的
    private AccountState accountState;
    private double balance;

    public Account(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
        accountState = new NormalState(this);//开户,设置为初始状态
        System.out.println(owner + " 开户,开户金额为: " + balance);
        System.out.println("=================================================");
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("输入有误");
            return;
        }
        System.out.println(owner + "存款" + amount);
        accountState.deposit(amount);
        System.out.println(owner + "现在的存款有" + balance);
        System.out.println(owner + "的账户现在的状态是:" + accountState.getClass().getSimpleName());
        System.out.println("=================================================");
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("输入有误");
            return;
        }
        System.out.println(owner + "取款" + amount);
        accountState.withdraw(amount);
        System.out.println(owner + "现在的存款有" + balance);
        System.out.println(owner + "的账户现在的状态是:" + accountState.getClass().getSimpleName());
        System.out.println("=================================================");
    }

    public void computeInterest() {
        accountState.computeInterest();
    }

    //提供一个由环境类负责自己改变状态的方法
    public void changeState() {
        if (balance < -2000) {
            accountState = new RestrictedState(this);
        } else if (balance < 0) {
            accountState = new OverdraftState(this);
        } else {
            accountState = new NormalState(this);
        }
    }
}
