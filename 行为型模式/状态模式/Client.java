package 行为型模式.状态模式;

public class Client {
    public static void main(String[] args) {
        Account account = new Account("lp", 1000);

        account.deposit(1000);
        account.deposit(1000);
        account.withdraw(2000);
        account.withdraw(2000);
        account.computeInterest();
        account.withdraw(2000);
        account.withdraw(2000);
        account.deposit(2000);

    }
}
