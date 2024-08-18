package 行为型模式.状态模式;

public abstract class AccountState {
    //这里可以由关联关系进一步降低为依赖关系,只需要向相应的方法添加一个参数就行了
    //但这是这样会增加参数传递的量
    protected Account account;

    //存款
    public abstract void deposit(double amount);

    //取款
    public abstract void withdraw(double amount);

    //计算利息
    public abstract void computeInterest();
}
